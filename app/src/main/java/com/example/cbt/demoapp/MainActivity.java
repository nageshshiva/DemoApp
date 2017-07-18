package com.example.cbt.demoapp;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etun,etpwd;
    Button btnlogin,btnsignup;
    String uname = "shiva";
    String pwd = "123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etun = (EditText)findViewById(R.id.login_username_et);
        etpwd = (EditText)findViewById(R.id.login_password_et);
        btnlogin=(Button)findViewById(R.id.login_btn_bv);

        btnlogin.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String s1=etun.getText().toString();
                        String s2=etpwd.getText().toString();

                       if(s1.equals(uname) && s2.equals(pwd))
                       {
                           Toast.makeText(MainActivity.this,R.string.login_success , Toast.LENGTH_SHORT).show();
                           Intent i1=new Intent(MainActivity.this,HomeActivity.class);
                           startActivity(i1);
                       }
                       else
                       {
                           Toast.makeText(MainActivity.this,R.string.login_failed , Toast.LENGTH_SHORT).show();
                       }
                    }
                }


        );
    }
}

