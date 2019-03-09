package com.example.coverflow.Model;

public class GameEntity {
    public String  title,summary;
   public int url;


    public GameEntity(int url,String title ,String summary ) {
        this.title = title;
        this.summary = summary;
        this.url = url;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setUrl(int url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public String getSummary() {
        return summary;
    }

    public int getUrl() {
        return url;
    }
}