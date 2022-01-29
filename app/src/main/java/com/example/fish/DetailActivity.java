package com.example.fish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    AllFish ikanKiriman;
    TextView txtBiology,txtHabitat,txtHabitatImpact,txtNfr,txtPopulation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        txtBiology=(TextView)findViewById(R.id.txt_biology);
//        txtHabitat=(TextView)findViewById(R.id.txt_habitat);
//        txtHabitatImpact=(TextView)findViewById(R.id.txt_habitatImpact);
//        txtNfr=(TextView) findViewById()
//        Intent dapet = getIntent();
//        ikanKiriman= (AllFish) dapet.getSerializableExtra("paket");
//        txtBiology.setText(ikanKiriman.getBiology());
//        txtHabitat.setText(ikanKiriman.getHabitat());
//        txtHabitatImpact.setText(ikanKiriman.getHabitatImpacts());
//        txtNfr.setText(ikanKiriman.getNOAAFisheriesRegion());
//        txtPopulation.setText(ikanKiriman.getPopulation());
    }
}