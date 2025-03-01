package Capa_Datos; //nombre del paquete
import java.sql.*; // Importa la biblioteca de conexion entre java y sql

public class Conexion {
	private final String url="jdbc:mysql://localhost:3306/PrestamoLaboratorio"; //url a para conectar de manera local
	private final String user="root";// Usuario root
	private final String pwd="";// contraseña constante para acceder a la base de datos
	
	public Conexion()//constructor por defecto de la clase
	{}
	
	public ResultSet Listar(String Cad) { /*metodo publico que devuelve un objeto
	ResultSet(que almacena el resultado de una consulta SQL*/

		
		try 
		{
			Connection cn = DriverManager.getConnection(url, user, pwd);/*Establece una conexion con la base
			de datos*/
			PreparedStatement da= cn.prepareStatement(Cad);/*Preparar consulta SQL*/
			ResultSet tbl = da.executeQuery(); /*Ejecuta la consulta en la base de datos*/
			return tbl;
			/*Retorna el result set*/
		}
		catch(SQLException e) /*Manejo de errores, imprimir error pero no detener programa*/
		{
			javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
			return null;
		}
	}
	
	public String Ejecutar(String Cad) /*Metodo para ejecutar la consulta SQL*/
	{
		try 
		{
			Connection cn = DriverManager.getConnection(url,user,pwd); /*Establece conexion*/
			PreparedStatement da = cn.prepareStatement(Cad); /*Prepara consulta mediante la declaracion Cad*/
			int r = da.executeUpdate(); //ejecuta actualizacion
			return null;
		}
		catch (SQLException e)
		{
			javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
			return "Error"+ e.getMessage();
			
		}
		
	}
}
