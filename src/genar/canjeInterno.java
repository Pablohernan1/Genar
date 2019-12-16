
package genar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;

public class canjeInterno extends javax.swing.JFrame {
    
static final Logger LOGGER = Logger.getAnonymousLogger();

    public canjeInterno() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        fech1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fechdepo = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Canje Interno");

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Fecha de Acreditación");

        jLabel2.setText("Fecha de Deposito");

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Para generar los archivos de Canje Interno, ingrese");

        jLabel4.setText("la fecha de depósito y de acreditación. ");

        jLabel5.setText("(AAAAMMDD)");

        jLabel6.setText("(AAAAMMDD)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fechdepo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fech1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(26, 26, 26)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fechdepo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fech1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String relleno = "101 002710270 000000010";
        String fech = fech1.getText();
        String relleno2 = "0001G094101SUPERVIELLE           1COEL S.A.                     0";
        String relleno3 = "5200                                              TRCCH.PRES.  ";
        String fech2 = fechdepo.getText();
        String relleno4 = "0001001100010000001";
        String relleno5 = "82000000000000000000000000000000000000000000                                   002000000000001";
        String relleno6 = "9000001000001000000000000000000000000000000000000000000                                      0";
        String relleno7 = "T000000";
        String fechita = fech.substring(4);
        String fechita1 = fech.substring(2);
        String fecha = fech2.substring(2);
        System.out.println(fechita);
        try {
            Path origenPath2 = FileSystems.getDefault().getPath("\\\\FSCEN-04\\GciaTestingyQA\\Sistemas Centrales\\CAMARA\\Imagenes_CanjeInterno\\VIPMMdd0.zip");
            Path destinoPath2 = FileSystems.getDefault().getPath("\\\\FSCEN-04\\GciaTestingyQA\\Sistemas Centrales\\CAMARA\\archivos\\VIPMMdd0.zip");
            //sobreescribir el fichero de destino si existe y lo copia
            Files.copy(origenPath2, destinoPath2, StandardCopyOption.REPLACE_EXISTING);
        } catch (FileNotFoundException ex) {
            LOGGER.log(Level.SEVERE, ex.getMessage());
        } catch (IOException ex) {
            LOGGER.log(Level.SEVERE, ex.getMessage());
        }

        try{
            File archivo = new File("\\\\FSCEN-04\\GciaTestingyQA\\Sistemas Centrales\\CAMARA\\archivos\\VIPMMdd0.zip");
            File archivo2 = new File("\\\\FSCEN-04\\GciaTestingyQA\\Sistemas Centrales\\CAMARA\\archivos\\"+"VIP"+fechita+"0.zip");

        if (archivo.exists()) {
                  archivo.renameTo(archivo2);
               }
        
        File archivocp0 = new File ("\\\\FSCEN-04\\GciaTestingyQA\\Sistemas Centrales\\CAMARA\\archivos\\CP0"+fechita+"0.027");
        
            try (FileWriter escribir = new FileWriter(archivocp0,true)) {
                //Escribimos en el archivo con el metodo write                          
                escribir.write(relleno+fechita1+relleno2+"\r\n"+relleno3+fecha+fechita1+relleno4+"\r\n"+relleno5+"\r\n"+relleno6 );
            }
            
            File archivocp1 = new File ("\\\\FSCEN-04\\GciaTestingyQA\\Sistemas Centrales\\CAMARA\\archivos\\VCP"+fechita+"0.027");
             
            try (FileWriter escribir2 = new FileWriter(archivocp1, true)) {
                 escribir2.write(relleno7+fech);
            }

            this.dispose();
            new exito(this, true).setVisible(true);

            }catch(Exception e){
            System.out.println(e);
           }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new canjeInterno().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fech1;
    private javax.swing.JTextField fechdepo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
