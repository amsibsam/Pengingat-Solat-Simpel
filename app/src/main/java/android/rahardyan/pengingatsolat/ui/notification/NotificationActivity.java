package android.rahardyan.pengingatsolat.ui.notification;

import android.rahardyan.pengingatsolat.base.BaseActivity;
import android.os.Bundle;
import android.rahardyan.pengingatsolat.R;
import android.view.View;
import android.widget.RelativeLayout;

public class NotificationActivity extends BaseActivity {
    private RelativeLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initView();
    }

    private void initView() {
        container = (RelativeLayout) findViewById(R.id.container);
        container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public int getLayout() {
        return R.layout.activity_notification;
    }
}
