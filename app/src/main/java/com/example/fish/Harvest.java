package com.example.fish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Harvest extends AppCompatActivity {
    WebView webHarvest;
    AllFish ikanKiriman;
    Button btnhv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harvest);
        webHarvest=(WebView)findViewById(R.id.web_harvest);
        btnhv=(Button) findViewById(R.id.btnhv);
        Intent dapet=getIntent();
        ikanKiriman= (AllFish) dapet.getSerializableExtra("paket");



        String harvest= ikanKiriman.getHarvest();
        webHarvest.getSettings().getJavaScriptEnabled();
        webHarvest.loadData(String.format(harvest),"text/html", "utf-8");
        btnhv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahBtnhv= new Intent(Harvest.this, Splashscreen.class);
                startActivity(pindahBtnhv);
            }
        });
    }
}