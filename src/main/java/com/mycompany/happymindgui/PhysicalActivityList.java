package com.mycompany.happymindgui;


import java.util.ArrayList;
import java.util.Calendar;



/**
 *
 * @Breda Logan
 */

// PhysicalActivityList class manages lists of different physical activities.
// It follows the Singleton pattern to ensure a single instance is created.
public class PhysicalActivityList {
    // Singleton instance
    private static PhysicalActivityList INSTANCE = new PhysicalActivityList();
    private ArrayList<CardioActivity> cardioActivities;
    private ArrayList<ToningActivity> toningActivities;
    private ArrayList<FlexibilityActivity> flexibilityActivities;

// Private constructor to initialize activity lists
private PhysicalActivityList() {
    // initialise array lists
        cardioActivities = new ArrayList<>();
        flexibilityActivities = new ArrayList<>();
        toningActivities = new ArrayList<>();
        
        
           cardioActivities.add(new CardioActivity ("Walking", 30,"Outdoor Walking"));
           cardioActivities.add(new CardioActivity ("Gardening", 45, "Outdoor gardening"));
           cardioActivities.add(new CardioActivity ("Swimming", 60, "Swimming in local pool"));
           cardioActivities.add(new CardioActivity ("Cycling", 60, "You can cycle out side or use the gym. If cycling outside, remember to wear protective clothing"));
           cardioActivities.add(new CardioActivity ("Exercise Class", 60, "Attend local exercise class e.g. Pilates, Yoga, Dance, Spinning, Aerobic Classes"));
           cardioActivities.add(new CardioActivity ("Jogging", 20, "Try some light jogging suitable to your level of ability"));
           cardioActivities.add(new CardioActivity ("Rest Day", 0, "It's important to take a day off, no phyical activity today"));
           
           flexibilityActivities.add(new FlexibilityActivity ("Arm Circles", 5, "Rotate our arms in a circular motion to enhance shoulder and arm flexibility"));
           flexibilityActivities.add(new FlexibilityActivity ("Neck Stretches", 5, "Gently tilt and rotate your head to improvie neck flexibility"));
           flexibilityActivities.add(new FlexibilityActivity ("Hip Flexor Stretch", 5, "Kneel and lunge forward to stretch the hip flexors"));
           flexibilityActivities.add(new FlexibilityActivity ("Shoulder Stretch", 5, "Cross one arm across your chest and gently push the elbow with the other arm to stretch the shoulders"));
           flexibilityActivities.add(new FlexibilityActivity ("Cat-Cow Stretch", 5, "Get onto hands and knees and arch, then round your back"));
           flexibilityActivities.add(new FlexibilityActivity ("Ankle Rolls", 5, "Rotate your ankles in circular motions to improve ankle flexibility"));
           flexibilityActivities.add(new FlexibilityActivity ("Yoga", 30, "Attend a Yoga class or follow an online tutorial"));
           
           toningActivities.add (new ToningActivity ("Plank", 10, "Balls of feet to toes and hands on the floor,straight line from head to heels in a static position, hold for 30, rest for 60"));
           toningActivities.add (new ToningActivity ("Wall Sits", 10, "Back against at wall, bend knees forming a 90 degree angle"));
           toningActivities.add (new ToningActivity ("Jumping Jacks", 10, "Jump, spreading your legs, and raising your arms overhead simultaneously"));
           toningActivities.add (new ToningActivity ("Half Push Ups", 15, "Hands and knees on the ground, straight line from head to knee, lower and raise body"));
           toningActivities.add (new ToningActivity ("Bicycle Crunches", 15, "Lying on back, alternately bring opposite elbow to knee in a cycling motion"));
           toningActivities.add (new ToningActivity ("Mountain Climbers", 15, "Start in a plank position and bring alternating knees towards your chest in a quick, running-like motiony"));
           toningActivities.add (new ToningActivity ("Rest Day", 0, "It's important to take a day off, no physical activity today"));


        
    }

// Getter method to access the singleton instance
public static PhysicalActivityList getInstance(){
     return INSTANCE;
 }

 // Method to replace an activity for the current day
public void replaceActivity(PhysicalActivity newActivity) {
        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int index = dayOfWeek - 1;

        if (index < 0) {
            index = cardioActivities.size() - 1;
        }

        // Determine the type of activity and update the corresponding list
        if (newActivity instanceof CardioActivity) {
            cardioActivities.set(index, (CardioActivity) newActivity);
        } else if (newActivity instanceof FlexibilityActivity) {
            flexibilityActivities.set(index, (FlexibilityActivity) newActivity);
        } else if (newActivity instanceof ToningActivity) {
            toningActivities.set(index, (ToningActivity) newActivity);
        }
    }
 // Getter methods to access activity lists
public ArrayList<CardioActivity> getCardioActivities() {
        return cardioActivities;
    }

    public ArrayList<ToningActivity> getToningActivities() {
        return toningActivities;
    }

    public ArrayList<FlexibilityActivity> getFlexibilityActivities() {
        return flexibilityActivities;
    }




}

