package com.gengen.mode.statutemode;

import android.content.Context;

/**
 * project name StatuteMode
 * package name com.gengen.mode.statutemode
 * Create by lxg
 * on 2017/9/27
 * at 14:41
 */
public interface UserState {
    /**
     * collect为收藏
     *
     * transmit为转发
     * @param context
     */


    void collect(Context context);

    void transmit(Context context);
}
