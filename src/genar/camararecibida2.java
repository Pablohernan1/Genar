/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genar;

import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author pzanelli
 */
public class camararecibida2 extends javax.swing.JFrame {

    /**
     * Creates new form camararecibida
     */
    public camararecibida2() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        numeCheque = new javax.swing.JTextField();
        fechaDeposito = new javax.swing.JTextField();
        importeDelCheque = new javax.swing.JTextField();
        ctaBantotal = new javax.swing.JTextField();
        sucBantotal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        subCtaBantotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tOper = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Generación archivo para camara recibida");

        jLabel2.setText("Número del Cheque");

        jLabel3.setText("Fecha del Depósito");

        jLabel4.setText("Importe del cheque");

        jLabel5.setText("Cuenta Bantotal");

        jLabel6.setText("Sucursal Bantotal");

        jButton1.setText("Generar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Sub-Cuenta Bantotal");

        jLabel8.setText("Tipo de operacion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tOper)
                            .addComponent(sucBantotal, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(subCtaBantotal)
                            .addComponent(importeDelCheque)
                            .addComponent(fechaDeposito, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ctaBantotal)
                            .addComponent(numeCheque))))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(numeCheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fechaDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(importeDelCheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ctaBantotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(subCtaBantotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tOper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sucBantotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String codInt = "003";
        String tipInt = "002";
        String numEnv = "000000000";
        String corre = "0000000000";
        String tipItem = "007";
        String numBole = "000000000";
        String numCheque = numeCheque.getText();  //Agregar funcion para completar 15 digitos
        String correChe = "000000000000000";
        String bcoLibr = "011";
        String sucBcoLibr = "005";
        String codPos = "1003        ";
        String local = "000";
        String ctaLibr = "000000000000000";
        String emprCorresp = "000";
        String bcoCorresp = "027";
        String sucBcoCorresp = "000";
        String pzoHs = "000";
        String sucDeposito = "000";
        String mdaDepo = "0080";
        String fechDepo = fechaDeposito.getText(); //Completar con 8 digitos
        String fechVenc = "00000000";
        String trunc = "S";
        String importeCheque = importeDelCheque.getText();  //Completar con 18 digitos

        String empresaBt = "001";
        String sucBt = sucBantotal.getText();
        String modBt = "000";
        String ctaBt = ctaBantotal.getText();
        String mdaBt = "0080";
        String papelBt = "0000";
        String opBt = "000000000";
        String subOp = subCtaBantotal.getText(); //"001";
        String tipOpBt = tOper.getText();
        String rubro = "0000000000000000";
        String mtvoRechazo = "000";
        

        try
        {
            String texto = "UNBTDCRI.txt";
            File archivo=new File(texto);         //Le damos el nombre al archivo y la extension
            
            String numCheque2 = String.format("%015d", Integer.parseInt(numCheque));
            String fechDepo2 = String.format("%08d", Integer.parseInt(fechDepo));
            String importeCheque2 = String.format("%018d", Integer.parseInt(importeCheque));
            String sucBt2 = String.format("%03d", Integer.parseInt(sucBt));
            String ctaBt2 = String.format("%09d", Integer.parseInt(ctaBt));
            String impCheProv = importeCheque2;
            String subCtaBt = String.format("%03d", Integer.parseInt(subOp));
            String tOper2 = String.format("%03d", Integer.parseInt(tipOpBt));            
                try (FileWriter escribir = new FileWriter(archivo,true)) {
                //Escribimos en el archivo con el metodo write                
                escribir.write(codInt+tipInt+numEnv+corre+tipItem+numBole+numCheque2+correChe+bcoLibr+sucBcoLibr+codPos+
                local+ctaLibr+emprCorresp+bcoCorresp+sucBcoCorresp+pzoHs+sucDeposito+mdaDepo+fechDepo2+
                fechVenc+trunc+importeCheque2+impCheProv+empresaBt+sucBt2+modBt+ctaBt2+mdaBt+papelBt+
                opBt+subCtaBt+tOper2+rubro+mtvoRechazo+"\r\n");
            }
                        //Lo utilizamos para limpiar los textFields

            this.dispose();
            new agregarrecibida(this, true).setVisible(true);
        }


        //En caso de error.
        catch(Exception e)
        {
            System.out.println("Error al escribir");
        }
        
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(camararecibida2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(camararecibida2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(camararecibida2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(camararecibida2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new camararecibida2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ctaBantotal;
    private javax.swing.JTextField fechaDeposito;
    private javax.swing.JTextField importeDelCheque;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField numeCheque;
    private javax.swing.JTextField subCtaBantotal;
    private javax.swing.JTextField sucBantotal;
    private javax.swing.JTextField tOper;
    // End of variables declaration//GEN-END:variables
}
