


import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
public class editDeleteScore extends javax.swing.JFrame {
    LoginForm loginForm=new LoginForm();
String username =loginForm.getUsername();
    
     score sc = new score();
      public editDeleteScore() {
           this.setUndecorated(true);
        initComponents();
        sc.fillScoreJTable(jTable1);
         
jTable1.setRowHeight(35);
        jTable1.setShowGrid(true);
        jTable1.setSelectionBackground(Color.GRAY);
          JTableHeader header = jTable1.getTableHeader();
    header.setBackground(new Color(204,153,0));
    header.setForeground(Color.BLACK);
   header.setFont(new Font("Arial",Font.BOLD,15) );
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_StudentId = new javax.swing.JTextField();
        jTextField_Score = new javax.swing.JTextField();
        jButtonEditScore = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Description = new javax.swing.JTextField();
        jTextField_CourseId = new javax.swing.JTextField();
        jButtonAddScore = new javax.swing.JButton();
        jButtonRemoveScore = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Id", "Course Id", "Score", "Description"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 145, 475, 380));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Student Id :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Course Id :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Description :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jTextField_StudentId.setEditable(false);
        jTextField_StudentId.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_StudentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_StudentIdActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_StudentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 230, 30));

        jTextField_Score.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ScoreActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_Score, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 230, 30));

        jButtonEditScore.setBackground(new java.awt.Color(204, 153, 0));
        jButtonEditScore.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonEditScore.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditScore.setText("Edit");
        jButtonEditScore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEditScoreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEditScoreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEditScoreMouseExited(evt);
            }
        });
        jButtonEditScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditScoreActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEditScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 90, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Score :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));
        jPanel1.add(jTextField_Description, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 230, 30));

        jTextField_CourseId.setEditable(false);
        jTextField_CourseId.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_CourseId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CourseIdActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_CourseId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 230, 30));

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
        jPanel1.add(jButtonAddScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 90, -1));

        jButtonRemoveScore.setBackground(new java.awt.Color(204, 153, 0));
        jButtonRemoveScore.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonRemoveScore.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRemoveScore.setText("Remove");
        jButtonRemoveScore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonRemoveScoreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonRemoveScoreMouseExited(evt);
            }
        });
        jButtonRemoveScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveScoreActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRemoveScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 90, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Manage score");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

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
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, 30, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int rowIndex= jTable1.getSelectedRow();
        jTextField_StudentId.setText(jTable1.getValueAt(rowIndex, 0).toString());
        jTextField_CourseId.setText(jTable1.getValueAt(rowIndex, 1).toString());
        jTextField_Score.setText(jTable1.getValueAt(rowIndex, 2).toString());
        jTextField_Description.setText(jTable1.getValueAt(rowIndex, 3).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField_StudentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_StudentIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_StudentIdActionPerformed

    private void jButtonRemoveScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveScoreActionPerformed
        
        int sid = Integer.valueOf(jTextField_StudentId.getText()),
                cid = Integer.valueOf(jTextField_CourseId.getText());
        sc.insertUpdateDeleteStudent('d', sid, cid, null, null);
         jTable1.setModel(new DefaultTableModel(null,new Object[]{"Student Id","Course Id","Score","Decsription"}));
            sc.fillScoreJTable(jTable1);
    }//GEN-LAST:event_jButtonRemoveScoreActionPerformed

    private void jButtonEditScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditScoreActionPerformed
            int sid = Integer.valueOf(jTextField_StudentId.getText()),
                cid = Integer.valueOf(jTextField_CourseId.getText());
            double scr = Double.valueOf(jTextField_Score.getText());
            String ds=jTextField_Description.getText();
            sc.insertUpdateDeleteStudent('u', sid, cid, scr, ds);
            jTable1.setModel(new DefaultTableModel(null,new Object[]{"Student Id","Course Id","Score","Decsription"}));
            sc.fillScoreJTable(jTable1);

// TODO add your handling code here:
//        int stdId =Integer.valueOf(jTextField_StudentId.getText();
//            int crsId =c.getCourseId(jComboBox1CourseID.getSelectedItem().toString()));
//        double scr=Integer.valueOf(jTextField_Score.getText());
//
//        System.out.println(crsId);
//        sc. insertUpdateDeleteStudent('i',stdId,crsId,scr,jTextField_Description.getText());
    }//GEN-LAST:event_jButtonEditScoreActionPerformed

    private void jTextField_CourseIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CourseIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CourseIdActionPerformed

    private void jButtonAddScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddScoreActionPerformed
            addScoreForm AddScf =new addScoreForm();
            AddScf.setVisible(true);
            AddScf.pack();
            AddScf.setLocationRelativeTo(null);
            AddScf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButtonAddScoreActionPerformed

    private void jButtonAddScoreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddScoreMouseEntered
       jButtonAddScore.setBackground(Color.BLACK);
     jButtonAddScore.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     jButtonAddScore.setPreferredSize(new Dimension(1000, 100)); 
    }//GEN-LAST:event_jButtonAddScoreMouseEntered

    private void jButtonAddScoreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddScoreMouseExited
        jButtonAddScore.setBackground(new Color(204,153,0));
          jButtonAddScore.setPreferredSize(new Dimension(1000, 100)); 
    }//GEN-LAST:event_jButtonAddScoreMouseExited

    private void jButtonEditScoreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditScoreMouseEntered
        jButtonEditScore.setBackground(Color.BLACK);
     jButtonEditScore.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     jButtonEditScore.setPreferredSize(new Dimension(1000, 100)); 
    }//GEN-LAST:event_jButtonEditScoreMouseEntered

    private void jButtonEditScoreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditScoreMouseExited
       jButtonEditScore.setBackground(new Color(204,153,0));
          jButtonEditScore.setPreferredSize(new Dimension(1000, 100)); 
    }//GEN-LAST:event_jButtonEditScoreMouseExited

    private void jButtonRemoveScoreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRemoveScoreMouseEntered
        jButtonRemoveScore.setBackground(Color.BLACK);
     jButtonRemoveScore.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     jButtonRemoveScore.setPreferredSize(new Dimension(1000, 100)); 
    }//GEN-LAST:event_jButtonRemoveScoreMouseEntered

    private void jButtonRemoveScoreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRemoveScoreMouseExited
        jButtonRemoveScore.setBackground(new Color(204,153,0));
          jButtonRemoveScore.setPreferredSize(new Dimension(1000, 100)); 
    }//GEN-LAST:event_jButtonRemoveScoreMouseExited

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        MainForm mf= new MainForm();
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);
        mf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mf.lblusername.setText("Welcome admin "+loginForm.getUsername()+" !");
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

    private void jTextField_ScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ScoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ScoreActionPerformed

    private void jButtonEditScoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditScoreMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEditScoreMouseClicked

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
    private javax.swing.JButton jButtonAddScore;
    private javax.swing.JButton jButtonEditScore;
    private javax.swing.JButton jButtonRemoveScore;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_CourseId;
    private javax.swing.JTextField jTextField_Description;
    private javax.swing.JTextField jTextField_Score;
    private javax.swing.JTextField jTextField_StudentId;
    // End of variables declaration//GEN-END:variables

}
