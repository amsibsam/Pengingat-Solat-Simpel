package android.rahardyan.pengingatsolat.base;

import android.content.Context;
import android.rahardyan.pengingatsolat.BuildConfig;
import android.rahardyan.pengingatsolat.network.NetworkManager;

/**
 * Created by rahardyan on 31/05/17.
 */

public class BasePresenter {
    protected final NetworkManager networkManager;
    protected Context context;

    public BasePresenter(Context context) {
        this.context = context;
        this.networkManager = new NetworkManager(context, BuildConfig.SERVER_URL, BuildConfig.DEBUG);
    }
}
