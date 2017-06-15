package android.rahardyan.pengingatsolat.ui.prayingtime.presenter;

import android.rahardyan.pengingatsolat.model.DailyPrayingTimePojo;

/**
 * Created by rahardyan on 02/06/17.
 */

public interface PrayingTimeContract {
    interface View {
        void onSuccessGetPrayingTime(DailyPrayingTimePojo dailyPrayingTimePojo);

        void onFailedGetPrayingTime(String errorMessage);

        void onShowLoading();

        void onDismissLoading();
    }

    interface UserActionListener {
        void getPrayingTime();
    }
}
