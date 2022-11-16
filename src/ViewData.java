


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

////------IMPORT-----////

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

////------IMPORT-----////

public class ViewData extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int q, i, id, deleteItem;
    
    String Gender;
    
    public ViewData() {
        initComponents();
    }

     public void upDateDB(){
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/enrollmentdata","root","jayven02");
            pst = conn.prepareStatement("select * from enrollmentdata");
 
            rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();
            
            q = stData.getColumnCount();
            DefaultTableModel RecordTable = (DefaultTableModel)enrollment_table.getModel();
            RecordTable.setRowCount(0);
            
            while(rs.next()){
                Vector columnData = new Vector();
                
                for (i = 1;i <= q; i ++)
                {
                    columnData.add(rs.getString("StudentID"));
                    columnData.add(rs.getString("Firstname"));
                    columnData.add(rs.getString("Middlename"));
                    columnData.add(rs.getString("Lastname"));
                    columnData.add(rs.getString("Age"));
                    columnData.add(rs.getString("Address"));
                    columnData.add(rs.getString("Gender"));
                    columnData.add(rs.getString("Contact"));
                    columnData.add(rs.getString("Section"));
                    columnData.add(rs.getString("Course"));
                    columnData.add(rs.getString("Date"));
                    
                }
                RecordTable.addRow(columnData);
            }
                
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        click_search = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        enrollment_table = new javax.swing.JTable();
        view_refresh = new javax.swing.JButton();
        view_back = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_firstname = new javax.swing.JLabel();
        txt_middlename = new javax.swing.JLabel();
        txt_lastname = new javax.swing.JLabel();
        txt_age = new javax.swing.JLabel();
        txt_address = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_gender = new javax.swing.JLabel();
        txt_contact = new javax.swing.JLabel();
        txt_section = new javax.swing.JLabel();
        txt_course = new javax.swing.JLabel();
        txt_date = new javax.swing.JLabel();
        txt_studentid = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Documents\\Jayven Folder\\data_icon\\search.png")); // NOI18N

        click_search.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        click_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                click_searchKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("StudentID :");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Documents\\Jayven Folder\\data_icon\\driver-license.png")); // NOI18N

        enrollment_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "StudentID", "Firstname", "Middlename", "Lastname", "Age", "Address", "Gender", "Contact", "Section", "Course", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        enrollment_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enrollment_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(enrollment_table);

        view_refresh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        view_refresh.setText("Refresh");
        view_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_refreshActionPerformed(evt);
            }
        });

        view_back.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        view_back.setText("Return");
        view_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_backActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Firstname :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 16, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Middlename :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 51, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Lastname :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 86, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Age :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 121, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Address :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 156, -1, -1));

        txt_firstname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel2.add(txt_firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 16, -1, -1));

        txt_middlename.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel2.add(txt_middlename, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 51, -1, -1));

        txt_lastname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel2.add(txt_lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 86, -1, -1));

        txt_age.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel2.add(txt_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 121, -1, -1));

        txt_address.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel2.add(txt_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 156, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Gender :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 16, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Contact No :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 51, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Section :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 86, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Course :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 121, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Date :");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 156, -1, -1));

        txt_gender.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel2.add(txt_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 16, -1, -1));

        txt_contact.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel2.add(txt_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 51, -1, -1));

        txt_section.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel2.add(txt_section, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 86, -1, -1));

        txt_course.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel2.add(txt_course, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 121, -1, -1));

        txt_date.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel2.add(txt_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 156, -1, -1));

        txt_studentid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12)
                        .addComponent(click_search, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_studentid, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 377, Short.MAX_VALUE)
                        .addComponent(view_refresh)
                        .addGap(18, 18, 18)
                        .addComponent(view_back))
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(click_search, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(view_refresh)
                                .addComponent(view_back))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_studentid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void view_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_refreshActionPerformed
        
        ////------REFRESH-----////
        
        upDateDB();
        
        ////------REFRESH-----////
        
    }//GEN-LAST:event_view_refreshActionPerformed

    private void view_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_backActionPerformed
        
        ////------RETURN-----////
        
        new Main().setVisible(true);
        this.setVisible(false); 
        dispose();
        
        ////------RETURN-----////
        
    }//GEN-LAST:event_view_backActionPerformed

    private void click_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_click_searchKeyReleased
        
        ////------SEARCH-----////
     
        String search = click_search.getText();
        
        try{
            upDateDB();
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/enrollmentdata","root","jayven02");
            
            pst = conn.prepareStatement("Select * from enrollmentdata where  Firstname  LIKE '%"+search+"%' ");
            rs = pst.executeQuery();
            enrollment_table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        ////------SEARCH-----////
        
    }//GEN-LAST:event_click_searchKeyReleased

    private void enrollment_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enrollment_tableMouseClicked
        
        ////------TABLE-----////
        
        int i = enrollment_table.getSelectedRow();
        TableModel model = enrollment_table.getModel();
        
        txt_studentid.setText(model.getValueAt(i, 0).toString());
        txt_firstname.setText(model.getValueAt(i, 1).toString());
        txt_middlename.setText(model.getValueAt(i, 2).toString());
        txt_lastname.setText(model.getValueAt(i, 3).toString());
        txt_age.setText(model.getValueAt(i, 4).toString());
        txt_address.setText(model.getValueAt(i, 5).toString());
        txt_gender.setText(model.getValueAt(i, 6).toString());
        txt_contact.setText(model.getValueAt(i, 7).toString());
        txt_section.setText(model.getValueAt(i, 8).toString());
        txt_course.setText(model.getValueAt(i, 9).toString());
        txt_date.setText(model.getValueAt(i, 10).toString());
        
        ////------TABLE-----////
        
    }//GEN-LAST:event_enrollment_tableMouseClicked


    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField click_search;
    private javax.swing.JTable enrollment_table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txt_address;
    private javax.swing.JLabel txt_age;
    private javax.swing.JLabel txt_contact;
    private javax.swing.JLabel txt_course;
    private javax.swing.JLabel txt_date;
    private javax.swing.JLabel txt_firstname;
    private javax.swing.JLabel txt_gender;
    private javax.swing.JLabel txt_lastname;
    private javax.swing.JLabel txt_middlename;
    private javax.swing.JLabel txt_section;
    private javax.swing.JLabel txt_studentid;
    private javax.swing.JButton view_back;
    private javax.swing.JButton view_refresh;
    // End of variables declaration//GEN-END:variables
}
