package com.example.coverflow.Contact;

import com.example.coverflow.R;

import java.util.ArrayList;

public class Contactcollection2 {

    public static ArrayList<Contact> getContact()
    {
        ArrayList<Contact> events=new ArrayList<>();

        Contact s=new Contact();

        s.setName("VIKASH KUMAR GUPTA");
        s.setGmail("vikashkumar220698@gmail.com.com");
        s.setDevelop("HEAD APP DEVELOPER");
        s.setImage(R.drawable.v);
        events.add(s);

        s=new Contact();

        s.setName("RAMAKANT SHAKYA");
        s.setGmail("ramakant0722@gmail.com");
        s.setDevelop("APP DEVELOPER");
        s.setImage(R.drawable.pubg3);
        events.add(s);

        s.setName("japneet singh");
        s.setGmail("");
        s.setDevelop("APP DEVELOPER");
        s.setImage(R.drawable.pubg3);
        events.add(s);

        s=new Contact();

        s.setName("vikas yadav");
        s.setGmail("");
        s.setDevelop("APP DEVELOPER");
        s.setImage(R.drawable.pubg3);
        events.add(s);

        s.setName("RAMAKANT SHAKYA");
        s.setGmail("ramakant0722@gmail.com");
        s.setDevelop("HEAD APP DEVELOPER");
        s.setImage(R.drawable.pubg3);
        events.add(s);

        s=new Contact();
        s.setName("RAMAKANT SHAKYA");
        s.setGmail("ramakant0722@gmail.com");
        s.setDevelop("HEAD APP DEVELOPER");
        s.setImage(R.drawable.pubg3);
        events.add(s);

        return events;
    }
}
