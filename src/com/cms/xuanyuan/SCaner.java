package com.cms.xuanyuan;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import com.robotium.solo.Solo;

/**
 * Created by dongqingqing on 15/9/14.
 */
public class SCaner extends ActivityInstrumentationTestCase2 {

    public Solo solo;
    public Activity activity;

    private static Class<?> launchActivityClass;
    private static String mainActivity = "";
    private static String packageName = "";

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

    public void testScaner_1() {
        //robotium test script
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
