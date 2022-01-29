package com.example.fish;

import java.io.Serializable;

public class FishPictureIllustration implements Serializable {
    private String src;
    private String alt;

    public String getSrc() {
        return src;
    }

    public String getAlt() {
        return alt;
    }
}
