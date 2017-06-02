package android.rahardyan.pengingatsolat.network;

import android.rahardyan.pengingatsolat.model.DailyPrayingTimePojo;

import com.google.gson.JsonElement;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by rahardyan on 31/05/17.
 */

public interface NetworkService {
    @GET("yogyakarta.json?key=ea221ff224a211c15d55a710bc4a8bda")
    Call<DailyPrayingTimePojo> getPrayingTime();
}
