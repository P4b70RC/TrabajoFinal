package Cinemar;

public class Pelicula {
	private String titulo;
	private String descripcion;
	private String categoria;
	private int duracion;
	private String lenguaje;
	private String tipo;
	
	public Pelicula(String titulo, String descripcion, String categoria, int duracion, String lenguaje, String tipo) {
		super();
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.duracion = duracion;
		this.lenguaje = lenguaje;
		this.tipo = tipo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getLenguaje() {
		return lenguaje;
	}

	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}	

}
