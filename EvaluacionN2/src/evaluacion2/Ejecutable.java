package evaluacion2;



public class Ejecutable {

	public static void main(String[] args) {
		//Arreglo de Electrodomestico de 10 posiciones
		Electrodomestico electrodomestico[] = new Electrodomestico[10];
		Lavadora lavadora = new Lavadora();
		
	
		//Creacion de objetos Lavadora
		electrodomestico[0] = new Lavadora(110000,"12345", 'j', 10, 50);
		electrodomestico[1] = new Lavadora(120000, "negro", 'B',15,40);
		electrodomestico[2] = new Lavadora(130000,"azul", 'c',25,  45);
		electrodomestico[3] = new Lavadora(140000,"rojo", 'D',45,  55);
		electrodomestico[4] = new Lavadora(150000,"gris", 'E',55,  65);
		
		//Creacion de objetos Television
		electrodomestico[5] = new Television(100000, "blanco", 'F', 55, 20, false);
        electrodomestico[6] = new Television(100000, "negro", 'A', 65,21, true);
		electrodomestico[7] = new Television(100000, "azul", 'B', 15, 62, false);
		
		//Creacion de objetos Electrodomestico
	    electrodomestico[8] = new Electrodomestico(100000, "rojo", 'c', 45);
	    electrodomestico[9]	= new Electrodomestico(1100000, "gris", 'D', 85);	
	    
	   
	    System.out.println("************LAVADORA***********************************************************************************************************");
		double precioFinalLavadora=0;
		double acumlav=0;
		char up;
		for (int i = 0; i <5; i++) {
			electrodomestico[i].comprobarColor();
			up = Character.toUpperCase(electrodomestico[i].getConsumo_energetico());
			electrodomestico[i].setConsumo_energetico(up);
			electrodomestico[i].comprobarConsumoEnergetico();
		    precioFinalLavadora=electrodomestico[i].precioFinal();
		    acumlav+=precioFinalLavadora;
		    System.out.println(electrodomestico[i]);
		}
		System.out.println("******************************************************************************************************************************");
		 System.out.println("Precio total de lavadoras="+acumlav);
		 System.out.println("************TELEVISION********************************************************************************************************");
		 double precioFinaltelevision=0;
		 double acumtele=0;
		 for (int i = 5; i <8; i++) {
				electrodomestico[i].comprobarColor();
				up = Character.toUpperCase(electrodomestico[i].getConsumo_energetico());
				electrodomestico[i].setConsumo_energetico(up);
				electrodomestico[i].comprobarConsumoEnergetico();
				precioFinaltelevision=electrodomestico[i].precioFinal();
				acumtele+=precioFinaltelevision;
			    System.out.println(electrodomestico[i]);
			}
		 System.out.println("******************************************************************************************************************************");
		 System.out.println("Precio total de televisores="+acumtele);
		 System.out.println("*****ELECTRODOMESTICO*********************************************************************************************************"); 
		 //Electrodomestico
		 double precioFinalelectrodomestico=0;
		 double acumelectro=0;
		 for (int i = 8; i <10; i++) {
				electrodomestico[i].comprobarColor();
				up = Character.toUpperCase(electrodomestico[i].getConsumo_energetico());
				electrodomestico[i].setConsumo_energetico(up);
				electrodomestico[i].comprobarConsumoEnergetico();
				precioFinalelectrodomestico=electrodomestico[i].precioFinal();
				acumelectro+=precioFinalelectrodomestico;
			    System.out.println(electrodomestico[i]);
			}
		 System.out.println("******************************************************************************************************************************");
		 System.out.println("Precio total de electrodomestico="+acumelectro);
		 System.out.println("******************************************************************************************************************************"); 
		 System.out.println("******************************************************************************************************************************");
		 System.out.println("Valor Total de todos los Electrodomesticos="+(acumtele+acumlav+acumelectro));
		 System.out.println("******************************************************************************************************************************");
		 
	}

}
