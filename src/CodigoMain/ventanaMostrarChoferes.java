package CodigoMain;
import java.util.*;
import javax.swing.JOptionPane;

/**
 * Esta clase contiene la ventana que muestra los conductores de la app.
 * @author Francisco Leiva
 * @version 1.0
 * @see javax.swing.JFrame
 */
public class ventanaMostrarChoferes extends javax.swing.JFrame {
    private ventanaDeAdministracion anterior;
    private ArrayList <HashMap> listaColecciones;
    private ArrayList <HashMap> listaRutas;
    private AdminClase admin;
    
    /**
     * Metodo constructor por defecto.
     */
    public ventanaMostrarChoferes() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    /**
     * Metodo constructor parametrizado.
     * @param anterior Indice a la ventana anterior
     * @param listaColecciones Lista de las colecciones de usuarios
     * @param listaRutas Lista de las rutas
     * @param admin Administrador con la sesion iniciada
     * @param i Numero de ruta de los choferes a mostrar
     */
    public ventanaMostrarChoferes(ventanaDeAdministracion anterior, ArrayList <HashMap> listaColecciones, ArrayList <HashMap> listaRutas,AdminClase admin,int i) {
        initComponents();
        setLocationRelativeTo(null);
        this.anterior=anterior;
        this.listaColecciones=listaColecciones;
        this.listaRutas=listaRutas;
        this.admin=admin;
        admin.mostrarConductores(listaRutas.get(i),listaChoferes);
    }
    
    /**
     * Metodo constructor parametrizado. (Sin ingresar un numero de ruta)
     * @param anterior Indice a la ventana anterior
     * @param listaColecciones Lista de colecciones de los usuarios
     * @param listaRutas Lista de las rutas
     * @param admin Administrador con la sesion iniciada
     */
    public ventanaMostrarChoferes(ventanaDeAdministracion anterior, ArrayList <HashMap> listaColecciones, ArrayList <HashMap> listaRutas,AdminClase admin) {
        initComponents();
        setLocationRelativeTo(null);
        this.anterior=anterior;
        this.listaColecciones=listaColecciones;
        this.listaRutas=listaRutas;
        this.admin=admin;
        admin.mostrarConductores(listaColecciones.get(1),listaChoferes);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaChoferes = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/logoRealTaxi.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 47));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonTitulos.png"))); // NOI18N
        jLabel2.setText("Conductores");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        listaChoferes.setBackground(new java.awt.Color(255, 204, 51));
        listaChoferes.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        listaChoferes.setForeground(new java.awt.Color(0, 0, 47));
        listaChoferes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaChoferes.setSelectionBackground(new java.awt.Color(0, 0, 47));
        listaChoferes.setVisibleRowCount(20);
        listaChoferes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaChoferesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listaChoferesMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(listaChoferes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 220, 300));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/cuadroAzul.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 160, 250, 320));

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
   
    /**
     * Boton que permite ir a la ventana anterior.
     * @param evt 
     */
    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        anterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    /**
     * Metodo que muestra la informacion de un conductor seleccionado de la lista de conductores.
     * @param evt 
     */
    private void listaChoferesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaChoferesMouseClicked
        
        ConductorClase conductor = new ConductorClase(0,null,"0","0","0",0);//Conductor auxiliar
        admin.buscar(listaChoferes.getSelectedValue(),listaColecciones.get(1),conductor);
        
        System.out.println(conductor.getRut());
        System.out.println(conductor.getUsername());
        InformacionConductor infoConductor = new InformacionConductor(this,conductor);
        infoConductor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_listaChoferesMouseClicked

    private void listaChoferesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaChoferesMouseEntered

    }//GEN-LAST:event_listaChoferesMouseEntered

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
            java.util.logging.Logger.getLogger(ventanaMostrarChoferes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaMostrarChoferes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaMostrarChoferes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaMostrarChoferes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaMostrarChoferes().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaChoferes;
    // End of variables declaration//GEN-END:variables
}
