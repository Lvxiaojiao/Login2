package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button mBtnLogin;
    Button mBtnRegiste;
    EditText mEtUser;
    EditText mEtPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnLogin = (Button) findViewById(R.id.btn_login);
        mBtnRegiste = (Button) findViewById(R.id.btn_registe);
        mEtUser = (EditText) findViewById(R.id.et_user);
        mEtPassword = (EditText) findViewById(R.id.et_password);


        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = mEtUser.getText().toString().trim();
                String pwd = mEtPassword.getText().toString().trim();
                if (username.equals("lvxiaojiao")&&pwd.equals("123456")) {
                    Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(intent);
                } else{
                Toast.makeText(MainActivity.this, "账号或密码错误", Toast.LENGTH_SHORT).show();
            }
            }
        });
        mBtnRegiste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this, RegisteActivity.class);
                startActivity(intent3);
            }
        });
    }
}