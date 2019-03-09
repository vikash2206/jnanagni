package com.example.coverflow;

import android.os.Build;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

public class TechActivity extends AppCompatActivity {
Window window;
ImageView imageView;
TextView textsummary;
TextView texttask;
TextView textcriteria;
TextView  textcoordinator;
String title;
String summary;
String  Task;
String criteria;
String coordinator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech);
        imageView=findViewById(R.id.img);
        textsummary=findViewById(R.id.txtsummary);
        texttask=findViewById(R.id.txttask);
        textcriteria=findViewById(R.id.txtjudge);
        textcoordinator=findViewById(R.id.txtcord);

      title=getIntent().getStringExtra("title");
        summary=getIntent().getStringExtra("summary");
       Task= getIntent().getStringExtra("Task");
       criteria= getIntent().getStringExtra("judgecriteria");
       coordinator= getIntent().getStringExtra("coordinators");

Bundle bundle=this.getIntent().getExtras();
int pic=bundle.getInt("image");
imageView.setImageResource(pic);
textsummary.setText(""+summary);
texttask.setText(""+Task);
textcriteria.setText(""+criteria);
textcoordinator.setText(""+coordinator);



        if (Build.VERSION.SDK_INT>=22){
            window=this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.status_bar));
        }

        Toolbar toolbar= findViewById(R.id.toolbar);
        // setSupportActionBar(toolbar);
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
}
