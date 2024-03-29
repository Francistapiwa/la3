/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main;

import java.awt.Image;
import javax.swing.ImageIcon;

    
/**
 *
 * @author tapiw
 */
public class ViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPanel
     */
    User u;

    public ViewPanel(User inputUser) {
        initComponents();
        this.u = inputUser;
        populateDetails();
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
        namelabel = new javax.swing.JLabel();
        lnamelabel = new javax.swing.JLabel();
        alabel = new javax.swing.JLabel();
        emaillabel = new javax.swing.JLabel();
        lastnamedetails = new javax.swing.JTextField();
        namedetails = new javax.swing.JTextField();
        agedetails = new javax.swing.JTextField();
        emaildetails = new javax.swing.JTextField();
        genderlabel = new javax.swing.JLabel();
        mbutton = new javax.swing.JRadioButton();
        fbutton = new javax.swing.JRadioButton();
        pbutton = new javax.swing.JRadioButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("View Details");

        namelabel.setText("Name");

        lnamelabel.setText("Last Name");

        alabel.setText("Age");

        emaillabel.setText("Email");

        lastnamedetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnamedetailsActionPerformed(evt);
            }
        });

        namedetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namedetailsActionPerformed(evt);
            }
        });

        agedetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agedetailsActionPerformed(evt);
            }
        });

        emaildetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emaildetailsActionPerformed(evt);
            }
        });

        genderlabel.setText("Gender");

        mbutton.setText("Male");

        fbutton.setText("Female");

        pbutton.setText("Prefer not to say");
        pbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(genderlabel)
                    .addComponent(lnamelabel)
                    .addComponent(namelabel)
                    .addComponent(alabel)
                    .addComponent(emaillabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(agedetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastnamedetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emaildetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namedetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(192, 192, 192))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fbutton)
                            .addComponent(mbutton)
                            .addComponent(pbutton))
                        .addGap(154, 154, 154))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namelabel)
                            .addComponent(namedetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(lnamelabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lastnamedetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alabel)
                    .addComponent(agedetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emaillabel)
                    .addComponent(emaildetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderlabel)
                    .addComponent(mbutton))
                .addGap(18, 18, 18)
                .addComponent(fbutton)
                .addGap(18, 18, 18)
                .addComponent(pbutton)
                .addContainerGap(205, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pbuttonActionPerformed

    private void namedetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namedetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namedetailsActionPerformed

    private void lastnamedetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnamedetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnamedetailsActionPerformed

    private void agedetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agedetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agedetailsActionPerformed

    private void emaildetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emaildetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emaildetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField agedetails;
    private javax.swing.JLabel alabel;
    private javax.swing.JTextField emaildetails;
    private javax.swing.JLabel emaillabel;
    private javax.swing.JRadioButton fbutton;
    private javax.swing.JLabel genderlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField lastnamedetails;
    private javax.swing.JLabel lnamelabel;
    private javax.swing.JRadioButton mbutton;
    private javax.swing.JTextField namedetails;
    private javax.swing.JLabel namelabel;
    private javax.swing.JRadioButton pbutton;
    // End of variables declaration//GEN-END:variables
}
private void populateDetails() {
  ImageIcon icon = new ImageIcon(u.imagePath);
        Image image = icon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon scaledIcon = new ImageIcon(image);
        
        
    }

