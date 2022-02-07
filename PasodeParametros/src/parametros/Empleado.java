package parametros;

public class Empleado {
	
	private String dni;
	private String nombre;
	private int edad;
	
	public String getDNI() {
		return dni;
	}

	public void setDNI(String dni) {
		this.dni = dni;
	}

	public Empleado(String dni, String nombre, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
	}

}
