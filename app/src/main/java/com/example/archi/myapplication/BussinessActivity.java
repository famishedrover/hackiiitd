package com.example.archi.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BussinessActivity extends AppCompatActivity {
    Button sign ;
    Button login;
    String contentUID;
    String contentPASS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bussiness);

        final EditText business_pass = (EditText) findViewById(R.id.business_pass);
        final EditText business_uid = (EditText) findViewById(R.id.business_uid);

        sign=(Button)findViewById(R.id.business_signup) ;

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent() ;
                i.setClass(BussinessActivity.this , SignUpActivity.class) ;
                startActivity(i) ;
            }
        });



        login=(Button)findViewById(R.id.business_login) ;

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v("check","working");
                contentUID = business_uid.getText().toString();
                contentPASS = business_pass.getText().toString();
                Log.v("check",contentPASS);
                Log.v("check",contentUID);

                Intent i=new Intent() ;
                i.setClass(BussinessActivity.this , BusinessActivityFinal.class) ;
                startActivity(i) ;
            }
        });
    }
}
