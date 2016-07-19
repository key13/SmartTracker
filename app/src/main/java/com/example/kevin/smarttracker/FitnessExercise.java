package com.example.kevin.smarttracker;

import android.net.Uri;

/**
 * Created by kevin on 19.07.2016.
 */
public class FitnessExercise {

    private String _name, _startingPosition, _properExecution;
    private Uri _uri;

    private FitnessExercise(){}

    public FitnessExercise(String name, String startingPosition, String properExecution, Uri uri){
        this._name = name;
        this._startingPosition = startingPosition;
        this._properExecution = properExecution;
        this._uri = uri;
    }

    public String getName(){
        return this._name;
    }

    public String getStartingPosition(){
        return this._startingPosition;
    }

    public String getProperExecution(){
        return this._properExecution;
    }

    public Uri getUri(){ return this._uri; }
}
