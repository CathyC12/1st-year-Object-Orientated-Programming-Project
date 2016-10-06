/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsapp;

/**
 *
 * @author x13335131
 */
public class LCLevelGUI extends javax.swing.JFrame {

    /**
     * Creates new form LCLevel
     */
    public LCLevelGUI() {
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
        LogoLbl = new javax.swing.JLabel();
        VisitBtn = new javax.swing.JButton();
        HomeBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        titleLbl = new javax.swing.JLabel();
        HigherBtn = new javax.swing.JButton();
        OrdinaryBtn = new javax.swing.JButton();
        backgroundLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/purple logo.JPG"))); // NOI18N
        LogoLbl.setText("jLabel1");
        jPanel1.add(LogoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 200, 70));

        VisitBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        VisitBtn.setForeground(new java.awt.Color(0, 153, 153));
        VisitBtn.setText("Save visit history");
        VisitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(VisitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 150, -1));

        HomeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/home.png"))); // NOI18N
        HomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(HomeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 40, 40));

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/back.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 40, 40));

        titleLbl.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(0, 153, 153));
        titleLbl.setText("Please select a level..");
        jPanel1.add(titleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 170, 40));

        HigherBtn.setBackground(new java.awt.Color(255, 255, 204));
        HigherBtn.setFont(new java.awt.Font("Thonburi", 1, 18)); // NOI18N
        HigherBtn.setForeground(new java.awt.Color(0, 153, 153));
        HigherBtn.setText("Higher");
        HigherBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        HigherBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HigherBtnActionPerformed(evt);
            }
        });
        jPanel1.add(HigherBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 170, 40));

        OrdinaryBtn.setBackground(new java.awt.Color(255, 255, 204));
        OrdinaryBtn.setFont(new java.awt.Font("Thonburi", 1, 18)); // NOI18N
        OrdinaryBtn.setForeground(new java.awt.Color(0, 153, 153));
        OrdinaryBtn.setText("Ordinary");
        OrdinaryBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        OrdinaryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdinaryBtnActionPerformed(evt);
            }
        });
        jPanel1.add(OrdinaryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 170, 40));

        backgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/background.jpg"))); // NOI18N
        jPanel1.add(backgroundLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 480));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 480));

        setSize(new java.awt.Dimension(407, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HigherBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HigherBtnActionPerformed
        LCHLPapersGUI mySnrExamPapersGUI = new LCHLPapersGUI();
        mySnrExamPapersGUI.setVisible(true);
        dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_HigherBtnActionPerformed

    private void OrdinaryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdinaryBtnActionPerformed
        LCOLPapersGUI myLCOLPapersGUI = new LCOLPapersGUI();
        myLCOLPapersGUI.setVisible(true);
        dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_OrdinaryBtnActionPerformed

    private void HomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBtnActionPerformed
        HomePageGUI myHomePage = new HomePageGUI();
        myHomePage.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        ExamCourseGUI myExamLevelsGUI = new ExamCourseGUI();
        myExamLevelsGUI.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed

    private void VisitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisitBtnActionPerformed
        // TODO add your handling code here:
        RecordsGUI myRecordsGUI = new RecordsGUI();
        myRecordsGUI.setVisible(true);
        dispose();
    }//GEN-LAST:event_VisitBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HigherBtn;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JLabel LogoLbl;
    private javax.swing.JButton OrdinaryBtn;
    private javax.swing.JButton VisitBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
