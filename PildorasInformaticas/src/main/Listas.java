package main;

import java.util.*;
import ol.Estudiante;
public class Listas {
	public static void main (String [] args) {
	//	
	//ArrayList <Tipo de dato> Mombre De la lista = new <Tipo de dato again> (parentesis);
		
		ArrayList <Estudiante> ListaEstudiante = new ArrayList<Estudiante>();
		
		ListaEstudiante.add(new Estudiante("Ana", 18, 70));
		ListaEstudiante.add(new Estudiante("Ana", 18, 70));
		ListaEstudiante.add(new Estudiante("Ana", 18, 70));
		ListaEstudiante.add(new Estudiante("Ana", 18, 70));
		ListaEstudiante.add(new Estudiante("Ana", 18, 70));
		ListaEstudiante.add(new Estudiante("Ana", 18, 70));
		ListaEstudiante.set(1, new Estudiante("Aldo", 21, 80));
		
		for (Estudiante e : ListaEstudiante) {
			System.out.println(e.mostrarDatos());
		}
		
	}
	
 }
	
	/*class Empleado{
		public Empleado(String nombre, int edad, double salario) {
			this.nombre = nombre;
			this.edad = edad;
			this.salario = salario;
		}
		
		public String dameDatos() {
			
			return "El empleado se llama "+nombre+ " Tiene "+edad+ " Y un salario de "+salario;
		}
		
		private String nombre;
		private int edad;
		private double salario;
	}*/
	

