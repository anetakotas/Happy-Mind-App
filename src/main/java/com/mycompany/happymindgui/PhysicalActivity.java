/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */package com.mycompany.happymindgui;



/**
 *
 * @Breda Logan
 */

//This super class has common attributes like name, duration, and description.
public class PhysicalActivity {
    
    //protected to allow subclasses to inherit and modify them
    protected String activityName;
    protected int duration;
    protected String description;

    // Constructor with parameters to initialize the activity attributes
    public PhysicalActivity(String activityName, int duration, String description) {
        this.activityName = activityName;
        this.duration = duration;
        this.description = description;
    }

    // Default constructor, initializes attributes to default values
    public PhysicalActivity() {
        this.activityName = "";
        this.duration = 0;
        this.description = "";
    }
    
    //getter methods
    public String getActivityName() {
        return activityName;
    }

    public int getDuration() {
        return duration;
    }

    public String getDescription() {
        return description;
    }
}