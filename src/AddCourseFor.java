
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author fatim
 */
public class AddCourseFor extends javax.swing.JFrame {
     
course c=new course();
    /**
     * Creates new form AddCourseFor
     */
    public AddCourseFor() {
        this.setUndecorated(true);
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
        title = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButtonCancel1 = new javax.swing.JButton();
        jButtonAdd2 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title.setText("Add Course");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Label :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 52, -1));

        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)));
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 231, 31));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("hours :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 52, -1));

        jButtonCancel1.setBackground(new java.awt.Color(204, 153, 0));
        jButtonCancel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCancel1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancel1.setText("Cancel");
        jButtonCancel1.setActionCommand("");
        jButtonCancel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCancel1.setMargin(new java.awt.Insets(2, 5, 2, 5));
        jButtonCancel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonCancel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCancel1MouseExited(evt);
            }
        });
        jButtonCancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancel1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 90, 30));

        jButtonAdd2.setBackground(new java.awt.Color(204, 153, 0));
        jButtonAdd2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonAdd2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAdd2.setText("Add");
        jButtonAdd2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));
        jButtonAdd2.setMargin(new java.awt.Insets(2, 5, 2, 5));
        jButtonAdd2.setMaximumSize(new java.awt.Dimension(50, 26));
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
        jPanel1.add(jButtonAdd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 90, 30));

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(4, 4, 300, 1));
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 231, 31));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText(" X");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 21, 26));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("←");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancel1MouseEntered
        jButtonCancel1.setBackground(Color.BLACK);
        jButtonCancel1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
    }//GEN-LAST:event_jButtonCancel1MouseEntered

    private void jButtonCancel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancel1MouseExited
        jButtonCancel1.setBackground(new Color(204,153,0));
       
    }//GEN-LAST:event_jButtonCancel1MouseExited

    private void jButtonCancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancel1ActionPerformed
        this.dispose();

    }//GEN-LAST:event_jButtonCancel1ActionPerformed

    private void jButtonAdd2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAdd2MouseEntered
        jButtonAdd2.setBackground(Color.BLACK);
        jButtonAdd2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
    }//GEN-LAST:event_jButtonAdd2MouseEntered

    private void jButtonAdd2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAdd2MouseExited
        jButtonAdd2.setBackground(new Color(204,153,0));
       
    }//GEN-LAST:event_jButtonAdd2MouseExited

    private void jButtonAdd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdd2ActionPerformed
        if(!c.isCourseExist(jTextField1.getText())){
            String label=jTextField1.getText();
            int hours=Integer.valueOf(jSpinner1.getValue().toString());
            c.insertUpdateDeleteCourse('i', null, label, hours);
            ManagecourseForm.jTable2.setModel(new DefaultTableModel(null,new Object[]{"id","label","hours"}));
            c.fillCourseTable(ManagecourseForm.jTable2);
        }else{
            JOptionPane.showMessageDialog(null, "course already exists");
        }

    }//GEN-LAST:event_jButtonAdd2ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        jLabel4.setForeground(Color.white);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        jLabel4.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        MainForm mf= new MainForm();
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);
        mf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         
        mf.lblStdCount.setText("The Total Number of Students is :"+Integer.toString(MyFunction.countData("student")));
                mf.lblCCount.setText("The Total Number of Courses is :"+Integer.toString(MyFunction.countData("course")));
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        jLabel6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel6MouseEntered

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
    private javax.swing.JButton jButtonCancel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
