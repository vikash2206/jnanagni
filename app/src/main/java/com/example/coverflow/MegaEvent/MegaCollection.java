package com.example.coverflow.MegaEvent;

import com.example.coverflow.R;
import com.example.coverflow.Technical.Technical;

import java.util.ArrayList;

public class MegaCollection  {

    public static ArrayList<Technical> getTechnical()
    {
        ArrayList<Technical> events=new ArrayList<>();

        Technical s=new Technical();

        s.setTitle("PUBG");
        s.setSummary("PUBG");
        s.setTask("");
        s.setJudcriteria("");
        s.setCoordinators("");
        s.setImage(R.drawable.pubg);
        events.add(s);



        return events;
    }
}
