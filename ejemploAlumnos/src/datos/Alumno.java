package datos;

public class Alumno {
	private String nombre;
	private String dni;
	private int nota;
	
	public Alumno(String nombre, String dni, int nota) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.nota = nota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "alumno [nombre=" + nombre + ", dni=" + dni + ", nota=" + nota
				+ "]";
	}
	
	
}
