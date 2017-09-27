package com.gengen.mode.statutemode;

import android.content.Context;
import android.widget.Toast;

/**
 * project name StatuteMode
 * package name com.gengen.mode.statutemode
 * Create by lxg
 * on 2017/9/27
 * at 14:43
 */
public class LoginInState implements UserState {
    /**
     * LoginInState 登陆成功状态类
     *
     * 实现两个接口
     *
     * @param context
     */


    @Override
    public void collect(Context context) {
        Toast.makeText(context, "收藏成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void transmit(Context context) {
        Toast.makeText(context, "转发成功", Toast.LENGTH_SHORT).show();
    }
}
