package com.example.coverflow.MegaEvent;

import android.os.Build;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.Window;

import com.example.coverflow.R;
import com.example.coverflow.Technical.TechnicalAdapter;

public class MegaActivity extends AppCompatActivity {
    Window window;
    private RecyclerView TechnicalList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mega);

        if (Build.VERSION.SDK_INT>=22){
            window=this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.status_bar));
        }

        TechnicalList =findViewById(R.id.MegaDetail);
        TechnicalList.setHasFixedSize(true);
        TechnicalList.setLayoutManager(new LinearLayoutManager(this));
        TechnicalList.setAdapter(new TechnicalAdapter(this, MegaCollection.getTechnical()));
    }
}
