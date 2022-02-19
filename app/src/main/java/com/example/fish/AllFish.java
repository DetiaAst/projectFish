package com.example.fish;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AllFish implements Serializable {
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

    @SerializedName("Calories")
    @Expose
    private  String Calories;


    private  String Cholesterol;

    @SerializedName("Carbohydrate")
    @Expose
    private String Carbohydrate;

    @SerializedName("Fat, Total")
    @Expose
    private String fatTotal;


    private  String Harvest;

    @SerializedName("Health Benefits")
    @Expose
    private  String HealthBenefits;

    @SerializedName("Physical Description")
    @Expose
    private String PhysicalDescription;


    private String Protein;

    @SerializedName("Quote")
    @Expose
    private  String Quote;

    @SerializedName("Saturated Fatty Acids, Total")
    @Expose
    private  String SaturatedFattyAcidsTotal ;





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

    public String getBiology() {
        return Biology;
    }

    public String getBycatch() {
        return Bycatch;
    }

    public String getCalories() {
        return Calories;
    }

    public String getCholesterol() {
        return Cholesterol;
    }

    public String getCarbohydrate() {
        return Carbohydrate;
    }

    public String getFatTotal() {
        return fatTotal;
    }

    public String getHarvest() {
        return Harvest;
    }

    public String getHealthBenefits() {
        return HealthBenefits;
    }

    public String getPhysicalDescription() {
        return PhysicalDescription;
    }

    public String getProtein() {
        return Protein;
    }

    public String getQuote() {
        return Quote;
    }

    public String getSaturatedFattyAcidsTotal() {
        return SaturatedFattyAcidsTotal;
    }
}
