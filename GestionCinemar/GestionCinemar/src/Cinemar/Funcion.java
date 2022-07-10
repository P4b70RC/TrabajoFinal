package Cinemar;

import java.util.Date;

public class Funcion {
	
	private String idfun;
	private Date horario;
	private Date fecha;
	private Pelicula pelicula;
	private Sala sala;
	private double precio;
	
	

	public Funcion(String idfun, Date horario, Date fecha, Pelicula pelicula, Sala sala, double precio) {
		super();
		this.idfun = idfun;
		this.horario = horario;
		this.fecha = fecha;
		this.pelicula = pelicula;
		this.sala = sala;
		this.precio = precio;
	}
	
public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}
	

	public String getIdfun() {
		return idfun;
	}

	public void setIdfun(String idfun) {
		this.idfun = idfun;
	}

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

}
