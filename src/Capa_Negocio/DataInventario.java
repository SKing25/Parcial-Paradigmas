package Capa_Negocio;

import java.util.ArrayList;
import java.sql.*;
import Capa_Datos.Conexion;

import javax.swing.*;

public class DataInventario {
    //INVENTARIO;
    private String Iv_codigo;
    private String Iv_nombre;
    private int Iv_stk;
    private String Iv_Estado;

    public String EliminarInventario() { //metodo
        {
            Conexion objmod = new Conexion(); /*Crea una instancia de clase conexion
				para interactuar con la base de datos*/
            String cad = "delete from inventario where Iv_codigo='" + this.getIv_codigo() + "'";/*Genera una
				consulta de eliminacion obteniendo el codigo del articulo*/
            return objmod.Ejecutar(cad); /*Retorna la instancia
				para que llame al metodo Ejecutar*/
        }
    }

    public String GrabarInventario() //Metodo añadir al inventario
    {
        Conexion objmod= new Conexion(); /*Crear instancia de de clase conexion*/
        String cad="Insert into inventario values('"+this.getIv_codigo()+
                "','"+this.getIv_nombre()+"','"+ this.getIv_stk()+"','"
                +this.getIv_Estado()+"')";/* Insertar valores
						a la base de datos llamando a todos sus parametros*/
        return objmod.Ejecutar(cad); /*Retorna la instancia
				para que llame al metodo Ejecutar*/
    }

    public String EditarInventario()/*Metodo de edicion de registro*/
    {
        Conexion objmod = new Conexion();/*Crear una instancia de conexion para interactuar con la base de datos*/
        String cad= "update inventario set Iv_nombre='"+this.getIv_nombre()+
                "',Iv_stk='"+this.getIv_stk()+"',Iv_Estado='"+this.getIv_Estado()+"'";/*Cad carga la consulta de actualizar obteniendo los valores
					del registro*/
        return objmod.Ejecutar(cad); /*Retorna la instancia y se llama al metodo ejecutar*/
    }
    //Mostrar TABLA ARTICULOS DESPUES DE CADA CONSULTA
    public ArrayList<DataInventario> ListaInventario()/*Array list donde se muestran los
		productos*/
    {
        ArrayList lista3= new ArrayList(); /*Se crea una arraylist vacio*/
        try
        {
            Conexion objmod= new Conexion(); /*Crea una instancia de conexion para interactuar con la
				base de datos*/
            ResultSet tabla= objmod.Listar("select * from inventario");/*Instancia un objeto result set y se listan los
				objetos*/
            DataInventario objinv; //recorrer el result set y se llena la lista
            while(tabla.next()) //Recorre el result set fila a fila
            {
                objinv = new DataInventario(); //Se crea un nuevo onjeto Data articulo para almacenar datos por fila
                objinv.setIv_codigo(tabla.getString("Iv_codigo"));
                objinv.setIv_nombre(tabla.getString("Iv_nombre"));
                objinv.setIv_stk(tabla.getInt("Iv_stk"));
                objinv.setIv_Estado(tabla.getString("Iv_Estado"));
                lista3.add(objinv); //Se agrega el objeto a la lista

            }
        }//Manejo de errores
        catch (SQLException e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return lista3;//Mostrar lista con articulos obtenidos
        /*Getters y Setters para las consultas por dato*/
    }

    public String pedirarticulo() {
        //metodo para que le reste 1 cuando se pida el articulo (se cree un prestamo)

        Conexion objmod = new Conexion();

        String cad = "UPDATE inventario SET Iv_stk = Iv_stk - 1 WHERE Iv_codigo = '" + this.getIv_codigo() + "'";

        return objmod.Ejecutar(cad);
    }

    public String devolverArticulo(){
        //metodo para que le sume 1 a la cantidad en stock cuando se devuelva el articulo (elimine el prestamo)

        Conexion objmod = new Conexion();

        String cad = "UPDATE inventario SET Iv_stk = Iv_stk + 1 WHERE Iv_codigo = '" + this.getIv_codigo() + "'";

        return objmod.Ejecutar(cad);
    }

    public String getIv_codigo() {
        return Iv_codigo;
    }

    public void setIv_codigo(String iv_codigo) {
        this.Iv_codigo = iv_codigo;
    }

    public String getIv_nombre() {
        return Iv_nombre;
    }

    public void setIv_nombre(String iv_nombre) {
        this.Iv_nombre = iv_nombre;
    }

    public int getIv_stk() {
        return Iv_stk;
    }

    public void setIv_stk(int iv_stk) {
        this.Iv_stk = iv_stk;
    }

    public String getIv_Estado() {
        return Iv_Estado;
    }

    public void setIv_Estado(String iv_Estado) {
        this.Iv_Estado = iv_Estado;
    }
}
