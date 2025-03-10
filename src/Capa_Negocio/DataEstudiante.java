package Capa_Negocio;
import java.util.ArrayList;
import java.sql.*;
import Capa_Datos.Conexion;

public class DataEstudiante {
    private int Es_identificacion;
    private String Es_nombre_completo;
    private String Es_carrera;
    private String Es_Email;

    public String EliminarEstudiante() { //metodo
        {
            Conexion objmod = new Conexion(); /*Crea una instancia de clase conexion
				para interactuar con la base de datos*/
            String cad = "delete from estudiante where Es_identificacion='" + this.getEs_identificacion() + "'";/*Genera una
				consulta de eliminacion obteniendo el codigo del articulo*/
            return objmod.Ejecutar(cad); /*Retorna la instancia
				para que llame al metodo Ejecutar*/
        }
    }

    public String GrabarEstudiante() //Metodo añadir al inventario
    {
        Conexion objmod= new Conexion(); /*Crear instancia de de clase conexion*/
        String cad="Insert into estudiante values('"+this.getEs_identificacion()+
                "','"+this.getEs_nombre_completo()+"','"+ this.getEs_carrera()+"','"
                +this.getEs_Email()+"')";/* Insertar valores
						a la base de datos llamando a todos sus parametros*/
        return objmod.Ejecutar(cad); /*Retorna la instancia
				para que llame al metodo Ejecutar*/
    }

    public String EditarEstudiante()/*Metodo de edicion de registro*/
    {
        Conexion objmod = new Conexion();/*Crear una instancia de conexion para interactuar con la base de datos*/
        String cad= "update estudiante set Es_nombre_completo='"+this.getEs_nombre_completo()+
                "',Es_carrera='"+this.getEs_carrera()+"',Es_Email='"+this.getEs_Email()+"'"+"where Es_identificacion='"+this.getEs_identificacion()+"'";/*Cad carga la consulta de actualizar obteniendo los valores
					del registro*/
        return objmod.Ejecutar(cad); /*Retorna la instancia y se llama al metodo ejecutar*/
    }

    //Mostrar TABLA ARTICULOS DESPUES DE CADA CONSULTA
    public ArrayList<DataEstudiante> ListaEstudiante()/*Array list donde se muestran los
		productos*/
    {
        ArrayList lista4= new ArrayList(); /*Se crea una arraylist vacio*/
        try
        {
            Conexion objmod= new Conexion(); /*Crea una instancia de conexion para interactuar con la
				base de datos*/
            ResultSet tabla= objmod.Listar("select * from estudiante");/*Instancia un objeto result set y se listan los
				objetos*/
            DataEstudiante objest; //recorrer el result set y se llena la lista
            while(tabla.next()) //Recorre el result set fila a fila
            {
                objest = new DataEstudiante(); //Se crea un nuevo onjeto Data articulo para almacenar datos por fila
                objest.setEs_identificacion(tabla.getInt("Es_identificacion"));
                objest.setEs_nombre_completo(tabla.getString("Es_nombre_completo"));
                objest.setEs_carrera(tabla.getString("Es_carrera"));
                objest.setEs_Email(tabla.getString("Es_Email"));
                lista4.add(objest); //Se agrega el objeto a la lista
            }
        }//Manejo de errores
        catch (SQLException e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return lista4;//Mostrar lista con articulos obtenidos
        /*Getters y Setters para las consultas por dato*/
    }

    public int getEs_identificacion() {
        return Es_identificacion;
    }

    public void setEs_identificacion(int es_identificacion) {
        this.Es_identificacion = es_identificacion;
    }

    public String getEs_nombre_completo() {
        return Es_nombre_completo;
    }

    public void setEs_nombre_completo(String es_nombre_completo) {
        this.Es_nombre_completo = es_nombre_completo;
    }

    public String getEs_carrera() {
        return Es_carrera;
    }

    public void setEs_carrera(String es_carrera) {
        this.Es_carrera = es_carrera;
    }

    public String getEs_Email() {
        return Es_Email;
    }

    public void setEs_Email(String es_Email) {
        this.Es_Email = es_Email;
    }
}
