package com.example.coverflow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.example.coverflow.About.AboutActivity;
import com.example.coverflow.Contact.ContactActivity;
import com.example.coverflow.EventDetail1.EventActivity;
import com.example.coverflow.Register.LoginActivity;
import com.ramotion.expandingcollection.ECBackgroundSwitcherView;
import com.ramotion.expandingcollection.ECCardData;
import com.ramotion.expandingcollection.ECPagerView;
import com.ramotion.expandingcollection.ECPagerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class FrontActivity extends AppCompatActivity {
    private ECPagerView ecPagerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        requestWindowFeature(Window.FEATURE_ACTION_BAR); //will hide the title

        getSupportActionBar().hide(); // hide the title bar

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_front);

        // Get pager from layout
        ecPagerView = (ECPagerView) findViewById(R.id.ec_pager_element);

        // Generate example dataset
        ArrayList<ECCardData> dataset = CardDataImpl.generateExampleData();

        // Implement pager adapter and attach it to pager view
        ECPagerViewAdapter ecPagerViewAdapter = new ECPagerViewAdapter(getApplicationContext(), dataset) {
            @Override
            public void instantiateCard(LayoutInflater inflaterService, ViewGroup head, final ListView list, ECCardData data) {
                // Data object for current card
                final CardDataImpl cardData = (CardDataImpl) data;

                // Set adapter and items to current card content list
                final List<String> listItems = cardData.getListItems();
                final CardListItemAdapter listItemAdapter = new CardListItemAdapter(getApplicationContext(), listItems);
                list.setAdapter(listItemAdapter);
                // Also some visual tuning can be done here
                list.setBackgroundColor(Color.WHITE);
                View gradient = new View(getApplicationContext());
                gradient.setLayoutParams(new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, AbsListView.LayoutParams.MATCH_PARENT));

                head.addView(gradient);

                // Inflate main header layout and attach it to header root view
                inflaterService.inflate(R.layout.list_item, head);

                TextView title = (TextView) head.findViewById(R.id.list_item_text);
                title.setText(cardData.getCardTitle());




                // Card toggling by click on head element
                head.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(final View v) {
                        if (cardData.getCardTitle().equals("EVENTS")) {
                            Intent i=new Intent(FrontActivity.this, EventActivity.class);
                            startActivity(i);

                        }
                        if (cardData.getCardTitle().equals("REGISTER")) {
                            Intent i=new Intent(FrontActivity.this, LoginActivity.class);
                            startActivity(i);
                        }

                        if (cardData.getCardTitle().equals("SPONSORS")) {
                            Intent i=new Intent(FrontActivity.this, SponsorsActivity.class);
                            startActivity(i);

                        }
                        if (cardData.getCardTitle().equals("GALLERY")) {
                            Intent i=new Intent(FrontActivity.this, GalleryActivity.class);
                            startActivity(i);

                        }
                        if (cardData.getCardTitle().equals("CONTACT US")) {
                            Intent i=new Intent(FrontActivity.this, ContactActivity.class);
                            startActivity(i);

                        }
                        if (cardData.getCardTitle().equals("ABOUT US")) {
                            Intent i=new Intent(FrontActivity.this, AboutActivity.class);
                            startActivity(i);

                        }

                    }
                });
            }
        };
        ecPagerView.setPagerViewAdapter(ecPagerViewAdapter);

        // Add background switcher to pager view
        ecPagerView.setBackgroundSwitcherView((ECBackgroundSwitcherView) findViewById(R.id.ec_bg_switcher_element));

        // Directly modifying dataset
        // dataset.remove(0);
        ecPagerViewAdapter.notifyDataSetChanged();

    }

    // Card collapse on back pressed
    @Override
    public void onBackPressed() {
        if (!ecPagerView.collapse())
            super.onBackPressed();
    }

}