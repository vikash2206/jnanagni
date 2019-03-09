package com.example.coverflow.Game;

import com.example.coverflow.R;
import com.example.coverflow.Technical.Technical;

import java.util.ArrayList;

public class GameCollection {

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
        s.setTitle("CHESS");
        s.setSummary("CHESS");
        s.setTask("");
        s.setJudcriteria("");
        s.setCoordinators("");
        s.setImage(R.drawable.chess);
        events.add(s);


        s=new Technical();
        s.setTitle("COUNTER STRIKE");
        s.setSummary("COUNTER STRIKE");
        s.setTask("");
        s.setJudcriteria("");
        s.setCoordinators("");
        s.setImage(R.drawable.counter);
        events.add(s);

        s=new Technical();
        s.setTitle("NFS");
        s.setSummary("NFS");
        s.setTask("");
        s.setJudcriteria("");
        s.setCoordinators("");
        s.setImage(R.drawable.nfs);
        events.add(s);

        s=new Technical();
        s.setTitle("PUBG");
        s.setSummary("PUBG");
        s.setTask("");
        s.setJudcriteria("");
        s.setCoordinators("");
        s.setImage(R.drawable.pubg);
        events.add(s);

        s=new Technical();
        s.setTitle("TABLE TENNIS");
        s.setSummary("TABLE TENNIS");
        s.setTask("");
        s.setJudcriteria("");
        s.setCoordinators("");
        s.setImage(R.drawable.table);
        events.add(s);





        return events;
    }
}
