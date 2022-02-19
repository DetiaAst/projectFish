package com.example.fish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Gizi extends AppCompatActivity {
    TextView txtCalories, txtCholesterol, txtCarbohydrate, txtProtein;
    AllFish ikanKiriman;
    Button btnGizi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gizi);
        txtCalories = (TextView) findViewById(R.id.txt_Calories);
        txtCholesterol = (TextView) findViewById(R.id.txt_Cholesterol);
        txtCarbohydrate = (TextView) findViewById(R.id.txt_Carbohydrate);
        txtProtein = (TextView) findViewById(R.id.txt_protein);
        btnGizi = (Button) findViewById(R.id.btnGZ);
        Intent dapet=getIntent();
        ikanKiriman= (AllFish) dapet.getSerializableExtra("paket");

        txtCalories.setText(ikanKiriman.getCalories());
        txtCholesterol.setText(ikanKiriman.getCholesterol());
        txtCarbohydrate.setText(ikanKiriman.getCarbohydrate());
        txtProtein.setText(ikanKiriman.getProtein());
        btnGizi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahBtnGiz = new Intent(Gizi.this, Harvest.class);
                pindahBtnGiz.putExtra("paket",ikanKiriman);
                startActivity(pindahBtnGiz);
            }

        });
    }
}
