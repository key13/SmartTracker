package com.example.kevin.smarttracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Iterator;
import java.util.List;

public class FreeTraining extends AppCompatActivity {

    ArrayAdapter<String> adapter;
    ListView listView;
    //String[] exercises = {"Gefangenen-Kniebeuge", "Liegestütz", "Hüftheben"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_free_training);

        List<FitnessExercise> fitnessExercises = ManagementSystem.getInstance().getFitnessexercises();
        String[] fitnessExerciseNames = new String[fitnessExercises.size()];
        Iterator<FitnessExercise> iter = fitnessExercises.iterator();
        for(int i = 0; i < fitnessExerciseNames.length; i++){
            fitnessExerciseNames[i] = iter.next().getName();
        }

        listView = (ListView) findViewById(R.id.listView);
        adapter = new ArrayAdapter<String>(this, R.layout.list_item, fitnessExerciseNames);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getBaseContext(), parent.getItemAtPosition(position) + " is selected", Toast.LENGTH_SHORT).show();
                Intent myIntent = new Intent(FreeTraining.this, Exercise.class);
                myIntent.putExtra("exercise", (String)parent.getItemAtPosition(position));
                FreeTraining.this.startActivity(myIntent);
            }
        });
    }
}