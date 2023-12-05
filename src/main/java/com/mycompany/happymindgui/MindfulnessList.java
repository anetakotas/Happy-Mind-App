package com.mycompany.happymindgui;




import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author necia
 */
public class MindfulnessList extends MindfulnessListActivity {
    private ArrayList<MindfulnessEntry> mindfulnessList;
    private MindfulnessEntry mindfulnessEntry;
    private Connection conn;
    
    public void getConnection() throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/HappyMind", "root", "Kicia222");
    }
    
    private MindfulnessList() {
        mindfulnessList = new ArrayList<MindfulnessEntry>();
    }
    
    private static MindfulnessList listInstance = new MindfulnessList();
    
    public static MindfulnessList getListInstance() {
        return listInstance;
    }
    
    public void addEntry(MindfulnessEntry mindfulnessEntry) {
        mindfulnessList.add(mindfulnessEntry);
    }
    
    public MindfulnessEntry getEntry(int i) {
        return mindfulnessList.get(i);
    }
    
    public int getSize() {
        return mindfulnessList.size();
    }
    
    public void updateEntry(int i, MindfulnessEntry editedEntry) {
        MindfulnessEntry userEntry = mindfulnessList.set(i, editedEntry);
    }
    
    public void deleteEntry(int i) {
        mindfulnessList.remove(i);
    }
    
    public void getAllEntries() {
        for(int i = 0; i < mindfulnessList.size(); i++) {
            System.out.println("Entry " + (i + 1) + ": " + mindfulnessList.get(i));
        }
    }
    
    public ArrayList<String> getEntries() {
        ArrayList<String> entryStrings = new ArrayList<>();
        
        for(MindfulnessEntry mindfulnessEntry: mindfulnessList) {
            entryStrings.add(mindfulnessEntry.getUserEntry());
        }
        
        return entryStrings;
    }
    
    public void readFile() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        this.getConnection();
        Statement statement = conn.createStatement();
        ResultSet results = statement.executeQuery("SELECT * FROM Entry");
        while(results.next()) {
            MindfulnessEntry mindfulnessEntry = null;
            String userEntry = results.getString("entryContext");
            mindfulnessEntry = new MindfulnessEntry(userEntry);
            mindfulnessList.add(mindfulnessEntry);
        }
        conn.close();
    }
    
    public void saveFile(MindfulnessEntry mindfulnessEntry) throws FileNotFoundException, IOException, SQLException {
//        try {
//            
//            String entryContext = mindfulnessEntry.getUserEntry();
//            this.getConnection();
//            Statement statement = conn.createStatement();
//            statement.executeUpdate("INSERT INTO Entry(entryContext) VALUES('" + entryContext + "');");
//            conn.close();
//        }
//        catch(SQLException e) {
//            JOptionPane.showMessageDialog(null, e.toString());
//        }
          this.getConnection();
          Statement statement = conn.createStatement();
          String userEntry = mindfulnessEntry.getUserEntry();
          statement.executeUpdate("INSERT INTO Entry(entryContext) VALUES('" + userEntry + "');");
          conn.close();
    }
}

