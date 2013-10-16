package com.pjq.glamour_xiapu;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

/**
 * Created with IntelliJ IDEA.
 * User: pjq
 * Date: 13-10-16
 * Time: ÉÏÎç11:21
 * To change this template use File | Settings | File Templates.
 */
public class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public class BackClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            finish();
        }
    }
}
