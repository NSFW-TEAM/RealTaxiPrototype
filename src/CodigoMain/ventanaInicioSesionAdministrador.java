package CodigoMain;
import java.util.*;
import javax.swing.*;

/**
 * Esta clase contiene la ventana de inicio de sesion de un administrador.
 * @author NSFW Team
 * @version 1.0
 * @see javax.swing.JFrame
 */
public class ventanaInicioSesionAdministrador extends javax.swing.JFrame {
    private pantallaPrincipal anterior;
    private ArrayList <HashMap> listaColecciones;
    private ArrayList <HashMap> listaRutas;
    
    /**
     * Metodo constructor por defecto.
     */
    public ventanaInicioSesionAdministrador() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    /**
     * Metodo constructor parametrizado.
     * @param anterior Indice a la ventana anterior
     * @param listaColecciones Lista de colecciones de los usuarios
     * @param listaRutas Lista de las rutas
     */
    public ventanaInicioSesionAdministrador(pantallaPrincipal anterior, ArrayList <HashMap> listaColecciones, ArrayList <HashMap> listaRutas) {
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
        jLabel3 = new javax.swing.JLabel();
        txtRutUsuario = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtContraseñaUsuario = new javax.swing.JPasswordField();
        btnInicioSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 200, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Condensed", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 47));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/barraTitulos.png"))); // NOI18N
        jLabel3.setText("Acceso administración");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 230, 110, 30));

        txtRutUsuario.setBackground(new java.awt.Color(255, 255, 204));
        txtRutUsuario.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        txtRutUsuario.setForeground(new java.awt.Color(0, 0, 47));
        txtRutUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRutUsuario.setText("Rut");
        txtRutUsuario.setBorder(null);
        txtRutUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRutUsuarioMouseClicked(evt);
            }
        });
        jPanel1.add(txtRutUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 200, 30));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 204));
        txtUsuario.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(0, 0, 47));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setText("Usuario");
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseClicked(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 200, 30));

        txtContraseñaUsuario.setBackground(new java.awt.Color(255, 255, 204));
        txtContraseñaUsuario.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        txtContraseñaUsuario.setForeground(new java.awt.Color(0, 0, 47));
        txtContraseñaUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContraseñaUsuario.setText("Contraseña");
        txtContraseñaUsuario.setBorder(null);
        txtContraseñaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContraseñaUsuarioMouseClicked(evt);
            }
        });
        jPanel1.add(txtContraseñaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 200, 30));

        btnInicioSesion.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        btnInicioSesion.setForeground(new java.awt.Color(255, 255, 204));
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
        jPanel1.add(btnInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 200, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/imagenMapa.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Boton que permite volver a la ventana anterior.
     * @param evt 
     */
    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        anterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    /**
     * Boton que permite al administrador existente iniciar sesion.
     * @param evt 
     */
    private void btnInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioSesionActionPerformed

        if(listaColecciones.get(0).containsKey(txtRutUsuario.getText())){
            AdminClase admin = (AdminClase) listaColecciones.get(0).get(txtRutUsuario.getText());
            System.out.println(admin.getPassword());
            if(admin.getPassword().equals(txtContraseñaUsuario.getText()) && admin.getUsername().equals(txtUsuario.getText())){
                ventanaDeAdministracion ventanaDeAdministracion= new ventanaDeAdministracion(this, listaColecciones, listaRutas, admin);
                ventanaDeAdministracion.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Contraseña o usuario incorrectos, intente nuevamente.");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Rut incorrecto, intente nuevamente.");
        }
    }//GEN-LAST:event_btnInicioSesionActionPerformed

    /**
     * Metodo que borra lo escrito en el campo del usuario al hacer clic por primera vez.
     * @param evt 
     */
    private void txtUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseClicked

        txtUsuario.setText("");
    }//GEN-LAST:event_txtUsuarioMouseClicked

    /**
     * Metodo que borra lo escrito en el campo del rut al hacer clic por primera vez.
     * @param evt 
     */
    private void txtRutUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRutUsuarioMouseClicked

        txtRutUsuario.setText("");
    }//GEN-LAST:event_txtRutUsuarioMouseClicked

    /**
     * Metodo que borra lo escrito en el campo de la contraseña al hacer clic por primera vez.
     * @param evt 
     */
    private void txtContraseñaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaUsuarioMouseClicked

        txtContraseñaUsuario.setText("");
    }//GEN-LAST:event_txtContraseñaUsuarioMouseClicked

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
            java.util.logging.Logger.getLogger(ventanaInicioSesionAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaInicioSesionAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaInicioSesionAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaInicioSesionAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaInicioSesionAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnInicioSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtContraseñaUsuario;
    private javax.swing.JTextField txtRutUsuario;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
