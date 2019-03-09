package com.example.coverflow.Register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.example.coverflow.R;

public class LoginActivity extends AppCompatActivity {
    Button signup;
    Button forgot;
RelativeLayout rellay1,rellay2;
Handler handler=new Handler();
Runnable runnable=new Runnable() {
    @Override
    public void run() {
        rellay1.setVisibility(View.VISIBLE);
        rellay2.setVisibility(View.VISIBLE);

    }
};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR); //will hide the title

        getSupportActionBar().hide(); // hide the title bar

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen

        setContentView(R.layout.activity_login);
        signup=findViewById(R.id.btn_signup);
        forgot=findViewById(R.id.forgot);
        rellay1=findViewById(R.id.rellay1);
        rellay2=findViewById(R.id.rellay2);
        handler.postDelayed(runnable,1000);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(i);
            }
        });


        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LoginActivity.this, ForgotActivity.class);
                startActivity(i);
            }
        });
    }
}
