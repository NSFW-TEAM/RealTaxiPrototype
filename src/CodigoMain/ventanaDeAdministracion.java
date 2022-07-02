package CodigoMain;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 * Esta clase contiene el menu de opciones de un administrador.
 * @author NSFW Team
 * @version 1.0
 * @see javax.swing.JFrame
 */
public class ventanaDeAdministracion extends javax.swing.JFrame {
    private ventanaInicioSesionAdministrador anterior;
    private ArrayList <HashMap> listaColecciones;
    private ArrayList <HashMap> listaRutas;
    private AdminClase admin;
   
    /**
     * Metodo constructor por defecto.
     */
    public ventanaDeAdministracion() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    /**
     * Metodo constructor parametrizado.
     * @param anterior Indice a la ventana anterior
     * @param listaColecciones Lista de las colecciones de usuarios
     * @param listaRutas Lista de rutas
     * @param admin Admin con la sesion iniciada
     */
    public ventanaDeAdministracion(ventanaInicioSesionAdministrador anterior, ArrayList <HashMap> listaColecciones, ArrayList <HashMap> listaRutas, AdminClase admin) {
        initComponents();
        setLocationRelativeTo(null);
        this.anterior=anterior;
        this.listaColecciones=listaColecciones;
        this.listaRutas=listaRutas;
        this.admin=admin;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnMostrarPorRutas = new javax.swing.JButton();
        btnMostrarUsuarios1 = new javax.swing.JButton();
        btnMostrarChoferes = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMostrarPorRutas.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        btnMostrarPorRutas.setForeground(new java.awt.Color(245, 245, 245));
        btnMostrarPorRutas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAzul.png"))); // NOI18N
        btnMostrarPorRutas.setText("Mostrar rutas");
        btnMostrarPorRutas.setBorder(null);
        btnMostrarPorRutas.setBorderPainted(false);
        btnMostrarPorRutas.setContentAreaFilled(false);
        btnMostrarPorRutas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMostrarPorRutas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAmarilloPressed.png"))); // NOI18N
        btnMostrarPorRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarPorRutasActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrarPorRutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        btnMostrarUsuarios1.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        btnMostrarUsuarios1.setForeground(new java.awt.Color(245, 245, 245));
        btnMostrarUsuarios1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAzul.png"))); // NOI18N
        btnMostrarUsuarios1.setText("Mostrar usuarios");
        btnMostrarUsuarios1.setBorder(null);
        btnMostrarUsuarios1.setBorderPainted(false);
        btnMostrarUsuarios1.setContentAreaFilled(false);
        btnMostrarUsuarios1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMostrarUsuarios1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAmarilloPressed.png"))); // NOI18N
        btnMostrarUsuarios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarUsuarios1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrarUsuarios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        btnMostrarChoferes.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        btnMostrarChoferes.setForeground(new java.awt.Color(245, 245, 245));
        btnMostrarChoferes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAzul.png"))); // NOI18N
        btnMostrarChoferes.setText("Mostrar conductores");
        btnMostrarChoferes.setBorder(null);
        btnMostrarChoferes.setBorderPainted(false);
        btnMostrarChoferes.setContentAreaFilled(false);
        btnMostrarChoferes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMostrarChoferes.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAmarilloPressed.png"))); // NOI18N
        btnMostrarChoferes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarChoferesActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrarChoferes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/cuadroAmarillo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 100, 250, 300));

        jLabel2.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 47));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/barraTitulos.png"))); // NOI18N
        jLabel2.setText("Seleccione una opción");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Boton que permite ir a la ventana anterior
     * @param evt 
     */
    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        anterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    /**
     * Boton que le permite al administrador mostrar una lista de todos los conductores de la app.
     * @param evt 
     */
    private void btnMostrarChoferesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarChoferesActionPerformed
        ventanaMostrarChoferes ventanaMostrarChoferes= new ventanaMostrarChoferes(this, listaColecciones, listaRutas, admin);
        ventanaMostrarChoferes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMostrarChoferesActionPerformed

    /**
     * Boton que le permite al administrador mostrar una lista de todos los usuarios de la app.
     * @param evt 
     */
    private void btnMostrarUsuarios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarUsuarios1ActionPerformed
        ventanaMostrarUsuarios ventanaMostrarUsuario= new ventanaMostrarUsuarios(this,listaColecciones,admin);
        ventanaMostrarUsuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMostrarUsuarios1ActionPerformed

    /**
     * Boton que le permite al administrador mostrar una lista de choferes seccionada por rutas.
     * @param evt 
     */
    private void btnMostrarPorRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPorRutasActionPerformed

        String [] arreglo ={"Ruta 1","Ruta 2","Ruta 3"};
        int opcion = JOptionPane.showOptionDialog(this, "Elige una ruta", "Escoja una opción", 0,JOptionPane.QUESTION_MESSAGE,null,arreglo,"");
        System.out.println(opcion);
        if(opcion!=-1){
            ventanaMostrarChoferes ventanaMostrarChoferes= new ventanaMostrarChoferes(this, listaColecciones, listaRutas, admin,opcion);
            ventanaMostrarChoferes.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnMostrarPorRutasActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaDeAdministracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaDeAdministracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaDeAdministracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaDeAdministracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaDeAdministracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnMostrarChoferes;
    private javax.swing.JButton btnMostrarPorRutas;
    private javax.swing.JButton btnMostrarUsuarios1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
