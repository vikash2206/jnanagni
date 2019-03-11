package com.example.coverflow.Contact;

import com.example.coverflow.R;

import java.util.ArrayList;



public class ContactCollection {

    public static ArrayList<Contact> getContact()
    {
        ArrayList<Contact> events=new ArrayList<>();

        Contact s=new Contact();

        s.setName("VIKASH KUMAR GUPTA");
        s.setGmail("vikashkumar220698@gmail.com");
        s.setDevelop("HEAD APP DEVELOPER");
        s.setImage(R.drawable.v);
        s.setCall("");
        events.add(s);

         s=new Contact();
        s.setName("RAMAKANT SHAKYA");
        s.setGmail("ramakant0722@gmail.com");
        s.setDevelop("FrontEnd APP DEVELOPER");
        s.setImage(R.drawable.r);
        s.setCall("8630500420");
        events.add(s);


        s=new Contact();
        s.setName("JAPNEET SINGH");
        s.setGmail("");
        s.setDevelop("APP DEVELOPER");
        s.setImage(R.drawable.pubg3);
        s.setCall("");
        events.add(s);

        s=new Contact();

        s.setName("VIKAS YADAV");
        s.setGmail("");
        s.setDevelop("APP DEVELOPER");
        s.setImage(R.drawable.pubg3);
        s.setCall("");
        events.add(s);

        return events;
    }
}
