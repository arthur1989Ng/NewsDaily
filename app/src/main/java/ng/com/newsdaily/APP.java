package ng.com.newsdaily;

import android.app.Application;
import android.content.Context;

import ng.com.newsdaily.utils.AppContextUtil;
import ng.com.newsdaily.utils.L;


/**
 * Created by niangang on 2016/11/23.
 */

public class APP extends Application {

    private static Context mApplicationContext;


    @Override
    public void onCreate() {
        super.onCreate();
        mApplicationContext = this;
        AppContextUtil.init(this);
        L.init();
    }
    // 获取ApplicationContext
    public static Context getContext() {
        return mApplicationContext;
    }
}
