package com.example.coverflow.Sport;

import com.example.coverflow.R;
import com.example.coverflow.Technical.Technical;

import java.util.ArrayList;

public class SportCollection {

    public static ArrayList<Technical> getTechnical()
    {
        ArrayList<Technical> events=new ArrayList<>();

        Technical s=new Technical();

        s.setTitle("BADMINTON");
        s.setSummary("BADMINTON");
        s.setTask("");
        s.setJudcriteria("");
        s.setCoordinators("");
        s.setImage(R.drawable.badmintan);
        events.add(s);


        s=new Technical();
        s.setTitle("CARROM");
        s.setSummary("CARROM");
        s.setTask("");
        s.setJudcriteria("");
        s.setCoordinators("");
        s.setImage(R.drawable.carrom);
        events.add(s);


        s=new Technical();
        s.setTitle("CHESS");
        s.setSummary("CHESS");
        s.setTask("");
        s.setJudcriteria("");
        s.setCoordinators("");
        s.setImage(R.drawable.chess);
        events.add(s);


        return events;
    }
}
