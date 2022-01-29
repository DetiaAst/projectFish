package com.example.fish;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Gallery implements Serializable{
    @SerializedName("src")
    private String src;
    @SerializedName( "alt")
    private String alt;
    @SerializedName("title")
    private String title;

    public String getSrc() {
        return src;
    }

    public String getAlt() {
        return alt;
    }

    public String getTitle() {
        return title;
    }
}
