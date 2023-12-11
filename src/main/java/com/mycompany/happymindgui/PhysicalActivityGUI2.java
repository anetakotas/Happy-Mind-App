/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.happymindgui;

import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;



/**
 *
 * @Breda Logan
 */
public class PhysicalActivityGUI2 extends javax.swing.JFrame {

  
//constructor for PhysicalActivityGUI2
    
    public PhysicalActivityGUI2() {
        initComponents();
        setLocationRelativeTo(null);//This line sets the location of the GUI window to be centered on the screen.
     
        //action listeners invokes the action performed method when buttons are clicked
     btnFlex.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnFlexActionPerformed(evt);
    }
});
     
     btnToning.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnToningActionPerformed(evt);
    }
});
     
     btnCardio.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCardioActionPerformed(evt);
    }
});
     
}
   /*This method takes a PhysicalActivity object as a parameter and updates the GUI components
    (txtActivityName, txtDuration, and txtDescription) with the details from the provided PhysicalActivity*/
        private void updateActivityDetails(PhysicalActivity activity) {
        txtActivityName.setText(activity.getActivityName());
        txtDuration.setText(String.valueOf(activity.getDuration()));
        txtDescription.setText(activity.getDescription());
    }
  
        //retrieves the Activity from the list class that corresponds to the current day of the week
        //calenadar starts at 1.  Array list starts at zero. To map day to array list subtrat 1
    private FlexibilityActivity getSelectedFlexibilityActivity() {
    int dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
    int index = dayOfWeek - 1;

    // Return it to the last day of week
    if (index < 0) {
        index = PhysicalActivityList.getInstance().getFlexibilityActivities().size() - 1;
    }

    //returning the activity at the specified index from the list of activities.
    return PhysicalActivityList.getInstance().getFlexibilityActivities().get(index);
}

    private ToningActivity getSelectedToningActivity() {
    int dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
    int index = dayOfWeek - 1;

    // Handle negative index
    if (index < 0) {
        index = PhysicalActivityList.getInstance().getToningActivities().size() - 1;
    }

    return PhysicalActivityList.getInstance().getToningActivities().get(index);
}
    
    private CardioActivity getSelectedCardioActivity() {
    int dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
    int index = dayOfWeek - 1;

    // Handle  index
    if (index < 0) {
        index = PhysicalActivityList.getInstance().getToningActivities().size() - 1;
    }

    return PhysicalActivityList.getInstance().getCardioActivities().get(index);
}
   /*If the "Flexibility" radio button is selected, it calls the getRandomFlexibilityActivity 
    method to get a random flexibility activity.*/
  private PhysicalActivity generateRandomActivity() {
    PhysicalActivity newActivity = null;

    if (btnFlex.isSelected()) {
        newActivity = getRandomFlexibilityActivity();
    } else if (btnToning.isSelected()) {
        newActivity = getRandomToningActivity();
    } else if (btnCardio.isSelected()) {
        newActivity = getRandomCardioActivity();
    }

    return newActivity;
}

private FlexibilityActivity getRandomFlexibilityActivity() {
    //retrieves the list of flexibility activities from the PhysicalActivityList
    ArrayList<FlexibilityActivity> flexibilityActivities = PhysicalActivityList.getInstance().getFlexibilityActivities();
    //Generates a random index within the range of the flexibility activities list size
    int randomIndex = new Random().nextInt(flexibilityActivities.size());
    //Retrieves the FlexibilityActivity at the randomly generated index
    return flexibilityActivities.get(randomIndex);
}

private ToningActivity getRandomToningActivity() {
    ArrayList<ToningActivity> toningActivities = PhysicalActivityList.getInstance().getToningActivities();
    int randomIndex = new Random().nextInt(toningActivities.size());
    return toningActivities.get(randomIndex);
}

private CardioActivity getRandomCardioActivity() {
    ArrayList<CardioActivity> cardioActivities = PhysicalActivityList.getInstance().getCardioActivities();
    int randomIndex = new Random().nextInt(cardioActivities.size());
    return cardioActivities.get(randomIndex);
}
  
       
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        btnGrpActivity = new javax.swing.ButtonGroup();
        btnBack = new javax.swing.JButton();
        txtDisplayH1 = new javax.swing.JLabel();
        activityLabel = new javax.swing.JLabel();
        durationLabel = new javax.swing.JLabel();
        descpLabel = new javax.swing.JLabel();
        txtDisplayH2 = new javax.swing.JLabel();
        btnFlex = new javax.swing.JRadioButton();
        btnToning = new javax.swing.JRadioButton();
        btnCardio = new javax.swing.JRadioButton();
        txtActivityName = new javax.swing.JTextField();
        txtDuration = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        btnChangeActivity = new javax.swing.JButton();

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Duration: ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 102, 204));
        btnBack.setText("Main Menu");
        btnBack.setDefaultCapable(false);
        btnBack.setFocusPainted(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtDisplayH1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        txtDisplayH1.setForeground(new java.awt.Color(0, 102, 204));
        txtDisplayH1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDisplayH1.setText("Physical activities are key to a Happy Mind");

        activityLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        activityLabel.setForeground(new java.awt.Color(51, 153, 255));
        activityLabel.setText("Today's Activity is:");

        durationLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        durationLabel.setForeground(new java.awt.Color(0, 153, 255));
        durationLabel.setText("Duration in minutes:");

        descpLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        descpLabel.setForeground(new java.awt.Color(0, 153, 255));
        descpLabel.setText("Description:");

        txtDisplayH2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDisplayH2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDisplayH2.setText("Choose your activity type:");

        btnGrpActivity.add(btnFlex);
        btnFlex.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnFlex.setForeground(new java.awt.Color(0, 102, 255));
        btnFlex.setText("Flexibility");
        btnFlex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlexActionPerformed(evt);
            }
        });

        btnGrpActivity.add(btnToning);
        btnToning.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnToning.setForeground(new java.awt.Color(0, 102, 255));
        btnToning.setText("Toning");
        btnToning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToningActionPerformed(evt);
            }
        });

        btnGrpActivity.add(btnCardio);
        btnCardio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCardio.setForeground(new java.awt.Color(0, 102, 255));
        btnCardio.setText("Cardio");
        btnCardio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCardioActionPerformed(evt);
            }
        });

        txtActivityName.setColumns(5);
        txtActivityName.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtActivityName.setForeground(new java.awt.Color(51, 153, 255));
        txtActivityName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActivityNameActionPerformed(evt);
            }
        });

        txtDuration.setColumns(5);
        txtDuration.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtDuration.setForeground(new java.awt.Color(0, 153, 255));
        txtDuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDurationActionPerformed(evt);
            }
        });

        txtDescription.setEditable(false);
        txtDescription.setBackground(new java.awt.Color(255, 255, 255));
        txtDescription.setColumns(20);
        txtDescription.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtDescription.setForeground(new java.awt.Color(0, 153, 255));
        txtDescription.setLineWrap(true);
        txtDescription.setRows(20);
        txtDescription.setWrapStyleWord(true);
        txtDescription.setAutoscrolls(false);
        jScrollPane1.setViewportView(txtDescription);

        btnChangeActivity.setBackground(new java.awt.Color(204, 204, 204));
        btnChangeActivity.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnChangeActivity.setForeground(new java.awt.Color(0, 102, 204));
        btnChangeActivity.setText("Change Activity");
        btnChangeActivity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActivityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(txtDisplayH1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(215, 215, 215)
                                .addComponent(btnFlex)
                                .addGap(84, 84, 84)
                                .addComponent(btnCardio))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnChangeActivity)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(60, 60, 60)
                                                    .addComponent(btnToning))
                                                .addComponent(descpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(activityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnBack))
                                            .addGap(39, 39, 39))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(durationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtActivityName, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(txtDisplayH2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(txtDisplayH1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDisplayH2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnToning)
                    .addComponent(btnFlex)
                    .addComponent(btnCardio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(activityLabel)
                    .addComponent(txtActivityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(durationLabel)
                    .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descpLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnChangeActivity))
                .addGap(23, 23, 23))
        );

        txtDisplayH1.getAccessibleContext().setAccessibleName("Choose Your Activity");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        new MainMenu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnChangeActivityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActivityActionPerformed
        PhysicalActivity newActivity = generateRandomActivity();
    updateActivityDetails(newActivity);
    /*when the "Change Activity" button is clicked, generateRandomActivity() is invoked, which in turn calls the appropriate method 
    (getRandomFlexibilityActivity(), getRandomToningActivity(), or getRandomCardioActivity()) based on the selected type of activity. 
    The details of the randomly generated activity are updated in the GUI using updateActivityDetails(newActivity).*/
    
    
    }//GEN-LAST:event_btnChangeActivityActionPerformed

    private void btnToningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToningActionPerformed
        // Get the selected FlexibilityActivity from the list
    ToningActivity selectedActivity = getSelectedToningActivity();

    // Update the GUI with the details of the selected activity
    updateActivityDetails(selectedActivity);
    }//GEN-LAST:event_btnToningActionPerformed

    
    
    private void txtDurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDurationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDurationActionPerformed

    private void txtActivityNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActivityNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActivityNameActionPerformed

    private void btnFlexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlexActionPerformed
        // Get the selected FlexibilityActivity from the list
    FlexibilityActivity selectedActivity = getSelectedFlexibilityActivity();

    // Update the GUI with the details of the selected activity
    updateActivityDetails(selectedActivity);
    }//GEN-LAST:event_btnFlexActionPerformed

    private void btnCardioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCardioActionPerformed
        // Get the selected FlexibilityActivity from the list
    CardioActivity selectedActivity = getSelectedCardioActivity();

    // Update the GUI with the details of the selected activity
    updateActivityDetails(selectedActivity);
    }//GEN-LAST:event_btnCardioActionPerformed


  

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
            java.util.logging.Logger.getLogger(PhysicalActivityGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhysicalActivityGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhysicalActivityGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhysicalActivityGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhysicalActivityGUI2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel activityLabel;
    private javax.swing.JButton btnBack;
    private javax.swing.JRadioButton btnCardio;
    private javax.swing.JButton btnChangeActivity;
    private javax.swing.JRadioButton btnFlex;
    private javax.swing.ButtonGroup btnGrpActivity;
    private javax.swing.JRadioButton btnToning;
    private javax.swing.JLabel descpLabel;
    private javax.swing.JLabel durationLabel;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtActivityName;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JLabel txtDisplayH1;
    private javax.swing.JLabel txtDisplayH2;
    private javax.swing.JTextField txtDuration;
    // End of variables declaration//GEN-END:variables

}


