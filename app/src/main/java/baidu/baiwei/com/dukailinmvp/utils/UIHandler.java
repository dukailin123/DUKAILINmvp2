package baidu.baiwei.com.dukailinmvp.utils;

import android.os.Handler;
import android.os.Looper;

/**
 * 在UI线程进行处理
 * <p/>
 * Created by YOLANDA on 2015-12-04.
 */
public class UIHandler extends Handler {
    private UIHandler() {
        super(Looper.getMainLooper());
    }

    private static UIHandler sInstance;

    public static UIHandler get() {
        if (sInstance == null) {
            sInstance = new UIHandler();
        }
        return sInstance;
    }
}
