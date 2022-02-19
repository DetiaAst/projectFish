package com.example.fish;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {
    @GET("species")
    Call<List<AllFishKecil>> getListFish();

    @GET("species/{spec}")
    Call<List<AllFish>> getSatuFish(@Path("spec") String spec);
}
