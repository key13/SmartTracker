package com.example.kevin.smarttracker;

/**
 * Created by kevin on 19.07.2016.
 */
public class FitnessExercise {

    private String _name, _startingPosition, _properExecution;

    private FitnessExercise(){}

    public FitnessExercise(String name, String startingPosition, String properExecution){
        this._name = name;
        this._startingPosition = startingPosition;
        this._properExecution = properExecution;
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
}
