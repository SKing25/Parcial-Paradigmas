package Capa_Presentacion;

import Capa_Negocio.DataInventario;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class Formulario_Inventario extends javax.swing.JFrame {

    public Formulario_Inventario() {
        initComponents(); //pone los componentes tal como se configuró en netbeans
        ListarInventario(); //llama a la función para que llene la tabla con los datos de la tabla inventario
        jBGrabar.setEnabled(false); //se deshabilita el botón grabar para usarlo después que se presione el botón "nuevo"
        setTitle("Inventario"); //le pongo el titulo a la ventana
    }

    public void ListarInventario(){
        DefaultTableModel tablaInv = new DefaultTableModel(); //creo un modelo de tabla para manejar los datos de esta
        DataInventario objinv = new DataInventario(); //creo un objeto DataInventario
        ArrayList<DataInventario> listaInv; //creo un arraylist
        listaInv = objinv.ListaInventario(); //los datos de la tabla estudiantes los meto en el arraylist
        tablaInv.addColumn("Codigo"); //pongo el título de las columnas de la tabla
        tablaInv.addColumn("Nombre");
        tablaInv.addColumn("Cantidad");
        tablaInv.addColumn("Estado");
        tablaInv.setRowCount(listaInv.size()); //el número de filas va a ser el número de objetos almacenados en la lista
        int i = 0;
        for(DataInventario x : listaInv){
            //lleno la tabla con los valores que hay en la lista
            tablaInv.setValueAt(x.getIv_codigo(), i, 0);
            tablaInv.setValueAt(x.getIv_nombre(), i, 1);
            tablaInv.setValueAt(x.getIv_stk(), i, 2);
            tablaInv.setValueAt(x.getIv_Estado(), i, 3);
            i++;
        }
        this.jTInventario.setModel(tablaInv); //le asigno el modelo a la tabla
    }

    public void LimpiarCajasTexto(){
        //dejo las cajas de texto vacías
        this.TFCodigo.setText("");
        this.TFNombre.setText("");
        this.TFCantidad.setText("");
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TFCodigo = new javax.swing.JTextField();
        TFNombre = new javax.swing.JTextField();
        TFCantidad = new javax.swing.JTextField();
        CBEstado = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTInventario = new javax.swing.JTable();
        jBNuevo = new javax.swing.JButton();
        jBGrabar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Codigo");

        jLabel2.setText("Nombre");

        jLabel3.setText("Cantidad");

        jLabel4.setText("Estado");

        jTInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTInventarioMousePressed(evt);
            }
        });

        jScrollPane1.setViewportView(jTInventario);

        CBEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bueno", "Regular", "Malo" }));

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
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(9, 9, 9))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addGap(7, 7, 7)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(CBEstado, 0, 100, Short.MAX_VALUE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(TFNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                                                .addComponent(TFCodigo)
                                                                .addComponent(TFCantidad)))
                                                .addGap(35, 35, 35))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jBNuevo)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBGrabar)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBModificar)
                                                .addGap(12, 12, 12)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jBEliminar)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBSalir))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(78, 78, 78)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(TFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel1))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(TFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(TFCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(CBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(43, Short.MAX_VALUE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jBNuevo)
                                        .addComponent(jBGrabar)
                                        .addComponent(jBModificar)
                                        .addComponent(jBEliminar)
                                        .addComponent(jBSalir))
                                .addGap(29, 29, 29))
        );

        setBounds(0, 0, 814, 407);

        pack();
    }// </editor-fold>

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {
        LimpiarCajasTexto();
        if ( this.jTInventario.getRowCount()+1 >= 10) this.TFCodigo.setText("IV00" + (this.jTInventario.getRowCount() +1));
        else if ( this.jTInventario.getRowCount()+1 >= 100) this.TFCodigo.setText("IV0" + (this.jTInventario.getRowCount() +1));
        else if ( this.jTInventario.getRowCount()+1 >= 1000) this.TFCodigo.setText("IV" + (this.jTInventario.getRowCount() +1));
        else this.TFCodigo.setText("IV000" + (this.jTInventario.getRowCount() + 1));
        jBGrabar.setEnabled(true); //habilito el boton Grabar
    }

    private void jBGrabarActionPerformed(java.awt.event.ActionEvent evt) {
        String codigo = TFCodigo.getText().trim(); //guardo el código sin espacios
        String nombre = TFNombre.getText().trim(); //guardo el nombre sin espacios
        String cantidad = TFCantidad.getText().trim(); //guardo la cantidad sin espacios

        if (codigo.isEmpty() || nombre.isEmpty() || cantidad.isEmpty()) {
            //verifico que el código o nombre o la cantidad no estén vacíos
            JOptionPane.showMessageDialog(null,"Debe completar todos los campos","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            //intento convertir la cantidad stock en entero
            int cantidadNum = Integer.parseInt(cantidad);
        } catch (NumberFormatException e) {
            //si no es entero lanza un error
            JOptionPane.showMessageDialog(null,"La cantidad debe ser un numero entero","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DataInventario objinv = new DataInventario(); //creo un objeto DataInventario

        boolean articuloExiste = false; //suponemos q el articulo no existe
        for(DataInventario posibleart : objinv.ListaInventario()) {
            //recorremos la lista buscando un artículo con el mismo código que se quiere crear
            if (posibleart.getIv_codigo().equals(this.TFCodigo.getText())) {
                //si encuentra un código igual retornamos q si existe un articulo asi
                articuloExiste = true;
                break;
            }
        }

        if (articuloExiste) {
            JOptionPane.showMessageDialog(null, "El articulo ya existe", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //después de las validaciones le colocamos los datos suministrados en los campos de texto al nuevo artículo
        objinv.setIv_codigo(this.TFCodigo.getText());
        objinv.setIv_nombre(this.TFNombre.getText());
        objinv.setIv_stk(Integer.parseInt(this.TFCantidad.getText()));
        objinv.setIv_Estado(this.CBEstado.getSelectedItem().toString());
        objinv.GrabarInventario();

        JOptionPane.showMessageDialog(null, "Articulo grabado con exito");
        ListarInventario();
    }

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {
        String codigo = TFCodigo.getText().trim(); //guardo el código sin espacios

        if (codigo.isEmpty()) {
            //verifico si el código es vacío
            JOptionPane.showMessageDialog(null, "Ingrese un codigo valido");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTInventario.getModel(); //guardo el modelo de la tabla en model

        boolean existe = false; //suponemos q el articulo a modificar no existe
        for (int i = 0; i < model.getRowCount(); i++) {
            //buscamos en las filas de la tabla en la columna 0 si hay un código igual al q se quiere modificar
            String posibleCodigo = model.getValueAt(i, 0).toString();
            if (posibleCodigo.equals(codigo)) {
                existe = true; //si se encuentra el código significa que el artículo si existe y si se puede modificar
                break;
            }
        }

        if (!existe) {
            //en caso de q no exista se dice q no existe
            JOptionPane.showMessageDialog(null, "El articulo no existe");
            return;
        }

        DataInventario objinv = new DataInventario(); //creo un objeto DataInventario

        //le asigno los nuevos valores al articulo
        objinv.setIv_codigo(codigo);
        objinv.setIv_nombre(this.TFNombre.getText());
        objinv.setIv_stk(Integer.parseInt(this.TFCantidad.getText()));
        objinv.setIv_Estado(this.CBEstado.getSelectedItem().toString());
        objinv.EditarInventario();

        JOptionPane.showMessageDialog(null, "Articulo modificado");
        ListarInventario();
    }

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {
        String codigo = TFCodigo.getText().trim(); //guardo el código puesto en el campo de texto sin espacios

        if (codigo.isEmpty()) {
            //verifico q no este vacío
            JOptionPane.showMessageDialog(null, "Ingrese un codigo valido");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTInventario.getModel(); //llamo al modelo de la tabla de articulos

        boolean existe = false; //suponemos q no existe el articulo
        for (int i = 0; i < model.getRowCount(); i++) {
            //recorremos la tabla en busca de un artículo con el código que se quiere eliminar
            String posibleCodigo = model.getValueAt(i, 0).toString();
            if (posibleCodigo.equals(codigo)) {
                //si lo encontramos mandamos q si existe (true)
                existe = true;
                break;
            }
        }

        if (!existe) {
            //si no existe el artículo no se puede eliminar
            JOptionPane.showMessageDialog(null, "El articulo no existe en el inventario");
            return;
        }

        //se pregunta si está seguro de eliminar el artículo
        int Res = JOptionPane.showConfirmDialog(null,"Estas seguro de eliminar el articulo: " + codigo + "?","Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
        if (Res == JOptionPane.YES_OPTION) {
            //si si esta seguro se elimina
            DataInventario objinv = new DataInventario();

            objinv.setIv_codigo(codigo);
            objinv.EliminarInventario();

            JOptionPane.showMessageDialog(null, "Articulo Eliminado");
            ListarInventario();
        }
    }

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {
        //se pregunta si se quiere salir del programa
        int r = JOptionPane.showConfirmDialog(null, "Esta seguro?");
        if (r == 0) System.exit(0);
    }

    private void jTInventarioMousePressed(java.awt.event.MouseEvent evt) {
        //metodo que llena los campos de texto de acuerdo a la fila seleccionada en la tabla
        int rec = this.jTInventario.getSelectedRow();
        this.TFCodigo.setText(jTInventario.getValueAt(rec, 0).toString());
        this.TFNombre.setText(jTInventario.getValueAt(rec, 1).toString());
        this.TFCantidad.setText(jTInventario.getValueAt(rec, 2).toString());
        this.CBEstado.setSelectedItem(jTInventario.getValueAt(rec, 3).toString());
    }

    private javax.swing.JComboBox<String> CBEstado;
    private javax.swing.JTextField TFCantidad;
    private javax.swing.JTextField TFCodigo;
    private javax.swing.JTextField TFNombre;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGrabar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTInventario;
}
