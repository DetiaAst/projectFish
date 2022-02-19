package com.example.fish;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class AllFishKecil implements Serializable {
    @SerializedName("Species Illustration Photo")
    @Expose
    private FishPictureIllustration fishPicture;

    @SerializedName("Species Name")
    @Expose
    private String speciesName;

    public FishPictureIllustration getFishPicture() {
        return fishPicture;
    }

    public void setFishPicture(FishPictureIllustration fishPicture) {
        this.fishPicture = fishPicture;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }
}
