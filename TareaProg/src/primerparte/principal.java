package primerparte;

public class principal {
	public static void main (String [] args){
		
		Espada hierro = new Espada();
		hierro.setDamage(4.5);
		hierro.setDurabilidad(80);
		hierro.setTextura("Hierro");
		System.out.println("Damage "+hierro.getDamage()+"\nDurabilidad "+hierro.getDurabilidad()+" \nTipo "+hierro.getTextura());
		
	}

}
