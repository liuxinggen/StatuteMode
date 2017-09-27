package com.gengen.mode.statutemode;

import android.content.Context;
import android.content.Intent;

/**
 * project name StatuteMode
 * package name com.gengen.mode.statutemode
 * Create by lxg
 * on 2017/9/27
 * at 14:45
 */
public class LoginOutState implements UserState {
    /**
     * 非登陆状态
     *
     * @param context
     */

    @Override
    public void collect(Context context) {
        login(context);
    }

    @Override
    public void transmit(Context context) {
        login(context);
    }

    /**
     * 跳转到登陆界面
     *
     * @param context
     */
    private void login(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        context.startActivity(intent);
    }
}
