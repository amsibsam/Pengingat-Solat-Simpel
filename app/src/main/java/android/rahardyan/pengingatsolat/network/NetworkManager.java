package android.rahardyan.pengingatsolat.network;

import android.content.Context;
import android.rahardyan.pengingatsolat.model.DailyPrayingTimePojo;

import com.google.gson.JsonElement;

import retrofit2.Call;

/**
 * Created by rahardyan on 31/05/17.
 */

public class NetworkManager {
    private Context context;
    private NetworkService networkService;
    public NetworkManager(Context context, String baseUrl, boolean isDebug) {
        this.context = context;
        this.networkService = NetworkFactory.createNetwork(baseUrl, isDebug)
                .create(NetworkService.class);
    }

    public Call<DailyPrayingTimePojo> getPrayerTime() {
        return networkService.getPrayingTime();
    }
}
