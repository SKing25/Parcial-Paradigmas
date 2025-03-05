package Capa_Presentacion;

import Capa_Negocio.DataInventario;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class Formulario_Inventario extends javax.swing.JFrame {

    public Formulario_Inventario() {
        initComponents(); //pone los componentes tal como se configuro en netbeans
        ListarInventario(); //llama a la funcion para que llene la tabla con los datos de la tabla inventario
        jBGrabar.setEnabled(false); //se dehabilita el boton grabar para usarlo despues q se precione el boton "nuevo"
        setTitle("Inventario"); //le pongo el titulo a la ventana
    }

    public void ListarInventario(){
        DefaultTableModel tablaInv = new DefaultTableModel(); //creo un modelo de tabla para maneja los datos de esta
        DataInventario objinv = new DataInventario(); //creo un objeto DataInventario
        ArrayList<DataInventario> listaInv = new ArrayList(); //creo un arraylist
        listaInv = objinv.ListaInventario(); //los datos de la tabla estudiantes los meto en el arraylist
        tablaInv.addColumn("Codigo"); //pongo el titulo de las columnas de la tabla
        tablaInv.addColumn("Nombre");
        tablaInv.addColumn("Cantidad");
        tablaInv.addColumn("Estado");
        tablaInv.setRowCount(listaInv.size()); //el numero de filas va a ser el numero de ojetos almacenados en la lista
        int i = 0;
        for(DataInventario x : listaInv){
            //lleno la tabla con los valores q hay en la lista
            tablaInv.setValueAt(x.getIv_codigo(), i, 0);
            tablaInv.setValueAt(x.getIv_nombre(), i, 1);
            tablaInv.setValueAt(x.getIv_stk(), i, 2);
            tablaInv.setValueAt(x.getIv_Estado(), i, 3);
            i++;
        }
        this.jTInventario.setModel(tablaInv); //le asigno el modelo a la tabla
    }

    public void LimpiarCajasTexto(){
        //dejo las cajas de texto vacias
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
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jBNuevo)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(CBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(TFNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(TFCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addComponent(TFCantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(22, 22, 22))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jBGrabar)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBModificar)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBEliminar)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBSalir)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(TFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(TFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(TFCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(CBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jBNuevo)
                                        .addComponent(jBGrabar)
                                        .addComponent(jBModificar)
                                        .addComponent(jBEliminar)
                                        .addComponent(jBSalir))
                                .addContainerGap(136, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {
        LimpiarCajasTexto();
        // opcional para mas delante: q ponga el codigo solo
        jBGrabar.setEnabled(true); //habilito el boton Grabar
    }

    private void jBGrabarActionPerformed(java.awt.event.ActionEvent evt) {
        String codigo = TFCodigo.getText().trim(); //guardo el codigo sin espacios
        String nombre = TFNombre.getText().trim(); //guardo el nombre sin espacios
        String cantidad = TFCantidad.getText().trim(); //guardo la cantidad sin espacios

        if (codigo.isEmpty() || nombre.isEmpty() || cantidad.isEmpty()) {
            //verifico que el codigo o nombre o la cantidad no esten vacios
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
            //recorremos la lista biscando un articulo con el mismo codigo q el se quiere crear
            if (posibleart.getIv_codigo().equals(this.TFCodigo.getText())) {
                //si encuentra un codigo igual retornamos q si existe un articulo asi
                articuloExiste = true;
                break;
            }
        }

        if (articuloExiste) {
            JOptionPane.showMessageDialog(null, "El articulo ya existe", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //despues de las validaciones le colocamos los datos suministrados en los campos de texto al nuevo articulo
        objinv.setIv_codigo(this.TFCodigo.getText());
        objinv.setIv_nombre(this.TFNombre.getText());
        objinv.setIv_stk(Integer.parseInt(this.TFCantidad.getText()));
        objinv.setIv_Estado(this.CBEstado.getSelectedItem().toString());
        objinv.GrabarInventario();

        JOptionPane.showMessageDialog(null, "Articulo grabado con exito");
        ListarInventario();
    }

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {
        String codigo = TFCodigo.getText().trim(); //guardo el codigo sin espacios

        if (codigo.isEmpty()) {
            //verifico si el codigo es vacio
            JOptionPane.showMessageDialog(null, "Ingrese un codigo valido");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTInventario.getModel(); //guardo el modelo de la tabla en model

        boolean existe = false; //suponemos q el articulo a modificar no existe
        for (int i = 0; i < model.getRowCount(); i++) {
            //buscamos en las filas de la tabla en la columna 0 si hay un codigo igual al q se quiere modificar
            String posibleCodigo = model.getValueAt(i, 0).toString();
            if (posibleCodigo.equals(codigo)) {
                existe = true; //si se encuentra el codigo significa q el articulo si existe y si se puede modificar
                break;
            }
        }

        if (!existe) {
            //en caso de q no exista se dice q no existe
            JOptionPane.showMessageDialog(null, "El articulo no existe");
            return;
        }

        DataInventario objinv = new DataInventario(); //creo un objeto DataInvetario

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
        String codigo = TFCodigo.getText().trim(); //guardo el codigo puesto en el campo de texto sin espacios

        if (codigo.isEmpty()) {
            //verifico q no este vacio
            JOptionPane.showMessageDialog(this, "Ingrese un codigo valido");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTInventario.getModel(); //llamo al modelo de la tabla de articulos

        boolean existe = false; //suponemos q no existe el articulo
        for (int i = 0; i < model.getRowCount(); i++) {
            //recorremos la tabla en busca de un articulo con el codigo q se quiere eliminar
            String posibleCodigo = model.getValueAt(i, 0).toString();
            if (posibleCodigo.equals(codigo)) {
                //si lo encontramos mandamos q si existe (true)
                existe = true;
                break;
            }
        }

        if (!existe) {
            //si no existe el articulo no se puede eliminar
            JOptionPane.showMessageDialog(null, "El articulo no existe en el inventario");
            return;
        }

        //se pregunta si esta seguro de eliminar el articulo
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
        //metodo q llena los campos de texto de acuerdo a la fila seleccionada en la tabla
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
