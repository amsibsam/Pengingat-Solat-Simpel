package android.rahardyan.pengingatsolat.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.rahardyan.pengingatsolat.ui.notification.NotificationActivity;
import android.widget.Toast;

/**
 * Created by rahardyan on 05/06/17.
 */

public class NotificationReceiver extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent notifIntent = new Intent(context, NotificationActivity.class);
        notifIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(notifIntent);
        Toast.makeText(context, "alarm start", Toast.LENGTH_SHORT).show();
    }
}
