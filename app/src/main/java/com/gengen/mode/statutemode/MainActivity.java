package com.gengen.mode.statutemode;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnTransmit;
    private Button btnCollect;
    private Button btnLoginout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    /**
     * 点击转发
     *
     * @param view
     */
    public void transmit(View view) {
        LoginContext.getLoginContext().transmit(this);
    }

    /**
     * 点击收藏按钮通过状态管理类来处理
     *
     * @param view
     */
    public void collection(View view) {
        LoginContext.getLoginContext().collection(this);
    }

    /**
     * 点击注销则调用状态管理类设置用户的状态为注销
     *
     * @param view
     */
    public void loginout(View view) {
        LoginContext.getLoginContext().setUserState(new LoginOutState());
    }

    @Override
    public void onClick(View v) {
        if (v == btnTransmit) {
            transmit(v);
        } else if (v == btnCollect) {
            collection(v);
        } else if (v == btnLoginout) {
            loginout(v);
        }
    }

    private void findViews() {
        btnTransmit = (Button) findViewById(R.id.btn_transmit);
        btnCollect = (Button) findViewById(R.id.btn_collect);
        btnLoginout = (Button) findViewById(R.id.btn_loginout);

        btnTransmit.setOnClickListener(this);
        btnCollect.setOnClickListener(this);
        btnLoginout.setOnClickListener(this);
    }
}
