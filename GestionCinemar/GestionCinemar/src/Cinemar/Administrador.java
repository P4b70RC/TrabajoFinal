package Cinemar;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import CinemarSql.Coneccion;


public class Administrador {
	
	
	
	

	

		Scanner t=new Scanner(System.in);
		Coneccion conn=new Coneccion();
		private String[][] matrizResultado;
		
		public Administrador(Persona u) throws SQLException {

			System.out.println("Menu Administrador");
			System.out.println("1 Ver listado Salas");
			System.out.println("2 Crear una sala con la película.");
			System.out.println("3 Modificar una sala");
			System.out.println("4 Eliminar una sala.");
			System.out.println("5 Ver reservas de todos los clientes.");
			System.out.println("6 Ver reservas de un cliente en particular.");
			System.out.println("7 Modificar descuentos.");
		
			
		

			
			int op=t.nextInt();
			
			switch(op) {
			case 1:
				
				verSalas();
				break;
				
			case 2:
				this.crearCartelera();
				break;
			case 3:
				
				this.modificarSala();
				break;
			case 4: 
				
				this.eliminarSala();
				break;
			case 5: 
				break;
			case 6:
				break;
			case 7:
				
				
			}
			
		}
		
		public void eliminarSala() throws SQLException {
			
			int id=0;
			int confirm=0;
			String sql="select idCartelera,Nombre,Hora,idSala from cartelera inner\n"
					+ "join Peliculas using(idPelicula);";
			
			ResultSet r=conn.devolverConsulta(sql);
			System.out.println("id|\t Nombre Pelicula|\t Hora|\t sala");
			
			while(r.next()) {
				
				System.out.println(r.getInt("idCartelera")+"\t");
				System.out.println(r.getString("Nombre")+"\t");
				System.out.println(r.getString("Hora")+"\t");
				System.out.println(r.getInt("idSala")+"\t");
			}
			
			System.out.println("Seleccione el id de la Cartlera a modificar");
			id=t.nextInt();
		
			System.out.println("Esta seguro de eliminar 1-SI 0-NO");
			confirm=t.nextInt();
			
			if(confirm==1) {
				sql="delete from cartelera where idCartelera="+id+";";
				conn.EjecutarConsulta(sql);
				System.out.print("Cartelera eliminada con exito");
			}
		}
		public void modificarSala() throws SQLException {
			
			int id=0;
			int idP=0;
			String sql="select idCartelera,Nombre,Hora,idSala from cartelera inner\n"
					+ "join Peliculas using(idPelicula);";
			
			ResultSet r=conn.devolverConsulta(sql);
			System.out.println("id|\t Nombre Pelicula|\t Hora|\t sala");
			
			while(r.next()) {
				
				System.out.println(r.getInt("idCartelera")+"\t");
				System.out.println(r.getString("Nombre")+"\t");
				System.out.println(r.getString("Hora")+"\t");
				System.out.println(r.getInt("idSala")+"\t");
			}
			
			System.out.println("Seleccione el id de la Cartlera a modificar");
			id=t.nextInt();
			
			System.out.print("Seleccione la pelicula nueva");
			
			r=conn.devolverConsulta("select * from Peliculas;");
			System.out.println("id|\t Nombre|\t Duracion");
			
			while(r.next()) {
				
				System.out.print(r.getInt("idPelicula")+"\n");
				System.out.print(r.getString("Nomobre")+"\n");
				System.out.print(r.getString("Duracion")+"\n");
				
			}
			System.out.println("Ingrese el id de la nueva Pelicula");
			idP=t.nextInt();
			
			
			sql="UPDATE `Cine`.`cartelera` SET `idPelicula` = "+idP +" WHERE (`idCartelera` = "+id+");";
			conn.EjecutarConsulta(sql);
			
			System.out.print("Cartelera actualizada");
			
		}
		
		public void crearCartelera() throws SQLException {
			
			int idSala=0;
			int idP=0;
			String Horario=null;
			System.out.println("Esta por crear una cartelera");
			
			System.out.println("Seleccione la sala");
			
			ResultSet r=conn.devolverConsulta("select idSala,Numero,Capacidad,Tipo from Salas inner join Tipo_Salausing(idTipo_Sala);");
			
			System.out.println("idSala|\t Numero|\t Capacidad|\t Tipo\t");
			
			while(r.next()) {
				System.out.print(r.getInt("idSala")+"\t");
				System.out.print(r.getString("Numero")+"\t");
				System.out.print(r.getString("Capacidad")+"\t");
				System.out.print(r.getString("Tipo")+"\t");
				System.out.print(r.getString("\n"));
			}
			System.out.println("Ingrese el id de la sala");
			idSala=t.nextInt();
			
			
			System.out.println("Seleccione la pelicula");
			r=conn.devolverConsulta("select * from Peliculas;");
			System.out.println("idPelicula|\t Nombre|\t Duracion");
			
			while(r.next()) {

				System.out.print(r.getInt("idPelicula")+"\t");
				System.out.print(r.getString("Nombre")+"\t");
				System.out.print(r.getString("Duracion")+"\t");
				
			}
			System.out.println("selecciona el id de la pelicula");
			idP=t.nextInt();
			
			System.out.println("Ingrese el horario");
			Horario=t.next();
			
			String sql="insert into cartelera values (null,"+idP+","+"'"+Horario+"'"+","+idSala+");";
			conn.EjecutarConsulta(sql);
			
			System.out.println("Cartelera creada con exito");
			
		}
		
		public void verSalas() throws SQLException {
			
			String sql="select * from Salas inner join Tipo_Sala using(idTipo_Sala);";
			ResultSet r=conn.devolverConsulta(sql);
			
			System.out.println("idSala| \t Numero|\t Capacidad|\t Tipo");
			
			while(r.next()) {
			
				System.out.println(r.getInt("idSala")+"\t"+r.getString("Numero")+"\t"+
				r.getString("Capacidad")+"\t"+r.getString("tipo"));
			}
		}
		
	}


