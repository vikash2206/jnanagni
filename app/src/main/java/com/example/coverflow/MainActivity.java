package com.example.coverflow;


import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.example.coverflow.About.AboutActivity;
import com.example.coverflow.Contact.ContactActivity;
import com.example.coverflow.EventDetail1.EventActivity;
import com.example.coverflow.Register.LoginActivity;
import com.mrgames13.jimdo.splashscreen.App.SplashScreenBuilder;
import com.ramotion.expandingcollection.ECBackgroundSwitcherView;
import com.ramotion.expandingcollection.ECCardData;
import com.ramotion.expandingcollection.ECPagerView;
import com.ramotion.expandingcollection.ECPagerViewAdapter;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    VideoView videoView;
    private static int SPLASH_TIME_OUT = 4000;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_main);
        videoView = (VideoView) findViewById(R.id.videoView);

        Uri video = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.jn);
        videoView.setVideoURI(video);



        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {

                TypeWriter typewriter = new TypeWriter(getApplicationContext());
                typewriter.setCharacterDelay(140);
                typewriter.setTextSize(25);

                typewriter.setTypeface(null, Typeface.BOLD);
                typewriter.setSoundEffectsEnabled(true);

                typewriter.setTextColor(getResources().getColor(R.color.textcol));
                typewriter.setPadding(220, 600, 20, 20);
                typewriter.setBackgroundResource( R.drawable.rj);



                typewriter.animateText("\tWELCOME\n\t\t\t\tTO\nJANANAGNI");

                setContentView(typewriter);
                new Handler().postDelayed(new Runnable() {

                    /*
                     * Showing splash screen with a timer. This will be useful when you
                     * want to show case your app logo / company
                     */

                    @Override
                    public void run() {

                        // This method will be executed once the timer is over
                        // Start your app main activity
                        Intent i = new Intent(MainActivity.this, FrontActivity.class);
                        startActivity(i);

                        // close this activity
                        finish();
                    }
                }, SPLASH_TIME_OUT);



            }
        });

        videoView.start();

    }




}
