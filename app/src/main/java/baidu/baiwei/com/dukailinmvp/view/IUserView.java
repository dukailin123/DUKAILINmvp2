package baidu.baiwei.com.dukailinmvp.view;

/**
 * Created by YOLANDA on 2015-12-04.
 */
public interface IUserView {
    /**
     * 登录成功
     */
    void onLoginSuccess();

    /**
     * 登录失败
     *
     * @param error
     */
    void onLoginFailed(String error);
}
