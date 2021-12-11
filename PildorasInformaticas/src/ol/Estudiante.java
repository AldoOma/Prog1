package ol;

public class Estudiante {

	
	private String nombre;
	private int edad;
	private double nota;

	public Estudiante(String nombre, int edad, double nota) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.nota = nota;
	}
	
	public String mostrarDatos () {
		return "El nombre es "+ nombre + " La edad es "+edad+" La nota es "+ nota;
		
	}
	

}
