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