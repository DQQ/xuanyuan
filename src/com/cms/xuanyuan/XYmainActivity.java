package com.cms.xuanyuan;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

/**
 * Created by dqq on 2015/9/15.
 */
public class XYmainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yxmain);

        Button cms_tset = (Button) findViewById(R.id.cms_button);
        cms_tset.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                Runtime run = Runtime.getRuntime();
                try {
                    if (Build.VERSION.SDK_INT < 17) {
                        run.exec("");
                    }
                    if (Build.VERSION.SDK_INT >= 17) {
                        run.exec("");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.e("destroy", "onDestroy~~~");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.e("pause", "onPause~~~");
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.e("restart", "onRestart~~~");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.e("resume", "onResume~~~");
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.e("start", "onStart~~~");
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.e("stop", "onStop~~~");
    }
}