/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reproductor.interfazGrafica.ventana;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author usuario
 */
public class InterfazReproductor extends javax.swing.JFrame {

    /**
     * Creates new form InterfazReproductor
     */
    public InterfazReproductor() {
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

        play = new javax.swing.JLabel();
        stop = new javax.swing.JLabel();
        pause = new javax.swing.JLabel();
        selectFile = new javax.swing.JLabel();
        forward = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        display = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        play.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reproductor/interfazGrafica/imagenes/play.png"))); // NOI18N
        play.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                playMouseReleased(evt);
            }
        });
        getContentPane().add(play, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 590, -1, -1));

        stop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reproductor/interfazGrafica/imagenes/stop.png"))); // NOI18N
        stop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                stopMouseReleased(evt);
            }
        });
        getContentPane().add(stop, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 590, -1, -1));

        pause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reproductor/interfazGrafica/imagenes/pause.png"))); // NOI18N
        pause.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pause.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pauseMouseReleased(evt);
            }
        });
        getContentPane().add(pause, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 590, -1, -1));

        selectFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reproductor/interfazGrafica/imagenes/selectFile.png"))); // NOI18N
        selectFile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                selectFileMouseReleased(evt);
            }
        });
        getContentPane().add(selectFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 590, -1, -1));

        forward.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reproductor/interfazGrafica/imagenes/forward.png"))); // NOI18N
        getContentPane().add(forward, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 590, 60, -1));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reproductor/interfazGrafica/imagenes/back.png"))); // NOI18N
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 590, 50, -1));

        display.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        display.setForeground(new java.awt.Color(255, 255, 255));
        display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 540, 440, 20));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reproductor/interfazGrafica/imagenes/logo4.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Euphemia", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AMusic");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Euphemia", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("The best way");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reproductor/interfazGrafica/imagenes/wallpaper.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stopMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopMouseReleased
        procesos.stop();
    }//GEN-LAST:event_stopMouseReleased

    private void playMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playMouseReleased
        procesos.resume();
    }//GEN-LAST:event_playMouseReleased

    private void pauseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pauseMouseReleased
        procesos.pause();
    }//GEN-LAST:event_pauseMouseReleased

    private void selectFileMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectFileMouseReleased
        FileFilter filter = new FileNameExtensionFilter("MP3 Files", "mp3","mpeg3"); //se crea un filtro para obviar lo que no sea de formatos espexificados
        
        JFileChooser chooser = new JFileChooser("F:\\Music"); //se elige una ruta determinada para abrir el explorador
        chooser.addChoosableFileFilter(filter); //se agrega el filtro al objeto que contiene la ruta
        
        int returnVal = chooser.showOpenDialog(null);
        
        if(returnVal == JFileChooser.APPROVE_OPTION){ //si se da click o se selecciona la opcion de open (aprove)
            File file = chooser.getSelectedFile(); //se guarda la ruta del archivo
            String song = file + ""; //lo convertimos de tipo file a string
            
            String name = chooser.getSelectedFile().getName();
            display.setText(name);
            
            
            procesos.play(song); //le mandamos la ruta a nuestro metodo play
        }
        
    }//GEN-LAST:event_selectFileMouseReleased

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
            java.util.logging.Logger.getLogger(InterfazReproductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazReproductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazReproductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazReproductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazReproductor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel background;
    private javax.swing.JLabel display;
    private javax.swing.JLabel forward;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel pause;
    private javax.swing.JLabel play;
    private javax.swing.JLabel selectFile;
    private javax.swing.JLabel stop;
    // End of variables declaration//GEN-END:variables
    ProcesosReproduccion procesos = new ProcesosReproduccion();
}