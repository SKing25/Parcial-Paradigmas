package Capa_Presentacion;

import Capa_Negocio.DataEstudiante;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class Formulario_Estudiante extends javax.swing.JFrame {

    public Formulario_Estudiante() {
        initComponents(); //pone los componentes tal como se configuro en el netbeans
        ListarEstudiante(); //llama a la funcion para que llene la tabla con los datos en la tabla estudiantes
        jBGrabar.setEnabled(false); //se deshabilita el boton grabar para usarlo despues q se presione elboton "nuevo"
        setTitle("Estudiante"); //le pongo el titulo a la ventana
    }

    public void ListarEstudiante() {
        DefaultTableModel tablaEst = new DefaultTableModel(); //creo un modelo de tabla para manejar los datos de esta
        DataEstudiante objest = new DataEstudiante(); //creo un objeto de DataEstudiante
        ArrayList<DataEstudiante> listaEst = new ArrayList(); //creo un arraylist
        listaEst = objest.ListaEstudiante(); //los datos de la tabla estudiantes los meto en el arraylist
        tablaEst.addColumn("Identificacion"); //pongo el titulo de las columnas de la tabla
        tablaEst.addColumn("Nombre completo");
        tablaEst.addColumn("Carrera");
        tablaEst.addColumn("Email");
        tablaEst.setRowCount(listaEst.size()); //el numero de filas va a ser el numero de objetos almacenados en la lista
        int i = 0;
        for(DataEstudiante x : listaEst){
            //lleno la tabla con los valores que hay en la lista
            tablaEst.setValueAt(x.getEs_identificacion(), i, 0);
            tablaEst.setValueAt(x.getEs_nombre_completo(), i, 1);
            tablaEst.setValueAt(x.getEs_carrera(), i, 2);
            tablaEst.setValueAt(x.getEs_Email(), i, 3);
            i++;
        }
        this.jTEstudiantes.setModel(tablaEst); //le asigno el modelo a la tabla
    }

    public void LimpiarCajasTexto(){
        //dejo las cajas de texto vacias
        this.TFId.setText("");
        this.TFNombreCompleto.setText("");
        this.TFEmail.setText("");
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TFId = new javax.swing.JTextField();
        TFNombreCompleto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTEstudiantes = new javax.swing.JTable();
        jBNuevo = new javax.swing.JButton();
        jBGrabar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        CBCarrera = new javax.swing.JComboBox<>();
        TFEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Identidicacion");

        jLabel2.setText("Nombre Completo");

        jLabel3.setText("Carrera");

        jLabel4.setText("Email");

        jTEstudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTEstudiantesMousePressed(evt);
            }
        });

        jScrollPane1.setViewportView(jTEstudiantes);

        CBCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ing Industrial",
                "Ciencias de la computacion", "Ing Ambiental", "Ing Electronica" }));

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
                                                                .addGap(9, 9, 9)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(TFId, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                                        .addComponent(TFNombreCompleto))
                                                .addGap(35, 35, 35))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jBNuevo)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBGrabar)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBModificar)
                                                .addGap(12, 12, 12))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(CBCarrera, 0, 100, Short.MAX_VALUE)
                                                        .addComponent(TFEmail))
                                                .addGap(36, 36, 36)))
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
                                                        .addComponent(TFId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel1))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(TFNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(CBCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(TFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    }// </editor-fold>

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {
        LimpiarCajasTexto();
        // opcional para mas delante: q ponga el codigo solo
        jBGrabar.setEnabled(true); //habilito el boton Grabar
    }

    private void jBGrabarActionPerformed(java.awt.event.ActionEvent evt) {
        String identificacion = TFId.getText().trim(); //guardo la identficacion sin espacios
        String nombreCompleto = TFNombreCompleto.getText().trim(); //guardo el nombre sin espacios
        String email = TFEmail.getText().trim(); // guardo el email sin espacios

        if (identificacion.isEmpty() || nombreCompleto.isEmpty() || email.isEmpty()) {
            // verifico si la identificacion o el nobre o el email estan vacios
            JOptionPane.showMessageDialog(null,"Debe completar todos los campos","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // intento convertir la identificacion a entero, esta debe ser un entero
            int id = Integer.parseInt(identificacion);
        } catch (NumberFormatException e) {
            // si la identificacion no es entero lanza un error
            JOptionPane.showMessageDialog(null,"La identificacion debe ser un valor numerico entero","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DataEstudiante objest = new DataEstudiante(); //creo un objeto DataEstudiante

        boolean estudianteExiste = false; //suponemos que el estudiante no existe para que no haya duplicados
        for(DataEstudiante posibleest : objest.ListaEstudiante()) {
            //recorremos la lista buscando un estudiante con el mismo id q el q se quiere crear
            if (posibleest.getEs_identificacion() == Integer.parseInt(this.TFId.getText())) {
                estudianteExiste = true; //si encuentra un id igual al q se quiere crear retornamos q si existe un estudiante asi (true)
                break;
            }
        }

        if (estudianteExiste) {
            JOptionPane.showMessageDialog(null, "Estudiante ya existe", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //despues de las validaciones le colocamos los datos suministrados en los campos de texto al nuevo estudiante
        objest.setEs_identificacion(Integer.parseInt(this.TFId.getText()));
        objest.setEs_nombre_completo(this.TFNombreCompleto.getText());
        objest.setEs_carrera(this.CBCarrera.getSelectedItem().toString());
        objest.setEs_Email(this.TFEmail.getText());
        objest.GrabarEstudiante();

        JOptionPane.showMessageDialog(null, "Estudiante grabado con exito");
        ListarEstudiante();
    }

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {
        String id = TFId.getText().trim(); //guardo el id sin espacios

        if (id.isEmpty()) {
            //verifico si el id es vacio
            JOptionPane.showMessageDialog(null, "Ingrese una identificacion valida");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTEstudiantes.getModel(); //guardo el modelo de la tabla en model

        boolean existe = false; //suponemos q no existe el estudiante a modificar
        for (int i = 0; i < model.getRowCount(); i++) {
            //buscamos en las filas de la tabla en la columna 0 si hay un id igual al q se quiere modificar
            String podibleId = model.getValueAt(i, 0).toString();
            if (podibleId.equals(id)) {
                existe = true; //si se encuentra el id significa q el estudiante si existe y se puede modificar
                break;
            }
        }

        if (!existe) {
            //en caso de no exista se dice q no existe
            JOptionPane.showMessageDialog(null, "El estudiante no existe");
            return;
        }

        DataEstudiante objest = new DataEstudiante(); //creo un objeto DataEstudante

        //le asigno los nuevos valores al estudiante
        objest.setEs_identificacion(Integer.parseInt(id));
        objest.setEs_nombre_completo(this.TFNombreCompleto.getText());
        objest.setEs_carrera(this.CBCarrera.getSelectedItem().toString());
        objest.setEs_Email(this.TFEmail.getText());
        objest.EditarEstudiante();

        JOptionPane.showMessageDialog(null, "Estudiante modificado");
        ListarEstudiante();
    }

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {
        String id = TFId.getText().trim(); //guardo el id puesto en el campo de texto sin espacios

        if (id.isEmpty()) {
            //verifico q no este vacio
            JOptionPane.showMessageDialog(null, "Ingrese una identificacion valida");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTEstudiantes.getModel(); //llamo al modelo de la tabla de estudiantes

        boolean existe = false; //suponemos q no existe el estudiante
        for (int i = 0; i < model.getRowCount(); i++) {
            //recorremos la tabla en busca de un estudiante con el id q se quiere eliminar
            String podibleId = model.getValueAt(i, 0).toString();
            if (podibleId.equals(id)) {
                //si lo encontramos mandamos que si existe (true)
                existe = true;
                break;
            }
        }

        if (!existe) {
            //si no existe el estudiante no se puede eliminar
            JOptionPane.showMessageDialog(null, "El estudiante no existe");
            return;
        }

        //se pregunta si esta seguro de eliminar el estudiante
        int Res = JOptionPane.showConfirmDialog(null,"Estas seguro de eliminar el estudiante: " + id + "?","Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
        if (Res == JOptionPane.YES_OPTION) {
            //si si esta seguro de eliminarlo se elimina
            DataEstudiante objinv = new DataEstudiante();

            objinv.setEs_identificacion(Integer.parseInt(id));
            objinv.EliminarEstudiante();

            JOptionPane.showMessageDialog(null, "Estudiante Eliminado");
            ListarEstudiante();
        }
    }

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {
        //se pregunta si se quiere salir del programa
        int r = JOptionPane.showConfirmDialog(null, "Esta seguro?");
        if (r == 0) System.exit(0);
    }

    private void jTEstudiantesMousePressed(java.awt.event.MouseEvent evt) {
        //metodo que llena los campos de texto de acuerdo a la fila seleccionada en la tabla
        int rec = this.jTEstudiantes.getSelectedRow();
        this.TFId.setText(jTEstudiantes.getValueAt(rec, 0).toString());
        this.TFNombreCompleto.setText(jTEstudiantes.getValueAt(rec, 1).toString());
        this.CBCarrera.setSelectedItem(jTEstudiantes.getValueAt(rec, 2).toString());
        this.TFEmail.setText(jTEstudiantes.getValueAt(rec, 3).toString());
    }

    private javax.swing.JComboBox<String> CBCarrera;
    private javax.swing.JTextField TFEmail;
    private javax.swing.JTextField TFId;
    private javax.swing.JTextField TFNombreCompleto;
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
    private javax.swing.JTable jTEstudiantes;
}
