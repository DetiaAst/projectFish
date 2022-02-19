package com.example.fish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailActivity extends AppCompatActivity {
    List<AllFish>ikanKirimanMentah;
    AllFish ikanKiriman;
    String namaIkannya;
    TextView txtNfr,txtPopulation,txtSn,txtBycatch,txtQuote,txtSfat;
    WebView webBiologi,webHabitat,webHabitatImpacts,webLocation,webHb,webPhysicalDescription;
    Button btnDet;
    ApiInterface apiInterface;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        webBiologi=(WebView) findViewById(R.id.web_biology);
        webHabitat=(WebView) findViewById(R.id.web_habitat);
        webHabitatImpacts=(WebView)findViewById(R.id.web_habitatImpact);
        webLocation=(WebView)findViewById(R.id.web_location);

        btnDet=(Button) findViewById(R.id.btnDet);

        webHb=(WebView)findViewById(R.id.web_hb);
        webPhysicalDescription=(WebView)findViewById(R.id.web_pd) ;
        txtNfr=(TextView) findViewById(R.id.txt_nfr);
        txtPopulation=(TextView) findViewById(R.id.txt_population);
        txtSn=(TextView) findViewById(R.id.txt_sn);
        txtBycatch=(TextView) findViewById(R.id.txt_Bycatch);
        txtQuote=(TextView) findViewById(R.id.txt_quote);
        txtSfat=(TextView) findViewById(R.id.txt_sfat);

        Intent dapet = getIntent();
        namaIkannya= dapet.getStringExtra("paket");
        apiInterface=ApiClient.ambilFish().create(ApiInterface.class);
        Call<List<AllFish>> allFishCall=apiInterface.getSatuFish(namaIkannya);
        allFishCall.enqueue(new Callback<List<AllFish>>() {
            @Override
            public void onResponse(Call<List<AllFish>> call, Response<List<AllFish>> response) {
                ikanKirimanMentah=response.body();
                ikanKiriman=ikanKirimanMentah.get(0);
                String biologi = ikanKiriman.getBiology();

                webBiologi.getSettings().getJavaScriptEnabled();
                webBiologi.loadData(String.format(biologi), "text/html", "utf-8");

                String habitat= ikanKiriman.getHabitat();
                webHabitat.getSettings().getJavaScriptEnabled();
                webHabitat.loadData(String.format(habitat),"text/html", "utf-8");

                String habitatImpacts=ikanKiriman.getHabitatImpacts();
                webHabitatImpacts.getSettings().getJavaScriptEnabled();
                webHabitatImpacts.loadData(String.format(habitatImpacts),"text/html", "utf-8");

                String location= ikanKiriman.getLocation();
                webLocation.getSettings().getJavaScriptEnabled();
                webLocation.loadData(String.format(location),"text/html", "utf-8");



                String hb= ikanKiriman.getHealthBenefits();
                webHb.getSettings().getJavaScriptEnabled();
                webHb.loadData(String.format(hb),"text/html", "utf-8");

                String pd= ikanKiriman.getPhysicalDescription();
                webPhysicalDescription.getSettings().getJavaScriptEnabled();
                webPhysicalDescription.loadData(String.format(pd),"text/html", "utf-8");

                txtNfr.setText(ikanKiriman.getNOAAFisheriesRegion());
                txtPopulation.setText(ikanKiriman.getPopulation());
                txtSn.setText(ikanKiriman.getSpeciesName());
                txtBycatch.setText(ikanKiriman.getBycatch());

                txtSfat.setText(ikanKiriman.getSaturatedFattyAcidsTotal());
                txtQuote.setText(ikanKiriman.getQuote());

                btnDet.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent pindahBtnDet= new Intent(DetailActivity.this, Gizi.class);
                        pindahBtnDet.putExtra("paket",ikanKiriman);
                        startActivity(pindahBtnDet);
                    }
                });
            }

            @Override
            public void onFailure(Call<List<AllFish>> call, Throwable t) {

            }
        });

    }

}