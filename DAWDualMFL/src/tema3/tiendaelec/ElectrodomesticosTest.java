package tema3.tiendaelec;

public class ElectrodomesticosTest {

	public static void main(String[] args) 
	{
		// Crear un objeto de la clase Electrodomesticos utilizando el constructor por defecto
        Electrodomesticos electrodomestico = new Electrodomesticos();
        System.out.println("Electrodomestico (por defecto):");
        System.out.println(electrodomestico);
        System.out.println("Consumo Anual: " + electrodomestico.consumoAnual() + " €");

        // Crear un objeto de la clase Electrodomesticos con parámetros personalizados
        Electrodomesticos electrodomestico2 = new Electrodomesticos("LG", "X1000", 500, "Negro", 2500, 3, 4, 0.35);
        System.out.println("Electrodomestico (personalizado):");
        System.out.println(electrodomestico2);
        System.out.println("Consumo Anual: " + electrodomestico2.consumoAnual() + " €");

        // Crear un objeto de la clase Television utilizando el constructor por defecto
        Television television = new Television();  // Resolución defecto
        System.out.println("Television (por defecto):");
        System.out.println(television);
        System.out.println("Consumo Anual: " + television.consumoAnual() + "€");

        // Crear un objeto de la clase Television con parámetros personalizados
        Television television2 = new Television(55);  // Resolución 55 pulgadas
        System.out.println("Television (personalizado):");
        System.out.println(television2);
        System.out.println("Consumo Anual: " + television2.consumoAnual() + " €");
	}

}
