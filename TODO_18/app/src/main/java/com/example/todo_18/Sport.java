package com.example.todo_18;

public class Sport {
    private String title;
    private String info;
    private final int imageResources;

    public Sport(String title, String info, int imageResources) {
        this.title = title;
        this.info = info;
        this.imageResources=imageResources;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getImageResources() {
        return imageResources;
    }
}

