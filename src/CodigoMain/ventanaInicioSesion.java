package CodigoMain;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Esta clase contiene el menu de inicio de sesion.
 * @author NSFW Team
 * @version 1.0
 * @see javax.swing.JFrame
 */
public class ventanaInicioSesion extends javax.swing.JFrame {
    private pantallaPrincipal anterior;
    ArrayList <HashMap> listaColecciones;
    ArrayList <HashMap> listaRutas;
    
    /**
     * Metodo constructor por defecto.
     */
    public ventanaInicioSesion() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    /**
     * Metodo constructor parametrizado.
     * @param anterior Indice a la ventana anterior
     * @param listaColecciones Lista de las colecciones de usuarios
     * @param listaRutas Lista de rutas
     */
    public ventanaInicioSesion(pantallaPrincipal anterior,ArrayList <HashMap> listaColecciones,ArrayList <HashMap> listaRutas) {
        initComponents();
        setLocationRelativeTo(null);
        this.anterior = anterior;
        this.listaColecciones = listaColecciones;
        this.listaRutas = listaRutas;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnInicioSesion = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        txtRut = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 204, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInicioSesion.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        btnInicioSesion.setForeground(new java.awt.Color(245, 245, 245));
        btnInicioSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAzul.png"))); // NOI18N
        btnInicioSesion.setText("Iniciar sesión");
        btnInicioSesion.setBorder(null);
        btnInicioSesion.setBorderPainted(false);
        btnInicioSesion.setContentAreaFilled(false);
        btnInicioSesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInicioSesion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAmarilloPressed.png"))); // NOI18N
        btnInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioSesionActionPerformed(evt);
            }
        });
        jPanel2.add(btnInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 200, 30));

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
        jPanel2.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txtRut.setBackground(new java.awt.Color(245, 245, 245));
        txtRut.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        txtRut.setForeground(new java.awt.Color(0, 0, 47));
        txtRut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRut.setText("Ingrese su rut");
        txtRut.setToolTipText("");
        txtRut.setBorder(null);
        txtRut.setName(""); // NOI18N
        txtRut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRutMouseClicked(evt);
            }
        });
        txtRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutActionPerformed(evt);
            }
        });
        jPanel2.add(txtRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 200, 30));
        txtRut.getAccessibleContext().setAccessibleName("boton1");

        txtContrasena.setBackground(new java.awt.Color(245, 245, 245));
        txtContrasena.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        txtContrasena.setForeground(new java.awt.Color(0, 0, 47));
        txtContrasena.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContrasena.setText("Contraseña");
        txtContrasena.setToolTipText("");
        txtContrasena.setBorder(null);
        txtContrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContrasenaMouseClicked(evt);
            }
        });
        txtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActionPerformed(evt);
            }
        });
        jPanel2.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 200, 30));

        jLabel3.setFont(new java.awt.Font("Roboto Condensed", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 47));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonTitulos.png"))); // NOI18N
        jLabel3.setText("Inicio de sesión");
        jLabel3.setFocusable(false);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 90, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/logoRealTaxi.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 200, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/imagenMapa.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaActionPerformed

    }//GEN-LAST:event_txtContrasenaActionPerformed

    private void txtRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutActionPerformed
        setVisible(false);
    }//GEN-LAST:event_txtRutActionPerformed

    /**
     * Boton que le permite a un conductor o pasajero existente iniciar sesion.
     * @param evt 
     */
    private void btnInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioSesionActionPerformed
        AdminClase admin=new AdminClase("admin1","0","0");
        
        if(admin.buscar(txtRut.getText(),listaColecciones.get(2))!=null){//Comprueba que el usuario con el rut ingresado exista
            
            if(txtContrasena.getText().equals(admin.buscar(txtRut.getText(),listaColecciones.get(2)).getPassword())){//Comprueba que las contraseña ingresada y la del usaurio dentro del mapa coincidan
                PasajeroClase pasajero = admin.buscar(txtRut.getText(),listaColecciones.get(2));
                JOptionPane.showMessageDialog(this,"Inicio sesión exitoso como Pasajero");
                ventanaPasajeros ventana = null;
                try {
                    ventana = new ventanaPasajeros(listaRutas,pasajero,listaColecciones);
                } catch (IOException ex) {
                    Logger.getLogger(ventanaInicioSesion.class.getName()).log(Level.SEVERE, null, ex);
                }
                ventana.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Contraseña incorrecta.");
            }    
        }else{
            if(admin.buscarConductor(txtRut.getText(),listaColecciones.get(1))!=null){
                if(txtContrasena.getText().equals(admin.buscarConductor(txtRut.getText(),listaColecciones.get(1)).getPassword())){
                    ConductorClase conductor = admin.buscarConductor(txtRut.getText(), listaColecciones.get(1));
                    JOptionPane.showMessageDialog(this,"Inicio sesión exitoso como Conductor");
                    ventanaConductor ventana = new ventanaConductor(listaRutas,conductor,listaColecciones);
                    ventana.setVisible(true);
                    this.dispose();
                }
                else{
                   JOptionPane.showMessageDialog(this, "Contraseña incorrecta."); 
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Rut inexistente");
            }
            
            
        }
    }//GEN-LAST:event_btnInicioSesionActionPerformed

    /**
     * Boton que permite volver a la ventana anterior
     * @param evt 
     */
    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        anterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    /**
     * Metodo que elimina lo escrito en el campo del rut al hacer clic por primera vez.
     * @param evt 
     */
    private void txtRutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRutMouseClicked

        if(txtRut.getText().equals("Ingrese su rut")) {
            txtRut.setText("");
        }
    }//GEN-LAST:event_txtRutMouseClicked

    /**
     * Metodo que elimina lo escrito en el campo de la contraseña al hacer clic por primera vez.
     * @param evt 
     */
    private void txtContrasenaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContrasenaMouseClicked

        txtContrasena.setText("");
        
    }//GEN-LAST:event_txtContrasenaMouseClicked

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
            java.util.logging.Logger.getLogger(ventanaInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaInicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnInicioSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}
