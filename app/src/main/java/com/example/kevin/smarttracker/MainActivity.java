package com.example.kevin.smarttracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button _shortTraining, _fullTraining, _ownTraining, _freeTraining;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        _shortTraining = (Button) findViewById(R.id.shortTraining);
        _shortTraining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, Exercise.class);
                myIntent.putExtra("exercise", "Russische Drehung");
                myIntent.putExtra("training",3);
                MainActivity.this.startActivity(myIntent);
            }
        });

        _fullTraining = (Button) findViewById(R.id.fullTraining);
        _fullTraining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent myIntent = new Intent(MainActivity.this, FreeTraining.class);
                //myIntent.putExtra("key",value);
                //MainActivity.this.startActivity(myIntent);
                _fullTraining.setText("#demnächst Verfügbar");
            }
        });

        _ownTraining = (Button) findViewById(R.id.ownTraining);
        _ownTraining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent myIntent = new Intent(MainActivity.this, FreeTraining.class);
                //myIntent.putExtra("key",value);
                //MainActivity.this.startActivity(myIntent);
                _ownTraining.setText("#demnächst Verfügbar");
            }
        });

        _freeTraining = (Button) findViewById(R.id.freeTraining);
        _freeTraining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, FreeTraining.class);
                //myIntent.putExtra("key",value);
                MainActivity.this.startActivity(myIntent);
            }
        });
    }
}