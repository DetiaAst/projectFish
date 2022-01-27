package com.example.fish;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AllFish {
    @SerializedName("Species Illustration Photo")
    @Expose
    private FishPictureIllustration fishPicture;

    @SerializedName("Species Name")
    @Expose
    private String speciesName;

    @SerializedName("Habitat")
    @Expose
    private String Habitat;

    @SerializedName("Habitat Impacts")
    @Expose
    private  String HabitatImpacts;

    @SerializedName("Location")
    @Expose
    private String Location;

    @SerializedName("NOAA Fisheries Region")
    @Expose
    private String NOAAFisheriesRegion;

    @SerializedName("Population")
    @Expose
    private  String Population;

    @SerializedName("Scientific Name")
    @Expose
    private String ScientificName;

    @SerializedName("Biology")
    @Expose
    private String Biology;

    @SerializedName("Bycatch")
    @Expose
    private  String Bycatch;

    public String getScientificName() {
        return ScientificName;
    }

    public String getPopulation() {
        return Population;
    }

    public String getNOAAFisheriesRegion() {
        return NOAAFisheriesRegion;
    }

    public String getLocation() {
        return Location;
    }

    public String getHabitatImpacts() {
        return HabitatImpacts;
    }

    public String getHabitat() {
        return Habitat;
    }

    public FishPictureIllustration getFishPicture() {
        return fishPicture;
    }

    public String getSpeciesName() {
        return speciesName;
    }
}
