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
public class camararecibida_1 extends javax.swing.JFrame {

    public static class Variable {
        public static int variableEntera =0;
    }
    
    /**
     * Creates new form camararecibida
     */
    public camararecibida_1() {
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
        fechDeposito = new javax.swing.JTextField();
        ctaBt = new javax.swing.JTextField();
        numChq = new javax.swing.JTextField();
        impChq = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Generacion CP0");
        setAlwaysOnTop(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Generación archivo CP0, camara recibida");

        jLabel2.setText("Fecha Deposito");

        jLabel3.setText("Cuenta BT");

        jLabel4.setText("Numero de Cheque");

        jLabel5.setText("Importe del Cheque");

        fechDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechDepositoActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(numChq, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ctaBt)
                            .addComponent(impChq, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechDeposito, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
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
                    .addComponent(fechDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ctaBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(numChq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(impChq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        // CABECERA DEL ARCIVO //
        String idenReg = "1";
        String codPriori = "01";
        String destInmed = " 002710270";
        String orgInmed = " 000000010";
        String fechPres = fechDeposito.getText();
        String horaDeposito = "1803";
        String idenArchi = "A";
        String tamReg = "094";
        String factBloq = "10";
        String codForm = "1";
        String destInme = "SUPERVIELLE           1";
        String origInme = "COEL S.A.              ";
        String codRef = "       0";
        
        // SEGUNDA LINEA //
        
        String identArchiv2 = "5";  
        String codgTrans = "200";
        String reservado = "                ";
        String reservado2 = "                    ";
        String reservado3 = "          ";
        String tpoRegistro = "TRC";
        String descrTrans = "CH.PRES.  "; 
        String fechPre2 = fechPres;
        int fechDepo = Integer.parseInt(fechPre2) + 1;
        String reservado4 = "000"; 
        String codOrig = "1";
        String identEntOrig = "00271027";
        String nroLote = "0000001";

        // LINEA 3 //
         
        String identReg3 = "6";
        String codTranscc = "27";
        String entDeb = "00270006";
        String reservado5 = "0";
        String ctaDebito = ctaBt.getText(); 
        String importe = impChq.getText();
        String numeChq = numChq.getText();
        String codPos = "001401";
        String rchzDepo = "0000            ";
        String inforTrans = "00";
        String regAdic = "0";
        String contRegis = "002700060008274";
        
        
        
        
        try
        {
            
            String fechaArchivo = fechPres.substring(2,6);
            int fechaCorregida = Integer.parseInt(fechaArchivo) + 1;
            String texto = "CP0"+fechaCorregida+"0.027.txt";
            Variable.variableEntera = fechaCorregida;
            File archivo=new File(texto);         //Le damos el nombre al archivo y la extension
            
            String fechPres2 = String.format("%06d", Integer.parseInt(fechPres));
            String ctaBantotal = String.format("%017d", Integer.parseInt(ctaDebito));
            String importe2 = String.format("%010d", Integer.parseInt(importe));
            String numeroCheque = String.format("%015d", Integer.parseInt(numeChq));
    
            //Comprobamos que si el archivo exista, lo borre. 
            if (archivo.exists()) {
                   archivo.delete();
               }
                        try (FileWriter escribir = new FileWriter(archivo,true)) {
                //Escribimos en el archivo con el metodo write                          
                escribir.write(idenReg+codPriori+destInmed+orgInmed+fechPres2+horaDeposito+idenArchi+tamReg+factBloq+codForm
                        +destInme+origInme+codRef+ "\r\n" 
                        +identArchiv2+codgTrans+reservado+reservado2+reservado3+tpoRegistro+descrTrans+fechPre2+fechDepo+reservado4+codOrig
                        +identEntOrig+nroLote+"\r\n" 
                        + identReg3+codTranscc+entDeb+reservado5+ctaBantotal+importe2+numeroCheque+codPos+rchzDepo+inforTrans+regAdic+contRegis+"\r\n"
                
                );
            }
                        //Lo utilizamos para limpiar los textFields

            this.dispose();
            camararecibida_2 verformulario=new camararecibida_2();
        verformulario.setVisible(true);
        verformulario.setLocationRelativeTo(null); 
        }
        //En caso de error.
        catch(Exception e)
        {
            System.out.println("Error al escribir");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void fechDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechDepositoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechDepositoActionPerformed

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
            java.util.logging.Logger.getLogger(camararecibida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(camararecibida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(camararecibida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(camararecibida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new camararecibida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ctaBt;
    private javax.swing.JTextField fechDeposito;
    private javax.swing.JTextField impChq;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField numChq;
    // End of variables declaration//GEN-END:variables
}
