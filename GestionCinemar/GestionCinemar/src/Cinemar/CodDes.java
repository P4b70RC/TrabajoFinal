package Cinemar;

public class CodDes {
	private int idTarjeta;
	private boolean frecuencia;
	private boolean descuento;
	
	public CodDes(int idTarjeta, boolean frecuencia, boolean descuento) {
		super();
		this.idTarjeta = idTarjeta;
		this.frecuencia = frecuencia;
		this.descuento = descuento;
	}
	
	
	public int getIdTarjeta() {
		return idTarjeta;
	}

	public void setIdTarjeta(int idTarjeta) {
		this.idTarjeta = idTarjeta;
	}

	public boolean getFrecuencia() {
		return frecuencia;
	}
	public void setFrecuencia(boolean frecuencia) {
		this.frecuencia = frecuencia;
	}
	public boolean isDescuento() {
		return descuento;
	}
	public void setDescuento(boolean descuento) {
		this.descuento = descuento;
	}
	 
	
 

}
