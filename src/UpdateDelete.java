/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

////------IMPORT-----////

import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import static javax.swing.UIManager.get;
import net.proteanit.sql.DbUtils;

////------IMPORT-----////

public class UpdateDelete extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int q, i, id, deleteItem;
    
    String Gender;
    
    String filename = null;
    byte[] person_image = null;
    private byte[] picture;
    
    public UpdateDelete() {
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

        gender_group = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_studentid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_firstname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_middlename = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_lastname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_age = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_address = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_contact = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        radio_male = new javax.swing.JRadioButton();
        radio_female = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        combo_section = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        combo_course = new javax.swing.JComboBox<>();
        search = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_date = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        enrollment_table = new javax.swing.JTable();
        btn_update = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update and Delete");
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("StudentID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Firstname");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Middlename");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Lastname");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Age");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Address");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("ContactNo.");

        txt_contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contactActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Gender");

        gender_group.add(radio_male);
        radio_male.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radio_male.setText("Male");
        radio_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_maleActionPerformed(evt);
            }
        });

        gender_group.add(radio_female);
        radio_female.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radio_female.setText("Female");
        radio_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_femaleActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Section");

        combo_section.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Section A", "Section B", "Section C", "Section D", "Section E", "Section F", "Section G" }));
        combo_section.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_sectionActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Course");

        combo_course.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SCIENCE, TECHNOLOGY AND MATHEMATICS", "HUMANITIES AND SOCIAL SCIENCE", "ACCOUNTANCY, BUSINESS AND MANAGEMENT", "INFORMATION TECHNOLOGY", "TOURISM", "CULINARY ART", "GENERAL ACADEMIC STRAND" }));

        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Documents\\Jayven Folder\\data_icon\\search.png")); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Date");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(radio_male)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radio_female)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_date, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(combo_section, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_studentid)
                            .addComponent(txt_firstname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_middlename, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_lastname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_age, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_address, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_contact, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combo_course, javax.swing.GroupLayout.Alignment.LEADING, 0, 155, Short.MAX_VALUE)
                            .addComponent(search))
                        .addGap(50, 50, 50))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(search)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_studentid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_middlename, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_age, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(radio_male)
                    .addComponent(radio_female))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(combo_section, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_course, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_date, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enrollment_tableMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(enrollment_table);

        btn_update.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_refresh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_refresh.setText("Refresh");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        btn_reset.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        btn_delete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_back.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btn_update)
                        .addGap(18, 18, 18)
                        .addComponent(btn_delete)
                        .addGap(18, 18, 18)
                        .addComponent(btn_refresh)
                        .addGap(18, 18, 18)
                        .addComponent(btn_reset)
                        .addGap(231, 231, 231)
                        .addComponent(btn_back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contactActionPerformed
 
    }//GEN-LAST:event_txt_contactActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        
        ///------RETURN BUTTON-----////
        
        new Main().setVisible(true);
        this.setVisible(false); 
        dispose();
        
        ///------RETURN BUTTON-----////
        
    }//GEN-LAST:event_btn_backActionPerformed

    private void enrollment_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enrollment_tableMouseClicked
        
        ///------TABLE CODE HERE-----////
        
        int i = enrollment_table.getSelectedRow();
        TableModel model = enrollment_table.getModel();
        
        txt_studentid.setText(model.getValueAt(i, 0).toString());
        txt_firstname.setText(model.getValueAt(i, 1).toString());
        txt_middlename.setText(model.getValueAt(i, 2).toString());
        txt_lastname.setText(model.getValueAt(i, 3).toString());
        txt_age.setText(model.getValueAt(i, 4).toString());
        txt_address.setText(model.getValueAt(i, 5).toString());
        
        
        String gender = model.getValueAt(i, 6).toString();
            if(gender.equals("Male")){
                radio_male.setSelected(true);
            }else{
                radio_female.setSelected(true);
            }
        
        txt_contact.setText(model.getValueAt(i, 7).toString());
        
        String section = model.getValueAt(i, 8).toString();
            switch(section){
                case "Section A":
                    combo_section.setSelectedIndex(0);
                    break;
                case "Section B":
                    combo_section.setSelectedIndex(1);
                    break;
                case "Section C":
                    combo_section.setSelectedIndex(2);
                    break;
                case "Section D":
                    combo_section.setSelectedIndex(3);
                    break;
                case "Section E":
                    combo_section.setSelectedIndex(4);
                    break;
                case "Section F":
                    combo_section.setSelectedIndex(5);
                    break;
                case "Section G":
                    combo_section.setSelectedIndex(6);
                    break;         
            }
            
        String strand = model.getValueAt(i, 9).toString();
            switch(strand){
                case "SCIENCE, TECHNOLOGY AND MATHEMATICS":
                    combo_course.setSelectedIndex(0);
                    break;
                case "HUMANITIES AND SOCIAL SCIENCE":
                    combo_course.setSelectedIndex(1);
                    break;
                case "ACCOUNTANCY, BUSINESS AND MANAGEMENT":
                    combo_course.setSelectedIndex(2);
                    break;
                case "INFORMATION TECHNOLOGY":
                    combo_course.setSelectedIndex(3);
                    break;
                case "TOURISM":
                    combo_course.setSelectedIndex(4);
                    break;
                case "CULINARY ART":
                    combo_course.setSelectedIndex(5);
                    break;
                case "GENERAL ACADEMIC STRAND":
                    combo_course.setSelectedIndex(6);
                    break;
            }

            try{
                int srow = enrollment_table.getSelectedRow();
                Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(srow, 10));
                txt_date.setDate(date);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, i);
            }
            
     ///------TABLE CODE HERE-----////
     
    }//GEN-LAST:event_enrollment_tableMouseClicked

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        
         ///------REFRESH BUTTON-----////
        
        upDateDB();
        
        ///------REFRESH BUTTON-----////
        
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        
        ///------RESET BUTTON-----////
        
        search.setText("");
        txt_studentid.setText("");
        txt_firstname.setText("");
        txt_middlename.setText("");
        txt_lastname.setText("");
        txt_age.setText("");
        txt_address.setText("");
        txt_contact.setText("");
        
        radio_male.setSelected(false);
        radio_female.setSelected(false);
        
        combo_section.setSelectedIndex(0);
        combo_course.setSelectedIndex(0);
        
        txt_date.setCalendar(null);
        
        ///------RESET BUTTON-----////
        
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        
        ///------UPDATE BUTTON-----////
        
        String studentid = txt_studentid.getText();
        String firstname = txt_firstname.getText();
        String middlename = txt_middlename.getText();
        String lastname = txt_lastname.getText();
        String age = txt_age.getText();
        String address = txt_address.getText();
        String contact = txt_contact.getText();
        
        if(radio_male.isSelected()){
                Gender = "Male";
            }if(radio_female.isSelected()){
                Gender = "Female";
            }String gender = Gender;  
        
        String section;
        section = combo_section.getSelectedItem().toString();                    
        String course;
        course = combo_course.getSelectedItem().toString();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(txt_date.getDate());
   
        try{
        
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/enrollmentdata","root","jayven02");
         
            pst.executeUpdate("update enrollmentdata set StudentID='"+studentid+"',Firstname='"+firstname+"' ,Middlename='"+middlename+"' ,Lastname='"+lastname+"' ,Age='"+age+"' ,Address='"+address+"',Gender='"+gender+"' ,Contact='"+contact+"' ,Section='"+section+"' ,Course='"+course+"', Date='"+date+"' where StudentID='"+studentid+"' ");           
            JOptionPane.showMessageDialog(this, "Updated Successfully");
            upDateDB();
            
        }catch (ClassNotFoundException | SQLException ex) {
            java.util.logging.Logger.getLogger(UpdateDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        ///------UPDATE BUTTON-----////
        
    }//GEN-LAST:event_btn_updateActionPerformed

    private void radio_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_maleActionPerformed

    }//GEN-LAST:event_radio_maleActionPerformed

    private void radio_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_femaleActionPerformed

    }//GEN-LAST:event_radio_femaleActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        
        ///------DELETE BUTTON-----////
        
        DefaultTableModel RecordTable = (DefaultTableModel)enrollment_table.getModel();
        int SelectedRows = enrollment_table.getSelectedRow();
        id = Integer.parseInt(RecordTable.getValueAt(SelectedRows, 0).toString());
        
            try {
            id = Integer.parseInt(RecordTable.getValueAt(SelectedRows, 0).toString());
            deleteItem = JOptionPane.showConfirmDialog(null, "Confirm Delete?", "Warning", JOptionPane.YES_NO_OPTION);
            if (deleteItem == JOptionPane.YES_OPTION){
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/enrollmentdata","root","jayven02");
                pst = conn.prepareStatement("delete from enrollmentdata where StudentID = ? ");
                  
                pst.setInt(1, id);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Deleted Successfully");
                upDateDB();
        }
            
        }catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(UpdateDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        java.util.logging.Logger.getLogger(UpdateDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
            
        ///------DELETE BUTTON-----////
            
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void combo_sectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_sectionActionPerformed
        
    }//GEN-LAST:event_combo_sectionActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
 
        ////------SEARCH_BAR-----////
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/enrollmentdata","root","jayven02");
            pst = conn.prepareStatement("Select * from enrollmentdata where  StudentID = ?");
           
   
            
            pst.setString(1, search.getText());
            rs = pst.executeQuery();
            
            if(rs.next()){
                String setstudentid = rs.getString("StudentID");
                txt_studentid.setText(setstudentid);
                
                String setfirstname = rs.getString("Firstname");
                txt_firstname.setText(setfirstname);
                
                String setmiddlename = rs.getString("Middlename");
                txt_middlename.setText(setmiddlename);
                
                String setlastname = rs.getString("Lastname");
                txt_lastname.setText(setlastname);
                
                String setage = rs.getString("Age");
                txt_age.setText(setage);
                
                String setaddress = rs.getString("Address");
                txt_address.setText(setaddress);
                
                String setcontact = rs.getString("Contact");
                txt_contact.setText(setcontact);
                
                String gender = rs.getString("Gender");
                if(gender.equals("Male")){
                    radio_male.setSelected(true);
                }else{
                    radio_female.setSelected(true);
                }
                              
                String section = rs.getString("Section");
                switch(section){
                case "Section A":
                    combo_section.setSelectedIndex(0);
                    break;
                case "Section B":
                    combo_section.setSelectedIndex(1);
                    break;
                case "Section C":
                    combo_section.setSelectedIndex(2);
                    break;
                case "Section D":
                    combo_section.setSelectedIndex(3);
                    break;
                case "Section E":
                    combo_section.setSelectedIndex(4);
                    break;
                case "Section F":
                    combo_section.setSelectedIndex(5);
                    break;
                case "Section G":
                    combo_section.setSelectedIndex(6);
                    break;         
            }
            
            String course = rs.getString("Course");
            switch(course){
                case "SCIENCE, TECHNOLOGY AND MATHEMATICS":
                    combo_course.setSelectedIndex(0);
                    break;
                case "HUMANITIES AND SOCIAL SCIENCE":
                    combo_course.setSelectedIndex(1);
                    break;
                case "ACCOUNTANCY, BUSINESS AND MANAGEMENT":
                    combo_course.setSelectedIndex(2);
                    break;
                case "INFORMATION TECHNOLOGY":
                    combo_course.setSelectedIndex(3);
                    break;
                case "TOURISM":
                    combo_course.setSelectedIndex(4);
                    break;
                case "CULINARY ART":
                    combo_course.setSelectedIndex(5);
                    break;
                case "GENERAL ACADEMIC STRAND":
                    combo_course.setSelectedIndex(6);
                    break;
            }
                
                txt_date.setDate(rs.getDate("Date"));
                
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    ///------SEARCH_BAR-----////
        
    }//GEN-LAST:event_searchKeyReleased

    private void enrollment_tableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enrollment_tableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_enrollment_tableMouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDelete().setVisible(true);
            }
        });
    }
    
    public byte[] getImage(){
        return picture;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> combo_course;
    private javax.swing.JComboBox<String> combo_section;
    private javax.swing.JTable enrollment_table;
    private javax.swing.ButtonGroup gender_group;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radio_female;
    private javax.swing.JRadioButton radio_male;
    private javax.swing.JTextField search;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_age;
    private javax.swing.JTextField txt_contact;
    private com.toedter.calendar.JDateChooser txt_date;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_lastname;
    private javax.swing.JTextField txt_middlename;
    private javax.swing.JTextField txt_studentid;
    // End of variables declaration//GEN-END:variables
}
