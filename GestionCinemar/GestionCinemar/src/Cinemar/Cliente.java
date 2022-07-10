package Cinemar;
import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.Scanner;

import CinemarSql.Coneccion;

public class Cliente {
		
	

	

		Scanner t=new Scanner(System.in);
		Coneccion conn=new Coneccion();
		private String[][] matrizResultado;
		
		private Persona u;
		public Cliente (Persona u) throws SQLException {

			this.u=u;
			System.out.println("Menu Administrador");
			System.out.println("1 Crear una reserva.");
			System.out.println("2 Modificar una reserva.");// ya no la quiero reserva
			System.out.println("3 Observar mis reservas.");// select where idUsario
			System.out.println("4 Ver el histórico de mis entradas."); 
		
			
			int op=t.nextInt();
			
			switch(op) {
			case 1:
				this.crearReserva();
				
				break;
				
			case 2:
				
				
				
				break;
			case 3:
				
		
				break;
			case 4: 
				

				break;
			case 5: 
				break;
			case 6:
				break;
			case 7:
				
				
			}
			
		}
		
		public void crearReserva() throws SQLException {
			
			System.out.println("--BIENVENIDO  A CONTINUACION MOSTRAREMOS LAS CARTELERAS DISPONIBLES");
			int id=0;
			int idSala=0;
			int idReserva=0;
			String sql="select idCartelera,Nombre,Hora,Numero from cartelera inner join Peliculas \n"
					+ "using(idPelicula) inner join Salas using(idSala);";
			
			
			ResultSet r=conn.devolverConsulta(sql);
			
			System.out.println("id|\t Pelicuala|\t Hora|\t Numero de sala|\t");
			
			while(r.next()) {
				
				System.out.print(r.getInt("idCartelera")+"\t");
				System.out.print(r.getString("Nombre")+"\t");
				System.out.print(r.getString("Hora")+"\t");
				System.out.print(r.getString("Numero")+"\t");
				
			}
			
			System.out.println("seleccione el id de la Cartelera elegida");
			
			id=t.nextInt();
			
			//agrego una reserva 
			String add="insert into Reservas values(null,"+u.getIdUsuario()+","+id+","+1+");";
			conn.EjecutarConsulta(add);
			
			System.out.println("Ingrese la cantidad de entradas que desea reservar");
			int cant=t.nextInt();

			//traigo la reserva
			r=conn.devolverConsulta("select Max(idReserva) as max from Reservas where idUsuario="+u.getIdUsuario()+";");
			idReserva= r.getInt("max");
			
			
			
			
			r=conn.devolverConsulta("select idSala from cartelera where idCartelera="+id+";");
			if(r.next()) {
				idSala=r.getInt("idSala");
			}
			
			for(int i=1;i<=cant;i++) {
			r=conn.devolverConsulta("select idButaca,Nombre from Butacas where idSala="+idSala+" and idEstado_Butaca=1;");
			
			System.out.println(" idButaca|\t Nombre|\t");
			while(r.next()) {
				System.out.print(r.getInt("idButaca")+"\t");
				System.out.print(r.getString("Nombre"));
			}
			System.out.println("Ingrese el id de la Butaca");
			int idButaca=t.nextInt();
			
			//cambio butaca a no disponible
			conn.EjecutarConsulta("UPDATE `Cine`.`Butacas` SET `idEstado_Butaca` = '2' WHERE (`idButaca` = "+idButaca+");");
			
			
			conn.EjecutarConsulta("insert into Reserva_x_Butacas values("+idReserva+","+idButaca+")");
			
			
			}
			
			
		}
	}
	
	
