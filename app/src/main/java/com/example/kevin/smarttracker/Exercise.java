package com.example.kevin.smarttracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Exercise extends AppCompatActivity {

    Button start;
    TextView headline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
        Bundle bundle = getIntent().getExtras();
        final FitnessExercise exercise = ManagementSystem.getInstance().getFitnessExercise((String) bundle.get("exercise"));
        if (exercise != null) {
            headline = (TextView) findViewById(R.id.textView2);
            headline.setText(exercise.getName());
            headline.setTextColor(141414);

            start = (Button) findViewById(R.id.button);
            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent myIntent = new Intent(Exercise.this, ExerciseExecution.class);
                    myIntent.putExtra("exercise", exercise.getName());
                    //myIntent.putExtra("key",value);
                    Exercise.this.startActivity(myIntent);
                }
            });
        }
    }
}