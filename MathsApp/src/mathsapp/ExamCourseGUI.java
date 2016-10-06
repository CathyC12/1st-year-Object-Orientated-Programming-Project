/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsapp;

/**
 *
 * @author x14110890
 */
public class ExamCourseGUI extends javax.swing.JFrame {

    /**
     * Creates new form LeavingCert
     */
    public ExamCourseGUI() {
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

        LogoLbl = new javax.swing.JLabel();
        homeBtn = new javax.swing.JButton();
        titleLbl = new javax.swing.JLabel();
        LeavingCertBtn = new javax.swing.JButton();
        JrCertBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        BackgroundLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/purple logo.JPG"))); // NOI18N
        LogoLbl.setText("jLabel1");
        getContentPane().add(LogoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 200, 70));

        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/home.png"))); // NOI18N
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 40, 40));

        titleLbl.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(0, 0, 102));
        titleLbl.setText("Please choose your course");
        getContentPane().add(titleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 190, 40));

        LeavingCertBtn.setBackground(new java.awt.Color(255, 255, 204));
        LeavingCertBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LeavingCertBtn.setForeground(new java.awt.Color(0, 0, 102));
        LeavingCertBtn.setText("Leaving Cert Course");
        LeavingCertBtn.setPreferredSize(new java.awt.Dimension(391, 480));
        LeavingCertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeavingCertBtnActionPerformed(evt);
            }
        });
        getContentPane().add(LeavingCertBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 180, 40));

        JrCertBtn.setBackground(new java.awt.Color(255, 255, 204));
        JrCertBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JrCertBtn.setForeground(new java.awt.Color(0, 0, 102));
        JrCertBtn.setText("Jr Cert Course");
        JrCertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JrCertBtnActionPerformed(evt);
            }
        });
        getContentPane().add(JrCertBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 180, 40));

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/back.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 40, 40));

        BackgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/background.jpg"))); // NOI18N
        BackgroundLbl.setText("jLabel3");
        BackgroundLbl.setPreferredSize(new java.awt.Dimension(391, 480));
        getContentPane().add(BackgroundLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(407, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JrCertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JrCertBtnActionPerformed
        JCLevelGUI myJCLevelGUI = new JCLevelGUI();
        myJCLevelGUI.setVisible(true);
        dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_JrCertBtnActionPerformed

    private void LeavingCertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeavingCertBtnActionPerformed
        LCLevelGUI myLCLevelGUI = new LCLevelGUI();
        myLCLevelGUI.setVisible(true);
        dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_LeavingCertBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        HomePageGUI myHomePageGUI = new HomePageGUI();
        myHomePageGUI.setVisible(true);
        dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_homeBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        HomePageGUI myHomePageGUI = new HomePageGUI();
        myHomePageGUI.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundLbl;
    private javax.swing.JButton JrCertBtn;
    private javax.swing.JButton LeavingCertBtn;
    private javax.swing.JLabel LogoLbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
