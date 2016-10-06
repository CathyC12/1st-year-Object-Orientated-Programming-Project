/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsapp;

import mathsapp.HomePageGUI;

/**
 *
 * @author x14110890
 */
public class IndefiniteIntegralGUI extends javax.swing.JFrame {

    /**
     * Creates new form Formula
     */
    public IndefiniteIntegralGUI() {
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
        IndefIntlbl = new javax.swing.JLabel();
        IndefIntlPicLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        HomeBtn = new javax.swing.JButton();
        BackgroundLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/purple logo.JPG"))); // NOI18N
        LogoLbl.setText("jLabel1");
        getContentPane().add(LogoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 200, 70));

        IndefIntlbl.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        IndefIntlbl.setForeground(new java.awt.Color(0, 153, 153));
        IndefIntlbl.setText("Indefinite Integral");
        getContentPane().add(IndefIntlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 200, 40));

        IndefIntlPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/Indefinite Integrals.PNG"))); // NOI18N
        getContentPane().add(IndefIntlPicLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 160, -1, 250));

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
        CalculusGUI myCalculus = new CalculusGUI();
        myCalculus.setVisible(true);
        dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundLbl;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JLabel IndefIntlPicLbl;
    private javax.swing.JLabel IndefIntlbl;
    private javax.swing.JLabel LogoLbl;
    private javax.swing.JButton backBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    // End of variables declaration//GEN-END:variables
}
