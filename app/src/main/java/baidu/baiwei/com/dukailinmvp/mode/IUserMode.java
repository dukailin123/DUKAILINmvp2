package baidu.baiwei.com.dukailinmvp.mode;

import baidu.baiwei.com.dukailinmvp.bean.User;

/**
 * Created by YOLANDA on 2015-12-04.
 */
public interface IUserMode {
    /**
     * 登录
     *
     * @param user
     * @return 约定返回"true"为登录成功，其他为登录失败的错误信息
     */
    String login(User user);
}
