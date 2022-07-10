package CinemarSql;

import java.sql.ResultSet;
import java.sql.SQLException;

import Cinemar.Administrador;
import Cinemar.Cliente;
import Cinemar.Cuenta;
import Cinemar.Persona;

public class test {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		
		Cuenta cuenta =new Cuenta ("MaxMar@gmail.com","159753");
		ResultSet r = cuenta.Ingresar();
		if (r.next()) {

			if (r.getInt("idRol") == 1) {
				System.out.println("soy administrador");
				Persona u = new Persona(r.getInt("idUsuario"), r.getString("Nombre"), r.getString("Apellido"),
						r.getString("dni"), r.getString("correo"),r.getString("pass"), r.getInt("idDescuento"),
						r.getInt("idRol"), r.getInt("idDomicilio"));
				
				Cliente m= new Cliente(u);
				

			} else {
				System.out.print("soy usuario comun");
				Persona u = new Persona(r.getInt("idUsuario"), r.getString("Nombre"), r.getString("Apellido"),
						r.getString("dni"), r.getString("correo"),r.getString("pass"), r.getInt("idDescuento"),
						r.getInt("idRol"), r.getInt("idDomicilio"));

			}
		} else {
			System.out.println("Usuario o contraseña incorrecto");
		}

	}
}
