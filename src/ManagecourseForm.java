
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * Essaie de changement de code
 */
public class ManagecourseForm extends javax.swing.JFrame {
LoginForm loginForm=new LoginForm();
String username =loginForm.getUsername();
    course c=new course();
    public ManagecourseForm() {
         this.setUndecorated(true);
        initComponents();
        
        
        c.fillCourseTable(jTable2);
        jTable2.setRowHeight(35);
        jTable2.setShowGrid(true);
        jTable2.setSelectionBackground(Color.GRAY);
          JTableHeader header = jTable2.getTableHeader();
    header.setBackground(new Color(204,153,0));
    header.setForeground(Color.BLACK);
    header.setFont(new Font("Arial", Font.BOLD, 15));
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabelid = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButtonRemovel1 = new javax.swing.JButton();
        jButtonAdd2 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButtonEdit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Manage Course");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        jLabelid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelid.setText("Id :");
        jPanel1.add(jLabelid, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 42, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 240, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("hours :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jButtonRemovel1.setBackground(new java.awt.Color(204, 153, 0));
        jButtonRemovel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonRemovel1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRemovel1.setText("Remove");
        jButtonRemovel1.setActionCommand("");
        jButtonRemovel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonRemovel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonRemovel1MouseExited(evt);
            }
        });
        jButtonRemovel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemovel1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRemovel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 90, -1));

        jButtonAdd2.setBackground(new java.awt.Color(204, 153, 0));
        jButtonAdd2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonAdd2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAdd2.setText("Add");
        jButtonAdd2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonAdd2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonAdd2MouseExited(evt);
            }
        });
        jButtonAdd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdd2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAdd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 90, -1));

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(4, 4, 300, 1));
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 240, 30));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "label", "hours"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 510, 240));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 240, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Label :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 60, -1));

        jButtonEdit.setBackground(new java.awt.Color(204, 153, 0));
        jButtonEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonEdit.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEdit.setText("Edit");
        jButtonEdit.setActionCommand("");
        jButtonEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEditMouseExited(evt);
            }
        });
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 90, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("←");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 20));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText(" X");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 21, 26));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRemovel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemovel1ActionPerformed
   if(!jTextField2.getText().equals("")){
       int id=Integer.valueOf(jTextField2.getText());
       c.insertUpdateDeleteCourse('d', id, null, null);
       ManagecourseForm.jTable2.setModel(new DefaultTableModel(null,new Object[]{"id","label","hours"}));
        
        c.fillCourseTable(ManagecourseForm.jTable2);
        jTextField2.setText("");
        jTextField1.setText("");
        jSpinner1.setValue(4);
   }
    }//GEN-LAST:event_jButtonRemovel1ActionPerformed

    private void jButtonAdd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdd2ActionPerformed
AddCourseFor addcf= new AddCourseFor();
addcf.setVisible(true);
addcf.pack();
addcf.setLocationRelativeTo(null);
addcf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


    }//GEN-LAST:event_jButtonAdd2ActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
    if(!c.isCourseExist(jTextField1.getText())){
        int id=Integer.valueOf(jTextField2.getText());
        String label=jTextField1.getText();
        int hours=Integer.valueOf(jSpinner1.getValue().toString());
        c.insertUpdateDeleteCourse('u', id, label, hours);
        ManagecourseForm.jTable2.setModel(new DefaultTableModel(null,new Object[]{"id","label","hours"}));
        
        c.fillCourseTable(ManagecourseForm.jTable2);
        JOptionPane.showMessageDialog(null, "Course Edited ");
        }else{
            JOptionPane.showMessageDialog(null, "Course already exists");
        }
            }//GEN-LAST:event_jButtonEditActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int index=jTable2.getSelectedRow();
        jTextField2.setText(jTable2.getValueAt(index, 0).toString());
        jTextField1.setText(jTable2.getValueAt(index, 1).toString());
        jSpinner1.setValue(Integer.valueOf(jTable2.getValueAt(index, 2).toString()));
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButtonAdd2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAdd2MouseEntered
     jButtonAdd2.setBackground(Color.BLACK);
     jButtonAdd2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     jButtonAdd2.setPreferredSize(new Dimension(1000, 100));    }//GEN-LAST:event_jButtonAdd2MouseEntered

    private void jButtonAdd2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAdd2MouseExited
         jButtonAdd2.setBackground(new Color(204,153,0));
          jButtonAdd2.setPreferredSize(new Dimension(1000, 100));    }//GEN-LAST:event_jButtonAdd2MouseExited

    private void jButtonEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditMouseEntered
         jButtonEdit.setBackground(Color.BLACK);
     jButtonEdit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     jButtonEdit.setPreferredSize(new Dimension(1000, 100));   
    }//GEN-LAST:event_jButtonEditMouseEntered

    private void jButtonEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditMouseExited
          jButtonEdit.setBackground(new Color(204,153,0));
          jButtonEdit.setPreferredSize(new Dimension(1000, 100));    }//GEN-LAST:event_jButtonEditMouseExited

    private void jButtonRemovel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRemovel1MouseExited
 jButtonRemovel1.setBackground(new Color(204,153,0));
          jButtonRemovel1.setPreferredSize(new Dimension(1000, 100));     }//GEN-LAST:event_jButtonRemovel1MouseExited

    private void jButtonRemovel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRemovel1MouseEntered
      jButtonRemovel1.setBackground(Color.BLACK);
      jButtonRemovel1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      jButtonRemovel1.setPreferredSize(new Dimension(1000, 100));     }//GEN-LAST:event_jButtonRemovel1MouseEntered

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
MainForm mf= new MainForm();
mf.setVisible(true);
mf.pack();
mf.setLocationRelativeTo(null);
mf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
mf.lblusername.setText("Welcome admin "+loginForm.getUsername()+" !");
mf.lblStdCount.setText("The Total Number of Students is :"+Integer.toString(MyFunction.countData("student")));
                mf.lblCCount.setText("The Total Number of Courses is :"+Integer.toString(MyFunction.countData("course")));
this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
jLabel2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jLabel5.setForeground(Color.white);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel5MouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginForm loginForm = new LoginForm();
        loginForm.setLocationRelativeTo(null); // Center the login form
        loginForm.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd2;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonRemovel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelid;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    public static javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
