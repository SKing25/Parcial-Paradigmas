package Capa_Presentacion;

import Capa_Negocio.DataEstudiante;
import Capa_Negocio.DataInventario;
import Capa_Negocio.DataPrestamo;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Time;
import java.util.ArrayList;

public class Formulario_Prestamo extends javax.swing.JFrame {

    public Formulario_Prestamo() {
        initComponents(); //pone los componentes tal como se configuro en el netbeans
        ListarPrestamos(); //llama a la funcion para que llene la tabla con los datos en la tabla estudiantes
        jBGrabar.setEnabled(false); //se deshabilita el boton grabar para usarlo despues q se presione elboton "nuevo"
        setTitle("Prestamo"); //le pongo el titulo a la ventana
    }

    public void ListarPrestamos() {
        DefaultTableModel tablaPre = new DefaultTableModel(); //creo un modelo de tabla para manejar los datos de esta
        DataPrestamo objpre = new DataPrestamo(); //creo un objeto de DataEstudiante
        ArrayList<DataPrestamo> listaPre = new ArrayList<>(); //creo un arraylist
        listaPre = objpre.ListaPrestamo(); //los datos de la tabla prestamos los meto en el arraylist
        tablaPre.addColumn("Codigo Prestamo"); //pongo el titulo de las columnas de la tabla
        tablaPre.addColumn("Salon"); // 1
        tablaPre.addColumn("Hora");  // 2
        tablaPre.addColumn("Codigo Articulo"); // 3
        tablaPre.addColumn("Nombre Articulo"); // 4
        tablaPre.addColumn("Identificacion Estudiante"); // 5
        tablaPre.addColumn("Nombre Estudiante"); //6
        tablaPre.setRowCount(listaPre.size()); //el numero de filas va a ser el numero de objetos almacenados en la lista
        int i = 0;
        for (DataPrestamo x : listaPre) {
            //llena la tabla con los valores q hay en la lista
            tablaPre.setValueAt(x.getPr_codigo(), i, 0);
            tablaPre.setValueAt(x.getPr_salon(), i, 1);
            tablaPre.setValueAt(x.getPr_hora_prestamo(), i, 2);
            tablaPre.setValueAt(x.getIv_codigo(), i, 3);
            tablaPre.setValueAt(x.getEs_identificacion(), i, 5);

            DataInventario z = null;
            for (DataInventario posibleinv : new DataInventario().ListaInventario()) {
                if(x.existeArticulo(x.getIv_codigo())) {
                    z = posibleinv;
                    tablaPre.setValueAt(z.getIv_nombre(), i, 4);
                    break;
                }
                else{
                    JOptionPane.showMessageDialog(null, "No se encontro el articulo", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            DataEstudiante e = null;
            for (DataEstudiante posibleest : new DataEstudiante().ListaEstudiante()) {
                if(x.existeEstudiante(x.getEs_identificacion())) {
                    e = posibleest;
                    tablaPre.setValueAt(e.getEs_nombre_completo(), i, 6);
                    break;
                }
                else{
                    JOptionPane.showMessageDialog(null, "No se encontro el estudiante", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            i++;
        }
        this.jTPrestamo.setModel(tablaPre); //le asigno el modelo a la tabla
    }

    public void LimpiarCajasTexto(){
        //dejo las cajas de texto vacias
        this.TFCodigoPrestamo.setText("");
        Time hora = new Time(System.currentTimeMillis()); //obtengo la hora actual
        this.TFHora.setText(String.valueOf(hora)); //pongo la hora en el capo de texto
        this.TFCodigoArticulo.setText("");
        this.TFIdEstudiante.setText("");
    }

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

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jLabel5.setText("Codigo de prestamo");

        jLabel6.setText("Salon");

        jLabel7.setText("Hora del prestamo");

        jLabel8.setText("Codigo del articulo");

        jLabel9.setText("Identificacion");

        jTPrestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTPrestamoMousePressed(evt);
            }
        });

        jScrollPane2.setViewportView(jTPrestamo);

        TFHora.setEditable(false);

        CBSalon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B100", "B101", "B102", "B103" }));

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
                                                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(8, 8, 8)
                                                                .addComponent(CBSalon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                .addGap(7, 7, 7))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel5)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(TFCodigoArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(TFIdEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(TFCodigoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(TFHora, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(56, 56, 56)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 24, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jBNuevo)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jBGrabar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jBModificar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jBEliminar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jBSalir)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                                                .addGap(26, 26, 26)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(TFIdEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel9))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(69, 69, 69)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jBNuevo)
                                        .addComponent(jBGrabar)
                                        .addComponent(jBModificar)
                                        .addComponent(jBEliminar)
                                        .addComponent(jBSalir))
                                .addGap(77, 77, 77))
        );

        pack();
    }// </editor-fold>

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {
        LimpiarCajasTexto();
        if ( this.jTPrestamo.getRowCount()+1 >= 10) this.TFCodigoPrestamo.setText("PR00" + (this.jTPrestamo.getRowCount() +1));
        else if ( this.jTPrestamo.getRowCount()+1 >= 100) this.TFCodigoPrestamo.setText("PR0" + (this.jTPrestamo.getRowCount() +1));
        else if ( this.jTPrestamo.getRowCount()+1 >= 1000) this.TFCodigoPrestamo.setText("PR" + (this.jTPrestamo.getRowCount() +1));
        else this.TFCodigoPrestamo.setText("PR000" + (this.jTPrestamo.getRowCount() + 1));
        TFCodigoArticulo.setText("IV");
        jBGrabar.setEnabled(true);
    }

    private void jBGrabarActionPerformed(java.awt.event.ActionEvent evt) {
        String codigoPrestamo = TFCodigoPrestamo.getText().trim(); //guardo el codigo del prestamo sin espacios
        String codigoArticulo = TFCodigoArticulo.getText().trim(); //guardo el codigo del articulo a prestar sin espacios
        String idEstudiante = TFIdEstudiante.getText().trim(); //guardo la identificacion del estudiante sin espacios

        if (codigoPrestamo.isEmpty() || codigoArticulo.isEmpty() || idEstudiante.isEmpty()) {
            //verifico q ni el codigo del prestamo, ni el codigo del articulo ni el id del estudiante  esten vacios
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            //intento convertir el id del estudiante en entero
            int idEst = Integer.parseInt(idEstudiante);
        } catch (NumberFormatException e) {
            //si no es un entero lanzo un mensaje de error
            JOptionPane.showMessageDialog(null,"La identificacion debe ser un valor numerico entero","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DataPrestamo objpre = new DataPrestamo(); //creo un objeto DataPrestamo

        if (!objpre.existeArticulo(codigoArticulo)) {
            //verifico que el articulo a prestar si exista mediante el metodo de la clase DataPrestamo
            JOptionPane.showMessageDialog(null, "El articulo no existe", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!objpre.existeEstudiante(Integer.parseInt(idEstudiante))) {
            //verifico q el estudiante tambien exista
            JOptionPane.showMessageDialog(null, "El estudiante no existe", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        boolean prestamoExiste = false; //suponemos el prestamo no existe
        for (DataPrestamo posiblepre : objpre.ListaPrestamo()) {
            //recorremos la lista donde estan todos los prestamos buscando uno con el mismo codigo de prestamo
            if (posiblepre.getPr_codigo().equals(this.TFCodigoPrestamo.getText())) {
                //si hay uno retornamos q si existe un prestamo con ese codigo (true)
                prestamoExiste = true;
                break;
            }
        }

        if (prestamoExiste) {
            //si el prestamo ya existe mandamos un mensaje de error
            JOptionPane.showMessageDialog(null, "El prestamo ya existe", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DataInventario objinv = null; //creamos un objeto DataInventario vacio para asignarle los datos mas adelante
        for (DataInventario posibleinv : new DataInventario().ListaInventario()) {
            //recorremos la lista de la tabla inventario buscando el articulo q se va a prestar mediante el codigo del articulo
            if (posibleinv.getIv_codigo().equals(this.TFCodigoArticulo.getText())) {
                //si se encuentra el articulo lo asignamos a objinv
                objinv = posibleinv;
                break;
            }
        }

        if (objinv == null) {
            //si no se encuentra el articulo en la lista retornamos un mensaje de error
            JOptionPane.showMessageDialog(null, "El articulo no existe", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (objinv.getIv_stk() > 0) {
            //verificamos q la cantidad en stock sea mayor q 0 para poder prestarlo
            objinv.pedirarticulo();
            //llamamos al metodo pedir articulo q le resta 1 al stock del articulo y no pedir articulos q no haya

            //asignamos todos los datos al prestamo q se va a crear
            objpre.setPr_codigo(this.TFCodigoPrestamo.getText());
            objpre.setPr_salon((String) this.CBSalon.getSelectedItem());
            objpre.setPr_hora_prestamo(Time.valueOf(this.TFHora.getText()));
            objpre.setIv_codigo(this.TFCodigoArticulo.getText());
            objpre.setEs_identificacion(Integer.parseInt(this.TFIdEstudiante.getText()));
            objpre.GrabarPrestamo();

            JOptionPane.showMessageDialog(null, "Prestamo grabado con éxito");
            ListarPrestamos();

        //si no hay stock del articulo retorna mensaje de error
        } else JOptionPane.showMessageDialog(null, "No hay articulos suficientes", "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {
        String codigoPrestamo = TFCodigoPrestamo.getText().trim(); //guardamos el codigo del prestamo sin espacios

        if (codigoPrestamo.isEmpty()) {
            //verificamos q el codigo no este vacio
            JOptionPane.showMessageDialog(null, "Ingrese un codigo valido");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTPrestamo.getModel(); //guardamos el modelo de la tabla de prestamos en model

        boolean existe = false; //suponemos q no existe el prestamo
        for (int i = 0; i < model.getRowCount(); i++) {
            //buscamos el codigo de prestamo en la tabla
            String podibleId = model.getValueAt(i, 0).toString();
            if (podibleId.equals(codigoPrestamo)) {
                existe = true; //si lo encuentra asignamos true para saber q si existe el prestamo a modificar
                break;
            }
        }

        if (!existe) {
            //si no existe mandar un mensaje para decir q el prestamo no existe
            JOptionPane.showMessageDialog(null, "El prestamo no existe");
            return;
        }

        DataPrestamo objpre = new DataPrestamo();//creamos un objeto DataPrestamo

        //le asignamos los nuevos valores al prestamo a modificar
        objpre.setPr_codigo(this.TFCodigoPrestamo.getText());
        objpre.setPr_salon((String) this.CBSalon.getSelectedItem());
        objpre.setPr_hora_prestamo(Time.valueOf(this.TFHora.getText()));
        objpre.setIv_codigo(this.TFCodigoArticulo.getText());
        objpre.setEs_identificacion(Integer.parseInt(this.TFIdEstudiante.getText()));
        objpre.EditarPrestamo();

        JOptionPane.showMessageDialog(null, "Prestamo modificado");
        ListarPrestamos();
    }

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {
        String codigoPrestamo = TFCodigoPrestamo.getText().trim(); //guardamos el codigo del prestamo sin espacios

        if (codigoPrestamo.isEmpty()) {
            //verificamos q el codigo no este vacio
            JOptionPane.showMessageDialog(null, "Ingrese un codigo valido");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTPrestamo.getModel(); //guardamos el modelo de la tabla en model

        boolean existe = false; //suponemos q no existe el prestamo
        for (int i = 0; i < model.getRowCount(); i++) {
            //recorremos la tabla buscando el codigo en la columna 0 del prestamo a eliminar
            String podibleId = model.getValueAt(i, 0).toString();
            if (podibleId.equals(codigoPrestamo)) {
                //si hay un codigo igual al q se quiere eliminar decimos q si existe el prestamo (true)
                existe = true;
                break;
            }
        }

        if (!existe) {
            //si no lo encuentra mandamos un mensaje diciendo q el prestamo no existe
            JOptionPane.showMessageDialog(null, "El prestamo no existe");
            return;
        }

        DataInventario objinv = null; //creamos un objeto DataInventario vacio para luego asignarlelos valores encontrados
        for (DataInventario posibleinv : new DataInventario().ListaInventario()) {
            //buscamos el codigo del articulo q se quiere devolver en la lista del inventario
            if (posibleinv.getIv_codigo().equals(this.TFCodigoArticulo.getText())) {
                //si lo encuentra le asignamos los valores a objinv
                objinv = posibleinv;
                break;
            }
        }

        //preguntamos si si se quiere eliminar el prestamo
        int Res = JOptionPane.showConfirmDialog(null,"Estas seguro de eliminar el prestamo: " + codigoPrestamo + "?","Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
        if (Res == JOptionPane.YES_OPTION) {
            DataPrestamo objpre = new DataPrestamo();

            //si responde q si eliminamos el prestamo
            objpre.setPr_codigo(this.TFCodigoPrestamo.getText());
            objpre.EliminarPrestamo();
            objinv.devolverArticulo(); //llamamos a la funcion de DataInventario para que devuelva el articulo (le sume 1 al stock)

            JOptionPane.showMessageDialog(null, "Prestamo Eliminado");
            ListarPrestamos();
        }
    }

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {
        //se pregunta si se quiere salir del programa
        int r = JOptionPane.showConfirmDialog(null, "Esta seguro?");
        if (r == 0) System.exit(0);
    }

    private void jTPrestamoMousePressed(java.awt.event.MouseEvent evt) {
        //metodo que llena los campos de texto de acuerdo a la fila seleccionada en la tabla
        int rec = this.jTPrestamo.getSelectedRow();
        this.TFCodigoPrestamo.setText(jTPrestamo.getValueAt(rec, 0).toString());
        this.CBSalon.setSelectedItem(jTPrestamo.getValueAt(rec, 1).toString());
        this.TFHora.setText(jTPrestamo.getValueAt(rec, 2).toString());
        this.TFCodigoArticulo.setText(jTPrestamo.getValueAt(rec, 3).toString());
        this.TFIdEstudiante.setText(jTPrestamo.getValueAt(rec, 4).toString());
    }

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
}
