package com.example.fish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.Toast;

import java.io.Serializable;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Splashscreen extends AppCompatActivity {
    ApiInterface apiInterface;
    List<AllFishKecil> allFish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        new AmbilData().execute();
    }

    private class AmbilData extends AsyncTask<Void,Void,Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }
        @Override
        protected Void doInBackground(Void... voids) {
            apiInterface=ApiClient.ambilFish().create(ApiInterface.class);
            Call<List<AllFishKecil>> listCall=apiInterface.getListFish();
            listCall.enqueue(new Callback<List<AllFishKecil>>() {
                @Override
                public void onResponse(Call<List<AllFishKecil>> call, Response<List<AllFishKecil>> response) {
                    allFish=response.body();
                    Intent kirimIkan = new Intent(Splashscreen.this,MainActivity.class);
                    kirimIkan.putExtra("ikannya", (Serializable) allFish);
                    startActivity(kirimIkan);
                    finish();

                }

                @Override
                public void onFailure(Call<List<AllFishKecil>> call, Throwable t) {
                    Toast.makeText(Splashscreen.this,"data gagal didapat",Toast.LENGTH_LONG).show();
                }
            });

            return null;
        }
        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);

        }

    }
}