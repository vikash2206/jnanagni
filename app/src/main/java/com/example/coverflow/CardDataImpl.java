package com.example.coverflow;

import com.ramotion.expandingcollection.ECCardData;
import java.util.ArrayList;

public class CardDataImpl implements ECCardData<String> {

    private String cardTitle;
    private Integer mainBackgroundResource;
    private Integer headBackgroundResource;
    private  ArrayList<String> listItems;

    public CardDataImpl(String cardTitle, Integer mainBackgroundResource, Integer headBackgroundResource) {
        this.mainBackgroundResource = mainBackgroundResource;
        this.headBackgroundResource = headBackgroundResource;

        this.cardTitle = cardTitle;
    }

    @Override
    public Integer getMainBackgroundResource() {
        return mainBackgroundResource;
    }

    @Override
    public Integer getHeadBackgroundResource() {
        return headBackgroundResource;
    }

    @Override
    public  ArrayList<String> getListItems() {
        return listItems;
    }

    public String getCardTitle() {
        return cardTitle;
    }

    public static ArrayList<ECCardData> generateExampleData() {
        ArrayList<ECCardData> list = new ArrayList<>();
        list.add(new CardDataImpl("EVENTS", R.drawable.vkg4, R.drawable.vkg4));
        list.add(new CardDataImpl("REGISTER", R.drawable.vkg, R.drawable.vkg));
        list.add(new CardDataImpl("SPONSORS", R.drawable.p1, R.drawable.p1));
        list.add(new CardDataImpl("GALLERY", R.drawable.p4, R.drawable.p4));
        list.add(new CardDataImpl("CONTACT US", R.drawable.p11, R.drawable.p11));
        list.add(new CardDataImpl("ABOUT US", R.drawable.a, R.drawable.a));


        return list;
    }



}