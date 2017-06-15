package android.rahardyan.pengingatsolat.ui.prayingtime.view;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.rahardyan.pengingatsolat.R;
import android.rahardyan.pengingatsolat.base.BaseActivity;
import android.rahardyan.pengingatsolat.model.DailyPrayingTimePojo;
import android.rahardyan.pengingatsolat.model.SolatModel;
import android.rahardyan.pengingatsolat.service.NotificationReceiver;
import android.rahardyan.pengingatsolat.ui.notification.NotificationActivity;
import android.rahardyan.pengingatsolat.ui.prayingtime.adapter.PrayingTimeAdapter;
import android.rahardyan.pengingatsolat.ui.prayingtime.presenter.PrayingTimeContract;
import android.rahardyan.pengingatsolat.ui.prayingtime.presenter.PrayingTimePresenter;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class PrayingTimeActivity extends BaseActivity implements PrayingTimeContract.View{
    private static final String TAG = PrayingTimeActivity.class.getSimpleName();
    private PrayingTimePresenter prayingTimePresenter;
    private PrayingTimeAdapter prayingTimeAdapter;
    private RecyclerView recyclerViewPrayingTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        prayingTimePresenter = new PrayingTimePresenter(this, this);
        setUpToolbar(false, getString(R.string.praying_time_activity_title));
        prayingTimePresenter.getPrayingTime();
        initView();
        initRecyclerView();
        setUpAlarm();
    }

    private void setUpAlarm() {
        Intent notifIntent = new Intent(PrayingTimeActivity.this, NotificationReceiver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 100, notifIntent, PendingIntent.FLAG_ONE_SHOT);
        AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        Calendar calendar = Calendar.getInstance();
        Log.d(TAG, "setUpAlarm: jam "+calendar.getTime().getHours()+" menit "+calendar.getTime().getMinutes());
        calendar.set(Calendar.HOUR_OF_DAY, 2);
        calendar.set(Calendar.MINUTE, 14);
        alarmManager.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), pendingIntent);
    }

    private void initRecyclerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        prayingTimeAdapter = new PrayingTimeAdapter(this);
        recyclerViewPrayingTime.setHasFixedSize(true);
        recyclerViewPrayingTime.setLayoutManager(linearLayoutManager);
        recyclerViewPrayingTime.setAdapter(prayingTimeAdapter);
    }

    private void initView() {
        recyclerViewPrayingTime = (RecyclerView) findViewById(R.id.praying_time_recycler);
    }

    @Override
    public int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void onSuccessGetPrayingTime(DailyPrayingTimePojo dailyPrayingTimePojo) {
        List<SolatModel> solatModels = new ArrayList<>();
        SolatModel subuh = new SolatModel();
        subuh.setSolatName("Subuh");
        subuh.setSolatTime(dailyPrayingTimePojo.getItems().get(0).getAsr());
        solatModels.add(subuh);
        SolatModel dhuhur = new SolatModel();
        dhuhur.setSolatName("Dhuhur");
        dhuhur.setSolatTime(dailyPrayingTimePojo.getItems().get(0).getDhuhr());
        solatModels.add(dhuhur);
        SolatModel ashar = new SolatModel();
        ashar.setSolatName("Ashar");
        ashar.setSolatTime(dailyPrayingTimePojo.getItems().get(0).getAsr());
        solatModels.add(ashar);
        SolatModel maghrib = new SolatModel();
        maghrib.setSolatName("Maghrib");
        maghrib.setSolatTime(dailyPrayingTimePojo.getItems().get(0).getMaghrib());
        solatModels.add(maghrib);
        SolatModel isya = new SolatModel();
        isya.setSolatName("Isya");
        isya.setSolatTime(dailyPrayingTimePojo.getItems().get(0).getIsha());
        solatModels.add(isya);
        prayingTimeAdapter.setData(solatModels);
        Log.d(TAG, "ashar praying time "+dailyPrayingTimePojo.getItems().get(0).getAsr());
    }

    @Override
    public void onFailedGetPrayingTime(String errorMessage) {
        onRequestFailed(errorMessage);
    }

    @Override
    public void onShowLoading() {
        showProgressDialog();
    }

    @Override
    public void onDismissLoading() {
        dismissProgressDialog();
    }
}
