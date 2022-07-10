package Cinemar;

import java.sql.ResultSet;
import java.sql.SQLException;

import CinemarSql.Coneccion;

public class Cuenta {
	private String Correo;
	private String pass;
	private Coneccion conn;
	
	public Cuenta() {
		
	}
	public Cuenta(String correo, String contrasenia) {
		super();
		this.Correo = correo;
		this.pass = contrasenia;
		this.conn=new Coneccion();
	}
	public String getCorreo() {
		return Correo;
	}
	public void setCorreo(String correo) {
		Correo = correo;
	}
	public String getContrasenia() {
		return pass;
	}
	public void setpass(String pass) {
		this.pass = pass;
	}
	
public ResultSet Ingresar() throws SQLException {
		
		String sql="select * from Usuario where correo="+"'"+this.Correo+"'"+" and pass="+"'"+this.pass+"'"+";";
		
		ResultSet r=this.conn.devolverConsulta(sql);
		
		return r;
		
	}
}
