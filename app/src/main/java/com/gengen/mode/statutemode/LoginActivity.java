package com.gengen.mode.statutemode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    private Button btnLoginin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnLoginin = (Button) findViewById(R.id.btn_loginin);
        btnLoginin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginin(v);
            }
        });
    }

    /**
     * 设置为登陆状态
     * @param view
     */
    public void loginin(View view) {
        LoginContext.getLoginContext().setUserState(new LoginInState());
        finish();
    }


}
