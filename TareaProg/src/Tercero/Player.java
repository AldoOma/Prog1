package Tercero;

public class Player {

		private	int		salud;
		private int		id;
		private String		skin;
		private String	name;
		private int		hambre;
		//private List	inventario;
		private	double	altura;
		private String	constectura;
		private String	clase;
		
		/*public Player(){
			
		}
		public int getSalud() {
			return salud;
		}
		public void setSalud(int salud) {
			this.salud = salud;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getSkin() {
			return skin;
		}
		public void setSkin(String skin) {
			this.skin = skin;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getHambre() {
			return hambre;
		}
		public void setHambre(int hambre) {
			this.hambre = hambre;
		}
		public double getAltura() {
			return altura;
		}
		public void setAltura(double altura) {
			this.altura = altura;
		}
		public String getConstectura() {
			return constectura;
		}
		public void setConstectura(String constectura) {
			this.constectura = constectura;
		}
		public String getClase() {
			return clase;
		}
		public void setClase(String clase) {
			this.clase = clase;
		}/**/
		
		
		public	Player(int salud, int id,int hambre,String skin, String name,double altura, String constectura, String clase ){
			
			this.altura = altura;
			this.clase = clase;
			this.constectura =constectura;
			this.hambre =  hambre;
			this.id = id;
			this.name = name;
			this.salud = salud;
			this.skin = skin;
			
		}
		public String MostrarDatos(){
			return "Nombre "+name+"\nSalud "+salud+"\nAltura "+altura+"\nConstectura "+constectura+"\nHambre "+hambre+"\nID "+id+"\nSkin "+skin
					+"\nClase "+clase;
		}
		 
		
}
