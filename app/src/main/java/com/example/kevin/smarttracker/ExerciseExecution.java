package com.example.kevin.smarttracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class ExerciseExecution extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_execution);
        Bundle bundle = getIntent().getExtras();
        final FitnessExercise exercise = ManagementSystem.getInstance().getFitnessExercise((String) bundle.get("exercise"));
        if (exercise != null) {
            VideoView mVideoView  = (VideoView)findViewById(R.id.videoView);
            mVideoView.setVideoURI(exercise.getUri());
            mVideoView.setMediaController(new MediaController(ExerciseExecution.this));
            mVideoView.seekTo(100);
        }
    }
}