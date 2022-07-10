package Cinemar;

public class Persona {
	private int idUsuario;
	private String Nombre;
	private String Apellido;
	private String dni;
	private String correo;
	private String pass;
	private int idDescuento;
	private int idRol;
	private int idDomicilio;
	public Persona(int idUsuario, String nombre, String apellido, String dni, String correo, String pass,
			int idDescuento, int idRol, int idDomicilio) {
		super();
		this.idUsuario = idUsuario;
		Nombre = nombre;
		Apellido = apellido;
		this.dni = dni;
		this.correo = correo;
		this.pass = pass;
		this.idDescuento = idDescuento;
		this.idRol = idRol;
		this.idDomicilio = idDomicilio;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getIdDescuento() {
		return idDescuento;
	}
	public void setIdDescuento(int idDescuento) {
		this.idDescuento = idDescuento;
	}
	public int getIdRol() {
		return idRol;
	}
	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}
	public int getIdDomicilio() {
		return idDomicilio;
	}
	public void setIdDomicilio(int idDomicilio) {
		this.idDomicilio = idDomicilio;
	}
	
	
	
	
}