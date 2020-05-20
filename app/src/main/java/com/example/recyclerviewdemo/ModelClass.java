package com.example.recyclerviewdemo;

public class ModelClass {

    private int imageIcon;
    String title;

    public int getImageIcon() {
        return imageIcon;
    }

    public String getTitle() {
        return title;
    }

    public ModelClass(int imageIcon, String title) {
        this.imageIcon = imageIcon;
        this.title = title;
    }
}
