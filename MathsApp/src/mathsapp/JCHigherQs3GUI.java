/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mathsapp;

import mathsapp.HomePageGUI;
import mathsapp.JuniorCertHigherControl;

/**
 *
 * @author x13335131
 */
public class JCHigherQs3GUI extends javax.swing.JFrame {

    /**
     * Creates new form JCHigherQs3
     */
    public JCHigherQs3GUI() {
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

        jPanel1 = new javax.swing.JPanel();
        qsPicLbl = new javax.swing.JLabel();
        ansPicLbl = new javax.swing.JLabel();
        answerTf = new javax.swing.JTextField();
        clearBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        backgroundLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        qsPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/Q.3.PNG"))); // NOI18N
        jPanel1.add(qsPicLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 200, 160));

        ansPicLbl.setText("A ∩ B=  ");
        jPanel1.add(ansPicLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 50, 20));

        answerTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        answerTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerTfActionPerformed(evt);
            }
        });
        jPanel1.add(answerTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 120, 30));

        clearBtn.setText("clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        jPanel1.add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 70, -1));

        nextBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nextBtn.setText("next");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });
        jPanel1.add(nextBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 90, 30));

        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/home.png"))); // NOI18N
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 40, 40));

        backgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/background.jpg"))); // NOI18N
        jPanel1.add(backgroundLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 480));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void answerTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerTfActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        HomePageGUI myHomePageGUI = new HomePageGUI();
        myHomePageGUI.setVisible (true);
        dispose();
    }//GEN-LAST:event_homeBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
       String ans = answerTf.getText();
       JuniorCertHigherControl.updateAns(ans, 2);
       JuniorCertHigherControl.validateQuestion3();
       JCHigherQs4GUI JCHQ4 = new JCHigherQs4GUI();
       JCHQ4.setVisible(true);
       dispose();
    }//GEN-LAST:event_nextBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
       answerTf.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ansPicLbl;
    private javax.swing.JTextField answerTf;
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nextBtn;
    private javax.swing.JLabel qsPicLbl;
    // End of variables declaration//GEN-END:variables
}
