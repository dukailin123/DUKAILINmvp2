package baidu.baiwei.com.dukailinmvp.presenter;


import baidu.baiwei.com.dukailinmvp.bean.User;
import baidu.baiwei.com.dukailinmvp.mode.UserMode;
import baidu.baiwei.com.dukailinmvp.utils.UIHandler;
import baidu.baiwei.com.dukailinmvp.view.IUserView;

/**
 * Created by YOLANDA on 2015-12-04.
 */
public class UserPresenter {
    private final IUserView userView;
    private final UserMode userMode;

    public UserPresenter(IUserView userView) {
        this.userView = userView;
        this.userMode = new UserMode();
    }

    /**
     * 登录
     *
     * @param user
     */
    public void login(final User user) {
        new Thread() {
            @Override
            public void run() {
                final String res = userMode.login(user);
                UIHandler.get().post(new Runnable() {
                    @Override
                    public void run() {
                        if ("true".equals(res)) {
                            userView.onLoginSuccess();
                        } else {
                            userView.onLoginFailed(res);
                        }
                    }
                });
            }
        }.start();
    }
}
