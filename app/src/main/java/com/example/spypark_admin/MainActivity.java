package com.example.spypark_admin;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Double3;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView D1,D2,D3,D4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        D1 = (CardView) findViewById (R.id.d1);
        D2 = (CardView) findViewById(R.id.d2);
        D3 = (CardView) findViewById(R.id.d3);
        D4 = (CardView) findViewById(R.id.d4);

        D1.setOnClickListener((View.OnClickListener) this);
        D2.setOnClickListener((View.OnClickListener) this);
        D3.setOnClickListener((View.OnClickListener) this);
        D4.setOnClickListener((View.OnClickListener) this);



    }
    @Override
    public void onClick(View V) {
        Intent i;
        switch (V.getId()){
            case R.id.d1: i = new Intent(this, d1.class);startActivity(i); break;
            case R.id.d2: i = new Intent(this, d2.class);startActivity(i); break;
            case R.id.d3: i = new Intent(this, d3.class);startActivity(i); break;
            case R.id.d4: i = new Intent(this, d4.class);startActivity(i); break;


        }
    }


}