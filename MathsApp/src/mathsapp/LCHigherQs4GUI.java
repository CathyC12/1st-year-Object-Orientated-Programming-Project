/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mathsapp;

import mathsapp.HomePageGUI;

/**
 *
 * @author x13335131
 */
public class LCHigherQs4GUI extends javax.swing.JFrame {

    /**
     * Creates new form LCHigherQs4
     */
    public LCHigherQs4GUI() {
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
        nextBtn = new javax.swing.JButton();
        question = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        answerTf = new javax.swing.JTextField();
        clearBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        backgroundLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        qsPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/LCHigherQs4.PNG"))); // NOI18N
        jPanel1.add(qsPicLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 120, 70));

        nextBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nextBtn.setText("next");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });
        jPanel1.add(nextBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 90, 30));

        question.setBorder(null);
        question.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        question.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("If x=4 and y=-1, \nevaluate the following \nexpression:");
        question.setViewportView(jTextArea1);

        jPanel1.add(question, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 190, 100));

        answerTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        answerTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerTfActionPerformed(evt);
            }
        });
        jPanel1.add(answerTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 170, 30));

        clearBtn.setText("clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        jPanel1.add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 80, -1));

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

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        String ans = answerTf.getText();
       LeavingCertHigherControl.updateAns(ans, 3);
       LeavingCertHigherControl.validateQuestion4();
       LCHigherQs5GUI LCHQ5 = new LCHigherQs5GUI();
       LCHQ5.setVisible(true);
       dispose();
    }//GEN-LAST:event_nextBtnActionPerformed

    private void answerTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerTfActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
       HomePageGUI myHomePageGUI = new HomePageGUI();
        myHomePageGUI.setVisible (true);
        dispose();
    }//GEN-LAST:event_homeBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        answerTf.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answerTf;
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton nextBtn;
    private javax.swing.JLabel qsPicLbl;
    private javax.swing.JScrollPane question;
    // End of variables declaration//GEN-END:variables
}
