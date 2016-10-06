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
public class TrigGUI extends javax.swing.JFrame {

    /**
     * Creates new form Formula
     */
    public TrigGUI() {
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
        Logo = new javax.swing.JLabel();
        Trigonometry = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        Home1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/purple logo.JPG"))); // NOI18N
        Logo.setText("jLabel1");
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 200, 70));

        Trigonometry.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        Trigonometry.setForeground(new java.awt.Color(102, 102, 255));
        Trigonometry.setText("Trigonometry");
        getContentPane().add(Trigonometry, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 160, 40));

        back.setBackground(new java.awt.Color(255, 255, 204));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/back.png"))); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 40, 40));

        Home1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/home.png"))); // NOI18N
        Home1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Home1ActionPerformed(evt);
            }
        });
        getContentPane().add(Home1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 40, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/Trig Integrals.PNG"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        Background.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/background.jpg"))); // NOI18N
        Background.setText("property");
        Background.setPreferredSize(new java.awt.Dimension(391, 480));
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 390, 520));

        setSize(new java.awt.Dimension(407, 518));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Home1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Home1ActionPerformed
        HomePageGUI myHomePage = new HomePageGUI();
        myHomePage.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_Home1ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        FormulaGUI myFormula = new FormulaGUI();
        myFormula.setVisible(true);
        dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton Home1;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Trigonometry;
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}