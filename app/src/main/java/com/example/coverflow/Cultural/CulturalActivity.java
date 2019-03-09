package com.example.coverflow.Cultural;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;

import com.example.coverflow.R;
import com.example.coverflow.Technical.TechnicalAdapter;

public class CulturalActivity extends AppCompatActivity {
    Window window;
    private RecyclerView TechnicalList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cultural);

        if (Build.VERSION.SDK_INT>=22){
            window=this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.status_bar));
        }

        TechnicalList =findViewById(R.id.culturalDetail);
        TechnicalList.setHasFixedSize(true);
        TechnicalList.setLayoutManager(new LinearLayoutManager(this));
        TechnicalList.setAdapter(new TechnicalAdapter(this, CulturalCollection.getTechnical()));
    }
}
