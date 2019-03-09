package com.example.coverflow.EventDetail1;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;
import com.example.coverflow.Common.Common;
import com.example.coverflow.Cultural.CulturalActivity;
import com.example.coverflow.Game.GameActivity;
import com.example.coverflow.MegaEvent.MegaActivity;
import com.example.coverflow.Model.GameEntity;
import com.example.coverflow.NonTech.NonTechActivity;
import com.example.coverflow.R;
import com.example.coverflow.Sport.SportActivity;
import com.example.coverflow.Technical.TechnicalActivity;

import it.moondroid.coverflow.components.ui.containers.FeatureCoverFlow;

public class EventActivity extends AppCompatActivity {


    private FeatureCoverFlow mCoverFlow;
    private CoverFlowAdapter mAdapter;

    private TextSwitcher mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_ACTION_BAR); //will hide the title

        getSupportActionBar().hide(); // hide the title bar


        setContentView(R.layout.activity_event);

        initData();


        mTitle =  findViewById(R.id.title);
        mTitle.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                LayoutInflater inflater = LayoutInflater.from(EventActivity.this);
                TextView textView = (TextView) inflater.inflate(R.layout.item_title, null);
                return textView;
            }
        });
        Animation in = AnimationUtils.loadAnimation(this, R.anim.slide_in_top);
        Animation out = AnimationUtils.loadAnimation(this, R.anim.slide_out_bottom);
        mTitle.setInAnimation(in);
        mTitle.setOutAnimation(out);

        mAdapter = new CoverFlowAdapter(Common.mData,this);

        mCoverFlow = ( findViewById(R.id.coverflow));
        mCoverFlow.setAdapter(mAdapter);


        mCoverFlow.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getApplicationContext(),"id=" +id,Toast.LENGTH_SHORT).show();

                if(id==0) {

                    Intent intent = new Intent(EventActivity.this, SportActivity.class);

                    startActivity(intent);

                }


                if(id==1) {
                    Intent intent = new Intent(EventActivity.this, GameActivity.class);

                    startActivity(intent);
                }
                if(id==2) {
                    Intent intent = new Intent(EventActivity.this, MegaActivity.class);

                    startActivity(intent);
                }

                if(id==3) {
                    Intent intent = new Intent(EventActivity.this, TechnicalActivity.class);

                    startActivity(intent);
                }





                if(id==4) {
                    Intent intent = new Intent(EventActivity.this, NonTechActivity.class);

                    startActivity(intent);
                }


                if(id==5) {
                    Intent intent = new Intent(EventActivity.this, CulturalActivity.class);

                    startActivity(intent);
                }

            }
        });

        mCoverFlow.setOnScrollPositionListener(new FeatureCoverFlow.OnScrollPositionListener() {
            @Override
            public void onScrolledToPosition(int position) {
                mTitle.setText(Common.mData.get(position).getTitle());
            }

            @Override
            public void onScrolling() {
                mTitle.setText("");
            }
        });

    }

    private void initData() {
try {


    Common.mData.add(new GameEntity(R.drawable.p4, "SPORTS", "SPORTS"));
    Common.mData.add(new GameEntity(R.drawable.p11, "GAMES", "GAMES"));
    Common.mData.add(new GameEntity(R.drawable.p6, "MEGA-EVENTS", "MEGA-EVENTS"));


    Common.mData.add(new GameEntity(R.drawable.vkg4, "TECHNICAL", "TECHNICAL"));
    Common.mData.add(new GameEntity(R.drawable.vkg, "NON-TECH", "NON-TECH"));
    Common.mData.add(new GameEntity(R.drawable.p1, "CULTURAL", "CULTURAL"));
}catch (Exception e){

}
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_coverflow_activity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}

