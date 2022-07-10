package CinemarSql;

import java.sql.SQLException;

import Cinemar.Cuenta;

public class Login {

	public static void main(String[] args) throws SQLException {
		
		
	
		
		Cuenta cuenta =new Cuenta ("MaxMar@gmail.com","159753");
		boolean l= cuenta.verificar();
		if (l==true) {
			System.out.println("Puede ingresar");
		}else {
			System.out.println("corre o pass incorrecto");
		}
		
	}

}
