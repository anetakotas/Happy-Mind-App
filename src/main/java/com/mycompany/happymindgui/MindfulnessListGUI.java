/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.happymindgui;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author necia
 */
public class MindfulnessListGUI extends javax.swing.JFrame {
    MindfulnessList mindfulnessList;
    DefaultListModel listModel;
    MindfulnessEntry mindfulnessEntry;
    /**
     * Creates new form MindfulnessList
     * @throws java.io.FileNotFoundException
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public MindfulnessListGUI() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        initComponents();
        setLocationRelativeTo(null);
        mindfulnessList = MindfulnessList.getListInstance();
        mindfulnessList.readFile();
        listModel = new DefaultListModel();
        loadEntries();
    }
    
    private void loadEntries(){
        listModel.clear();
        for (String entryContext: mindfulnessList.getEntries()) {
            listModel.addElement(entryContext);
        }
        listDisplay.setModel(listModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        addEntry = new javax.swing.JButton();
        editEntry = new javax.swing.JButton();
        deleteEntry = new javax.swing.JButton();
        searchEntry = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listDisplay = new javax.swing.JList<>();
        jButton5 = new javax.swing.JButton();
        dailyGoalProgress = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        changeGoal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 26)); // NOI18N
        jLabel1.setText("Mindfulness List");

        addEntry.setText("Add New Entry");
        addEntry.setDefaultCapable(false);
        addEntry.setFocusPainted(false);
        addEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEntryActionPerformed(evt);
            }
        });

        editEntry.setText("Edit Existing Entry");
        editEntry.setDefaultCapable(false);
        editEntry.setFocusPainted(false);
        editEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editEntryActionPerformed(evt);
            }
        });

        deleteEntry.setText("Delete Entry");
        deleteEntry.setDefaultCapable(false);
        deleteEntry.setFocusPainted(false);

        searchEntry.setText("Search For Entry");
        searchEntry.setDefaultCapable(false);
        searchEntry.setFocusPainted(false);

        listDisplay.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listDisplay);

        jButton5.setText("Back");
        jButton5.setDefaultCapable(false);
        jButton5.setFocusPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel2.setText("Today's goal:");

        changeGoal.setText("Change Daily Goal");
        changeGoal.setDefaultCapable(false);
        changeGoal.setFocusPainted(false);
        changeGoal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeGoalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addEntry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editEntry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteEntry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchEntry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton5))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dailyGoalProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(changeGoal))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(addEntry)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editEntry)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteEntry)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchEntry))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dailyGoalProgress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(changeGoal)
                            .addComponent(jButton5))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editEntryActionPerformed
        // TODO add your handling code here:
//        MindfulnessEntry mindfulnessEntry = new MindfulnessEntry();
//        String userEntry 
    }//GEN-LAST:event_editEntryActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new MainMenu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void changeGoalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeGoalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changeGoalActionPerformed

    private void addEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEntryActionPerformed
        // TODO add your handling code here:
//        String userEntry = JOptionPane.showInputDialog("Enter your entry:");
//        mindfulnessEntry = new MindfulnessEntry(userEntry);
//        mindfulnessEntry.setUserEntry(userEntry);
//        mindfulnessList.addEntry(userEntry);
//        mindfulnessList.saveFile();
//        System.out.println(userEntry);
//        loadEntries();
          String userEntry = JOptionPane.showInputDialog("Enter your entry:");
          MindfulnessEntry mindfulnessEntry = null;
          mindfulnessEntry = new MindfulnessEntry(userEntry);
          mindfulnessList.addEntry(mindfulnessEntry);
          System.out.println(mindfulnessEntry);
        try {
            mindfulnessList.saveFile(mindfulnessEntry);
        } catch (IOException ex) {
            Logger.getLogger(MindfulnessListGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MindfulnessListGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
          loadEntries();
          
    }//GEN-LAST:event_addEntryActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MindfulnessListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MindfulnessListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MindfulnessListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MindfulnessListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MindfulnessListGUI().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(MindfulnessListGUI.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(MindfulnessListGUI.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(MindfulnessListGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEntry;
    private javax.swing.JButton changeGoal;
    private javax.swing.JProgressBar dailyGoalProgress;
    private javax.swing.JButton deleteEntry;
    private javax.swing.JButton editEntry;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listDisplay;
    private javax.swing.JButton searchEntry;
    // End of variables declaration//GEN-END:variables
}
