/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsapp;

import java.awt.Desktop;
import java.io.File;
import java.net.URL;
//import java.net*;

/**
 *
 *
 */
public class JrHLPapersGUI extends javax.swing.JFrame {

    /**
     * Creates new form Year
     */
    public JrHLPapersGUI() {
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

        YearBtn = new javax.swing.ButtonGroup();
        title2Lbl = new javax.swing.JLabel();
        homeBtn = new javax.swing.JButton();
        LogoLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        selectCombo1 = new javax.swing.JComboBox();
        BackgroundLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title2Lbl.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        title2Lbl.setForeground(new java.awt.Color(124, 96, 30));
        title2Lbl.setText("Higher Level");
        getContentPane().add(title2Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 140, 30));

        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/home.png"))); // NOI18N
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 40, 40));

        LogoLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/purple logo.JPG"))); // NOI18N
        LogoLbl.setText("jLabel1");
        getContentPane().add(LogoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 200, 70));

        titleLbl.setBackground(new java.awt.Color(255, 255, 204));
        titleLbl.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(153, 102, 0));
        titleLbl.setText("Jr Exam Papers");
        getContentPane().add(titleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 180, 40));

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/back.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 40, 40));

        selectCombo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        selectCombo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Please select a year", "2011 Paper 1", "2011 Paper 2", "2012 Paper 1", "2012 Paper 2", "2013 Paper 1", "2013 Paper 2" }));
        selectCombo1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selectCombo1ItemStateChanged(evt);
            }
        });
        selectCombo1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                selectCombo1FocusGained(evt);
            }
        });
        selectCombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectCombo1ActionPerformed(evt);
            }
        });
        selectCombo1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                selectCombo1PropertyChange(evt);
            }
        });
        getContentPane().add(selectCombo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 150, 60));

        BackgroundLbl.setBackground(new java.awt.Color(255, 255, 204));
        BackgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/background.jpg"))); // NOI18N
        BackgroundLbl.setText("jLabel3");
        BackgroundLbl.setPreferredSize(new java.awt.Dimension(391, 480));
        getContentPane().add(BackgroundLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 390, 500));

        setSize(new java.awt.Dimension(407, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        HomePageGUI myHomePage = new HomePageGUI();
        myHomePage.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_homeBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        JCLevelGUI myJCLevelGUI = new JCLevelGUI();
        myJCLevelGUI.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed

    private void selectCombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectCombo1ActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_selectCombo1ActionPerformed

    private void selectCombo1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_selectCombo1PropertyChange
        // TODO add your handling code here:
        //System.out.println("Any message here");
    }//GEN-LAST:event_selectCombo1PropertyChange

    private void selectCombo1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selectCombo1ItemStateChanged
        // TODO add your handling code here:
        //Code taken from flowStack website
        if (selectCombo1.getSelectedIndex() == 1) {
            try {
                if ((new File("JCHLP12011.pdf")).exists()) {
                    Process p = Runtime
                            .getRuntime()
                            .exec("rundll32 url.dll,FileProtocolHandler JCHLP12011.pdf");
                    p.waitFor();
                } else {
                    System.out.println("File does not exist");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
        if (selectCombo1.getSelectedIndex() == 2) {
            try {
                Desktop.getDesktop().browse(new URL("http://www.examinations.ie/archive/exampapers/2011/JC003ALP200EV.pdf").toURI());
            } catch (Exception e) {
            }
        }
        if (selectCombo1.getSelectedIndex() == 3) {
            try {
                Desktop.getDesktop().browse(new URL("http://examinations.ie/archive/exampapers/2012/JC003ALP100EV.pdf").toURI());
            } catch (Exception e) {
            }
        }
        if (selectCombo1.getSelectedIndex() == 4) {
            try {
                Desktop.getDesktop().browse(new URL("http://www.examinations.ie/archive/exampapers/2012/JC003ALP200EV.pdf").toURI());
            } catch (Exception e) {
            }
        }
        if (selectCombo1.getSelectedIndex() == 5) {
            try {
                Desktop.getDesktop().browse(new URL("http://www.examinations.ie/archive/exampapers/2013/JC003ALP100EV.pdf").toURI());
            } catch (Exception e) {
            }
        }
        if (selectCombo1.getSelectedIndex() == 6) {
            try {
                Desktop.getDesktop().browse(new URL("http://www.examinations.ie/archive/exampapers/2013/JC003ALP200EV.pdf").toURI());
            } catch (Exception e) {
            }
        }


    }//GEN-LAST:event_selectCombo1ItemStateChanged

    private void selectCombo1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_selectCombo1FocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_selectCombo1FocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundLbl;
    private javax.swing.JLabel LogoLbl;
    private javax.swing.ButtonGroup YearBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JComboBox selectCombo1;
    private javax.swing.JLabel title2Lbl;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}