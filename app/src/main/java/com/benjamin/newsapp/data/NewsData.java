package com.benjamin.newsapp.data;

public class NewsData {

    private String title;
    private String date;
    private int imageResourceId;

    public NewsData(String title, String date, int imageResourceId) {
        this.title = title;
        this.date = date;
        this.imageResourceId = imageResourceId;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
