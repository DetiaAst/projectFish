package com.example.fish;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("api/species")
    Call<List<AllFish>> getListFish();
}
