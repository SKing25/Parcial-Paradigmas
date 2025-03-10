package Capa_Presentacion;

import javax.swing.*;

public class Formulario_Main extends javax.swing.JFrame {

    public Formulario_Main() {
        initComponents();
        setTitle("Main");
        setLocationRelativeTo(null);
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMInventario = new javax.swing.JMenu();
        jMiInventario = new javax.swing.JMenuItem();
        jMEstudiantes = new javax.swing.JMenu();
        jMiEstudiantes = new javax.swing.JMenuItem();
        jMPrestamos = new javax.swing.JMenu();
        jMiPrestamos = new javax.swing.JMenuItem();
        jMSalir = new javax.swing.JMenu();
        jMiSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SISTEMA DE PRESTAMO DE ARTICULOS");

        jMInventario.setText("Inventario");
        jMiInventario.setText("Inventario");
        jMiInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMiInventarioActionPerformed(evt);
            }});
        jMInventario.add(jMiInventario);
        jMenuBar1.add(jMInventario);

        jMEstudiantes.setText("Estudiantes");
        jMiEstudiantes.setText("Estudiantes");
        jMiEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMiEstudiantesActionPerformed(evt);
            }
        });
        jMEstudiantes.add(jMiEstudiantes);
        jMenuBar1.add(jMEstudiantes);

        jMPrestamos.setText("Prestamos");
        jMiPrestamos.setText("Prestamos");
        jMiPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMiPrestamosActionPerformed(evt);
            }
        });
        jMPrestamos.add(jMiPrestamos);
        jMenuBar1.add(jMPrestamos);

        jMSalir.setText("Salir");
        jMiSalir.setText("Salir");
        jMiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMiSalirActionPerformed(evt);
            }
        });
        jMSalir.add(jMiSalir);
        jMenuBar1.add(jMSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void jMiInventarioActionPerformed(java.awt.event.ActionEvent evt) {
        Formulario_Inventario fi = new Formulario_Inventario();
        fi.setVisible(true);
        fi.setLocationRelativeTo(null);
    }

    private void jMiEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {
        Formulario_Estudiante fe = new Formulario_Estudiante();
        fe.setVisible(true);
        fe.setLocationRelativeTo(null);
    }

    private void jMiPrestamosActionPerformed(java.awt.event.ActionEvent evt) {
        Formulario_Prestamo fp = new Formulario_Prestamo();
        fp.setVisible(true);
        fp.setLocationRelativeTo(null);
    }

    private void jMiSalirActionPerformed(java.awt.event.ActionEvent evt) {
        int r = JOptionPane.showConfirmDialog(null, "Esta seguro?", "Confirmar salir", JOptionPane.YES_NO_OPTION);
        if (r == 0) System.exit(0);
    }

    public static void main(String args[]) {
        Formulario_Main main = new Formulario_Main();
        main.setVisible(true);
    }

    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMEstudiantes;
    private javax.swing.JMenu jMInventario;
    private javax.swing.JMenu jMPrestamos;
    private javax.swing.JMenu jMSalir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMiEstudiantes;
    private javax.swing.JMenuItem jMiInventario;
    private javax.swing.JMenuItem jMiPrestamos;
    private javax.swing.JMenuItem jMiSalir;
}
