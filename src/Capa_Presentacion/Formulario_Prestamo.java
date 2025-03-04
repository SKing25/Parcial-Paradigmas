package Capa_Presentacion;

import Capa_Negocio.DataInventario;
import Capa_Negocio.DataPrestamo;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Time;
import java.util.ArrayList;

public class Formulario_Prestamo extends javax.swing.JFrame {

    /**
     * Creates new form Formulario_Inventario
     */
    public Formulario_Prestamo() {
        initComponents();
        ListarPrestamos();
        jBGrabar.setEnabled(false);
        setTitle("Prestamo");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void ListarPrestamos() {
        DefaultTableModel tablaPre = new DefaultTableModel();
        DataPrestamo objpre = new DataPrestamo();
        ArrayList<DataPrestamo> listaPre = new ArrayList<>();
        listaPre = objpre.ListaPrestamo();
        tablaPre.addColumn("Codigo Prestamo");
        tablaPre.addColumn("Salon");
        tablaPre.addColumn("Hora");
        tablaPre.addColumn("Codigo Articulo");
        tablaPre.addColumn("Identificacion Estudiante");
        tablaPre.setRowCount(listaPre.size());
        int i = 0;
        for (DataPrestamo x : listaPre) {
            tablaPre.setValueAt(x.getPr_codigo(), i, 0);
            tablaPre.setValueAt(x.getPr_salon(), i, 1);
            tablaPre.setValueAt(x.getPr_hora_prestamo(), i, 2);
            tablaPre.setValueAt(x.getIv_codigo(), i, 3);
            tablaPre.setValueAt(x.getEs_identificacion(), i, 4);
            i++;
        }
        this.jTPrestamo.setModel(tablaPre);
    }

    public void LimpiarCajasTexto(){
        this.TFCodigoPrestamo.setText("");
        Time hora = new Time(System.currentTimeMillis());
        this.TFHora.setText(String.valueOf(hora));
        this.TFCodigoArticulo.setText("");
        this.TFIdEstudiante.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTPrestamo = new javax.swing.JTable();
        TFCodigoPrestamo = new javax.swing.JTextField();
        TFHora = new javax.swing.JTextField();
        CBSalon = new javax.swing.JComboBox<>();
        TFCodigoArticulo = new javax.swing.JTextField();
        TFIdEstudiante = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jBNuevo = new javax.swing.JButton();
        jBGrabar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTPrestamo.setModel(new javax.swing.table.DefaultTableModel(
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
        jTPrestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTPrestamoMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTPrestamo);

        TFHora.setEditable(false);

        CBSalon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B100", "B101", "B102", "B103" }));

        jLabel5.setText("Codigo de prestamo");

        jLabel6.setText("Salon");

        jLabel7.setText("Hora del prestamo");

        jLabel8.setText("Codigo del articulo");

        jLabel9.setText("Identificacion");

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

        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(8, 8, 8)
                                                .addComponent(CBSalon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(647, 647, 647))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addGap(7, 7, 7))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel5)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                                .addComponent(jBNuevo))
                                                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jBGrabar)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jBModificar)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jBEliminar)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jBSalir))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(TFCodigoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(TFHora, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(TFCodigoArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(TFIdEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(39, 39, 39)
                                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(75, 75, 75))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(78, 78, 78)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(TFCodigoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(CBSalon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel6))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(TFHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel7))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(TFCodigoArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel8))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(TFIdEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel9))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(58, Short.MAX_VALUE)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jBNuevo)
                                        .addComponent(jBGrabar)
                                        .addComponent(jBModificar)
                                        .addComponent(jBEliminar)
                                        .addComponent(jBSalir))
                                .addGap(109, 109, 109))
        );

        pack();
    }// </editor-fold>

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {
        LimpiarCajasTexto();
        // opcional para mas delante: q ponga el codigo solo
        jBGrabar.setEnabled(true);
    }

    private void jBGrabarActionPerformed(java.awt.event.ActionEvent evt) {
        String codigoPrestamo = TFCodigoPrestamo.getText().trim();
        String codigoArticulo = TFCodigoArticulo.getText().trim();
        String idEstudiante = TFIdEstudiante.getText().trim();

        if (codigoPrestamo.isEmpty() || codigoArticulo.isEmpty() || idEstudiante.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Debe completar todos los campos",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int idEst = Integer.parseInt(idEstudiante);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "La identificacion debe ser un valor numerico entero",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        DataPrestamo objpre = new DataPrestamo();

        if (!objpre.existeArticulo(codigoArticulo)) {
            JOptionPane.showMessageDialog(null, "El articulo no existe", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!objpre.existeEstudiante(Integer.parseInt(idEstudiante))) {
            JOptionPane.showMessageDialog(null, "El estudiante no existe", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        boolean prestamoExiste = false;
        for (DataPrestamo posiblepre : objpre.ListaPrestamo()) {
            if (posiblepre.getPr_codigo().equals(this.TFCodigoPrestamo.getText())) {
                prestamoExiste = true;
                break;
            }
        }
        if (prestamoExiste) {
            JOptionPane.showMessageDialog(null, "El prestamo ya existe", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DataInventario objinv = null;
        for (DataInventario posibleinv : new DataInventario().ListaInventario()) {
            if (posibleinv.getIv_codigo().equals(this.TFCodigoArticulo.getText())) {
                objinv = posibleinv;
                break;
            }
        }

        if (objinv == null) {
            JOptionPane.showMessageDialog(null, "El artículo no existe", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (objinv.getIv_stk() > 0) {
            objinv.pedirarticulo();

            DataPrestamo nuevoPrestamo = new DataPrestamo();
            nuevoPrestamo.setPr_codigo(this.TFCodigoPrestamo.getText());
            nuevoPrestamo.setPr_salon(this.CBSalon.getSelectedItem().toString());
            nuevoPrestamo.setPr_hora_prestamo(Time.valueOf(this.TFHora.getText()));
            nuevoPrestamo.setIv_codigo(this.TFCodigoArticulo.getText());
            nuevoPrestamo.setEs_identificacion(Integer.parseInt(this.TFIdEstudiante.getText()));
            nuevoPrestamo.GrabarPrestamo();

            JOptionPane.showMessageDialog(null, "Prestamo grabado con éxito");
            ListarPrestamos();
        } else {
            JOptionPane.showMessageDialog(null, "No hay articulos suficientes", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {
        String codigoPrestamo = TFCodigoPrestamo.getText().trim();
        if (codigoPrestamo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un codigo valido");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTPrestamo.getModel();
        boolean existe = false;
        for (int i = 0; i < model.getRowCount(); i++) {
            String podibleId = model.getValueAt(i, 0).toString();
            if (podibleId.equals(codigoPrestamo)) {
                existe = true;
                break;
            }
        }

        if (!existe) {
            JOptionPane.showMessageDialog(this, "El prestamo no existe");
            return;
        }

        DataPrestamo objpre = new DataPrestamo();
        objpre.setPr_codigo(this.TFCodigoPrestamo.getText());
        objpre.setPr_salon(this.CBSalon.getSelectedItem().toString());
        objpre.setPr_hora_prestamo(Time.valueOf(this.TFHora.getText()));
        objpre.setIv_codigo(this.TFCodigoArticulo.getText());
        objpre.setEs_identificacion(Integer.parseInt(this.TFIdEstudiante.getText()));
        objpre.EditarPrestamo();
        JOptionPane.showMessageDialog(null, "Prestamo modificado");
        ListarPrestamos();
    }

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {
        String codigoPrestamo = TFCodigoPrestamo.getText().trim();
        String codigoArticulo = TFCodigoArticulo.getText().trim();

        if (codigoPrestamo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un codigo valido");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTPrestamo.getModel();
        boolean existe = false;
        for (int i = 0; i < model.getRowCount(); i++) {
            String podibleId = model.getValueAt(i, 0).toString();
            if (podibleId.equals(codigoPrestamo)) {
                existe = true;
                break;
            }
        }

        if (!existe) {
            JOptionPane.showMessageDialog(this, "El prestamo no existe");
            return;
        }

        DataInventario objinv = null;
        for (DataInventario posibleinv : new DataInventario().ListaInventario()) {
            if (posibleinv.getIv_codigo().equals(this.TFCodigoArticulo.getText())) {
                objinv = posibleinv;
                break;
            }
        }

        int Res = JOptionPane.showConfirmDialog(null,
                "Estas seguro de eliminar el prestamo: " + codigoPrestamo + "?",
                "Confirmar Eliminación",
                JOptionPane.YES_NO_OPTION);
        if (Res == JOptionPane.YES_OPTION) {
            DataPrestamo objpre = new DataPrestamo();
            objpre.setPr_codigo(this.TFCodigoPrestamo.getText());
            objpre.EliminarPrestamo();
            objinv.devolverArticulo();
            JOptionPane.showMessageDialog(null, "Prestamo Eliminado");
            ListarPrestamos();
        }
    }

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {
        int r = JOptionPane.showConfirmDialog(null, "Esta seguro?");
        if (r == 0){
            System.exit(0);
        }
    }

    private void jTPrestamoMousePressed(java.awt.event.MouseEvent evt) {
        int rec = this.jTPrestamo.getSelectedRow();
        this.TFCodigoPrestamo.setText(jTPrestamo.getValueAt(rec, 0).toString());
        this.CBSalon.setSelectedItem(jTPrestamo.getValueAt(rec, 1).toString());
        this.TFHora.setText(jTPrestamo.getValueAt(rec, 2).toString());
        this.TFCodigoArticulo.setText(jTPrestamo.getValueAt(rec, 3).toString());
        this.TFIdEstudiante.setText(jTPrestamo.getValueAt(rec, 4).toString());
    }

    // Variables declaration - do not modify
    private javax.swing.JComboBox<String> CBSalon;
    private javax.swing.JTextField TFCodigoArticulo;
    private javax.swing.JTextField TFCodigoPrestamo;
    private javax.swing.JTextField TFHora;
    private javax.swing.JTextField TFIdEstudiante;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGrabar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTPrestamo;
    // End of variables declaration
}
