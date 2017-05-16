package baidu.baiwei.com.dukailinmvp.mode;

import baidu.baiwei.com.dukailinmvp.bean.User;

/**
 * Created by YOLANDA on 2015-12-04.
 */
public class UserMode implements IUserMode {
    @Override
    public String login(User user) {
        boolean networkError = false; //网络是否异常

        try {
            Thread.sleep(3000);//模拟网络连接
            if (networkError) {
                return "网络异常";
            } else if ("11111".equals(user.getUsername()) && "123456".equals(user.getPassword())) {
                return "true";
            } else {
                return "账号或密码错误";
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
