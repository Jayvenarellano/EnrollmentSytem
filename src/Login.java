/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

////------IMPORT-----////

import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

///------IMPORT----////

public class Login extends javax.swing.JFrame {


    public Login() {
        initComponents();
        
        addPlaceholderStyle(enter_user);
        addPlaceholderStyle(enter_pass);
        
    }

    public void addPlaceholderStyle(JTextField textField){
        
        ///------ADD PLACEHOLDER-----////
        
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN);
        textField.setFont(font);
        textField.setForeground(Color.gray);
        
        ///------ADD PLACEHOLDER-----////
        
    }
    
    public void removePlaceholderStyle(JTextField textField){
        
        ///------REMOVE PLACEHOLDER-----////
        
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN);
        textField.setFont(font);
        textField.setForeground(Color.black);
        
        ///------REMOVE PLACEHOLDER-----////
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        enter_user = new javax.swing.JTextField();
        enter_pass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        show_pass = new javax.swing.JCheckBox();
        btn_login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jLabel1.setText("SAN RAFAEL SENIOR HIGH SCHOOL");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setText("STUDENT REGISTRATION FORM");

        enter_user.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        enter_user.setText("Enter username");
        enter_user.setToolTipText("Enter username");
        enter_user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                enter_userFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                enter_userFocusLost(evt);
            }
        });

        enter_pass.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        enter_pass.setText("Enter password");
        enter_pass.setEchoChar('\u0000');
        enter_pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                enter_passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                enter_passFocusLost(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Documents\\Jayven Folder\\data_icon\\user.png")); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Documents\\Jayven Folder\\data_icon\\key.png")); // NOI18N

        show_pass.setText("show password");
        show_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_passActionPerformed(evt);
            }
        });

        btn_login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(enter_user))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(show_pass)
                                    .addComponent(enter_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(80, 80, 80))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(enter_user, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(enter_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(show_pass)
                .addGap(18, 18, 18)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
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

    private void enter_userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enter_userFocusGained
     
        ///------ENTER USERNAME FOCUSGAINED-----////
        
        if(enter_user.getText().equals("Enter username")){
            enter_user.setText(null);
            enter_user.requestFocus();
         
            removePlaceholderStyle(enter_user);
        }  
        
        ///------ENTER USERNAME FOCUSGAINED-----////
        
    }//GEN-LAST:event_enter_userFocusGained

    private void enter_userFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enter_userFocusLost
        
        ///------ENTER USERNAME FOCUSLOST-----////
        
        if(enter_user.getText().length()==0){
            addPlaceholderStyle(enter_user);
            enter_user.setText("Enter username");
        }
        
        ///------ENTER USERNAME FOCUSLOST-----////
        
    }//GEN-LAST:event_enter_userFocusLost

    private void enter_passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enter_passFocusGained
        
        ///------ENTER PASSWORD FOCUSGAINED-----////
        
        if(enter_pass.getText().equals("Enter password")){
            enter_pass.setText(null);
            enter_pass.requestFocus();
            enter_pass.setEchoChar('*');
         
            removePlaceholderStyle(enter_pass);
        }  
        
        ///------ENTER PASSWORD FOCUSGAINED-----////
        
    }//GEN-LAST:event_enter_passFocusGained

    private void enter_passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enter_passFocusLost
        
        ///------ENTER PASSWORD FOCUSLOST-----////
        
        if(enter_pass.getText().length()==0){
            addPlaceholderStyle(enter_pass);
            enter_pass.setText("Enter password");
            enter_pass.setEchoChar('\u0000');
        }
        
        ///------ENTER PASSWORD FOCUSLOST-----////
        
    }//GEN-LAST:event_enter_passFocusLost

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        
        ///------FOCUSGAINED WINDOW-----////
        
        this.requestFocusInWindow();
        
        ///------FOCUSGAINED WINDOW-----////
        
    }//GEN-LAST:event_formWindowGainedFocus

    private void show_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_passActionPerformed
        
            ///------SHOW PASSWORD-----////
        
            if(show_pass.isSelected()){
                enter_pass.setEchoChar('\u0000');
            }else{
                enter_pass.setEchoChar('*');
            }
            
            ///------SHOW PASSWORD-----////
        
    }//GEN-LAST:event_show_passActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        
        ///------LOGIN BUTTON-----////
        
        String user=enter_user.getText();
        String Pass=enter_pass.getText();
        
        if(user.equals("Admin")&& Pass.equals("Admin")){
            new Main().setVisible(true);
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "Incorrect NAME OR Password");
        }
        
        ///------LOGIN BUTTON-----////
        
    }//GEN-LAST:event_btn_loginActionPerformed


    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JPasswordField enter_pass;
    private javax.swing.JTextField enter_user;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox show_pass;
    // End of variables declaration//GEN-END:variables
}
