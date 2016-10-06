/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mathsapp;

import mathsapp.HomePageGUI;
import mathsapp.highScoreControl;

/**
 *
 * @author x13335131
 */
public class LCHigherSummaryGUI extends javax.swing.JFrame {

    private static boolean sent = false;
    /**
     * Creates new form summary
     */
    //gets user results
    public LCHigherSummaryGUI() {
       initComponents();
       String S= LeavingCertHigherControl.getSummary();
       result.setText(S);//displays user results
       sent=false;
    }
    public void sendInfo(){
        if(sent==false) {
            String name=enterNameTf.getText();
            int score= LeavingCertHigherControl.getCount();
            highScoreControl.addLCHigher(name, score, "LCHH");
            sent=true;
        }
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
        summaryTxtLbl = new javax.swing.JLabel();
        summary = new javax.swing.JScrollPane();
        result = new javax.swing.JTextArea();
        SaveHighScoreBtn = new javax.swing.JButton();
        nameLbl = new javax.swing.JLabel();
        enterNameTf = new javax.swing.JTextField();
        homeBtn = new javax.swing.JButton();
        tryAgainBtn = new javax.swing.JButton();
        backroundLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        summaryTxtLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        summaryTxtLbl.setText("Summary");
        jPanel1.add(summaryTxtLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 80, 30));

        summary.setBorder(null);
        summary.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        summary.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        result.setEditable(false);
        result.setColumns(20);
        result.setFont(new java.awt.Font("Mangal", 0, 12)); // NOI18N
        result.setRows(5);
        result.setBorder(null);
        summary.setViewportView(result);

        jPanel1.add(summary, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 150, 250));

        SaveHighScoreBtn.setText("save high score");
        SaveHighScoreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveHighScoreBtnActionPerformed(evt);
            }
        });
        jPanel1.add(SaveHighScoreBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 383, 130, 30));

        nameLbl.setText("Enter Name :");
        jPanel1.add(nameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 80, 30));

        enterNameTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterNameTfActionPerformed(evt);
            }
        });
        jPanel1.add(enterNameTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 100, -1));

        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/home.png"))); // NOI18N
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 40, 40));

        tryAgainBtn.setText("Try Again");
        tryAgainBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tryAgainBtnActionPerformed(evt);
            }
        });
        jPanel1.add(tryAgainBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, -1, -1));

        backroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/background.jpg"))); // NOI18N
        jPanel1.add(backroundLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 480));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
       HomePageGUI Hp = new HomePageGUI();
       Hp.setVisible(true);
       dispose();
    }//GEN-LAST:event_homeBtnActionPerformed

    private void tryAgainBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tryAgainBtnActionPerformed
       LCHigherQs1GUI retry = new LCHigherQs1GUI();
       retry.setVisible(true);
       dispose();
    }//GEN-LAST:event_tryAgainBtnActionPerformed

    private void enterNameTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterNameTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterNameTfActionPerformed

    private void SaveHighScoreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveHighScoreBtnActionPerformed
        sendInfo();
        enterNameTf.setText("saved!");
    }//GEN-LAST:event_SaveHighScoreBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SaveHighScoreBtn;
    private javax.swing.JLabel backroundLbl;
    private javax.swing.JTextField enterNameTf;
    private javax.swing.JButton homeBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextArea result;
    private javax.swing.JScrollPane summary;
    private javax.swing.JLabel summaryTxtLbl;
    private javax.swing.JButton tryAgainBtn;
    // End of variables declaration//GEN-END:variables
}