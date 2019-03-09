package com.example.coverflow.Cultural;

import com.example.coverflow.R;
import com.example.coverflow.Technical.Technical;

import java.util.ArrayList;

public class CulturalCollection {

    public static ArrayList<Technical> getTechnical()
    {
        ArrayList<Technical> events=new ArrayList<>();

        Technical s=new Technical();

        s.setTitle("DANCE COMPETITION");
        s.setSummary("DANCE COMPETITION");
        s.setTask("");
        s.setJudcriteria("");
        s.setCoordinators("");
        s.setImage(R.drawable.dance);
        events.add(s);


        s=new Technical();
        s.setTitle("LOL-STANDUP COMEDY");
        s.setSummary("LOL-STANDUP COMEDY");
        s.setTask("");
        s.setJudcriteria("");
        s.setCoordinators("");
        s.setImage(R.drawable.comedy);
        events.add(s);


        s=new Technical();
        s.setTitle("SINGING COMPETITION");
        s.setSummary("SINGING COMPETITION");
        s.setTask("");
        s.setJudcriteria("");
        s.setCoordinators("");
        s.setImage(R.drawable.singing);
        events.add(s);





        s=new Technical();
        s.setTitle("FASHION SHOW");
        s.setSummary("FASHION SHOW");
        s.setTask("");
        s.setJudcriteria("");
        s.setCoordinators("");
        s.setImage(R.drawable.fasion);
        events.add(s);




        return events;
    }
}
