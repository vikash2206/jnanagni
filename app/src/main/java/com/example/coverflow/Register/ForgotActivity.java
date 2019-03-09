package com.example.coverflow.Register;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;

import com.example.coverflow.R;

public class ForgotActivity extends AppCompatActivity {
    RelativeLayout rellay1,rellay2;
    Handler handler=new Handler();
    Runnable runnable=new Runnable() {
        @Override
        public void run() {
            rellay1.setVisibility(View.VISIBLE);


        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR); //will hide the title

        getSupportActionBar().hide(); // hide the title bar

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen

        setContentView(R.layout.activity_forgot);

        rellay1 = findViewById(R.id.rellay1);

        handler.postDelayed(runnable, 1000);
    }
}
