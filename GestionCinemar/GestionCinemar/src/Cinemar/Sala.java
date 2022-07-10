package Cinemar;

public class Sala {
	
	
		private int numero;
		private Butaca capacidad[][];
		private Funcion funcion;
		private boolean tipo;
		private boolean estado;
		private String carteelra;
		
		public Sala( int numero,int filas, int columnas,Funcion funcion,boolean tipo, boolean estado) {
			
			capacidad =new Butaca[filas][columnas];
			
			this.numero=numero;		
			this.funcion= funcion;
			this.tipo=tipo;
			this.estado=estado;
			butacas();
			
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public Butaca[][] getCapacidad() {
			return capacidad;
		}

		public void setCapacidad(Butaca[][] capacidad) {
			this.capacidad = capacidad;
		}

		public Funcion getFuncion() {
			return funcion;
		}

		public void setFuncion(Funcion funcion) {
			this.funcion = funcion;
		}

		public boolean isTipo() {
			return tipo;
		}

		public void setTipo(boolean tipo) {
			this.tipo = tipo;
		}

		public boolean isEstado() {
			return estado;
		}

		public void setEstado(boolean estado) {
			this.estado = estado;
		}

		public String getCarteelra() {
			return carteelra;
		}

		public void setCarteelra(String carteelra) {
			this.carteelra = carteelra;
		}

		private void butacas() {
			
			int fila=capacidad.length;
			for(int i=0;i<capacidad.length;i++) {
				for (int j=0;j<capacidad.length;j++) {
					capacidad[i][j]=new Butaca((char)('A'+j),fila);
					
				}
				fila--;
			}
		}
		
		public boolean hayLugar() {
			
			boolean lugar =false;
			for(int i=0;i<capacidad.length &&!lugar;i++) {
				for (int j=0;j<capacidad.length &&!lugar;j++) {
					
					if(!capacidad[i][j].ocupado()) {
						lugar=true;
						
					}
					
				}
				
			}
			
		return lugar;
		}	
		
		public boolean ubicacionButaca (int fila, char columna) {
			
			return capacidad[capacidad.length-fila][columna-'A'].ocupado();
		}
		
		
		
	}

