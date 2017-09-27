# StatuteMode
状态模式：
#  当一个对象的内在状态改变时允许改变其行为，这个对象看起来像是改变了其类
状态模式的实战：
# 在开发过程中，登陆模块应该是经常用到的地方，在用户已知登陆和未登录的情况下对同一事件的
# 处理方式是不同的。例如，在转发和收藏某个信息的时候，首先会检测用户是否登录，如果登录则允
# 许转发和收藏，否则跳转到登录界面。


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

