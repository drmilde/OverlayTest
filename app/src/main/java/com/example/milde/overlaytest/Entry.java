package com.example.milde.overlaytest;

/**
 * Created by milde on 13.12.17.
 */

public class Entry {

    private final int imageResId;
    private final String title;

    public Entry( int imageResId, String title ) {
        this.imageResId = imageResId;
        this.title = title;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getTitle() {
        return title;
    }

}

