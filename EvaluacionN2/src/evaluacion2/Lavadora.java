package evaluacion2;

public class Lavadora extends Electrodomestico {

	//atributo constante
	protected final static int carga_const=5;
	//atributo de la clase
	private int carga;
	//Metodo con sobreescritura
	@Override
	public double precioFinal() {
		if (carga>30) {
			precio=precio+50;
			super.precioFinal();
		}
		return precio;
	}
	//Constructor por defecto
		public Lavadora() {
			
		}
    //Constructor con atributos heredados
	public Lavadora(int precio, String color, char consumo_energetico, int peso,int carga) {
		super(precio, color, consumo_energetico, peso);
		this.carga = carga;
	}
	public int getCarga() {
		return carga;
	}
	@Override
	public String toString() {
		return "Lavadora precio final unitario=" + precio + ", color=" + super.getColor() + ", consumo energetico=" + super.getConsumo_energetico()+", carga="+carga
				+ ", peso=" + super.getPeso() + "]";
	}
    
	

	

	

	
		
}
	
	

	
	
	

	  
	 
	 

