package Cinemar;

import java.util.ArrayList;

public class Reserva {
	
	private int numReserva;
	private Funcion funcion;
	private Sala sala;
	private Pelicula pelicula;
	private Butaca  butaca;
	private double subtotal;
	private ArrayList<CodDes> descuento;
	
	
	
	
	
	
	
	public Reserva(int numReserva, Funcion funcion, Sala sala, Pelicula pelicula, Butaca butaca, double subtotal,
			ArrayList<CodDes> descuento) {
		super();
		this.numReserva = numReserva;
		this.funcion = funcion;
		this.sala = sala;
		this.pelicula = pelicula;
		this.butaca = butaca;
		this.subtotal = subtotal;
		this.descuento = descuento;
	}
	public int getNumReserva() {
		return numReserva;
	}
	public void setNumReserva(int numReserva) {
		this.numReserva = numReserva;
	}
	public Funcion getFuncion() {
		return funcion;
	}
	public void setFuncion(Funcion funcion) {
		this.funcion = funcion;
	}
	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	public Pelicula getPelicula() {
		return pelicula;
	}
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	public Butaca getButaca() {
		return butaca;
	}
	public void setButaca(Butaca butaca) {
		this.butaca = butaca;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public ArrayList<CodDes> getDescuento() {
		return descuento;
	}
	public void setDescuento(ArrayList<CodDes> descuento) {
		this.descuento = descuento;
	}
	
	
	

}
