package com.example.archi.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CustomerLoginScreen extends AppCompatActivity {




    Button sign ;
    Button login;
    String contentUID;
    String contentPASS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_login_screen);


        final EditText customer_uid = (EditText) findViewById(R.id.customer_uid);
        final EditText customer_pass = (EditText) findViewById(R.id.customer_pass);


        sign=(Button)findViewById(R.id.signup) ;

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent() ;
                i.setClass(CustomerLoginScreen.this , SignUpActivity.class) ;
                startActivity(i) ;
            }
        });



        login=(Button)findViewById(R.id.customer_login) ;

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contentUID = customer_uid.getText().toString();
                contentPASS = customer_pass.getText().toString();
                Log.v("check",contentPASS);
                Log.v("check",contentUID);

                Intent i=new Intent() ;
                i.setClass(CustomerLoginScreen.this , CustomerActivityFinal.class) ;
                startActivity(i) ;
            }
        });
    }
}
