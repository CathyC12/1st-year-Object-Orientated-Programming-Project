/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsapp;

import mathsapp.FormulaGUI;
import mathsapp.FormulaGUI;
import mathsapp.HomePageGUI;
import mathsapp.HomePageGUI;
import mathsapp.Property1GUI;
import mathsapp.Property1GUI;
import mathsapp.Property2;
import mathsapp.Property2;
import mathsapp.Property3;
import mathsapp.Property3;
import mathsapp.Property4;
import mathsapp.Property4;

/**
 *
 * @author x14110890
 */
public class AlgebraGUI extends javax.swing.JFrame {

    /**
     * Creates new form Formula
     */
    public AlgebraGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        LogoLbl = new javax.swing.JLabel();
        AlgebraLbl = new javax.swing.JLabel();
        Property1Btn = new javax.swing.JRadioButton();
        Property2Btn = new javax.swing.JRadioButton();
        Property3Btn = new javax.swing.JRadioButton();
        Property4Btn = new javax.swing.JRadioButton();
        backBtn = new javax.swing.JButton();
        HomeBtn = new javax.swing.JButton();
        BackgroundLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/purple logo.JPG"))); // NOI18N
        LogoLbl.setText("jLabel1");
        getContentPane().add(LogoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 200, 70));

        AlgebraLbl.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        AlgebraLbl.setForeground(new java.awt.Color(0, 153, 153));
        AlgebraLbl.setText("Algebra");
        getContentPane().add(AlgebraLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 130, 40));

        Property1Btn.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup1.add(Property1Btn);
        Property1Btn.setFont(new java.awt.Font("Thonburi", 3, 18)); // NOI18N
        Property1Btn.setForeground(new java.awt.Color(0, 153, 153));
        Property1Btn.setText("property 1");
        Property1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Property1BtnActionPerformed(evt);
            }
        });
        getContentPane().add(Property1Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 120, -1));

        Property2Btn.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup1.add(Property2Btn);
        Property2Btn.setFont(new java.awt.Font("Thonburi", 3, 18)); // NOI18N
        Property2Btn.setForeground(new java.awt.Color(0, 153, 153));
        Property2Btn.setText("property 2");
        Property2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Property2BtnActionPerformed(evt);
            }
        });
        getContentPane().add(Property2Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 120, -1));

        Property3Btn.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup1.add(Property3Btn);
        Property3Btn.setFont(new java.awt.Font("Thonburi", 3, 18)); // NOI18N
        Property3Btn.setForeground(new java.awt.Color(0, 153, 153));
        Property3Btn.setText("property 3");
        Property3Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Property3BtnActionPerformed(evt);
            }
        });
        getContentPane().add(Property3Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 120, -1));

        Property4Btn.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup1.add(Property4Btn);
        Property4Btn.setFont(new java.awt.Font("Thonburi", 3, 18)); // NOI18N
        Property4Btn.setForeground(new java.awt.Color(0, 153, 153));
        Property4Btn.setText("property 4");
        Property4Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Property4BtnActionPerformed(evt);
            }
        });
        getContentPane().add(Property4Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 120, -1));

        backBtn.setBackground(new java.awt.Color(255, 255, 204));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/back.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 40, 40));

        HomeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/home.png"))); // NOI18N
        HomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(HomeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 40, 40));

        BackgroundLbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BackgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/background.jpg"))); // NOI18N
        BackgroundLbl.setText("property");
        BackgroundLbl.setPreferredSize(new java.awt.Dimension(391, 480));
        getContentPane().add(BackgroundLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 390, 520));

        setSize(new java.awt.Dimension(407, 518));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBtnActionPerformed
        HomePageGUI myHomePage = new HomePageGUI();
        myHomePage.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        FormulaGUI myFormula = new FormulaGUI();
        myFormula.setVisible(true);
        dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed

    private void Property1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Property1BtnActionPerformed
        Property1GUI A = new Property1GUI();
        A.setVisible(true);
    }//GEN-LAST:event_Property1BtnActionPerformed

    private void Property3BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Property3BtnActionPerformed
        // TODO add your handling code here:
        Property3 A = new Property3();
        A.setVisible(true);
    }//GEN-LAST:event_Property3BtnActionPerformed

    private void Property2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Property2BtnActionPerformed
        Property2 A = new Property2();
        A.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_Property2BtnActionPerformed

    private void Property4BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Property4BtnActionPerformed
        // TODO add your handling code here:
        Property4 A = new Property4();
        A.setVisible(true);
    }//GEN-LAST:event_Property4BtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AlgebraLbl;
    private javax.swing.JLabel BackgroundLbl;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JLabel LogoLbl;
    private javax.swing.JRadioButton Property1Btn;
    private javax.swing.JRadioButton Property2Btn;
    private javax.swing.JRadioButton Property3Btn;
    private javax.swing.JRadioButton Property4Btn;
    private javax.swing.JButton backBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    // End of variables declaration//GEN-END:variables
}
