/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reproductor;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author android
 */
public class JTableTest extends javax.swing.JFrame {
    
    private Object[][] datos;
    /**
     * Creates new form JTableTest
     */
    public JTableTest(List<String[]> Informacion, List<String> Canciones, String directorio) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.informacion=Informacion;
        datos=new Object[Informacion.size()][4];
        this.canciones=Canciones;
        for(int i=0; i<Informacion.size(); i++){
            for(int j=0; j<4; j++){
                datos[i][j]=Informacion.get(i)[j];
            }
        }
        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                datos,
                new String [] {
                    "Title", "Artist", "Album", "Genero"
                })
        );
        jTable1.setAutoCreateRowSorter(true);
        ListSelectionModel model=jTable1.getSelectionModel();
        model.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(!model.isSelectionEmpty()){
                    int row=jTable1.getSelectedRow();
                    datoSeleccionado[0]=jTable1.getValueAt(row, 0).toString();
                    datoSeleccionado[1]=jTable1.getValueAt(row, 1).toString();
                    datoSeleccionado[2]=jTable1.getValueAt(row, 2).toString();
                    datoSeleccionado[3]=jTable1.getValueAt(row, 3).toString();
                }
                indiceObtenido=getIndex(datoSeleccionado);
                System.out.println(directorio+"\\"+canciones.get(indiceObtenido));
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        Explorador ex=new Explorador();
        String directorio=ex.abrirExplorador();
        String directorioA=directorio;
        if(ex.getCanciones(null)!=null){
            canciones=ex.getCanciones(null);
        }
        List <String[]> Informacion=new ArrayList<String[]>();
        for(String cancion:canciones){
            directorioA+="\\"+cancion;
            Informacion.add(ID3Tag.getID3TagList(directorioA));
            directorioA=directorio;
        }
        
        this.informacion=Informacion;
        datos=new Object[Informacion.size()][4];
        for(int i=0; i<Informacion.size(); i++){
            for(int j=0; j<4; j++){
                datos[i][j]=Informacion.get(i)[j];
            }
        }
        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                datos,
                new String [] {
                    "Title", "Artist", "Album", "Genero"
                })
        );
        jTable1.setAutoCreateRowSorter(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private int getIndex(String[] infoObtenida){
        for(String[] info:this.informacion){
            if(info[0]==infoObtenida[0]&&info[1]==infoObtenida[1]&&info[2]==infoObtenida[2]&&info[3]==infoObtenida[3]){
                return this.informacion.indexOf(info);
            }
        }
        return 1;
    }
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    private Explorador exp;
    private String directorio;
    String[] datoSeleccionado=new String[4];
    private List<String[]> informacion;
    private int indiceObtenido;
    private List<String> canciones;
}
