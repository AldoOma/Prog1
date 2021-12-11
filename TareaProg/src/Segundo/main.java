package Segundo;

public class main {
	public static void main (String [] args){
		
		Cubo CuboDiamante = new Cubo ();
		CuboDiamante.setCapacitybyStacks(64);
		CuboDiamante.setDrop("Diamantitos");
		CuboDiamante.setDurabilidad(10);
		CuboDiamante.setEspacioEnArea(3);
		CuboDiamante.setTextura("Diamante.png");
		System.out.println("***Cubo Diamante***\nCapacidad por stack "+CuboDiamante.getCapacitybyStacks()+"\nDrop "+CuboDiamante.getDrop()
				+"\nDurabilidad"+CuboDiamante.getDurabilidad()+"\nEspacio en area "+CuboDiamante.getEspacioEnArea()+"\ntextura "+CuboDiamante.getTextura());
		
		Cubo CuboHierro = new Cubo("Hierro", "Hierro.png", 64, 5, 3);
		CuboHierro.mostrarDatos();
	}
}
