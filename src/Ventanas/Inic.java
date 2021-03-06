/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Otros.AdminIFrame;
import java.awt.Panel;
import javax.swing.JDesktopPane;

/**
 *
 * @author Juanc
 */
public class Inic extends javax.swing.JFrame {
    private static CreaUser vntCrea = null;
    private static VerUsuarios vntVerUs = null;
    private static InfoClient vntInfoC = null;
    private static IngresarCliente vntIC = null;
    private static MercaExisten vntME = null;
    private static RegistraMerca vntRM = null;
    private static VerProveedores vntVP = null;
    private static RegistraProveedor vntRP = null;
    private static Mail vtnMail = null;
    /**
     * Creates new form Inic
     */
    public Inic() {
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

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        dp = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        crearusuario = new javax.swing.JMenuItem();
        verusuario = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        informacion = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mercaexistente = new javax.swing.JMenuItem();
        registramerca = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        verprove = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout dpLayout = new javax.swing.GroupLayout(dp);
        dp.setLayout(dpLayout);
        dpLayout.setHorizontalGroup(
            dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1385, Short.MAX_VALUE)
        );
        dpLayout.setVerticalGroup(
            dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 816, Short.MAX_VALUE)
        );

        jMenu9.setText("Inicio");
        jMenu9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        crearusuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        crearusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        crearusuario.setText("Crea Usuario");
        crearusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearusuarioActionPerformed(evt);
            }
        });
        jMenu9.add(crearusuario);

        verusuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        verusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario mas.png"))); // NOI18N
        verusuario.setText("Ver Usuarios");
        verusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verusuarioActionPerformed(evt);
            }
        });
        jMenu9.add(verusuario);

        jMenuBar2.add(jMenu9);

        jMenu10.setText("Clientes");
        jMenu10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        informacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        informacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info.png"))); // NOI18N
        informacion.setText("Ver Clientes");
        informacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informacionActionPerformed(evt);
            }
        });
        jMenu10.add(informacion);

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario mas.png"))); // NOI18N
        jMenuItem3.setText("Ingresar Cliente");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem3);

        jMenuBar2.add(jMenu10);

        jMenu3.setText("Mercaderia");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        mercaexistente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mercaexistente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/percha.png"))); // NOI18N
        mercaexistente.setText("En existencia");
        mercaexistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mercaexistenteActionPerformed(evt);
            }
        });
        jMenu3.add(mercaexistente);

        registramerca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        registramerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/moda.png"))); // NOI18N
        registramerca.setText("Registrar Mercaderia");
        registramerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registramercaActionPerformed(evt);
            }
        });
        jMenu3.add(registramerca);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Proveedores");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        verprove.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        verprove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/info.png"))); // NOI18N
        verprove.setText("Ver Proveedores");
        verprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verproveActionPerformed(evt);
            }
        });
        jMenu4.add(verprove);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Proveedor.png"))); // NOI18N
        jMenuItem2.setText("Registrar Proveedor");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar2.add(jMenu4);

        jMenu5.setText("Asistencia Técnica");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/enviar-correo.png"))); // NOI18N
        jMenuItem4.setText("Correo Electronico");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        jMenuBar2.add(jMenu5);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dp)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dp)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void crearusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearusuarioActionPerformed
        // TODO add your handling code here:
        //vntInfoC.dispose();
        if(vntCrea == null){
            vntCrea = new CreaUser();
        }
        AdminIFrame.mostrarVentanaFactura(dp, vntCrea); 
    }//GEN-LAST:event_crearusuarioActionPerformed

    private void informacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informacionActionPerformed
        // TODO add your handling code here:
         
        if(vntInfoC == null){
            vntInfoC = new InfoClient();
        }
        AdminIFrame.mostrarVentanaFactura(dp, vntInfoC); 
    }//GEN-LAST:event_informacionActionPerformed

    private void verusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verusuarioActionPerformed
        // TODO add your handling code here:
        if(vntVerUs == null){
            vntVerUs = new VerUsuarios();
        }
        AdminIFrame.mostrarVentanaFactura(dp, vntVerUs); 
    }//GEN-LAST:event_verusuarioActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        if(vntIC == null){
            vntIC = new IngresarCliente();
        }
        AdminIFrame.mostrarVentanaFactura(dp, vntIC);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void mercaexistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mercaexistenteActionPerformed
        // TODO add your handling code here:
        if(vntME == null){
            vntME = new MercaExisten();
        }
        AdminIFrame.mostrarVentanaFactura(dp, vntME);
    }//GEN-LAST:event_mercaexistenteActionPerformed

    private void registramercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registramercaActionPerformed
        // TODO add your handling code here:
        if(vntRM == null){
            vntRM = new RegistraMerca();
        }
        AdminIFrame.mostrarVentanaFactura(dp, vntRM);
    }//GEN-LAST:event_registramercaActionPerformed

    private void verproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verproveActionPerformed
        // TODO add your handling code here:
        
        if(vntVP == null){
            vntVP = new VerProveedores();
        }
        AdminIFrame.mostrarVentanaFactura(dp, vntVP);        
    }//GEN-LAST:event_verproveActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        if(vntRP == null){
            vntRP = new RegistraProveedor();
        }
        AdminIFrame.mostrarVentanaFactura(dp, vntRP);    
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        if(vtnMail == null){
            vtnMail = new Mail();
        }
        AdminIFrame.mostrarVentanaFactura(dp, vtnMail);    
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(Inic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem crearusuario;
    private javax.swing.JDesktopPane dp;
    private javax.swing.JMenuItem informacion;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JMenuItem mercaexistente;
    private javax.swing.JMenuItem registramerca;
    private javax.swing.JMenuItem verprove;
    private javax.swing.JMenuItem verusuario;
    // End of variables declaration//GEN-END:variables
}
