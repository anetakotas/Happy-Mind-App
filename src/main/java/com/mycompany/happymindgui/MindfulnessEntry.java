package com.mycompany.happymindgui;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author necia
 */
public class MindfulnessEntry extends MindfulnessListActivity {
    private String userEntry;
    
    public MindfulnessEntry() {
        this.userEntry = "";
    }

    public MindfulnessEntry(String userEntry) {
        this.userEntry = userEntry;
    }

    public String getUserEntry() {
        return userEntry;
    }

    public void setUserEntry(String userEntry) {
        this.userEntry = userEntry;
    }
    
}
