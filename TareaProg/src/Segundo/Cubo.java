package Segundo;

public class Cubo {
	private String	drop;
	private String	textura;
	private int		capacitybyStacks;
	private int		durabilidad;
	private int		espacioEnArea;
	
	public String getDrop() {
		return drop;
	}
	public void setDrop(String drop) {
		this.drop = drop;
	}
	public String getTextura() {
		return textura;
	}
	public void setTextura(String textura) {
		this.textura = textura;
	}
	public int getCapacitybyStacks() {
		return capacitybyStacks;
	}
	public void setCapacitybyStacks(int capacitybyStacks) {
		this.capacitybyStacks = capacitybyStacks;
	}
	public int getDurabilidad() {
		return durabilidad;
	}
	public void setDurabilidad(int durabilidad) {
		this.durabilidad = durabilidad;
	}
	public int getEspacioEnArea() {
		return espacioEnArea;
	}
	public void setEspacioEnArea(int espacioEnArea) {
		this.espacioEnArea = espacioEnArea;
	}
	public Cubo(){
		
	}
		
	
	public Cubo (String drop,String textura, int capacitybyStacks, int durabilidad, int espacionEnArea ){
		this.capacitybyStacks = capacitybyStacks;
		this.drop = drop;
		this.durabilidad = durabilidad;
		this.espacioEnArea = espacionEnArea;
		this.textura = textura;
		
	}
	public void  mostrarDatos(){
		System.out.println("\n***Cubo "+drop+"***"+"\nCapacidad por stack "+capacitybyStacks+"\nDrop "+drop
				+"\nDurabilidad"+durabilidad+"\nEspacio en area "+espacioEnArea+"\ntextura "+textura);
	}
	
}
