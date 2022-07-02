package CodigoMain;

import javax.swing.JOptionPane;

/**
 * Esta clase permite a los usuarios ver informacion sobre los conductores
 * @author Angel Morales
 * @version 1.0
 * @see javax.swing.JFrame
 */
public class InformacionConductor extends javax.swing.JFrame {
    
    private ventanaMostrarChoferes anterior;
    private ConductorClase conductor;
    
    /**
     * Metodo constructor por defecto.
     */
    public InformacionConductor() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    /**
     * Metodo constructor parametrizado.
     * @param anterior Indicador hacia la ventana anterior
     * @param conductor Conductor del que se mostrara informacion
     */
    public InformacionConductor(ventanaMostrarChoferes anterior,ConductorClase conductor) {
        initComponents();
        setLocationRelativeTo(null);
        this.anterior=anterior;
        this.conductor=conductor;
        txtUsuario.setText(conductor.getUsername());
        txtRut.setText(conductor.getRut());
        txtAñoFabricacion.setText(conductor.getRut());
        txtCalificacion.setText(Float.toString(conductor.getCalificación()));
        txtMarca.setText(conductor.getAuto().getMarca());
        txtModelo.setText(conductor.getAuto().getModelo());
        txtPatente.setText(conductor.getAuto().getPatente());
        txtColor.setText(conductor.getAuto().getColor());
        txtCapacidad.setText(Integer.toString(conductor.getAuto().getCapacidad()));
        txtAñoFabricacion.setText(Integer.toString(conductor.getAuto().getAñoFab()));
    }

    /**
     * Botones de la ventana.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPenalizarConductor = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtAñoFabricacion = new javax.swing.JLabel();
        txtMarca = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JLabel();
        txtColor = new javax.swing.JLabel();
        txtPatente = new javax.swing.JLabel();
        txtModelo = new javax.swing.JLabel();
        txtRut = new javax.swing.JLabel();
        txtCalificacion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPenalizarConductor.setBackground(new java.awt.Color(196, 28, 0));
        btnPenalizarConductor.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        btnPenalizarConductor.setForeground(new java.awt.Color(245, 245, 245));
        btnPenalizarConductor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonPenalizar.png"))); // NOI18N
        btnPenalizarConductor.setText("Penalizar conductor");
        btnPenalizarConductor.setBorderPainted(false);
        btnPenalizarConductor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPenalizarConductor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAmarilloPressed.png"))); // NOI18N
        btnPenalizarConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPenalizarConductorActionPerformed(evt);
            }
        });
        jPanel1.add(btnPenalizarConductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 200, 30));

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
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 47));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonTitulos.png"))); // NOI18N
        jLabel1.setText("Información del conductor ");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        txtAñoFabricacion.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txtAñoFabricacion.setForeground(new java.awt.Color(245, 245, 245));
        txtAñoFabricacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAzul.png"))); // NOI18N
        txtAñoFabricacion.setText("Año de fabricación");
        txtAñoFabricacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtAñoFabricacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 200, 30));

        txtMarca.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(245, 245, 245));
        txtMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAzul.png"))); // NOI18N
        txtMarca.setText("Marca");
        txtMarca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(0, 0, 47));
        txtUsuario.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(245, 245, 245));
        txtUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAzul.png"))); // NOI18N
        txtUsuario.setText("Nombre");
        txtUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 200, 30));

        txtCapacidad.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txtCapacidad.setForeground(new java.awt.Color(245, 245, 245));
        txtCapacidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAzul.png"))); // NOI18N
        txtCapacidad.setText("Capacidad");
        txtCapacidad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        txtColor.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txtColor.setForeground(new java.awt.Color(245, 245, 245));
        txtColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAzul.png"))); // NOI18N
        txtColor.setText("Color");
        txtColor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        txtPatente.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txtPatente.setForeground(new java.awt.Color(245, 245, 245));
        txtPatente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAzul.png"))); // NOI18N
        txtPatente.setText("Patente");
        txtPatente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtPatente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        txtModelo.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txtModelo.setForeground(new java.awt.Color(245, 245, 245));
        txtModelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAzul.png"))); // NOI18N
        txtModelo.setText("Modelo");
        txtModelo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        txtRut.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txtRut.setForeground(new java.awt.Color(245, 245, 245));
        txtRut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAzul.png"))); // NOI18N
        txtRut.setText("Rut");
        txtRut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        txtCalificacion.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        txtCalificacion.setForeground(new java.awt.Color(245, 245, 245));
        txtCalificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAzul.png"))); // NOI18N
        txtCalificacion.setText("Calificación");
        txtCalificacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtCalificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel2.setBackground(new java.awt.Color(245, 245, 245));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/pnatallaFondo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 60, 250, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPenalizarConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPenalizarConductorActionPerformed
        JOptionPane.showMessageDialog(this, "El conductor fue penalizado");
        //placeholder
    }//GEN-LAST:event_btnPenalizarConductorActionPerformed

    /**
     * Boton para volver a la ventana anterior
     */
    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        anterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(InformacionConductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionConductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionConductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionConductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionConductor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnPenalizarConductor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtAñoFabricacion;
    private javax.swing.JLabel txtCalificacion;
    private javax.swing.JLabel txtCapacidad;
    private javax.swing.JLabel txtColor;
    private javax.swing.JLabel txtMarca;
    private javax.swing.JLabel txtModelo;
    private javax.swing.JLabel txtPatente;
    private javax.swing.JLabel txtRut;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
