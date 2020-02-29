package evaluacion2;

public class Television extends Electrodomestico {
	
	private int resolucion=20;
	private boolean sintonizadorTDT=false;
    //Metodo heredado por desde clase padre
	@Override
	public double precioFinal() {
		if (resolucion>40) {
			precio=precio*1.30;
		}
		if (sintonizadorTDT==true) {
			precio=precio+50;
		}
		super.precioFinal();
		return precio;
		// TODO Auto-generated method stub	
	}
	//Constructor por defecto
	public Television() {
	
	}
	//Constructor con todos los atributos
	public Television(int precio, String color, char consumoenergetico, int peso, int resolucion,boolean sintonizadorTDT) {
		super(precio, color, consumoenergetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}
	//Metodos Get
	public int getResolucion() {
		return resolucion;
	}
	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	@Override
	public String toString() {
		return "Television precio final unitario=" + precio + ", color=" + super.getColor() + ", consumo energetico=" + super.getConsumo_energetico()+", resolucion="+resolucion
		+", sintonizadorTDT="+ sintonizadorTDT+ ", peso=" + super.getPeso() + "]";
	}
	
	
	
	
	

}
