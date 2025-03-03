package Capa_Presentacion;

import Capa_Negocio.DataInventario;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class Formulario_Inventario extends javax.swing.JFrame {

    public Formulario_Inventario() {
        initComponents();
        ListarInventario();
        jBGrabar.setEnabled(false);

    }

    public void ListarInventario(){
        DefaultTableModel tablaInv = new DefaultTableModel();
        DataInventario objinv = new DataInventario();
        ArrayList<DataInventario> listaInv = new ArrayList();
        listaInv = objinv.ListaInventario();
        tablaInv.addColumn("Codigo");
        tablaInv.addColumn("Nombre");
        tablaInv.addColumn("Cantidad");
        tablaInv.addColumn("Estado");
        tablaInv.setRowCount(listaInv.size());
        int i = 0;
        for(DataInventario x : listaInv){
            tablaInv.setValueAt(x.getIv_codigo(), i, 0);
            tablaInv.setValueAt(x.getIv_nombre(), i, 1);
            tablaInv.setValueAt(x.getIv_stk(), i, 2);
            tablaInv.setValueAt(x.getIv_Estado(), i, 3);
            i++;
        }
        this.jTable1.setModel(tablaInv);
    }

    public void LimpiarCajasTexto(){
        this.TFCodigo.setText("");
        this.TFNombre.setText("");
        this.TFCantidad.setText("");
        this.TFEstado.setText("");
    }

    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        TFCodigo = new javax.swing.JTextField();
        TFNombre = new javax.swing.JTextField();
        TFCantidad = new javax.swing.JTextField();
        TFEstado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBNuevo = new javax.swing.JButton();
        jBGrabar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane2.setViewportView(jTable1);

        jScrollPane1.setViewportView(jScrollPane2);

        jLabel1.setText("Codigo");

        jLabel2.setText("Nombre");

        jLabel3.setText("Cantidad");

        jLabel4.setText("Estado");

        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBGrabar.setText("Grabar");
        jBGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGrabarActionPerformed(evt);
            }
        });

        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(TFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(TFCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(TFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(TFEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(62, 62, 62)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jBGrabar)
                                                                        .addComponent(jBNuevo))
                                                                .addGap(9, 9, 9))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jBSalir)
                                                                .addComponent(jBModificar)))))
                                .addGap(35, 35, 35)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(100, 100, 100)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(TFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel1))
                                                .addGap(30, 30, 30)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(TFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel2))
                                                .addGap(29, 29, 29)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(TFCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3))
                                                .addGap(32, 32, 32)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(TFEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4))
                                                .addGap(18, 18, 18)
                                                .addComponent(jBNuevo)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jBGrabar)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBModificar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jBSalir))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(63, 63, 63)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(137, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {
        LimpiarCajasTexto();
        // opcional para mas delante: q ponga el codigo solo
        jBGrabar.setEnabled(true);
    }

    private void jBGrabarActionPerformed(java.awt.event.ActionEvent evt) {
        DataInventario objinv = new DataInventario();
        objinv.setIv_codigo(this.TFCodigo.getText());
        objinv.setIv_nombre(this.TFNombre.getText());
        objinv.setIv_stk(Integer.parseInt(this.TFCantidad.getText()));
        objinv.setIv_Estado(this.TFEstado.getText());
        JOptionPane.showMessageDialog(null, objinv.GrabarInventario());
        ListarInventario();
    }

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {
        DataInventario objinv = new DataInventario();
        objinv.setIv_codigo(this.TFCodigo.getText());
        objinv.setIv_nombre(this.TFNombre.getText());
        objinv.setIv_stk(Integer.parseInt(this.TFCantidad.getText()));
        objinv.setIv_Estado(this.TFEstado.getText());
        JOptionPane.showMessageDialog(null, objinv.EditarInventario());
        ListarInventario();
    }

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {
        int r = JOptionPane.showConfirmDialog(null, "Esta seguro?");
        if (r == 0){
            System.exit(0);
        }
    }

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {
        int rec = this.jTable1.getSelectedRow();
        this.TFCodigo.setText(jTable1.getValueAt(rec, 0).toString());
        this.TFNombre.setText(jTable1.getValueAt(rec, 1).toString());
        this.TFCantidad.setText(jTable1.getValueAt(rec, 2).toString());
        this.TFEstado.setText(jTable1.getValueAt(rec, 3).toString());
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Formulario_Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario_Inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JTextField TFCantidad;
    private javax.swing.JTextField TFCodigo;
    private javax.swing.JTextField TFEstado;
    private javax.swing.JTextField TFNombre;
    private javax.swing.JButton jBGrabar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration
}
