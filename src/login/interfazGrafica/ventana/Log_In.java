/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.interfazGrafica.ventana;
<<<<<<< HEAD:src/login/interfazGrafica/ventana/Interfaz.java
import database.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import password.Password;
=======

import java.awt.Color;


>>>>>>> e0f25380b4a318dcf097d81fdc60e6d5b70d8237:src/login/interfazGrafica/ventana/Log_In.java
/**
 *
 * @author usuario
 */
public class Log_In extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Log_In() {
        initComponents();
        this.setLocationRelativeTo(null);
<<<<<<< HEAD:src/login/interfazGrafica/ventana/Interfaz.java
        con=new DBQuery();
=======
        
        userPlaceHolder();
        passwordPlaceHolder();
>>>>>>> e0f25380b4a318dcf097d81fdc60e6d5b70d8237:src/login/interfazGrafica/ventana/Log_In.java
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exitButton = new javax.swing.JButton();
        iconUser = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        logInButton = new javax.swing.JButton();
        fondoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitButton.setBackground(new java.awt.Color(0, 0, 0));
        exitButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setText("Exit");
        exitButton.setBorderPainted(false);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 10, -1, -1));

        iconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/interfazGrafica/imagenes/logo_icon.png"))); // NOI18N
        getContentPane().add(iconUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        userField.setBackground(new java.awt.Color(51, 51, 51));
        userField.setForeground(new java.awt.Color(255, 255, 255));
        userField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userFieldActionPerformed(evt);
            }
        });
<<<<<<< HEAD:src/login/interfazGrafica/ventana/Interfaz.java
        getContentPane().add(userField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 200, -1));

        jLabel2.setFont(new java.awt.Font("Euphemia", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));
=======
        getContentPane().add(userField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 250, 27));
        userField.getAccessibleContext().setAccessibleDescription("");
>>>>>>> e0f25380b4a318dcf097d81fdc60e6d5b70d8237:src/login/interfazGrafica/ventana/Log_In.java

        passwordField.setBackground(new java.awt.Color(51, 51, 51));
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 250, 27));

        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Don't have account? Create it");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, -1, -1));

        logInButton.setBackground(new java.awt.Color(3, 3, 59));
        logInButton.setForeground(new java.awt.Color(255, 255, 255));
        logInButton.setText("Log In");
<<<<<<< HEAD:src/login/interfazGrafica/ventana/Interfaz.java
        logInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 170, -1));
=======
        getContentPane().add(logInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 170, -1));
>>>>>>> e0f25380b4a318dcf097d81fdc60e6d5b70d8237:src/login/interfazGrafica/ventana/Log_In.java

        fondoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/interfazGrafica/imagenes/wallpaper_login_3.jpg"))); // NOI18N
        getContentPane().add(fondoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void userFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userFieldActionPerformed
<<<<<<< HEAD:src/login/interfazGrafica/ventana/Interfaz.java
        // TODO add your handling code here:
        
    }//GEN-LAST:event_userFieldActionPerformed

    private void logInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInButtonActionPerformed
        // TODO add your handling code here:
        if(userField.getText().length()==0 || jPasswordField1.getPassword().length==0){
            System.out.println("Uno de los campos está vacio");
        }else{
            if(con.isIn(Password.chartoPass(jPasswordField1.getPassword()), userField.getText())){
                System.out.println("Exito!!!");
                userField.setEnabled(false);
                jPasswordField1.setEnabled(false);
            }else{
                System.out.println("fracaso");
                userField.setText("");
                jPasswordField1.setText("");
            }
        }
        
    }//GEN-LAST:event_logInButtonActionPerformed

=======
        // TODO add your handling code here
       
        if(userField.getKeyListeners() != null)
            userField.setText(null);
        
    }//GEN-LAST:event_userFieldActionPerformed

    private void userPlaceHolder(){
        userPlaceHolder = new com.placeholder.PlaceHolder(userField, "username");
        
        userPlaceHolder.setFont("Euphemia");
        userPlaceHolder.setColorHolder(Color.gray);
        userPlaceHolder.setSize(16);
    }
    private void passwordPlaceHolder(){
        passwordPlaceHolder = new com.placeholder.PlaceHolder(passwordField, "password");
        passwordPlaceHolder.setFont("Euphemia");
        passwordPlaceHolder.setColorHolder(Color.gray);
        passwordPlaceHolder.setSize(16);
    }

    
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
            java.util.logging.Logger.getLogger(Log_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Log_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Log_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Log_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Log_In().setVisible(true);
            }
        });
    }
>>>>>>> e0f25380b4a318dcf097d81fdc60e6d5b70d8237:src/login/interfazGrafica/ventana/Log_In.java

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel fondoLabel;
    private javax.swing.JLabel iconUser;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton logInButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userField;
    // End of variables declaration//GEN-END:variables
<<<<<<< HEAD:src/login/interfazGrafica/ventana/Interfaz.java
    private DBQuery con;
=======
    private com.placeholder.PlaceHolder userPlaceHolder;
    private com.placeholder.PlaceHolder passwordPlaceHolder;

>>>>>>> e0f25380b4a318dcf097d81fdc60e6d5b70d8237:src/login/interfazGrafica/ventana/Log_In.java
}