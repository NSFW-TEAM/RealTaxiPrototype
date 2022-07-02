package CodigoMain;
import java.util.*;

/**
 * Esta clase contiene la pantalla principal de la app.
 * @author NSFW TEAM
 * @version 1.0
 * @see javax.swing.JFrame
 */
public class pantallaPrincipal extends javax.swing.JFrame {
    
    private ArrayList <HashMap> listaColecciones;
    private ArrayList <HashMap> listaRutas;
    
    /**
     * Metodo constructor por defecto.
     */
    public pantallaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    /**
     * Metodo constructor parametrizado.
     * @param listaColecciones Lista de las colecciones de usuarios
     * @param listaRutas Lista de las rutas
     */
    public pantallaPrincipal(ArrayList <HashMap> listaColecciones, ArrayList <HashMap> listaRutas) {
        initComponents();
        setLocationRelativeTo(null);
        this.listaColecciones=listaColecciones;
        this.listaRutas=listaRutas;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnInicioSesion = new javax.swing.JButton();
        btnRegistrarse = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnAdministracion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 47));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/logoRealTaxi.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        btnInicioSesion.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        btnInicioSesion.setForeground(new java.awt.Color(0, 0, 47));
        btnInicioSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAmarillo.png"))); // NOI18N
        btnInicioSesion.setText("Iniciar Sesión");
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
        jPanel1.add(btnInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 200, 30));

        btnRegistrarse.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(0, 0, 47));
        btnRegistrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAmarillo.png"))); // NOI18N
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
        jPanel1.add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 200, 30));

        jLabel2.setFont(new java.awt.Font("Roboto Condensed", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("v1.0");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, -1, -1));

        btnAdministracion.setFont(new java.awt.Font("Roboto Condensed", 1, 12)); // NOI18N
        btnAdministracion.setForeground(new java.awt.Color(255, 207, 7));
        btnAdministracion.setText("Administración");
        btnAdministracion.setBorderPainted(false);
        btnAdministracion.setContentAreaFilled(false);
        btnAdministracion.setDefaultCapable(false);
        btnAdministracion.setFocusPainted(false);
        btnAdministracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministracionActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdministracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 420, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Boton que abre la ventana de registro de usuario.
     * @param evt 
     */
    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        ventanaRegistro ventanaRegistro= new ventanaRegistro(this, listaColecciones, listaRutas);
        ventanaRegistro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    /**
     * Boton que permite a un conductor o pasajero iniciar sesion.
     * @param evt 
     */
    private void btnInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioSesionActionPerformed
        ventanaInicioSesion ventanaInicioSesion= new ventanaInicioSesion(this,listaColecciones, listaRutas);
        ventanaInicioSesion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInicioSesionActionPerformed

    /**
     * Boton que permite a un administrador iniciar sesion.
     * @param evt 
     */
    private void btnAdministracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministracionActionPerformed
        ventanaInicioSesionAdministrador ventanaAdministrador= new ventanaInicioSesionAdministrador(this, listaColecciones, listaRutas);
        ventanaAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAdministracionActionPerformed

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
            java.util.logging.Logger.getLogger(pantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdministracion;
    private javax.swing.JButton btnInicioSesion;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}