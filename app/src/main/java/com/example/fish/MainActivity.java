package com.example.fish;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

   RecyclerView.LayoutManager layoutManager;
   List<AllFishKecil> allFish;
   ApiInterface apiInterface;

   AllFishAdapter allFishAdapter;
   RecyclerView rvAllFish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvAllFish=(RecyclerView)findViewById(R.id.rv_all);
        layoutManager=new LinearLayoutManager(this);
        rvAllFish.setLayoutManager(layoutManager);
//        apiInterface=ApiClient.ambilFish().create(ApiInterface.class);
//        Call<List<AllFish>>listCall=apiInterface.getListFish();
//        listCall.enqueue(new Callback<List<AllFish>>() {
//            @Override
//            public void onResponse(Call<List<AllFish>> call, Response<List<AllFish>> response) {
//                allFish=response.body();
//                allFishAdapter=new AllFishAdapter(MainActivity.this,allFish);
//                rvAllFish.setAdapter(allFishAdapter);
//                allFishAdapter.notifyDataSetChanged();
//            }
//
//            @Override
//            public void onFailure(Call<List<AllFish>> call, Throwable t) {
//                Toast.makeText(MainActivity.this,"data gagal didapat",Toast.LENGTH_LONG).show();
//            }
//        });
        Intent dapetIkan = getIntent();
        allFish= (List<AllFishKecil>) dapetIkan.getSerializableExtra("ikannya");
        allFishAdapter=new AllFishAdapter(MainActivity.this,allFish);
        rvAllFish.setAdapter(allFishAdapter);
        allFishAdapter.notifyDataSetChanged();

    }
    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("Really Exit?")
                .setMessage("Are you sure you want to exit?")
                .setNegativeButton(android.R.string.no, null)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface arg0, int arg1) {
                        MainActivity.super.onBackPressed();
                    }
                }).create().show();
    }
}