package android.rahardyan.pengingatsolat.ui.view;

import android.rahardyan.pengingatsolat.R;
import android.rahardyan.pengingatsolat.base.BaseActivity;
import android.rahardyan.pengingatsolat.model.DailyPrayingTimePojo;
import android.rahardyan.pengingatsolat.ui.presenter.PrayingTimeContract;
import android.rahardyan.pengingatsolat.ui.presenter.PrayingTimePresenter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class PrayingTimeActivity extends BaseActivity implements PrayingTimeContract.View{
    private static final String TAG = PrayingTimeActivity.class.getSimpleName();
    private PrayingTimePresenter prayingTimePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        prayingTimePresenter = new PrayingTimePresenter(this, this);
        setUpToolbar(false, getString(R.string.praying_time_activity_title));
        prayingTimePresenter.getPrayingTime();
    }

    @Override
    public int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void onSuccessGetPrayingTime(DailyPrayingTimePojo dailyPrayingTimePojo) {
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
