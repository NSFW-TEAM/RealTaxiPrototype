package CodigoMain;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JOptionPane;


/**
 * Esta clase contiene la ventana de registro de usuario de la app.
 * @author NSFW Team
 * @version 1.0
 * @see javax.swing.JFrame
 */
public class ventanaRegistro extends javax.swing.JFrame {
    private pantallaPrincipal anterior;
    private ArrayList <HashMap> listaColecciones;
    private ArrayList <HashMap> listaRutas;
    
    /**
     * Metodo constructor por defecto.
     */
    public ventanaRegistro() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    /**
     * Metodo constructor parametrizado.
     * @param anterior Indice a la ventana anterior
     * @param listaColecciones Lista de las colecciones de usuarios
     * @param listaRutas Lista de las rutas
     */
    public ventanaRegistro(pantallaPrincipal anterior,ArrayList <HashMap> listaColecciones,ArrayList <HashMap> listaRutas){
        initComponents();
        setLocationRelativeTo(null);
        this.anterior=anterior;
        this.listaColecciones=listaColecciones;
        this.listaRutas=listaRutas;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        txtRutUsuario = new javax.swing.JTextField();
        txtContraseña2 = new javax.swing.JPasswordField();
        txtContraseña1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        btnRegistrarse = new javax.swing.JButton();
        opcionCombo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 207, 7));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAtras.png"))); // NOI18N
        btnAtras.setBorderPainted(false);
        btnAtras.setContentAreaFilled(false);
        btnAtras.setFocusPainted(false);
        btnAtras.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAtrasPressed.png"))); // NOI18N
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/logoRealTaxi.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/imagenMapa.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 180));

        jLabel3.setFont(new java.awt.Font("Roboto Condensed", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 47));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/barraTitulos.png"))); // NOI18N
        jLabel3.setText("Registro");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Condensed", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 47));
        jLabel5.setText("Confirme su contraseña:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        txtNombreUsuario.setBackground(new java.awt.Color(245, 245, 245));
        txtNombreUsuario.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        txtNombreUsuario.setForeground(new java.awt.Color(0, 0, 47));
        txtNombreUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreUsuario.setText("Nombre de Usuario");
        txtNombreUsuario.setBorder(null);
        txtNombreUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtNombreUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreUsuarioMouseClicked(evt);
            }
        });
        txtNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 200, 30));

        txtRutUsuario.setBackground(new java.awt.Color(245, 245, 245));
        txtRutUsuario.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        txtRutUsuario.setForeground(new java.awt.Color(0, 0, 47));
        txtRutUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRutUsuario.setText("Rut de Usuario");
        txtRutUsuario.setBorder(null);
        txtRutUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRutUsuarioMouseClicked(evt);
            }
        });
        jPanel1.add(txtRutUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 200, 30));

        txtContraseña2.setBackground(new java.awt.Color(245, 245, 245));
        txtContraseña2.setForeground(new java.awt.Color(0, 0, 47));
        txtContraseña2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContraseña2.setText("Contraseña");
        txtContraseña2.setBorder(null);
        txtContraseña2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtContraseña2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContraseña2MouseClicked(evt);
            }
        });
        txtContraseña2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseña2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtContraseña2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 200, 30));
        txtContraseña2.getAccessibleContext().setAccessibleName("");
        txtContraseña2.getAccessibleContext().setAccessibleDescription("ddssss");

        txtContraseña1.setBackground(new java.awt.Color(245, 245, 245));
        txtContraseña1.setForeground(new java.awt.Color(0, 0, 47));
        txtContraseña1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContraseña1.setText("Contraseña");
        txtContraseña1.setBorder(null);
        txtContraseña1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtContraseña1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContraseña1MouseClicked(evt);
            }
        });
        jPanel1.add(txtContraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 200, 30));

        jLabel4.setFont(new java.awt.Font("Roboto Condensed", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 47));
        jLabel4.setText("Cree una contraseña:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        btnRegistrarse.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 204));
        btnRegistrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAzul.png"))); // NOI18N
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.setBorder(null);
        btnRegistrarse.setBorderPainted(false);
        btnRegistrarse.setContentAreaFilled(false);
        btnRegistrarse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrarse.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAmarilloPressed.png"))); // NOI18N
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        opcionCombo.setBackground(new java.awt.Color(245, 245, 245));
        opcionCombo.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        opcionCombo.setForeground(new java.awt.Color(0, 0, 47));
        opcionCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pasajero", "Conductor" }));
        opcionCombo.setBorder(null);
        opcionCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionComboActionPerformed(evt);
            }
        });
        jPanel1.add(opcionCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 200, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUsuarioActionPerformed
        
    }//GEN-LAST:event_txtNombreUsuarioActionPerformed

    /**
     * Boton que le permite a un usuario registrarse en la app.
     * @param evt 
     */
    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        if(txtContraseña1.getText().equals(txtContraseña2.getText())==false ){
            JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden");
        }else{
            AdminClase admin=new AdminClase("admin1","0","0");
            if(opcionCombo.getItemAt(opcionCombo.getSelectedIndex()).equals("Pasajero")){
                PasajeroClase nuevoPasajero= new PasajeroClase(txtNombreUsuario.getText(),txtContraseña1.getText(), txtRutUsuario.getText());
                
                if(admin.buscar(nuevoPasajero.getRut(), listaColecciones.get(2))==null){
                    try {
                        admin.agregarPasajero(nuevoPasajero);
                        listaColecciones.get(2).put(nuevoPasajero.getRut(), nuevoPasajero);
                    } catch (IOException ex) {
                        Logger.getLogger(ventanaRegistro.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(this, "Pasajero registrado correctamente");
                }
                else{
                    JOptionPane.showMessageDialog(this, "Ya existe una cuenta asociada a este rut");
                }
                
                //ventanaPasajero ventanaPasajero =new ventanaPasajero(listaRutas, nuevoPasajero);
                //ventanaPasajero.setVisible(true);
                //this.dispose();
            }else{
                
                if(admin.buscarConductor(txtRutUsuario.toString(), listaColecciones.get(1))==null){
                    try {
                        admin.agregarConductor(admin.buscarConductor(txtRutUsuario.toString(), listaColecciones.get(1)));
                        listaColecciones.get(1).put(txtRutUsuario.toString(), admin.buscarConductor(txtRutUsuario.toString(), listaColecciones.get(1)));
                    } catch (IOException ex) {
                        Logger.getLogger(ventanaRegistro.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(this, "Conductor registrado correctamente");
                    FormularioAuto formulario = new FormularioAuto(this,txtNombreUsuario.getText(),txtContraseña1.getText(), txtRutUsuario.getText(), listaColecciones, listaRutas);
                    formulario.setVisible(true);
                    this.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(this, "Ya existe una cuenta asociada a este rut");
                }
                //ConductorClase nuevoConductor= new ConductorClase(txtNombreUsuario.getText(),txtContraseña1.getText(), txtRutUsuario.getText(), );
            }
        }
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    /**
     * Boton que permite volver a la ventana anterior.
     * @param evt 
     */
    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        anterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void opcionComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionComboActionPerformed
        
    }//GEN-LAST:event_opcionComboActionPerformed

    /**
     * Boton que elimina lo escrito en el campo del nombre de usuario al hacer clic por primera vez.
     * @param evt 
     */
    private void txtNombreUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreUsuarioMouseClicked

        if(txtNombreUsuario.getText().equals("Nombre de Usuario")) {
            txtNombreUsuario.setText("");
        }
        
    }//GEN-LAST:event_txtNombreUsuarioMouseClicked

    /**
     * Boton que elimina lo escrito en el campo del rut al hacer clic por primera vez.
     * @param evt 
     */
    private void txtRutUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRutUsuarioMouseClicked

        if(txtRutUsuario.getText().equals("Rut de Usuario")) {
            txtRutUsuario.setText("");
        }
    }//GEN-LAST:event_txtRutUsuarioMouseClicked

    /**
     * Boton que elimina lo escrito en el campo de la primera contraseña al hacer clic por primera vez.
     * @param evt 
     */
    private void txtContraseña1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseña1MouseClicked

        txtContraseña1.setText("");
    }//GEN-LAST:event_txtContraseña1MouseClicked

    /**
     * Boton que elimina lo escrito en el campo de la segunda contraseña al hacer clic por primera vez.
     * @param evt 
     */
    private void txtContraseña2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseña2MouseClicked
        txtContraseña2.setText("");
    }//GEN-LAST:event_txtContraseña2MouseClicked

    private void txtContraseña2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseña2ActionPerformed

    }//GEN-LAST:event_txtContraseña2ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventanaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaRegistro().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> opcionCombo;
    private javax.swing.JPasswordField txtContraseña1;
    private javax.swing.JPasswordField txtContraseña2;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtRutUsuario;
    // End of variables declaration//GEN-END:variables
}
