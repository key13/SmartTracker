package com.example.kevin.smarttracker;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.media.session.MediaController;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.VideoView;

public class Exercise extends AppCompatActivity {

    TextView headline, description;
    VideoView videoView;
    MediaController videoController;
    Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
        Bundle bundle = getIntent().getExtras();
        final FitnessExercise exercise = ManagementSystem.getInstance().getFitnessExercise((String) bundle.get("exercise"));
        if (exercise != null) {
            headline = (TextView) findViewById(R.id.textView2);
            headline.setText(exercise.getName());

            description = (TextView) findViewById(R.id.textView4);
            description.setText(Html.fromHtml("<b>Ausgangsposition:</b><br>" + exercise.getStartingPosition() + "<br><b>Richtige Ausführung:</b><br>" + exercise.getProperExecution()));
            description.setMovementMethod(new ScrollingMovementMethod());

            //videoView = (VideoView) findViewById(R.id.videoView);
            //videoController = new MediaController(Exercise.this);
            //videoView.setVideoPath("../..assets/Prisoner Squat - YouTube.mp4");
            //videoController.setMediaPlayer(videoView);
            //videoView.setMediaController(videoController);

            /*VideoView mVideoView  = (VideoView)findViewById(R.id.videoView);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                if (mVideoView != null) {
                    mVideoView.setMediaController(new MediaController(Exercise.this));
                }
                mVideoView.setVideoURI(Uri.parse("../..assets/Prisoner Squat - YouTube.mp4"));
                mVideoView.requestFocus();
                mVideoView.start();
            }*/


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