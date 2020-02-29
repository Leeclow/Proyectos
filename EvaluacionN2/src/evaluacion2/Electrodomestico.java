package evaluacion2;

public  class Electrodomestico {
	// Declaracion de  constantes
	protected final static int precio_base_const=100000;
	protected final static String color_const="blanco";
	protected final static char consumo_energetico_const='F';
	protected final static int peso_const=5;
	
	//Declaracion de atributos de la clase
	protected double precio; 
	private String color;
	private char consumo_energetico;
	private int peso;
	
	
	// Metodo comprobarConsumoEnergetico
 	public char comprobarConsumoEnergetico() {
 		
		if(consumo_energetico!='A'&consumo_energetico!='B'&consumo_energetico!='C'&consumo_energetico!='D'&consumo_energetico!='E'&consumo_energetico!='F') {
			consumo_energetico=consumo_energetico_const;
		}
		return 0 ;
	}
    // Metodo comprobarColor
	public String comprobarColor() {
		if (color!="blanco"&color!="negro"&color!="rojo"&color!="azul"&color!="gris") {
			color=color_const;
		}
		return color;
	}
	// Metodo precioFinal
	public double precioFinal() {
		
		switch (consumo_energetico) {
		  case 'A':
		    //RECARGA 100
			  precio=precio+100;
		    break;
		  case 'B':
		    //RECARGA 80
			  precio=precio+80;
		    break;
		  case 'C':
		    //RECARGA 60
			  precio=precio+60;
		    break;
		  case 'D':
		   //RECARGA 50
			  precio=precio+50;
		    break;
		  case 'E':
			//RECARGA 30
			  precio=precio+30;
		    break;
		  case 'F':
			//RECARGA 10
			  precio=precio+10;
		    break;
		}
		
		if (peso>=0 & peso<=19) {
			//RECARGA 10
			precio=precio+10;
		}
		if (peso>=20 && peso<=49) {
			//RECARGA 50
			precio=precio+50;
		}
		if (peso>=50 & peso<=79) {
			//RECARGA 80
			precio=precio+80;
		}
		if (peso>80) {
			//RECARGA 100
			precio=precio+100;
		}
		return precio;
	}
    //Constructor con valores constantes
	public Electrodomestico() {
		this(precio_base_const, color_const, consumo_energetico_const, peso_const);	
	}
	//constructor sin valores constantes
	public Electrodomestico(int precio, String color, char consumo_energetico, int peso) {
	
		this.precio = precio;
		this.color = color;
		this.consumo_energetico = consumo_energetico;
		this.peso = peso;
	}
	//Metodos GET
	public double getPrecio() {
		return precio;
	}
	public String getColor() {
		return color;
	}
	public char getConsumo_energetico() {
		return consumo_energetico;
	}
	public int getPeso() {
		return peso;
	}
	public void setConsumo_energetico(char consumo_energetico) {
		this.consumo_energetico = consumo_energetico;
	}
	@Override
	public String toString() {
		return "Electrodomestico [precio=" + precio + ", color=" + color + ", consumo_energetico=" + consumo_energetico
				+ ", peso=" + peso + "]";
	}
	
	
	
	
	

}
