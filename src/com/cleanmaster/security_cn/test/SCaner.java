package com.cleanmaster.security_cn.test;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import com.robotium.solo.Solo;
import org.junit.Test;

/**
 * Created by dongqingqing on 15/9/14.
 */
public class SCaner extends ActivityInstrumentationTestCase2 {

    public Solo solo;
    public Activity activity;

    private static Class<?> launchActivityClass;
//    private static String mainActivity = "ks.cm.antivirus.scan.ScanMainActivity";
    private static String mainActivity = "ks.cm.antivirus.main.SplashActivity";
    private static String packageName = "com.cleanmaster.security_cn";

    static {
        try {
            launchActivityClass = Class.forName(mainActivity);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public SCaner() {
        super(packageName,launchActivityClass);
    }

    protected void setUp() throws Exception {
        super.setUp();
        this.activity = this.getActivity();
        this.solo = new Solo(getInstrumentation(), getActivity());
    }

    @Test
    public void testScaner_1() {
        //robotium test script
        solo.waitForActivity(mainActivity, 2000);
        //solo.clickOnButton("��ʼʹ��");

        solo.clickOnButton("��֪ͨ����");
        //solo.clickOnView(solo.getButton(com.cleanmaster.security_cn.test.R.));
    }

    public void tearDown() throws Exception {
        try {
            this.solo.finishOpenedActivities();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        this.activity.finish();
        super.tearDown();
    }
}
