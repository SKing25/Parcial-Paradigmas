package Capa_Presentacion;

import Capa_Negocio.DataPrestamo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Formulario_Articulo extends javax.swing.JFrame {

    public Formulario_Articulo() { /*Constructor*/
        initComponents();
        this.setSize(850, 430);
        ListarArticulos();
        jBGrabar.setEnabled(false);
    }

    public void ListarArticulos() { //Recupera los articulos de la base de datos
        //Para mostrarlos en la Jtable1
        DefaultTableModel tabla = new DefaultTableModel();
        DataPrestamo objart = new DataPrestamo();
        ArrayList<DataPrestamo> lista2 = new ArrayList();
        lista2 = objart.ListaArticulos(); /*L*/
        tabla.addColumn("Codigo");
        tabla.addColumn("Nombre");
        tabla.addColumn("Unidad");
        tabla.addColumn("Precio");
        tabla.addColumn("Stock");
        tabla.addColumn("Marca");
        tabla.setRowCount(lista2.size());
        int i = 0;
        for (DataPrestamo x : lista2) {
            tabla.setValueAt(x.getArt_cod(), i, 0);
            tabla.setValueAt(x.getArt_nom(), i, 1);
            tabla.setValueAt(x.getArt_uni(), i, 2);
            tabla.setValueAt(x.getArt_pre(), i, 3);
            tabla.setValueAt(x.getArt_stk(), i, 4);
            tabla.setValueAt(x.getArt_marca(), i, 5);
            i++;
        }
        this.jTable1.setModel(tabla);
    }

    public void LimpiarCajasTexto(){ /*Borra contenido de las cajas
    de texto*/
        this.TFCodigo.setText("");
        this.TFNombre.setText("");
        this.TFMedida.setText("");
        this.TFPrecio.setText("");
        this.TFCantidad.setText("");
        this.TFMarca.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
//Lista de botones y elementos graficcs
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TFCodigo = new javax.swing.JTextField();
        TFNombre = new javax.swing.JTextField();
        TFMedida = new javax.swing.JTextField();
        TFPrecio = new javax.swing.JTextField();
        TFCantidad = new javax.swing.JTextField();
        TFMarca = new javax.swing.JTextField();

        TFCodigo.setEditable(false);
        TFNombre.setEditable(false);
        TFMedida.setEditable(false);
        TFPrecio.setEditable(false);
        TFCantidad.setEditable(false);
        TFMarca.setEditable(false);

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBNuevo = new javax.swing.JButton();
        jBGrabar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Codigo:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Unidad de medida:");

        jLabel4.setText("Precio:");

        jLabel5.setText("Cantidad:");

        jLabel6.setText("Marca: ");

        jScrollPane1.setViewportView(jTable1);

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

        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
// El armado de la interfaz grafica
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jBNuevo)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBGrabar)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBModificar)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBEliminar)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBSalir))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(TFCodigo)
                                                        .addComponent(TFNombre)
                                                        .addComponent(TFMedida)
                                                        .addComponent(TFPrecio)
                                                        .addComponent(TFCantidad)
                                                        .addComponent(TFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(26, 26, 26)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(TFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(TFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(TFMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(TFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel5)
                                                        .addComponent(TFCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel6)
                                                        .addComponent(TFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jBNuevo)
                                        .addComponent(jBGrabar)
                                        .addComponent(jBModificar)
                                        .addComponent(jBEliminar)
                                        .addComponent(jBSalir))
                                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// Eventos de botones

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) { //Generar codigo para cada nuevo registro
        TFCodigo.setEditable(true);
        TFNombre.setEditable(true);
        TFMedida.setEditable(true);
        TFPrecio.setEditable(true);
        TFCantidad.setEditable(true);
        TFMarca.setEditable(true);
        LimpiarCajasTexto();
        if ( this.jTable1.getRowCount()+1 >= 10) this.TFCodigo.setText("A00" + (this.jTable1.getRowCount() +1));

        else if ( this.jTable1.getRowCount()+1 >= 100) this.TFCodigo.setText("A0" + (this.jTable1.getRowCount() +1));

        else if ( this.jTable1.getRowCount()+1 >= 1000) this.TFCodigo.setText("A" + (this.jTable1.getRowCount() +1));
        else this.TFCodigo.setText("A000" + (this.jTable1.getRowCount() + 1));

        jBGrabar.setEnabled(true); //Al presionar nuevo, se añade el codigo predeterminado y se habilita el boton grabar
        jBModificar.setEnabled(false);
        jBEliminar.setEnabled(false);
    }

    private void jBGrabarActionPerformed(java.awt.event.ActionEvent evt) {//Grabar nuevo articulo
        if (TFCodigo.getText().isEmpty() || TFNombre.getText().isEmpty() || TFMedida.getText().isEmpty() ||
                TFPrecio.getText().isEmpty() || TFCantidad.getText().isEmpty() || TFMarca.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return; // Detener el método si hay campos vacíos
        }
        try {
            DataPrestamo objart = new DataPrestamo();
            objart.setArt_cod(this.TFCodigo.getText());
            objart.setArt_nom(this.TFNombre.getText());
            objart.setArt_uni(this.TFMedida.getText());
            objart.setArt_pre((Double.parseDouble(TFPrecio.getText())));
            objart.setArt_stk(Integer.parseInt(TFCantidad.getText()));
            objart.setArt_marca(this.TFMarca.getText());
            objart.GrabarArticulo();
            ListarArticulos();
            LimpiarCajasTexto();
            JOptionPane.showMessageDialog(null, "Articulo añadido");
            jBGrabar.setEnabled(false);
            jBModificar.setEnabled(true);
            jBEliminar.setEnabled(true);
            TFCodigo.setEditable(true);
            TFNombre.setEditable(false);
            TFMedida.setEditable(false);
            TFPrecio.setEditable(false);
            TFCantidad.setEditable(false);
            TFMarca.setEditable(false);

        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese valores numéricos válidos en Precio y Cantidad", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) { //Modificar datos del articulo recibido
        try {
            DataPrestamo objart = new DataPrestamo();
            objart.setArt_cod(this.TFCodigo.getText());
            objart.setArt_nom(this.TFNombre.getText());
            objart.setArt_uni(this.TFMedida.getText());
            objart.setArt_pre((Double.parseDouble(TFPrecio.getText())));
            objart.setArt_stk(Integer.parseInt(TFCantidad.getText()));
            objart.setArt_marca(this.TFMarca.getText());
            objart.EditarArticulo();
            ListarArticulos();
            JOptionPane.showMessageDialog(null, "Articulo modificado exitosamente", "Modificacion", JOptionPane.INFORMATION_MESSAGE);
            LimpiarCajasTexto();
            TFCodigo.setEditable(true);
            TFNombre.setEditable(false);
            TFMedida.setEditable(false);
            TFPrecio.setEditable(false);
            TFCantidad.setEditable(false);
            TFMarca.setEditable(false);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Seleccione un articulo para editar");
        }
    }

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) { // Eliminar articulo a partir del codigo
        int Res = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar el articulo: " + this.TFCodigo.getText());
        if (this.TFCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione el articulo");
        }
        else if (Res == 0) {
            DataPrestamo objart = new DataPrestamo();
            objart.setArt_cod(this.TFCodigo.getText());
            objart.EliminarArticulo();
            LimpiarCajasTexto();
            ListarArticulos();
            JOptionPane.showMessageDialog(null, "Articulo Eliminado");
            TFNombre.setEditable(false);
            TFMedida.setEditable(false);
            TFPrecio.setEditable(false);
            TFCantidad.setEditable(false);
            TFMarca.setEditable(false);

        }
    }

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {
        int r = JOptionPane.showConfirmDialog(null, "Esta seguro?");
        if (r == 0) {
            System.exit(0);
        }
    }

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) { //Obtener datos del articulo a partir de tenerlo presionado con el mouse
        TFCodigo.setEditable(true);
        TFNombre.setEditable(true);
        TFMedida.setEditable(true);
        TFPrecio.setEditable(true);
        TFCantidad.setEditable(true);
        TFMarca.setEditable(true);
        int rec = this.jTable1.getSelectedRow();
        this.TFCodigo.setText(jTable1.getValueAt(rec, 0).toString());
        this.TFNombre.setText(jTable1.getValueAt(rec, 1).toString());
        this.TFMedida.setText(jTable1.getValueAt(rec, 2).toString());
        this.TFPrecio.setText(jTable1.getValueAt(rec, 3).toString());
        this.TFCantidad.setText(jTable1.getValueAt(rec, 4).toString());
        this.TFMarca.setText(jTable1.getValueAt(rec, 5).toString());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulario_Articulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_Articulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_Articulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_Articulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario_Articulo().setVisible(true);
            }
        });
    }

    private javax.swing.JTextField TFCantidad;
    private javax.swing.JTextField TFCodigo;
    private javax.swing.JTextField TFMarca;
    private javax.swing.JTextField TFMedida;
    private javax.swing.JTextField TFNombre;
    private javax.swing.JTextField TFPrecio;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGrabar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
}
