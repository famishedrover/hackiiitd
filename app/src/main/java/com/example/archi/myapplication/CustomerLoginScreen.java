package com.example.archi.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CustomerLoginScreen extends AppCompatActivity {




    Button sign ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_login_screen);

        sign=(Button)findViewById(R.id.signup) ;

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent() ;
                i.setClass(CustomerLoginScreen.this , SignUpActivity.class) ;
                startActivity(i) ;
            }
        });

    }
}
