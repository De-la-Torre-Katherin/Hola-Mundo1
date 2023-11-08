/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hola.mundo.visual;

import javax.swing.ImageIcon;

/**
 *
 * @author HP
 */
public class Banderas extends javax.swing.JFrame {

    /**
     * Creates new form Banderas
     */
    public Banderas() {
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

        lblbanderas = new javax.swing.JLabel();
        lblnumero = new javax.swing.JLabel();
        btnvisualizar = new javax.swing.JButton();
        lblnumero1 = new javax.swing.JLabel();
        lblresultado = new javax.swing.JLabel();
        lblimagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblbanderas.setText("   BANDERAS");

        lblnumero.setText("Numero:");

        btnvisualizar.setText("Visualizar");
        btnvisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvisualizarActionPerformed(evt);
            }
        });

        lblimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resouses/descarga (1).jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(lblbanderas, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(lblnumero)
                        .addGap(18, 18, 18)
                        .addComponent(lblnumero1)
                        .addGap(316, 316, 316)
                        .addComponent(lblresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(btnvisualizar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(lblimagen)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblbanderas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnumero)
                    .addComponent(lblnumero1)
                    .addComponent(lblresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnvisualizar)
                .addGap(60, 60, 60)
                .addComponent(lblimagen)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnvisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvisualizarActionPerformed
        // TODO add your handling code here:

double numeroramdomico=Math.random();

int numeroAleatorio = (int)(Math.random() * 70+2); 

lblresultado.setText(String.valueOf(numeroAleatorio));


if ((numeroramdomico%2)==0){
    
    ImageIcon a=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\Hola Mundo Visual\\src\\Resouses\\descarga(1).jpg");
    
            lblimagen.setIcon(a);
            
            
}else{
    ImageIcon b =new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\Hola Mundo Visual\\src\\Resouses\\ecuador.jpg");
    
            lblimagen.setIcon(b);
            
}





    }//GEN-LAST:event_btnvisualizarActionPerformed

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
            java.util.logging.Logger.getLogger(Banderas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Banderas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Banderas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Banderas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Banderas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnvisualizar;
    private javax.swing.JLabel lblbanderas;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JLabel lblnumero;
    private javax.swing.JLabel lblnumero1;
    private javax.swing.JLabel lblresultado;
    // End of variables declaration//GEN-END:variables
}
