package com.example.coverflow.Technical;




import com.example.coverflow.R;

import java.util.ArrayList;

public class TechnicalCollection {

    public static ArrayList<Technical> getTechnical()
    {
        ArrayList<Technical> events=new ArrayList<>();

        Technical s=new Technical();

        s.setTitle("APP DEVELOPMENT");
        s.setSummary("APP DEVELOP");
        s.setTask("A");
        s.setJudcriteria("D");
        s.setCoordinators("S");
        s.setImage(R.drawable.app);
        events.add(s);


        s=new Technical();
        s.setTitle("BACK TO PAST");
        s.setSummary("BACK TO PAST");
        s.setTask("");
        s.setJudcriteria("");
        s.setCoordinators("");
        s.setImage(R.drawable.back);
        events.add(s);


        s=new Technical();
        s.setTitle("CIRCUIT DEBUGGING");
        s.setSummary("CIRCUIT DEBUGGING");
        s.setTask("");
        s.setJudcriteria("");
        s.setCoordinators("");
        s.setImage(R.drawable.circuit);
        events.add(s);



        s=new Technical();
        s.setTitle("DECIPHER");
        s.setSummary("DECIPHER");
        s.setTask("");
        s.setJudcriteria("");
        s.setCoordinators("");
        s.setImage(R.drawable.decipher);
        events.add(s);



        s=new Technical();
        s.setTitle("ELECTRICAL QUIZ");
        s.setSummary("ELECTRICAL QUIZ");
        s.setTask("");
        s.setJudcriteria("");
        s.setCoordinators("");
        s.setImage(R.drawable.electrial);
        events.add(s);


        s=new Technical();
        s.setTitle("ELECTRONIOCS PROJECT");
        s.setSummary("ELECTRONIOCS PROJECT");
        s.setTask("");
        s.setJudcriteria("");
        s.setCoordinators("");
        s.setImage(R.drawable.electronics);
        events.add(s);



        s=new Technical();
        s.setTitle("HACKATHON");
        s.setSummary("HACKATHON");
        s.setTask("");
        s.setJudcriteria("");
        s.setCoordinators("");
        s.setImage(R.drawable.hack);
        events.add(s);



        s=new Technical();
        s.setTitle("LINE FOLLOWER");
        s.setSummary("LINE FOLLOWER");
        s.setTask("");
        s.setJudcriteria("");
        s.setCoordinators("");
        s.setImage(R.drawable.line);
        events.add(s);



        s=new Technical();
        s.setTitle("NOPC");
        s.setSummary("NOPC");
       s.setTask("");
       s.setJudcriteria("");
       s.setCoordinators("");
        s.setImage(R.drawable.n1);
        events.add(s);


        s=new Technical();
        s.setTitle("ROBO SOCCER");
        s.setSummary("ROBO SOCCER");
        s.setTask("");
        s.setJudcriteria("");
        s.setCoordinators("");
        s.setImage(R.drawable.robo);
        events.add(s);



        s=new Technical();
        s.setTitle("ROBO RACE");
        s.setSummary("ROBO RACE");
        s.setTask("");
        s.setJudcriteria("");
        s.setCoordinators("");
        s.setImage(R.drawable.race);
        events.add(s);


        s=new Technical();
        s.setTitle("ROBO WAR");
        s.setSummary("ROBO WAR");
        s.setTask("A");
        s.setJudcriteria("C");
        s.setCoordinators("R");
        s.setImage(R.drawable.war);
        events.add(s);


        s=new Technical();
        s.setTitle("TOWER MAKING");
        s.setSummary("TOWER MAKING");
        s.setTask("");
        s.setJudcriteria("");
        s.setCoordinators("");
        s.setImage(R.drawable.tower);
        events.add(s);


        s=new Technical();
        s.setTitle("WEB DEVELOPMENT");
        s.setSummary("WEB DEVELOPMENT");
        s.setTask("");
        s.setJudcriteria("");
        s.setCoordinators("");
        s.setImage(R.drawable.web);
        events.add(s);


        return events;
    }
}
