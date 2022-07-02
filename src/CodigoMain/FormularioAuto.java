package CodigoMain;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Esta clase permite que un conductor registre su auto.
 * @author Angel Morales
 * @version 1.0
 * @see javax.swing.JFrame
 */
public class FormularioAuto extends javax.swing.JFrame {
    
    ventanaRegistro anterior;
    String username;
    String password;
    String rut;
    private ArrayList <HashMap> listaColecciones;
    private ArrayList <HashMap> listaRutas;
    
    /**
     * Metodo constructor por defecto.
     */
    public FormularioAuto() {
        initComponents();
        setLocationRelativeTo(null);
        
    }
    
    /**
     * Metodo constructor parametrizado.
     * @param anterior Indicador hacia la ventana anterior
     * @param username Nombre de usuario del conductor
     * @param password Constraseña del conductor
     * @param rut Rut del conductor
     * @param listaColecciones Colección de clases
     * @param listaRutas Lista de todas las rutas
     */
    public FormularioAuto(ventanaRegistro anterior,String username,String password, String rut, ArrayList <HashMap> listaColecciones,ArrayList <HashMap> listaRutas){
        initComponents();
        setLocationRelativeTo(null);
        this.anterior=anterior;
        this.username=username;
        this.password=password;
        this.rut = rut;
        this.listaColecciones=listaColecciones;
        this.listaRutas=listaRutas;
    }

    /**
     * Botones de la ventana.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TxtModeloAuto = new javax.swing.JTextField();
        TxtColor = new javax.swing.JTextField();
        TxtMarcaAuto = new javax.swing.JTextField();
        TxtAñoFab = new javax.swing.JTextField();
        TxtPatente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnRegistroAuto = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtModeloAuto.setBackground(new java.awt.Color(245, 245, 245));
        TxtModeloAuto.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        TxtModeloAuto.setForeground(new java.awt.Color(0, 0, 47));
        TxtModeloAuto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtModeloAuto.setText("Modelo del auto");
        TxtModeloAuto.setBorder(null);
        TxtModeloAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtModeloAutoActionPerformed(evt);
            }
        });
        jPanel1.add(TxtModeloAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 200, 30));

        TxtColor.setBackground(new java.awt.Color(245, 245, 245));
        TxtColor.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        TxtColor.setForeground(new java.awt.Color(0, 0, 47));
        TxtColor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtColor.setText("Color del auto");
        TxtColor.setBorder(null);
        TxtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtColorActionPerformed(evt);
            }
        });
        jPanel1.add(TxtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 200, 30));

        TxtMarcaAuto.setBackground(new java.awt.Color(245, 245, 245));
        TxtMarcaAuto.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        TxtMarcaAuto.setForeground(new java.awt.Color(0, 0, 47));
        TxtMarcaAuto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtMarcaAuto.setText("Marca del auto");
        TxtMarcaAuto.setBorder(null);
        TxtMarcaAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtMarcaAutoActionPerformed(evt);
            }
        });
        jPanel1.add(TxtMarcaAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 200, 30));

        TxtAñoFab.setBackground(new java.awt.Color(245, 245, 245));
        TxtAñoFab.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        TxtAñoFab.setForeground(new java.awt.Color(0, 0, 47));
        TxtAñoFab.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtAñoFab.setText("Año de fabricación");
        TxtAñoFab.setBorder(null);
        TxtAñoFab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAñoFabActionPerformed(evt);
            }
        });
        jPanel1.add(TxtAñoFab, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 200, 30));

        TxtPatente.setBackground(new java.awt.Color(245, 245, 245));
        TxtPatente.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        TxtPatente.setForeground(new java.awt.Color(0, 0, 47));
        TxtPatente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtPatente.setText("Patente del auto");
        TxtPatente.setBorder(null);
        TxtPatente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPatenteActionPerformed(evt);
            }
        });
        jPanel1.add(TxtPatente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 200, 30));

        jLabel1.setFont(new java.awt.Font("Roboto Condensed", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 47));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/barraTitulos.png"))); // NOI18N
        jLabel1.setText("Informacion del auto");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        btnRegistroAuto.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        btnRegistroAuto.setForeground(new java.awt.Color(245, 245, 245));
        btnRegistroAuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAzul.png"))); // NOI18N
        btnRegistroAuto.setText("Registrar conductor");
        btnRegistroAuto.setBorder(null);
        btnRegistroAuto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistroAuto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/botonAmarilloPressed.png"))); // NOI18N
        btnRegistroAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroAutoActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistroAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 200, 30));

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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/logoRealTaxi.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 200, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodigoMain/images/imagenMapa.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 180));

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

    private void TxtModeloAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtModeloAutoActionPerformed
        // placeholder
    }//GEN-LAST:event_TxtModeloAutoActionPerformed

    private void TxtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtColorActionPerformed
        // placeholder
    }//GEN-LAST:event_TxtColorActionPerformed

    private void TxtMarcaAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtMarcaAutoActionPerformed
        // placeholder
    }//GEN-LAST:event_TxtMarcaAutoActionPerformed

    private void TxtAñoFabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAñoFabActionPerformed
        // placeholder
    }//GEN-LAST:event_TxtAñoFabActionPerformed

    private void TxtPatenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPatenteActionPerformed
        // placeholder
    }//GEN-LAST:event_TxtPatenteActionPerformed

    /**
     * Botón que registra un auto segun los valores ingresados.
     */
    private void btnRegistroAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroAutoActionPerformed

       boolean isNumber=true;
       AdminClase admin=new AdminClase("admin1","0","0");
        try {
            Integer.parseInt(TxtAñoFab.getText());
        } catch (NumberFormatException excepcion){
            isNumber=false;
        }
       if(isNumber){
            AutoClase auto = new AutoClase(TxtMarcaAuto.getText(),TxtColor.getText(),TxtModeloAuto.getText(),TxtPatente.getText(), Integer.parseInt(TxtAñoFab.getText()));
            ConductorClase conductor= new ConductorClase((float) 2.5,auto,username,password,rut,0);
            try {
                admin.agregarConductor(conductor);
            }catch (IOException ex) {
                Logger.getLogger(FormularioAuto.class.getName()).log(Level.SEVERE, null, ex);
            }
            listaColecciones.get(1).put(rut, conductor);
            int random = (int) (Math.random() * 3)+1;
            if(random == 1)listaRutas.get(0).put(conductor.getRut(), conductor);
            if(random == 2)listaRutas.get(1).put(conductor.getRut(), conductor);
            if(random == 3)listaRutas.get(2).put(conductor.getRut(), conductor);
            JOptionPane.showMessageDialog(this, "El conductor fue ingresado correctamente");
       }else{
           JOptionPane.showMessageDialog(this, "El año de fabricación no es un numero");
       }
    }//GEN-LAST:event_btnRegistroAutoActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioAuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioAuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioAuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioAuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioAuto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtAñoFab;
    private javax.swing.JTextField TxtColor;
    private javax.swing.JTextField TxtMarcaAuto;
    private javax.swing.JTextField TxtModeloAuto;
    private javax.swing.JTextField TxtPatente;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnRegistroAuto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
