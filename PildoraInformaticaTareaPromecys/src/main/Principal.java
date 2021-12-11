package main;

public class Principal {

	public static void main(String[] args) {

		
		System.out.println("Primer video de pildoras informatica");
		
		/* Tipos de datos  
		 * Entero:
		 * -> Int
		 * -> Short
		 * -> Long 
		 * Coma flotante (Decimales)
		 * -> Float
		 * -> Double
		 * Char Para carecteres
		 * Logicos
		 * -> boolean
		 */
		 
			byte edad;
			edad = 35;
			System.out.println("Imprimiendo edad "+edad);
			//operadores
			int a = 5;
			
			int b;
			
			b = 7;
			
			int c = a +b;//operador de suma
			//int c = a - c;//operador de resta
			//int c = a * b;//operador de multiplicacion
			//int c = a / b; //operador de division
			//c++;
			//c += 6;
			//c -=6;
			
			System.out.println(c);
			
			final double apulgadas = 2.54;
			double cm = 6;
			
			double resultado = cm/apulgadas;
			System.out.println("en "+ cm +"cm hay "+ resultado + " pulgadas");
			
	}

}
