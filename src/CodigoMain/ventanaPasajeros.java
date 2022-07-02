package CodigoMain;


//import static com.teamdev.jxbrowser.engine.RenderingMode.*;
//import com.teamdev.jxbrowser.browser.Browser;
//import com.teamdev.jxbrowser.engine.Engine;
//import com.teamdev.jxbrowser.engine.EngineOptions;
//import com.teamdev.jxbrowser.engine.RenderingMode;
//import com.teamdev.jxbrowser.view.swing.BrowserView;
//import com.teamdev.jxbrowser.*;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.util.*;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.OK_CANCEL_OPTION;
import javax.swing.table.DefaultTableModel;

/**
 * Esta clase contiene el menu de configuraciones de un pasajero.
 * @author NSFW Team
 * @version 1.0
 * @see javax.swing.JFrame
 */
public class ventanaPasajeros extends javax.swing.JFrame {
    private ArrayList <HashMap> listaCiudades;
    private ArrayList <HashMap> listaColecciones;
    private PasajeroClase pasajero;
    private ArrayList<String> ruts;
    private ConductorClase conductorPago;
        
    /**
     * Metodo constructor por defecto.
     */
    public ventanaPasajeros() {
        initComponents();
        apartadoOpcion.setVisible(false);
        botonAtras.setVisible(false);
        this.setLocationRelativeTo(null);
    }
    
    /**
     * Metodo constructor parametrizado.
     * @param listaRutas Lista de las rutas
     * @param pasajero Pasajero con la sesion iniciada
     * @param listaColecciones Lista de las colecciones de usuarios
     * @throws IOException 
     */
    public ventanaPasajeros(ArrayList <HashMap> listaRutas, PasajeroClase pasajero, ArrayList <HashMap> listaColecciones) throws IOException {
        initComponents();
        this.setLocationRelativeTo(null);
        this.listaCiudades=listaRutas;
        this.pasajero=pasajero;
        this.listaColecciones=listaColecciones;
        apartadoOpcion.setVisible(false);
        botonAtras.setVisible(false);
        txtNombreUsuario.setText(pasajero.getUsername());
        txtPantallaEspera.setVisible(false);
        String saldo = Integer.toString(pasajero.tarjeta.getSaldo());
        String numTarjeta = Long.toString(pasajero.tarjeta.getNum_tarjeta());
        txtTituloSaldo.setText("Saldo: Tarjeta N°"+numTarjeta);
        txtSaldoUsuario.setText("$"+saldo);
        txtPagar.setVisible(false);
        btnEnEfectivo.setVisible(false);
        btnTarjeta.setVisible(false);
        pasajeroEnEspera(pasajero);
        pasajeroEnViaje(pasajero);
        navegador();
        rellenarCombobox();
        //ordenarTablaNombre(listaColecciones.get(1));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        apartadoOpcion = new javax.swing.JPanel();
        botonAtras = new javax.swing.JButton();
        btnEliminarCuenta = new javax.swing.JButton();
        btnCambiarNombre = new javax.swing.JButton();
        btnCambiarContrasena = new javax.swing.JButton();
        btnCambiarAvatar = new javax.swing.JButton();
        btnCambiarTarjeta = new javax.swing.JButton();
        btnCerrarCesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JLabel();
        botonConfiguracion = new javax.swing.JButton();
        panelAmarillo = new javax.swing.JLabel();
        comboboxActual = new javax.swing.JComboBox<>();
        comboboxDestino = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPagar = new javax.swing.JLabel();
        txtPantallaEspera = new javax.swing.JLabel();
        btnEnEfectivo = new javax.swing.JButton();
        btnTarjeta = new javax.swing.JButton();
        scrollTabla = new javax.swing.JScrollPane();
        tablaDeConductores = new javax.swing.JTable();
        txtSaldoUsuario = new javax.swing.JLabel();
        txtTituloSaldo = new javax.swing.JLabel();
        btnOrdenarNombres = new javax.swing.JButton();
        btnOrndenarCalificacion = new javax.swing.JButton();
        txtOrdenar = new javax.swing.JLabel();
        btnFiltrarPorRango = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PanelPrincipal.setBackground(new java.awt.Color(245, 245, 245));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        apartadoOpcion.setBackground(new java.awt.Color(255, 255, 204));
        apartadoOpcion.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        apartadoOpcion.setDoubleBuffered(false);
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
        apartadoOpcion.add(btnCambiarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, -1, -1));

        btnCambiarContrasena.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        btnCambiarContrasena.setForeground(new java.awt.Color(245, 245, 245));
        btnCambiarContrasena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAzul.png"))); // NOI18N
        btnCambiarContrasena.setText("Cambiar Contraseña");
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
        apartadoOpcion.add(btnCambiarContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 180, -1, -1));

        btnCambiarAvatar.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        btnCambiarAvatar.setForeground(new java.awt.Color(245, 245, 245));
        btnCambiarAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAzul.png"))); // NOI18N
        btnCambiarAvatar.setText("Cambiar avatar");
        btnCambiarAvatar.setBorderPainted(false);
        btnCambiarAvatar.setContentAreaFilled(false);
        btnCambiarAvatar.setFocusPainted(false);
        btnCambiarAvatar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCambiarAvatar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAmarilloPressed.png"))); // NOI18N
        apartadoOpcion.add(btnCambiarAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 240, -1, -1));

        btnCambiarTarjeta.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        btnCambiarTarjeta.setForeground(new java.awt.Color(245, 245, 245));
        btnCambiarTarjeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAzul.png"))); // NOI18N
        btnCambiarTarjeta.setText("Cambiar tarjeta");
        btnCambiarTarjeta.setBorderPainted(false);
        btnCambiarTarjeta.setContentAreaFilled(false);
        btnCambiarTarjeta.setFocusPainted(false);
        btnCambiarTarjeta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCambiarTarjeta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAmarilloPressed.png"))); // NOI18N
        btnCambiarTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarTarjetaActionPerformed(evt);
            }
        });
        apartadoOpcion.add(btnCambiarTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 300, -1, -1));

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
        apartadoOpcion.add(btnCerrarCesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 360, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(42, 41, 93));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/barraTitulos.png"))); // NOI18N
        jLabel1.setText("Configuraciones");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        apartadoOpcion.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 60, -1, -1));

        PanelPrincipal.add(apartadoOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 240, 500));

        txtNombreUsuario.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        txtNombreUsuario.setForeground(new java.awt.Color(245, 245, 245));
        txtNombreUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/user.png"))); // NOI18N
        txtNombreUsuario.setText("Usuario");
        txtNombreUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtNombreUsuario.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        PanelPrincipal.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 40, 100, 100));

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
        PanelPrincipal.add(botonConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, -1));

        panelAmarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/DivisionAmarillo.png"))); // NOI18N
        PanelPrincipal.add(panelAmarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        comboboxActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxActualActionPerformed(evt);
            }
        });
        PanelPrincipal.add(comboboxActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 130, 30));

        comboboxDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxDestinoActionPerformed(evt);
            }
        });
        PanelPrincipal.add(comboboxDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 130, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 47));
        jLabel3.setText("Ubicación Actual:");
        PanelPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 47));
        jLabel4.setText("Destino:");
        PanelPrincipal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        txtPagar.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        txtPagar.setForeground(new java.awt.Color(0, 0, 47));
        txtPagar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPagar.setText("¿Como desea pagar?");
        txtPagar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelPrincipal.add(txtPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 280, 50));

        txtPantallaEspera.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        txtPantallaEspera.setForeground(new java.awt.Color(0, 0, 47));
        txtPantallaEspera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPantallaEspera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/checkIcono.png"))); // NOI18N
        txtPantallaEspera.setText("Su taxi va en camino!");
        txtPantallaEspera.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtPantallaEspera.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        PanelPrincipal.add(txtPantallaEspera, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 280, 160));

        btnEnEfectivo.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        btnEnEfectivo.setForeground(new java.awt.Color(255, 255, 255));
        btnEnEfectivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAzul.png"))); // NOI18N
        btnEnEfectivo.setText("En efectivo");
        btnEnEfectivo.setBorderPainted(false);
        btnEnEfectivo.setContentAreaFilled(false);
        btnEnEfectivo.setDefaultCapable(false);
        btnEnEfectivo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEnEfectivo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAmarilloPressed.png"))); // NOI18N
        btnEnEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnEfectivoActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnEnEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 300, -1));

        btnTarjeta.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        btnTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        btnTarjeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAzul.png"))); // NOI18N
        btnTarjeta.setText("Tarjeta");
        btnTarjeta.setBorderPainted(false);
        btnTarjeta.setContentAreaFilled(false);
        btnTarjeta.setDefaultCapable(false);
        btnTarjeta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTarjeta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAmarilloPressed.png"))); // NOI18N
        btnTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTarjetaActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 300, -1));

        tablaDeConductores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Calificación"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaDeConductores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDeConductoresMouseClicked(evt);
            }
        });
        scrollTabla.setViewportView(tablaDeConductores);

        PanelPrincipal.add(scrollTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 280, 130));

        txtSaldoUsuario.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        txtSaldoUsuario.setForeground(new java.awt.Color(0, 0, 47));
        txtSaldoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/saldo.png"))); // NOI18N
        txtSaldoUsuario.setText("\"Saldo Usuario\"");
        txtSaldoUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelPrincipal.add(txtSaldoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 240, 50));

        txtTituloSaldo.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        txtTituloSaldo.setForeground(new java.awt.Color(0, 0, 47));
        txtTituloSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTituloSaldo.setText("Saldo:");
        txtTituloSaldo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelPrincipal.add(txtTituloSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 300, 30));

        btnOrdenarNombres.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        btnOrdenarNombres.setText("Nombres");
        btnOrdenarNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarNombresActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnOrdenarNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        btnOrndenarCalificacion.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        btnOrndenarCalificacion.setText("Calificacion");
        btnOrndenarCalificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrndenarCalificacionActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnOrndenarCalificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, -1, -1));

        txtOrdenar.setText("Ordenar por:");
        PanelPrincipal.add(txtOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, -1, -1));

        btnFiltrarPorRango.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        btnFiltrarPorRango.setText("Filtrar por rango");
        btnFiltrarPorRango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarPorRangoActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnFiltrarPorRango, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        PanelPrincipal.getAccessibleContext().setAccessibleParent(PanelPrincipal);

        setSize(new java.awt.Dimension(316, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Boton que muestra la ventana de configuraciones de pasajero.
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
     * Boton que le permite a un pasajero eliminar su cuenta.
     * @param evt 
     */
    private void btnEliminarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCuentaActionPerformed
        // TODO add your handling code here:
        int opt = JOptionPane.showConfirmDialog(this, "¿Estas seguro?");
        
        if (opt ==0){
            try {
                pasajero.logEliminarCuenta();
                pasajero.eliminarCuenta(listaColecciones.get(1));
                this.setVisible(false);
                pantallaPrincipal ventana = new pantallaPrincipal();
                ventana.setVisible(true);
            } catch (IOException ex) {   
                Logger.getLogger(ventanaPasajeros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnEliminarCuentaActionPerformed

    private void comboboxDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxDestinoActionPerformed

    }//GEN-LAST:event_comboboxDestinoActionPerformed

    /**
     * Metodo que permite rellenar las tablas de conductores y los secciona por rutas.
     * @param evt 
     */
    private void comboboxActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxActualActionPerformed
        HashMap ciudad = null;
        Object[] key;
        Ruta ruta=null;
        int i=0;
        
        if(pasajero.ciudad.equals("San Antonio"))i=0;
        if(pasajero.ciudad.equals("Villa Alemana"))i=1;
        if(pasajero.ciudad.equals("Putaendo"))i=2;
        
        ciudad=listaCiudades.get(i);
        
        if(comboboxActual.getSelectedIndex()==0){
            key = ciudad.keySet().toArray();
            ruta=(Ruta) ciudad.get(key[0].toString());
        }
        if(comboboxActual.getSelectedIndex()==1){
            key = ciudad.keySet().toArray();
            ruta=(Ruta) ciudad.get(key[1].toString());
        }
        if(comboboxActual.getSelectedIndex()==2){
            key = ciudad.keySet().toArray();
            ruta=(Ruta) ciudad.get(key[2].toString());
        }
        
        try {
            editarHtml(ruta.coordenadas.get(0),ruta.coordenadas.get(ruta.coordenadas.size()-1));
        } catch (IOException ex) {
            Logger.getLogger(ventanaPasajeros.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        rellenarTabla(tablaDeConductores, ruta.personasOnRute);
    }//GEN-LAST:event_comboboxActualActionPerformed

    /**
     * Metodo que le permite a un pasajero cambiar su contraseña.
     * @param evt 
     */
    private void btnCambiarContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarContrasenaActionPerformed
        // TODO add your handling code here:
        String contraseñaActual = JOptionPane.showInputDialog(this,"Ingrese contraseña actual: ");
        if(!contraseñaActual.equals(pasajero.getPassword())){
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
            pasajero.setPassword(contraseñaNueva2);
            try {
                pasajero.cambiarContraseña();
            } catch (IOException ex) {
                Logger.getLogger(ventanaPasajeros.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this,"Contraseña cambiada correctamente.");
        }
    }//GEN-LAST:event_btnCambiarContrasenaActionPerformed

    /**
     * Boton que le permite a un pasajero cambiar su nombre.
     * @param evt 
     */
    private void btnCambiarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarNombreActionPerformed
        String contraseñaActual = JOptionPane.showInputDialog(this,"Ingrese contraseña actual: ");
        if(!contraseñaActual.equals(pasajero.getPassword())){
            JOptionPane.showMessageDialog(this,"Contraseña incorrecta, intente nuevamente.");
        }else{
            String nombreNuevo = "";
            do{
                nombreNuevo = JOptionPane.showInputDialog(this,"Ingrese nombre nuevo: ");
            }while(nombreNuevo.equals(""));
            try {
                pasajero.logCambiarNombre(nombreNuevo);
                pasajero.setUserName(nombreNuevo);
                pasajero.cambiarNombre();
            } catch (IOException ex) {
                Logger.getLogger(ventanaPasajeros.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            this.txtNombreUsuario.setText(pasajero.getUsername());
            JOptionPane.showMessageDialog(this,"Nombre actualizado correctamente.");
        }
    }//GEN-LAST:event_btnCambiarNombreActionPerformed

    /**
     * Boton que le permite a un pasajero cerrar su sesion.
     * @param evt 
     */
    private void btnCerrarCesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarCesionActionPerformed
        
        int opt = JOptionPane.showConfirmDialog(this, "¿Estas seguro?");
        
        if(opt ==0){
            this.setVisible(false);
            pantallaPrincipal ventana = new pantallaPrincipal(listaColecciones,listaCiudades);
            ventana.setVisible(true);
        }
    }//GEN-LAST:event_btnCerrarCesionActionPerformed

    /**
     * Boton que le permite a un pasajero cambiar su tarjeta. (reemplazarla)
     * @param evt 
     */
    private void btnCambiarTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarTarjetaActionPerformed
        
        int opt;
        
        if(pasajero.tarjeta.getNum_tarjeta()==0000L){
            
            opt= JOptionPane.showConfirmDialog(this, "Usted no posee una tarjeta asociada, ¿desea generar una tarjeta?");
            if(opt==0){
                int contraseña =  Integer.parseInt(JOptionPane.showInputDialog(this,"Ingrese una nueva contraseña: "));        
                
                long num_tarjetaN=1;
                
                while(num_tarjetaN < 1000000000000000L || num_tarjetaN>10000000000000000L){
                    num_tarjetaN = ThreadLocalRandom.current().nextLong(100000000000000000L);
                }
                
                try {
                    pasajero.cambiarTarjeta(num_tarjetaN,contraseña,10000);
                } catch (IOException ex) {
                    Logger.getLogger(ventanaPasajeros.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                pasajero.tarjeta.setNum_tarjeta(num_tarjetaN);
                pasajero.tarjeta.setSaldo(10000);
                pasajero.tarjeta.setClaveTarjeta(contraseña);
            }
        }
        else{
            opt = JOptionPane.showConfirmDialog(this, "¿Estas seguro?");
            
            if(opt==0){
                String contraseñaIngresada = JOptionPane.showInputDialog(this,"Ingrese Contraseña actual de su tarjeta: ");
                
                if(Integer.parseInt(contraseñaIngresada) == pasajero.tarjeta.getClaveTarjeta()){
                    int contraseñaNueva = Integer.parseInt(JOptionPane.showInputDialog(this,"Ingrese una nueva contraseña: "));
                    
                    long num_tarjetaN=1;
                    while(num_tarjetaN < 1000000000000000L || num_tarjetaN>10000000000000000L){
                        num_tarjetaN = ThreadLocalRandom.current().nextLong(100000000000000000L);
                    }
                    
                    try {
                        pasajero.cambiarTarjeta(num_tarjetaN,contraseñaNueva,10000);
                    } catch (IOException ex) {
                        Logger.getLogger(ventanaPasajeros.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "Constraseña incorrecta, intentelo nuevamente");
                }
            }
        }   
    }//GEN-LAST:event_btnCambiarTarjetaActionPerformed

    /**
     * Metodo que le permite a un pasajero pedir un taxi con un conductor seleccionado.
     * @param evt 
     */
    private void tablaDeConductoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDeConductoresMouseClicked
        // TODO add your handling code here:
        int seleccion=tablaDeConductores.rowAtPoint(evt.getPoint());
        System.out.println(seleccion);
        String rut = ruts.get(seleccion);
        //String rut = tablaDeConductores.getValueAt(seleccion,NORMAL).toString();
        int opcion=JOptionPane.showConfirmDialog(this, "¿Deseas pedir un taxi con este conductor?",null,JOptionPane.YES_NO_OPTION);
        ConductorClase conductor = (ConductorClase) listaColecciones.get(1).get(rut);
        System.out.println(conductor.getUsername());
        
        if(opcion==0){
            if(conductor!=null){
                pasajero.conductorPago=conductor;
            }
            try {
                pasajero.pedirTaxi(conductor);
                JOptionPane.showMessageDialog(this, "Su taxi va en camino");
                pasajero.setEnEspera(true);
                txtPantallaEspera.setVisible(true);
                scrollTabla.setVisible(false);
                tablaDeConductores.setVisible(false);
                btnOrdenarNombres.setVisible(false);
                btnOrndenarCalificacion.setVisible(false);
                btnFiltrarPorRango.setVisible(false);
                txtOrdenar.setVisible(false);
            } catch (IOException ex) {
                Logger.getLogger(ventanaPasajeros.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //ventanaPedidoTaxi ventana= new ventanaPedidoTaxi();
            //ventana.setVisible(true);
            //this.dispose();
        }
    }//GEN-LAST:event_tablaDeConductoresMouseClicked

    /**
     * Boton que le permite a un pasajero pagarle a un conductor.
     * @param evt 
     */
    private void btnEnEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnEfectivoActionPerformed
        try {
            pasajero.pagar(2000,pasajero.conductorPago);
        } catch (IOException ex) {
            Logger.getLogger(ventanaPasajeros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEnEfectivoActionPerformed

    /**
     * Metodo que regula los intentos al ingresar la contraseña de una tarjeta de un pasajero.
     * @param evt 
     */
    private void btnTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTarjetaActionPerformed
        try {
            int cont=3;
            int clave= Integer.parseInt(JOptionPane.showInputDialog(this,"Ingrese la clave de su tarjeta:"));
            while(cont!=0){
                if(clave==pasajero.tarjeta.getClaveTarjeta()){
                    pasajero.pagar(2000,pasajero.tarjeta.getClaveTarjeta(),pasajero.tarjeta.getNum_tarjeta(),pasajero.conductorPago);
                    break;
                }else{
                    JOptionPane.showMessageDialog(this, "La contraseña es incorrecta, le quedan "+cont+" intentos");
                    cont-=1;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(ventanaPasajeros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTarjetaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Boton que permite a un pasajero ordenar la lista de conductores por nombre.
     * @param evt 
     */
    private void btnOrdenarNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarNombresActionPerformed
        String combo = comboboxActual.getSelectedItem().toString();
        int comboIndex = comboboxActual.getSelectedIndex();
        System.out.println(comboIndex);
        combo= comboboxActual.getItemAt(comboIndex);
        String a = comboboxActual.getItemAt(comboIndex);
        
        int i=0;
        if(pasajero.ciudad.equals("San Antonio"))i=0;
        if(pasajero.ciudad.equals("Villa Alemana"))i=1;
        if(pasajero.ciudad.equals("Putaendo"))i=2;
        HashMap ciudad = listaCiudades.get(i);
        Set<String> llaves = ciudad.keySet();
        Object[] arregloLlaves = llaves.toArray();
        
        for(int j=0;j<arregloLlaves.length;j++){
           System.out.println("LLAVES DE CIUDADES:"+arregloLlaves[j]); 
        }
        
        for(int j=0;j<arregloLlaves.length;j++){
            
            Ruta ruta= (Ruta) ciudad.get(arregloLlaves[j]);
            
            System.out.println(ruta.NombreDeRuta());
            if(ruta.NombreDeRuta().equals(a)){
                System.out.println(a);
                ordenarTablaNombre(ruta.personasOnRute);
            }
        }
    }//GEN-LAST:event_btnOrdenarNombresActionPerformed

    /**
     * Boton que permite a un pasajero ordenar la lista de conductores por calificacion.
     * @param evt 
     */
    private void btnOrndenarCalificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrndenarCalificacionActionPerformed
        String combo = comboboxActual.getSelectedItem().toString();
        int comboIndex = comboboxActual.getSelectedIndex();
        System.out.println(comboIndex);
        combo= comboboxActual.getItemAt(comboIndex);
        String a = comboboxActual.getItemAt(comboIndex);
        
        int i=0;
        if(pasajero.ciudad.equals("San Antonio"))i=0;
        if(pasajero.ciudad.equals("Villa Alemana"))i=1;
        if(pasajero.ciudad.equals("Putaendo"))i=2;
        HashMap ciudad = listaCiudades.get(i);
        Set<String> llaves = ciudad.keySet();
        Object[] arregloLlaves = llaves.toArray();
        
        for(int j=0;j<arregloLlaves.length;j++){
           System.out.println("LLAVES DE CIUDADES:"+arregloLlaves[j]); 
        }
        
        for(int j=0;j<arregloLlaves.length;j++){
            
            Ruta ruta= (Ruta) ciudad.get(arregloLlaves[j]);
            
            System.out.println(ruta.NombreDeRuta());
            if(ruta.NombreDeRuta().equals(a)){
                System.out.println(a);
                ordenarTablaCalificacion(ruta.personasOnRute);
            }
        }
    }//GEN-LAST:event_btnOrndenarCalificacionActionPerformed
    
    /**
     * Metodo que identifica si un String es valido como Integer.
     * @param cadena Numero a analizar
     * @return Retorna TRUE si es numérico y FALSE si no
     */
    private static boolean isNumeric(String cadena){
    try {
            Integer.parseInt(cadena);
            return true;
    } catch (NumberFormatException nfe){
            return false;
        }
    }
    
    /**
     * Boton que permite a un pasajero filtrar la lista de conductores por rango.
     * @param evt 
     */
    private void btnFiltrarPorRangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarPorRangoActionPerformed
        String filtros1=null;
        String filtros2=null;
        while(true){
           filtros1=(JOptionPane.showInputDialog(this, "Ingrese el primer parametro para filtrar:"));
           filtros2=(JOptionPane.showInputDialog(this, "Ingrese el segundo parametro para filtrar:"));
           if(isNumeric(filtros1) && isNumeric(filtros2)){
               break;
           }else{
                JOptionPane.showConfirmDialog(this, "Alguno de los parametros debe estar mal, reintentalo");
           }
        }
        float filtro1=Float.parseFloat(filtros1);
        float filtro2=Float.parseFloat(filtros2);
        
        String combo = comboboxActual.getSelectedItem().toString();
        int comboIndex = comboboxActual.getSelectedIndex();
        System.out.println(comboIndex);
        combo= comboboxActual.getItemAt(comboIndex);
        String a = comboboxActual.getItemAt(comboIndex);
        
        int i=0;
        if(pasajero.ciudad.equals("San Antonio"))i=0;
        if(pasajero.ciudad.equals("Villa Alemana"))i=1;
        if(pasajero.ciudad.equals("Putaendo"))i=2;
        HashMap ciudad = listaCiudades.get(i);
        Set<String> llaves = ciudad.keySet();
        Object[] arregloLlaves = llaves.toArray();
        
        for(int j=0;j<arregloLlaves.length;j++){
           System.out.println("LLAVES DE CIUDADES:"+arregloLlaves[j]); 
        }
        
        for(int j=0;j<arregloLlaves.length;j++){
            
            Ruta ruta= (Ruta) ciudad.get(arregloLlaves[j]);
            
            System.out.println(ruta.NombreDeRuta());
            if(ruta.NombreDeRuta().equals(a)){
                System.out.println(a);
                filtrarCalificacion(ruta.personasOnRute, filtro1, filtro2);
            }
        }
    }//GEN-LAST:event_btnFiltrarPorRangoActionPerformed

    
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
            java.util.logging.Logger.getLogger(ventanaPasajeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaPasajeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaPasajeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaPasajeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaPasajeros().setVisible(true);
            }
        });
    }
    
    /**
     * Metodo que rellena el combobox segun la ciudad del pasajero.
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void rellenarCombobox() throws FileNotFoundException, IOException{
        comboboxActual.removeAllItems();
        comboboxDestino.removeAllItems();
        int i=0;
        if(pasajero.ciudad.equals("San Antonio"))i=0;
        if(pasajero.ciudad.equals("Villa Alemana"))i=1;
        if(pasajero.ciudad.equals("Putaendo"))i=2;
        HashMap ciudad = listaCiudades.get(i);
        Set<String> llaves = ciudad.keySet();
        Object[] arregloLlaves = llaves.toArray();
        
        for(int j=0;j<arregloLlaves.length;j++){
           System.out.println("LLAVES DE CIUDADES:"+arregloLlaves[j]);
           comboboxActual.addItem((String) arregloLlaves[j]);
           comboboxDestino.addItem((String) arregloLlaves[j]);
        }
        //TODO OK HASTA AHORA PANCHO FUI A HACERME UN CAFE
    }
     
    /**
     * Metodo que rellena la tabla de conductores con conductores.
     * @param tabla Tabla que se rellena
     * @param conductores Mapa de conductores con los que se rellena
     */
    public void rellenarTabla(JTable tabla, HashMap <String,UsuarioClase> conductores){ 
        
        Set<String> llaves = conductores.keySet();
        ruts = new ArrayList<String>();
        ruts.clear();
        Object[] arregloLlaves = llaves.toArray();
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.setRowCount(0);
        for(int i=0;i<arregloLlaves.length;i++){
            Vector v= new Vector();
            System.out.println(arregloLlaves[i]);
            ConductorClase conductor = (ConductorClase) conductores.get(arregloLlaves[i]);
            v.add(conductor.getUsername());
            v.add(conductor.getCalificación());
            ruts.add(i,conductores.get(arregloLlaves[i]).getRut());
            //System.out.println(v);
            model.addRow(v);
        }
    }
    
    /**
     * Metodo que ordena la tabla de conductores por nombre.
     * @param conductores Mapa de los conductores
     */
    public void ordenarTablaNombre(HashMap <String,UsuarioClase> conductores){
        ArrayList<String> nombres = new ArrayList<String>();
        ArrayList<Float> calificacion= new ArrayList<Float>();
        ruts = new ArrayList<String>();
        Set<String> llaves = conductores.keySet();
        Object[] arregloLlaves = llaves.toArray();
        DefaultTableModel model = (DefaultTableModel) tablaDeConductores.getModel();
        model.setRowCount(0);
        System.out.println("Desordenardo:");
        for(int i=0;i<arregloLlaves.length;i++){
            ConductorClase conductor= (ConductorClase) conductores.get(arregloLlaves[i]);
            nombres.add(conductor.getUsername());
            calificacion.add(conductor.getCalificación());
            ruts.add(conductor.getRut());
            System.out.println(nombres.get(i)+" "+calificacion.get(i).toString()+" "+ruts.get(i));
        }
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Ordenado:");
        for(int i=0;i<arregloLlaves.length-1;i++){
            for(int j=i+1;j<arregloLlaves.length;j++){
                if(nombres.get(i).toUpperCase().compareTo(nombres.get(j).toUpperCase())>0){
                    String aux=nombres.get(i);
                    nombres.remove(i);
                    nombres.add(i,nombres.get(j-1));
                    nombres.remove(j);
                    nombres.add(j,aux);
                    
                    String auxRut=ruts.get(i);
                    ruts.remove(i);
                    ruts.add(i,ruts.get(j-1));
                    ruts.remove(j);
                    ruts.add(j,auxRut);
                    
                    Float auxCalificacion=calificacion.get(i);
                    calificacion.remove(i);
                    calificacion.add(i,calificacion.get(j-1));
                    calificacion.remove(j);
                    calificacion.add(j,auxCalificacion);
                    
                }
            }
        }
        for(int i=0;i<arregloLlaves.length;i++){
            System.out.println(nombres.get(i)+" "+calificacion.get(i).toString()+" "+ruts.get(i));
        }
        
        for(int i=0;i<arregloLlaves.length;i++){
            Vector v= new Vector();
            v.add(nombres.get(i));
            v.add(calificacion.get(i));
            model.addRow(v);
        }
        
    }
    
    /**
     * Metodo que ordena la tabla de conductores por calificacion.
     * @param conductores Mapa de los conductores
     */
    public void ordenarTablaCalificacion(HashMap <String,UsuarioClase> conductores){
        ArrayList<String> nombres = new ArrayList<String>();
        ArrayList<Float> calificacion= new ArrayList<Float>();
        ruts = new ArrayList<String>();
        Set<String> llaves = conductores.keySet();
        Object[] arregloLlaves = llaves.toArray();
        DefaultTableModel model = (DefaultTableModel) tablaDeConductores.getModel();
        model.setRowCount(0);
        System.out.println("Desordenardo:");
        for(int i=0;i<arregloLlaves.length;i++){
            ConductorClase conductor= (ConductorClase) conductores.get(arregloLlaves[i]);
            nombres.add(conductor.getUsername());
            calificacion.add(conductor.getCalificación());
            ruts.add(conductor.getRut());
            System.out.println(nombres.get(i)+" "+calificacion.get(i).toString()+" "+ruts.get(i));
        }
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Ordenado:");
        for(int i=0;i<arregloLlaves.length-1;i++){
            for(int j=i+1;j<arregloLlaves.length;j++){
                if(calificacion.get(i)<calificacion.get(j)){
                    String aux=nombres.get(i);
                    nombres.remove(i);
                    nombres.add(i,nombres.get(j-1));
                    nombres.remove(j);
                    nombres.add(j,aux);
                    
                    String auxRut=ruts.get(i);
                    ruts.remove(i);
                    ruts.add(i,ruts.get(j-1));
                    ruts.remove(j);
                    ruts.add(j,auxRut);
                    
                    Float auxCalificacion=calificacion.get(i);
                    calificacion.remove(i);
                    calificacion.add(i,calificacion.get(j-1));
                    calificacion.remove(j);
                    calificacion.add(j,auxCalificacion);
                    
                }
            }
        }
        for(int i=0;i<arregloLlaves.length;i++){
            System.out.println(nombres.get(i)+" "+calificacion.get(i).toString()+" "+ruts.get(i));
        }
        
        for(int i=0;i<arregloLlaves.length;i++){
            Vector v= new Vector();
            v.add(nombres.get(i));
            v.add(calificacion.get(i));
            model.addRow(v);
        }
        
    }
    
    /**
     * Metodo que filtra los conductores segun un rango especificado.
     * @param conductores Mapa de los conductores
     * @param filtro1 Limite inferior
     * @param filtro2 Limite superior
     */
    public void filtrarCalificacion(HashMap <String,UsuarioClase> conductores, float filtro1, float filtro2){
        ArrayList<String> nombres = new ArrayList<String>();
        ArrayList<Float> calificacion= new ArrayList<Float>();
        ruts = new ArrayList<String>();
        Set<String> llaves = conductores.keySet();
        Object[] arregloLlaves = llaves.toArray();
        DefaultTableModel model = (DefaultTableModel) tablaDeConductores.getModel();
        model.setRowCount(0);
        System.out.println("Desordenardo:");
        for(int i=0;i<arregloLlaves.length;i++){
            ConductorClase conductor= (ConductorClase) conductores.get(arregloLlaves[i]);
            nombres.add(conductor.getUsername());
            calificacion.add(conductor.getCalificación());
            ruts.add(conductor.getRut());
            System.out.println(nombres.get(i)+" "+calificacion.get(i).toString()+" "+ruts.get(i));
        }
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Filtrado:");
        if(filtro1>filtro2){
            float aux=filtro2;
            filtro2=filtro1;
            filtro1=aux;
        }
        for(int i=0;i<arregloLlaves.length;i++){
            if(calificacion.get(i)>=filtro1 && calificacion.get(i)<=filtro2){
                Vector v= new Vector();
                v.add(nombres.get(i));
                v.add(calificacion.get(i));
                model.addRow(v);
                   
            }
        }
        for(int i=0;i<arregloLlaves.length;i++){
            System.out.println(nombres.get(i)+" "+calificacion.get(i).toString()+" "+ruts.get(i));
        }
        
    }
    
    /**
     * Metodo que le permite a un pasajero declararse en espera.
     * @param pasajero Pasajero con la sesion iniciada 
     */
    public void pasajeroEnEspera(PasajeroClase pasajero){
        if(pasajero.isEnEspera()==true){
            txtPantallaEspera.setVisible(true);
            scrollTabla.setVisible(false);
            tablaDeConductores.setVisible(false);
            btnOrdenarNombres.setVisible(false);
            btnOrndenarCalificacion.setVisible(false);
            btnFiltrarPorRango.setVisible(false);
            txtOrdenar.setVisible(false);
        }
    }
    
    /**
     * Metodo que le permite a un pasajero declararse en viaje.
     * @param pasajero Pasajero con la sesion iniciada
     */
    public void pasajeroEnViaje(PasajeroClase pasajero){
        if(pasajero.isEnViaje()==true){
            txtPantallaEspera.setVisible(false);
            scrollTabla.setVisible(false);
            tablaDeConductores.setVisible(false);
            txtPagar.setVisible(true);
            btnEnEfectivo.setVisible(true);
            btnTarjeta.setVisible(true);
            btnOrdenarNombres.setVisible(false);
            btnOrndenarCalificacion.setVisible(false);
            btnFiltrarPorRango.setVisible(false);
            txtOrdenar.setVisible(false);
        }

    }
    
    public void navegador(){
        /*
        System.setProperty("jxbrowser.license.key", "6P830J66YB4T8QTX1T61JJ0R8Y1KZ9UTO9A7V1FVZ47DTDE52469T9C1V7YJQW8FW8FE");
        Engine engine = Engine.newInstance(
        EngineOptions.newBuilder(HARDWARE_ACCELERATED)
                .licenseKey("6P830J66YB4T8QTX1T61JJ0R8Y1KZ9UTO9A7V1FVZ47DTDE52469T9C1V7YJQW8FW8FE")
                .build());
        Browser browser = engine.newBrowser();
        SwingUtilities.invokeLater(() -> {
            BrowserView view = BrowserView.newInstance(browser);
 
            JFrame frame = new JFrame("Swing BrowserView");
            frame.add(view, BorderLayout.CENTER);
            frame.setSize(700, 500);
            frame.setVisible(true);
            browser.navigation().loadUrl("https://html5test.com");
        });
        */
    }
    
    /**
     * Metodo que edita un archivo Html y le ingresa unas coordenadas especificadas que forman una ruta.
     * @param coordenadasOrigen Coordenadas de origen
     * @param coordenadasDestino Coordenadas del destino
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void editarHtml(String coordenadasOrigen,String coordenadasDestino) throws FileNotFoundException, IOException {
        PrintWriter pw = new PrintWriter(new File ("Archivos/rutas_aux.html"));
        StringBuilder sb = new StringBuilder();
        String txtFile = "Archivos/rutas.html";
        BufferedReader br = null;
        String lineString = "";
        br = new BufferedReader(new FileReader(txtFile));
        int i, cont=41;
        for(i=0;i<cont;i++){
            lineString = br.readLine();
            sb.append(lineString);
            sb.append("\n");
        }
        br.readLine();
        String[] coordsOri = coordenadasOrigen.split(" ");
        String[] coordsDes = coordenadasDestino.split(" ");
        sb.append("          center: { lat: "+coordsOri[0]+", lng: "+coordsOri[1]+" },\n");
        cont=51;
        for(i=i;i<=cont;i++){
            lineString = br.readLine();
            sb.append(lineString);
            sb.append("\n");
        }
        sb.append("            origin: { lat: "+coordsOri[0]+", lng: "+coordsOri[1]+"},\n");
        lineString = br.readLine();
        sb.append("            destination: { lat: "+coordsDes[0]+", lng: "+coordsDes[1]+" },\n");
        lineString = br.readLine();
        while ((lineString = br.readLine()) != null){
            sb.append(lineString);
            sb.append("\n");
        }
        pw.write(sb.toString());
        pw.close();
        /*Eliminamos original
        File archivo= new File("Archivos/rutas.txt");
        archivo.delete();*/
        //Creamos nuevamente el archivo original
        PrintWriter pwOriginal = new PrintWriter(new File ("Archivos/rutas.html"));
        StringBuilder sbOriginal = new StringBuilder();
        String htmlFileCopia = "Archivos/rutas_aux.html";
        BufferedReader brCopia = null;
        String lineStringOriginal = "";
        brCopia = new BufferedReader(new FileReader(htmlFileCopia));
        while ((lineStringOriginal = brCopia.readLine()) != null) {
            sbOriginal.append(lineStringOriginal);
            sbOriginal.append("\n");
        }
        //Escribimos sobre archivo original
        pwOriginal.write(sbOriginal.toString());
        pwOriginal.close();
        
        //Eliminamos auxiliar
        File archivoAux= new File("Archivos/rutas_aux.html");
        archivoAux.delete();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel apartadoOpcion;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonConfiguracion;
    private javax.swing.JButton btnCambiarAvatar;
    private javax.swing.JButton btnCambiarContrasena;
    private javax.swing.JButton btnCambiarNombre;
    private javax.swing.JButton btnCambiarTarjeta;
    private javax.swing.JButton btnCerrarCesion;
    private javax.swing.JButton btnEliminarCuenta;
    private javax.swing.JButton btnEnEfectivo;
    private javax.swing.JButton btnFiltrarPorRango;
    private javax.swing.JButton btnOrdenarNombres;
    private javax.swing.JButton btnOrndenarCalificacion;
    private javax.swing.JButton btnTarjeta;
    private javax.swing.JComboBox<String> comboboxActual;
    private javax.swing.JComboBox<String> comboboxDestino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel panelAmarillo;
    private javax.swing.JScrollPane scrollTabla;
    private javax.swing.JTable tablaDeConductores;
    private javax.swing.JLabel txtNombreUsuario;
    private javax.swing.JLabel txtOrdenar;
    private javax.swing.JLabel txtPagar;
    private javax.swing.JLabel txtPantallaEspera;
    private javax.swing.JLabel txtSaldoUsuario;
    private javax.swing.JLabel txtTituloSaldo;
    // End of variables declaration//GEN-END:variables

}