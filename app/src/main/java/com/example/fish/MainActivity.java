package com.example.fish;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
   ApiInterface apiInterface;
   RecyclerView.LayoutManager layoutManager;
   List<AllFish> allFish;
   AllFishAdapter allFishAdapter;
   RecyclerView rvAllFish;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvAllFish=(RecyclerView)findViewById(R.id.rv_all);
        layoutManager=new LinearLayoutManager(this);
        rvAllFish.setLayoutManager(layoutManager);
        apiInterface=ApiClient.ambilFish().create(ApiInterface.class);
        Call<List<AllFish>> allFishCall = apiInterface.getListFish();
        allFishCall.enqueue(new Callback<List<AllFish>>() {
            @Override
            public void onResponse(Call<List<AllFish>> call, Response<List<AllFish>> response) {
                allFish=response.body();
                allFishAdapter=new AllFishAdapter(MainActivity.this,allFish);
                rvAllFish.setAdapter(allFishAdapter);
            }

            @Override
            public void onFailure(Call<List<AllFish>> call, Throwable t) {

            }
        });

    }
}