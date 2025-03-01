package Capa_Negocio;
import java.sql.Time;
import java.util.ArrayList;
import java.sql.*;
import Capa_Datos.Conexion;

public class DataPrestamo {
	private String Pr_codigo;
	private String Pr_salon;
	private Time Pr_hora_prestamo;
	private String Iv_codigo;
	private int Es_identificacion;

	public String EliminarPrestamo() {
		Conexion objmod = new Conexion();
		String cad = "delete from prestamo where Pr_codigo='" + this.getPr_codigo() + "'";
		return objmod.Ejecutar(cad);
	}

	public String GrabarPrestamo() //Metodo añadir al inventario
	{
		Conexion objmod= new Conexion(); /*Crear instancia de de clase conexion*/
		String cad="Insert into prestamo values('"+this.getPr_codigo()+
				"','"+this.getPr_salon()+"','"+ this.getPr_hora_prestamo()+"','"
				+this.getIv_codigo()+"','"
				+this.getEs_identificacion()+"')";/* Insertar valores
						a la base de datos llamando a todos sus parametros*/
		return objmod.Ejecutar(cad); /*Retorna la instancia
				para que llame al metodo Ejecutar*/
	}

	public String EditarPrestamo() {
		Conexion objmod = new Conexion();
		String cad = "update prestamo set Pr_salon='" + this.getPr_salon() +
				"', Pr_hora_prestamo='" + this.getPr_hora_prestamo() +
				"', Iv_codigo='" + this.getIv_codigo() +
				"', Es_identificacion='" + this.getEs_identificacion() +
				"' where Pr_codigo='" + this.getPr_codigo() + "'";
		return objmod.Ejecutar(cad);
	}

	public ArrayList<DataPrestamo> ListaPrestamo() {
		ArrayList<DataPrestamo> lista = new ArrayList<>();
		try {
			Conexion objmod = new Conexion();
			ResultSet tabla = objmod.Listar("select * from prestamo");
			DataPrestamo objprestamo;
			while (tabla.next()) {
				objprestamo = new DataPrestamo();
				objprestamo.setPr_codigo(tabla.getString("Pr_codigo"));
				objprestamo.setPr_salon(tabla.getString("Pr_salon"));
				objprestamo.setPr_hora_prestamo(tabla.getTime("Pr_hora_prestamo"));
				objprestamo.setIv_codigo(tabla.getString("Iv_codigo"));
				objprestamo.setEs_identificacion(tabla.getInt("Es_identificacion"));
				lista.add(objprestamo);
			}
		} catch (SQLException e) {
			javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
		}
		return lista;
	}

	// Getters y Setters
	public String getPr_codigo() {
		return Pr_codigo;
	}

	public void setPr_codigo(String pr_codigo) {
		this.Pr_codigo = pr_codigo;
	}

	public String getPr_salon() {
		return Pr_salon;
	}

	public void setPr_salon(String pr_salon) {
		this.Pr_salon = pr_salon;
	}

	public Time getPr_hora_prestamo() {
		return Pr_hora_prestamo;
	}

	public void setPr_hora_prestamo(Time pr_hora_prestamo) {
		this.Pr_hora_prestamo = pr_hora_prestamo;
	}

	public String getIv_codigo() {
		return Iv_codigo;
	}

	public void setIv_codigo(String iv_codigo) {
		this.Iv_codigo = iv_codigo;
	}

	public int getEs_identificacion() {
		return Es_identificacion;
	}

	public void setEs_identificacion(int es_identificacion) {
		this.Es_identificacion = es_identificacion;
	}
}
