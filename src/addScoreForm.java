


import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;





public class addScoreForm extends javax.swing.JFrame {
  
   course c=new course(); 
   student sdt = new student();
   score sc = new score();
   DefaultTableModel model;
   
   
   
   
    public addScoreForm() {
         this.setUndecorated(true);
        initComponents();
        c.fillCourseCombo(jComboBox1CourseId);
        sdt.filleStudentable(jTable1, "");
       
       
        HideColum(2);
        HideColum(1);
        HideColum(0);
        model =(DefaultTableModel)jTable1.getModel();
       jTable1.setRowHeight(50);
        jTable1.setRowMargin(5);
       
       jTable1.setShowGrid(true);
        jTable1.setSelectionBackground(Color.GRAY);
         JTableHeader header = jTable1.getTableHeader();
   header.setBackground(new Color(204,153,0));
    header.setForeground(Color.BLACK);
  header.setFont(new Font("Arial",Font.BOLD,15) );
    }
             private void HideColum(int colIndex){
             TableColumn col =jTable1.getColumnModel().getColumn(colIndex);
             col.setMaxWidth(160);
             col.setMinWidth(160);
            col.setPreferredWidth(0);
          }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_StudentId = new javax.swing.JTextField();
        jTextField_Score = new javax.swing.JTextField();
        jButtonCancel = new javax.swing.JButton();
        jButtonAddScore = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Description = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1CourseId = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Sudent Id :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Course Id :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Description :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        jTextField_StudentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_StudentIdActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_StudentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 124, 200, 30));
        jPanel1.add(jTextField_Score, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 200, 30));

        jButtonCancel.setBackground(new java.awt.Color(204, 153, 0));
        jButtonCancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCancel.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancel.setText("Cancel");
        jButtonCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonCancelMouseEntered(evt);
            }
        });
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 90, -1));

        jButtonAddScore.setBackground(new java.awt.Color(204, 153, 0));
        jButtonAddScore.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonAddScore.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAddScore.setText("Add");
        jButtonAddScore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonAddScoreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonAddScoreMouseExited(evt);
            }
        });
        jButtonAddScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddScoreActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAddScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 90, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Score :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));
        jPanel1.add(jTextField_Description, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 200, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "First_Name", "Last_Name"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 108, 475, 405));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Add Score");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 206, -1));

        jComboBox1CourseId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1CourseIdActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1CourseId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 200, 30));

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
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("  X");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 30, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 580));

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
   
    private void jTextField_StudentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_StudentIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_StudentIdActionPerformed

    private void jButtonAddScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddScoreActionPerformed
        // TODO add your handling code here:
        int stdId =Integer.valueOf(jTextField_StudentId.getText());
        int crsId =Integer.valueOf(c.getCourseId(jComboBox1CourseId.getSelectedItem().toString()));
        double scr=Double.valueOf(jTextField_Score.getText());
         
        System.out.println(crsId);
        sc. insertUpdateDeleteStudent('i',stdId,crsId,scr,jTextField_Description.getText());
        
        try{
        
         editDeleteScore.jTable1.setModel(new DefaultTableModel(null,new Object[]{"Student Id","Course Id","Score","Description"}));
        sc.fillScoreJTable(editDeleteScore.jTable1);
        }catch(Exception ex){
        
        System.out.println(ex.getMessage());
            
        }
        
        
     
    }//GEN-LAST:event_jButtonAddScoreActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int rowIndex= jTable1.getSelectedRow();
        jTextField_StudentId.setText(jTable1.getValueAt(rowIndex, 0).toString());
     //   jComboBox1CourseId.setText(jTable1.getValueAt(rowIndex, 1).toString());
      
        jTextField_Description.setText(jTable1.getValueAt(rowIndex, 3).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonAddScoreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddScoreMouseEntered
       jButtonAddScore.setBackground(Color.BLACK);
     jButtonAddScore.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     jButtonAddScore.setPreferredSize(new Dimension(1000, 100)); 
    }//GEN-LAST:event_jButtonAddScoreMouseEntered

    private void jButtonAddScoreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddScoreMouseExited
        jButtonAddScore.setBackground(new Color(204,153,0));
          jButtonAddScore.setPreferredSize(new Dimension(1000, 100)); 
    }//GEN-LAST:event_jButtonAddScoreMouseExited

    private void jButtonCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelMouseEntered
        jButtonCancel.setBackground(Color.BLACK);
     jButtonCancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     jButtonCancel.setPreferredSize(new Dimension(1000, 100)); 
    }//GEN-LAST:event_jButtonCancelMouseEntered

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

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        jLabel11.setForeground(Color.white);
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        jLabel11.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel11MouseExited

    private void jComboBox1CourseIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1CourseIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1CourseIdActionPerformed

   
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
    private javax.swing.JButton jButtonAddScore;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JComboBox<String> jComboBox1CourseId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_Description;
    private javax.swing.JTextField jTextField_Score;
    private javax.swing.JTextField jTextField_StudentId;
    // End of variables declaration//GEN-END:variables
}
