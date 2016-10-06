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
public class LCOrdinarySummaryGUI extends javax.swing.JFrame {
private static boolean sent = false;
    /**
     * Creates new form LCOrdinarySummary
     */
    public LCOrdinarySummaryGUI() {
        initComponents();
       String S= LeavingCertOrdinaryControl.getSummary();
       result.setText(S);//displays user results
       sent = false;
    }
     public void sendInfo(){
         if (sent==false) {
            String name=enterNameTf.getText();
            int score= LeavingCertOrdinaryControl.getCount();
            highScoreControl.addLCOrd(name, score, "LCOH");
            sent = true;
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
        tryAgainBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        nameLbl = new javax.swing.JLabel();
        summary = new javax.swing.JScrollPane();
        result = new javax.swing.JTextArea();
        saveHighScoreBtn = new javax.swing.JButton();
        enterNameTf = new javax.swing.JTextField();
        backgroundLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        summaryTxtLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        summaryTxtLbl.setText("Summary");
        jPanel1.add(summaryTxtLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 80, 30));

        tryAgainBtn.setText("Try Again");
        tryAgainBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tryAgainBtnActionPerformed(evt);
            }
        });
        jPanel1.add(tryAgainBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, -1));

        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/home.png"))); // NOI18N
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 40, 40));

        nameLbl.setText("Enter Name: ");
        jPanel1.add(nameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 80, 20));

        summary.setBorder(null);
        summary.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        summary.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        summary.setHorizontalScrollBar(null);

        result.setEditable(false);
        result.setColumns(20);
        result.setFont(new java.awt.Font("Mangal", 0, 12)); // NOI18N
        result.setRows(5);
        summary.setViewportView(result);

        jPanel1.add(summary, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 150, 270));

        saveHighScoreBtn.setText("save high score");
        saveHighScoreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveHighScoreBtnActionPerformed(evt);
            }
        });
        jPanel1.add(saveHighScoreBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 400, 130, -1));
        jPanel1.add(enterNameTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 90, 20));

        backgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/background.jpg"))); // NOI18N
        jPanel1.add(backgroundLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 480));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tryAgainBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tryAgainBtnActionPerformed
        LCOrdQs1GUI retry = new LCOrdQs1GUI();
       retry.setVisible(true);
       dispose();
    }//GEN-LAST:event_tryAgainBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        HomePageGUI Hp = new HomePageGUI();
       Hp.setVisible(true);
       dispose();
    }//GEN-LAST:event_homeBtnActionPerformed

    private void saveHighScoreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveHighScoreBtnActionPerformed
      sendInfo();
      enterNameTf.setText("saved!");
    }//GEN-LAST:event_saveHighScoreBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.JTextField enterNameTf;
    private javax.swing.JButton homeBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextArea result;
    private javax.swing.JButton saveHighScoreBtn;
    private javax.swing.JScrollPane summary;
    private javax.swing.JLabel summaryTxtLbl;
    private javax.swing.JButton tryAgainBtn;
    // End of variables declaration//GEN-END:variables
}
