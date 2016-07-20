package com.example.kevin.smarttracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class ExerciseExecution extends AppCompatActivity {

    private Bundle _bundle;
    private Button _skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_execution);
        _bundle = getIntent().getExtras();
        final FitnessExercise exercise = ManagementSystem.getInstance().getFitnessExercise((String) _bundle.get("exercise"));
        if (exercise != null) {
            VideoView mVideoView  = (VideoView)findViewById(R.id.videoView);
            mVideoView.setVideoURI(exercise.getUri());
            mVideoView.setMediaController(new MediaController(ExerciseExecution.this));
            mVideoView.seekTo(100);
        }
        _skip = (Button) findViewById(R.id.button);
        _skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exerciseFinished();
            }
        });
    }

    private void exerciseFinished(){
        int id = (int)_bundle.get("training");
        id--;
        Intent myIntent;
        if(0 < id) {
            myIntent = new Intent(ExerciseExecution.this, Exercise.class);
            myIntent.putExtra("exercise", ManagementSystem.getInstance().getFitnessExercise(id).getName());
            myIntent.putExtra("training", id);
        }else{
            if(id < 0) {
                myIntent = new Intent(ExerciseExecution.this, FreeTraining.class);
            }else {
                myIntent = new Intent(ExerciseExecution.this, MainActivity.class);
            }
        }
        ExerciseExecution.this.startActivity(myIntent);
    }
}