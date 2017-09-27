package com.gengen.mode.statutemode;

import android.content.Context;

/**
 * project name StatuteMode
 * package name com.gengen.mode.statutemode
 * Create by lxg
 * on 2017/9/27
 * at 14:49
 */
public class LoginContext {
    /**
     * 状态管理类
     * <p>
     * 这个类用来对状态进行管理，默认的状态是非登陆状态
     * 此外，为了保证全局状态一致性，这里使用了单列模式
     */

    private UserState userState = new LoginOutState();

    private static LoginContext loginContext = new LoginContext();

    /**
     * 单列模式，保证全局状态一致性
     * @return
     */
    public static LoginContext getLoginContext() {
        return loginContext;
    }

    public static void setLoginContext(LoginContext loginContext) {
        LoginContext.loginContext = loginContext;
    }

    public UserState getUserState() {
        return userState;
    }

    public void setUserState(UserState userState) {
        this.userState = userState;
    }

    /**
     * 转发
     *
     * @param context
     */
    public void transmit(Context context) {
        this.userState.transmit(context);
    }

    /**
     * 收藏
     *
     * @param context
     */
    public void collection(Context context) {
        this.userState.collect(context);
    }

}
