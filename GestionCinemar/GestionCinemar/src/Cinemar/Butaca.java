package Cinemar;

public class Butaca {

	private char letra;
	private int fila;
	private Cliente espectador;
	
	
	public Butaca(char letra, int fila ) {
		super();
		this.letra = letra;
		this.fila = fila;
		this.espectador = null;
	}


	public char getLetra() {
		return letra;
	}


	public void setLetra(char letra) {
		this.letra = letra;
	}


	public int getFila() {
		return fila;
	}


	public void setFila(int fila) {
		this.fila = fila;
	}


	public Cliente getEspectador() {
		return espectador;
	}


	public void setEspectador(Cliente espectador) {
		this.espectador = espectador;
	}
	
	
	public boolean ocupado() {
		
		return espectador!=null;
	}
	
	
}
