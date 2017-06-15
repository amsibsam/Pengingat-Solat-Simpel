package android.rahardyan.pengingatsolat.ui.prayingtime.presenter;

import android.content.Context;
import android.rahardyan.pengingatsolat.R;
import android.rahardyan.pengingatsolat.base.BasePresenter;
import android.rahardyan.pengingatsolat.model.DailyPrayingTimePojo;
import android.support.annotation.NonNull;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by rahardyan on 02/06/17.
 */

public class PrayingTimePresenter extends BasePresenter implements PrayingTimeContract.UserActionListener {
    @NonNull
    private PrayingTimeContract.View mPrayingTimeView;

    public PrayingTimePresenter(Context context, PrayingTimeContract.View prayingTimeView) {
        super(context);
        mPrayingTimeView = prayingTimeView;
    }

    @Override
    public void getPrayingTime() {
        mPrayingTimeView.onShowLoading();
        networkManager.getPrayerTime().enqueue(new Callback<DailyPrayingTimePojo>() {
            @Override
            public void onResponse(Call<DailyPrayingTimePojo> call, Response<DailyPrayingTimePojo> response) {
                mPrayingTimeView.onDismissLoading();
                if (response.isSuccessful()) {
                    mPrayingTimeView.onSuccessGetPrayingTime(response.body());
                } else {
                    mPrayingTimeView.onFailedGetPrayingTime(context.getString(R.string.server_error));
                }
            }

            @Override
            public void onFailure(Call<DailyPrayingTimePojo> call, Throwable t) {
                mPrayingTimeView.onDismissLoading();
                mPrayingTimeView.onFailedGetPrayingTime(context.getString(R.string.server_error));
            }
        });
    }
}
