/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsapp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 *
 */
public class RecordsGUI extends javax.swing.JFrame {

    private String name;
    private String surname;
    private String history;
    //declare array of Question objects
    private ArrayList<Records> qList;
    //declare count variable to keep track of how many objects are in array
    private int count;
    private Object searchType;

    /**
     * Creates new form QuestionGUI
     */
    public RecordsGUI() {
        initComponents();
        name = new String();
        surname = new String();
        history = new String();
        //create array of records objects
        qList = new ArrayList<Records>();
        //initialise count to 0
        count = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homeBtn = new javax.swing.JButton();
        studyLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        surnameLbl = new javax.swing.JLabel();
        displayBtn = new javax.swing.JButton();
        HistoryLbl = new javax.swing.JLabel();
        nameTf = new javax.swing.JTextField();
        surnameTf = new javax.swing.JTextField();
        historyTf = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        backgroundLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/home.png"))); // NOI18N
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 40, 40));

        studyLbl.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        studyLbl.setForeground(new java.awt.Color(209, 20, 20));
        studyLbl.setText("Visit Record");
        getContentPane().add(studyLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 148, -1));

        nameLbl.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        nameLbl.setForeground(new java.awt.Color(209, 20, 20));
        nameLbl.setText("First Name:");
        getContentPane().add(nameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        surnameLbl.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        surnameLbl.setForeground(new java.awt.Color(209, 20, 20));
        surnameLbl.setText("Surname:");
        getContentPane().add(surnameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        displayBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        displayBtn.setForeground(new java.awt.Color(209, 20, 20));
        displayBtn.setText("Display All");
        displayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBtnActionPerformed(evt);
            }
        });
        getContentPane().add(displayBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 120, -1));

        HistoryLbl.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        HistoryLbl.setForeground(new java.awt.Color(209, 20, 20));
        HistoryLbl.setText("Exam Papers Visited:");
        getContentPane().add(HistoryLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 190, -1));

        nameTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTfActionPerformed(evt);
            }
        });
        getContentPane().add(nameTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 210, -1));
        getContentPane().add(surnameTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 210, -1));

        historyTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyTfActionPerformed(evt);
            }
        });
        getContentPane().add(historyTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 340, 70));

        addBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addBtn.setForeground(new java.awt.Color(209, 20, 20));
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 120, -1));

        saveBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(209, 20, 20));
        saveBtn.setText("Save Information");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 290, -1));

        deleteBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(209, 20, 20));
        deleteBtn.setText("Delete Information");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 290, -1));

        backgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/background2.jpg"))); // NOI18N
        backgroundLbl.setOpaque(true);
        getContentPane().add(backgroundLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 480));

        setSize(new java.awt.Dimension(407, 518));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // Get text from TextFields
        if (nameTf.getText().equals("")) { //if the text field is empty
            JOptionPane.showMessageDialog(null, "Please fill in the name field: ");

        } else if (surnameTf.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill in surname field: ");
        } else if (historyTf.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill exam history field: ");
        } else {
            name = nameTf.getText();
            surname = surnameTf.getText();
            history = historyTf.getText();

            //create a new Question object
            Records q = new Records();

            //add contents of textfields to q
            q.setName(name);
            q.setSurname(surname);
            q.setHistory(history);

            //add q to array of records objects
            qList.add(q);
            //increase count to show that another object has been added to the array
            count++;
            JOptionPane.showMessageDialog(null, "Your information has been added ");

            nameTf.setText("");
            surnameTf.setText("");
            historyTf.setText("");
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void displayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBtnActionPerformed
        // Loop through array of records objects
        for (int i = 0; i < qList.size(); i++) {
            JOptionPane.showMessageDialog(null, "Name: " + qList.get(i).getName() + "\n Surname: " + qList.get(i).getSurname() + "\n History: " + qList.get(i).getHistory());
        }
    }//GEN-LAST:event_displayBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        //Declare objects required to write object to a file
        File f;
        FileOutputStream fStream;
        ObjectOutputStream oStream;
        //Use a try statement
        try {
            f = new File("history.dat");
            fStream = new FileOutputStream(f);
            oStream = new ObjectOutputStream(fStream);
            //creat objects
            oStream.writeObject(qList);
            oStream.close();
            JOptionPane.showMessageDialog(null, "Your information has been saved ");
        } //catch the IOException
        catch (IOException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void nameTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTfActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        //Check if all search criteria has been input
        if (nameTf.getText().equals("") && surnameTf.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "You must enter your first name & surname");
        } //Check if the arrayList is empty
        else if (qList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Sorry, there is nothing to delete");
        } //else, find & delete the relevant object
        else {
            name = nameTf.getText();
            surname = surnameTf.getText();
            //history = historyTf.getText();

            for (int i = 0; i < count; i = i + 1) {
                //check if all search criteria has been met and if so, delete object
                if (qList.get(i).getName().equals(name) && qList.get(i).getSurname().equals(surname)) {
                    //qList.get(i).getHistory()==history);
                    qList.remove(i);
                    JOptionPane.showMessageDialog(null, "Deleted record at index " + i);
                    //break;                  
                }

                //If nothing is found by the end of the arrayList
                if (qList != null) {
                } else {
                    JOptionPane.showMessageDialog(null, "Sorry, that record could not be found");
                }
                
            }
        }
        nameTf.setText("");
        surnameTf.setText("");
        historyTf.setText("");

    }//GEN-LAST:event_deleteBtnActionPerformed

    private void historyTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_historyTfActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        HomePageGUI myHomePage = new HomePageGUI();
        myHomePage.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_homeBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RecordsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecordsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecordsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecordsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecordsGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HistoryLbl;
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton displayBtn;
    private javax.swing.JTextField historyTf;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTf;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel studyLbl;
    private javax.swing.JLabel surnameLbl;
    private javax.swing.JTextField surnameTf;
    // End of variables declaration//GEN-END:variables
}
