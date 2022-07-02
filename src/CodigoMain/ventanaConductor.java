package CodigoMain;

import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * Esta clase contiene el menu de configuraciones de un conductor.
 * @author NSFW Team
 * @version 1.0
 * @see javax.swing.JFrame
 */
public class ventanaConductor extends javax.swing.JFrame {
    private ArrayList <HashMap> listaRutas;
    private ArrayList <HashMap> listaColecciones;
    private ConductorClase conductor;
    
    /**
     * Metodo constructor por defecto.
     */
    public ventanaConductor() {
        initComponents();
        apartadoOpcion.setVisible(false);
        botonAtras.setVisible(false);
        this.setLocationRelativeTo(null);
    }
    
    /**
     * Metodo constructor parametrizado.
     * @param listaRutas Lista de las rutas del conductor
     * @param conductor Conductor usando la app
     * @param listaColecciones Lista de los mapas de los usuarios
     */
    public ventanaConductor(ArrayList <HashMap> listaRutas, ConductorClase conductor, ArrayList <HashMap> listaColecciones) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.listaRutas=listaRutas;
        this.conductor=conductor;
        this.listaColecciones=listaColecciones;
        apartadoOpcion.setVisible(false);
        botonAtras.setVisible(false);
        String ganancias= Integer.toString(conductor.getGanancias());
        String calificacion=Float.toString(conductor.getCalificación());
        txtGanacias.setText("Ganancias: $"+ganancias);
        txtCalificacion.setText("Calificacion: "+calificacion);
        int ruta= buscarRuta(listaRutas, conductor)+1;
        txtRuta.setText("Su ruta: N°"+Integer.toString(ruta));
        txtNombreUsuario.setText(conductor.getUsername());
        rellenarLista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        apartadoOpcion = new javax.swing.JPanel();
        botonAtras = new javax.swing.JButton();
        btnEliminarCuenta = new javax.swing.JButton();
        btnCambiarNombre = new javax.swing.JButton();
        btnCambiarContrasena = new javax.swing.JButton();
        btnCambiarAvatar = new javax.swing.JButton();
        btnSolicitarCambioRuta = new javax.swing.JButton();
        btnCerrarCesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnCambiarAuto = new javax.swing.JButton();
        botonConfiguracion = new javax.swing.JButton();
        txtNombreUsuario = new javax.swing.JLabel();
        panelAmarillo = new javax.swing.JLabel();
        txtCalificacion = new javax.swing.JLabel();
        txtGanacias = new javax.swing.JLabel();
        txtRuta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPasajeros = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setMaximumSize(new java.awt.Dimension(300, 500));
        setPreferredSize(new java.awt.Dimension(310, 510));
        setResizable(false);
        setSize(new java.awt.Dimension(300, 500));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setFocusTraversalPolicyProvider(true);
        jPanel1.setMaximumSize(new java.awt.Dimension(300, 500));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        apartadoOpcion.setBackground(new java.awt.Color(255, 255, 204));
        apartadoOpcion.setDoubleBuffered(false);
        apartadoOpcion.setFocusable(false);
        apartadoOpcion.setMinimumSize(new java.awt.Dimension(300, 500));
        apartadoOpcion.setPreferredSize(new java.awt.Dimension(300, 500));
        apartadoOpcion.setRequestFocusEnabled(false);
        apartadoOpcion.setVerifyInputWhenFocusTarget(false);
        apartadoOpcion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAtras.png"))); // NOI18N
        botonAtras.setBorderPainted(false);
        botonAtras.setContentAreaFilled(false);
        botonAtras.setFocusPainted(false);
        botonAtras.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAtrasPressed.png"))); // NOI18N
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });
        apartadoOpcion.add(botonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        btnEliminarCuenta.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        btnEliminarCuenta.setForeground(new java.awt.Color(245, 245, 245));
        btnEliminarCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonPenalizar.png"))); // NOI18N
        btnEliminarCuenta.setText("Eliminar cuenta");
        btnEliminarCuenta.setBorderPainted(false);
        btnEliminarCuenta.setContentAreaFilled(false);
        btnEliminarCuenta.setFocusPainted(false);
        btnEliminarCuenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminarCuenta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAmarilloPressed.png"))); // NOI18N
        btnEliminarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCuentaActionPerformed(evt);
            }
        });
        apartadoOpcion.add(btnEliminarCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 420, -1, -1));

        btnCambiarNombre.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        btnCambiarNombre.setForeground(new java.awt.Color(245, 245, 245));
        btnCambiarNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAzul.png"))); // NOI18N
        btnCambiarNombre.setText("Cambiar nombre");
        btnCambiarNombre.setBorderPainted(false);
        btnCambiarNombre.setContentAreaFilled(false);
        btnCambiarNombre.setFocusPainted(false);
        btnCambiarNombre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCambiarNombre.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAmarilloPressed.png"))); // NOI18N
        btnCambiarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarNombreActionPerformed(evt);
            }
        });
        apartadoOpcion.add(btnCambiarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 90, -1, -1));

        btnCambiarContrasena.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        btnCambiarContrasena.setForeground(new java.awt.Color(245, 245, 245));
        btnCambiarContrasena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAzul.png"))); // NOI18N
        btnCambiarContrasena.setText("Cambiar contraseña");
        btnCambiarContrasena.setBorderPainted(false);
        btnCambiarContrasena.setContentAreaFilled(false);
        btnCambiarContrasena.setFocusPainted(false);
        btnCambiarContrasena.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCambiarContrasena.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAmarilloPressed.png"))); // NOI18N
        btnCambiarContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarContrasenaActionPerformed(evt);
            }
        });
        apartadoOpcion.add(btnCambiarContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 145, -1, -1));

        btnCambiarAvatar.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        btnCambiarAvatar.setForeground(new java.awt.Color(245, 245, 245));
        btnCambiarAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAzul.png"))); // NOI18N
        btnCambiarAvatar.setText("Cambiar avatar");
        btnCambiarAvatar.setBorderPainted(false);
        btnCambiarAvatar.setContentAreaFilled(false);
        btnCambiarAvatar.setFocusPainted(false);
        btnCambiarAvatar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCambiarAvatar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAmarilloPressed.png"))); // NOI18N
        apartadoOpcion.add(btnCambiarAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 200, -1, -1));

        btnSolicitarCambioRuta.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        btnSolicitarCambioRuta.setForeground(new java.awt.Color(245, 245, 245));
        btnSolicitarCambioRuta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAzul.png"))); // NOI18N
        btnSolicitarCambioRuta.setText("Solicitar cambio de ruta");
        btnSolicitarCambioRuta.setBorderPainted(false);
        btnSolicitarCambioRuta.setContentAreaFilled(false);
        btnSolicitarCambioRuta.setFocusPainted(false);
        btnSolicitarCambioRuta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSolicitarCambioRuta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAmarilloPressed.png"))); // NOI18N
        apartadoOpcion.add(btnSolicitarCambioRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 255, -1, -1));

        btnCerrarCesion.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        btnCerrarCesion.setForeground(new java.awt.Color(245, 245, 245));
        btnCerrarCesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAzul.png"))); // NOI18N
        btnCerrarCesion.setText("Cerrar sesión");
        btnCerrarCesion.setBorderPainted(false);
        btnCerrarCesion.setContentAreaFilled(false);
        btnCerrarCesion.setFocusPainted(false);
        btnCerrarCesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrarCesion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAmarilloPressed.png"))); // NOI18N
        btnCerrarCesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarCesionActionPerformed(evt);
            }
        });
        apartadoOpcion.add(btnCerrarCesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 365, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(42, 41, 93));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/barraTitulos.png"))); // NOI18N
        jLabel1.setText("Configuraciones");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        apartadoOpcion.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 40, 150, -1));

        btnCambiarAuto.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        btnCambiarAuto.setForeground(new java.awt.Color(245, 245, 245));
        btnCambiarAuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAzul.png"))); // NOI18N
        btnCambiarAuto.setText("Cambiar auto");
        btnCambiarAuto.setBorderPainted(false);
        btnCambiarAuto.setContentAreaFilled(false);
        btnCambiarAuto.setFocusPainted(false);
        btnCambiarAuto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCambiarAuto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAmarilloPressed.png"))); // NOI18N
        apartadoOpcion.add(btnCambiarAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 310, -1, -1));

        jPanel1.add(apartadoOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 240, 500));

        botonConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonConfiguracion.png"))); // NOI18N
        botonConfiguracion.setBorderPainted(false);
        botonConfiguracion.setContentAreaFilled(false);
        botonConfiguracion.setFocusPainted(false);
        botonConfiguracion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonConfiguracionPressed.png"))); // NOI18N
        botonConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConfiguracionActionPerformed(evt);
            }
        });
        jPanel1.add(botonConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, -1, -1));

        txtNombreUsuario.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        txtNombreUsuario.setForeground(new java.awt.Color(245, 245, 245));
        txtNombreUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/user.png"))); // NOI18N
        txtNombreUsuario.setText("Usuario");
        txtNombreUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtNombreUsuario.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 40, 100, 100));

        panelAmarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/DivisionAmarillo.png"))); // NOI18N
        jPanel1.add(panelAmarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 100));

        txtCalificacion.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        txtCalificacion.setForeground(new java.awt.Color(0, 0, 47));
        txtCalificacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCalificacion.setText("Calificacion:");
        txtCalificacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtCalificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 300, 30));

        txtGanacias.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        txtGanacias.setForeground(new java.awt.Color(0, 0, 47));
        txtGanacias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtGanacias.setText("Ganancias: $");
        txtGanacias.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtGanacias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 300, 30));

        txtRuta.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        txtRuta.setForeground(new java.awt.Color(0, 0, 47));
        txtRuta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRuta.setText("Ruta actual");
        jPanel1.add(txtRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 300, 30));

        listPasajeros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listPasajerosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listPasajeros);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 260, 160));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Boton que abre la ventana de configuraciones.
     * @param evt 
     */
    private void botonConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfiguracionActionPerformed
        panelAmarillo.setVisible(false);
        apartadoOpcion.setVisible(true);
        botonAtras.setVisible(true);
    }//GEN-LAST:event_botonConfiguracionActionPerformed

    /**
     * Boton que permite volver a la ventana anterior.
     * @param evt 
     */
    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed

        panelAmarillo.setVisible(true);
        apartadoOpcion.setVisible(false);
        botonAtras.setVisible(false);
    }//GEN-LAST:event_botonAtrasActionPerformed

    /**
     * Boton que le permite a un conductor eliminar su cuenta.
     * @param evt 
     */
    private void btnEliminarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCuentaActionPerformed
        
        int opt = JOptionPane.showConfirmDialog(this, "¿Estas seguro?");
        
        if (opt ==0){
            try {
                conductor.logEliminarCuenta();
                conductor.eliminarCuenta(listaColecciones.get(1));
                conductor.eliminarAuto();
                this.setVisible(false);
                pantallaPrincipal ventana = new pantallaPrincipal();
                ventana.setVisible(true);
            } catch (IOException ex) {   
                Logger.getLogger(ventanaConductor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnEliminarCuentaActionPerformed

    /**
     * Boton que permite a un conductor cambiar su nombre
     * @param evt 
     */
    private void btnCambiarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarNombreActionPerformed
         String contraseñaActual = JOptionPane.showInputDialog(this,"Ingrese contraseña actual: ");
        if(!contraseñaActual.equals(conductor.getPassword())){
            JOptionPane.showMessageDialog(this,"Contraseña incorrecta, intente nuevamente.");
        }else{
            String usernameNuevo = "";
            usernameNuevo = JOptionPane.showInputDialog(this,"Ingrese nombre nuevo: ");
            try {
                conductor.logCambiarNombre(usernameNuevo);
                conductor.setUserName(usernameNuevo);
                conductor.cambiarNombre();
            } catch (IOException ex) {
                Logger.getLogger(ventanaConductor.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.txtNombreUsuario.setText(conductor.getUsername());
            JOptionPane.showMessageDialog(this,"Nombre cambiado correctamente.");
        }
    }//GEN-LAST:event_btnCambiarNombreActionPerformed

    /**
     * Boton que permite a un conductor cambiar su contraseña
     * @param evt 
     */
    private void btnCambiarContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarContrasenaActionPerformed
        String contraseñaActual = JOptionPane.showInputDialog(this,"Ingrese contraseña actual: ");
        if(!contraseñaActual.equals(conductor.getPassword())){
            JOptionPane.showMessageDialog(this,"Contraseña incorrecta, intente nuevamente.");
        }else{
            String contraseñaNueva1 = "a";
            String contraseñaNueva2 = "b";
            do{
                contraseñaNueva1 = JOptionPane.showInputDialog(this,"Ingrese contraseña nueva: ");
                contraseñaNueva2 = JOptionPane.showInputDialog(this,"Confirme contraseña nueva: ");
                if(!contraseñaNueva1.equals(contraseñaNueva2)){
                    JOptionPane.showMessageDialog(this,"Las contraseñas no coinciden, intente nuevamente.");
                }
            }while(!contraseñaNueva1.equals(contraseñaNueva2));
            conductor.setPassword(contraseñaNueva2);
            try {
                conductor.cambiarContraseña();
            } catch (IOException ex) {
                Logger.getLogger(ventanaPasajeros.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this,"Contraseña cambiada correctamente.");
        }
    }//GEN-LAST:event_btnCambiarContrasenaActionPerformed

    /**
     * Boton que permite a un conductor cerrar su sesion.
     * @param evt 
     */
    private void btnCerrarCesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarCesionActionPerformed
        int opt = JOptionPane.showConfirmDialog(this, "¿Estas seguro?");
        
        if(opt ==0){
            this.setVisible(false);
            pantallaPrincipal ventana = new pantallaPrincipal(listaColecciones,listaRutas);
            ventana.setVisible(true);
        }
    }//GEN-LAST:event_btnCerrarCesionActionPerformed

    /**
     * Metodo que permite a un conductor escoger un pasajero y tomarlo.
     * @param evt 
     */
    private void listPasajerosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listPasajerosMouseClicked
        String[] opciones= {"Si", "No","Ver información"};
        int opcion=JOptionPane.showOptionDialog(this,"¿Desea confirmar el viaje", "Escoja una opcion", 0,JOptionPane.PLAIN_MESSAGE,null,opciones,"");
        //System.out.println(evt);
        String nombre=listPasajeros.getSelectedValue();
        int seleccion=listPasajeros.getSelectedIndex();
        System.out.println(nombre);
        System.out.println(opcion);
        System.out.println(seleccion);
        if(opcion!=-1){
            if(opcion==2){
                JOptionPane.showMessageDialog(this, "Nombre del pasajero: "+nombre);
            }
            if(opcion==0){
                PasajeroClase pasajero= conductor.getAuto().getPasajeros(seleccion);
                pasajero.setEnViaje(true);
                pasajero.setEnEspera(false);
            }
        }
    }//GEN-LAST:event_listPasajerosMouseClicked

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
            java.util.logging.Logger.getLogger(ventanaConductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaConductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaConductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaConductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaConductor().setVisible(true);
            }
        });
    }
    
    /**
     * Metodo que permite ver las rutas de un conductor.
     * @param listaRutas Lista de las rutas
     * @param conductor Conductor del cual se mostraran las rutas
     * @return Retorna el numero de ruta del conductor si es que tiene una asignada y 123456 si no se encuentra (ERROR)
     */
    public int buscarRuta(ArrayList <HashMap> listaRutas, ConductorClase conductor){
        for(int i=0;i<listaRutas.size();i++){
            if(listaRutas.get(i).containsKey(conductor.getRut())){
                System.out.println(i);
                return i;
            }
        }
        return 123456;
    }
    
    /**
     * Metodo que permite rellenar el auto de un conductor con pasajeros.
     */
    public void rellenarLista(){
        DefaultListModel<String> model = new DefaultListModel<>();
        listPasajeros.setModel(model);
        for(int i=0;i<4-(conductor.getAuto().getCapacidad());i++){
            PasajeroClase pasajero= conductor.getAuto().getPasajeros(i);
            model.addElement(pasajero.getUsername());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel apartadoOpcion;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonConfiguracion;
    private javax.swing.JButton btnCambiarAuto;
    private javax.swing.JButton btnCambiarAvatar;
    private javax.swing.JButton btnCambiarContrasena;
    private javax.swing.JButton btnCambiarNombre;
    private javax.swing.JButton btnCerrarCesion;
    private javax.swing.JButton btnEliminarCuenta;
    private javax.swing.JButton btnSolicitarCambioRuta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listPasajeros;
    private javax.swing.JLabel panelAmarillo;
    private javax.swing.JLabel txtCalificacion;
    private javax.swing.JLabel txtGanacias;
    private javax.swing.JLabel txtNombreUsuario;
    private javax.swing.JLabel txtRuta;
    // End of variables declaration//GEN-END:variables
}
