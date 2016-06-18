package com.example.kevin.smarttracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button shortTraining, fullTraining, ownTraining, freeTraining;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        shortTraining = (Button) findViewById(R.id.shortTraining);
        shortTraining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent myIntent = new Intent(MainActivity.this, FreeTraining.class);
                //myIntent.putExtra("key",value);
                //MainActivity.this.startActivity(myIntent);
            }
        });

        fullTraining = (Button) findViewById(R.id.fullTraining);
        fullTraining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent myIntent = new Intent(MainActivity.this, FreeTraining.class);
                //myIntent.putExtra("key",value);
                //MainActivity.this.startActivity(myIntent);
                fullTraining.setText("#demnächst Verfügbar");
            }
        });

        ownTraining = (Button) findViewById(R.id.ownTraining);
        ownTraining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent myIntent = new Intent(MainActivity.this, FreeTraining.class);
                //myIntent.putExtra("key",value);
                //MainActivity.this.startActivity(myIntent);
                ownTraining.setText("#demnächst Verfügbar");
            }
        });

        freeTraining = (Button) findViewById(R.id.freeTraining);
        freeTraining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, FreeTraining.class);
                //myIntent.putExtra("key",value);
                MainActivity.this.startActivity(myIntent);
            }
        });
    }
}