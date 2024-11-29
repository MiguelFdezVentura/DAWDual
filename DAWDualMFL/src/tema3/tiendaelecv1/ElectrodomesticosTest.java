package tema3.tiendaelecv1;

public class ElectrodomesticosTest {

	public static void main(String[] args) 
	{
		// Crear un objeto de la clase Electrodomesticos utilizando el constructor por defecto
        Electrodomesticos electrodomestico = new Electrodomesticos();
        System.out.println("Electrodomestico (por defecto):");
        System.out.println(electrodomestico);
        System.out.println("Consumo Anual: " + electrodomestico.consumoAnual() + " €");
        
        // Crear un objeto de la clase Electrodomesticos utilizando el constructor por defecto
        Electrodomesticos electrodomestico2 = new Electrodomesticos();
        System.out.println("Electrodomestico (por defecto):");
        System.out.println(electrodomestico2);
        System.out.println("Consumo Anual: " + electrodomestico.consumoAnual() + " €");
        
        // Crear un objeto de la clase Electrodomesticos con parámetros personalizados
        Electrodomesticos electrodomestico3 = new Electrodomesticos(Electrodomesticos.MARCAS.LG, "X1000", 500, "Negro", 2500, 3, 4, 0.35);
        System.out.println("Electrodomestico (personalizado):");
        System.out.println(electrodomestico3);
        System.out.println("Consumo Anual: " + electrodomestico3.consumoAnual() + " €");

        // Crear un objeto de la clase Television utilizando el constructor por defecto
        Television television = new Television();  // Resolución defecto
        System.out.println("Television (por defecto):");
        System.out.println(television);
        System.out.println("Consumo Anual: " + television.consumoAnual() + "€");
        
        // Crear un objeto de la clase Television utilizando el constructor por defecto
        Television television2 = new Television(55);  // Resolución defecto
        System.out.println("Television (por defecto):");
        System.out.println(television2);
        System.out.println("Consumo Anual: " + television2.consumoAnual() + "€");

        // Crear un objeto de la clase Television con parámetros personalizados
        Television television3 = new Television(2500, 3, 4, 0.35, 55);  // Resolución 55 pulgadas
        System.out.println("Television (personalizado):");
        System.out.println(television3);
        System.out.println("Consumo Anual: " + television3.consumoAnual() + " €");
        
        System.out.println("Comparacion Elec1 con Elec2 = " + electrodomestico.equal(electrodomestico2));
        System.out.println("Comparacion Elec1 con Elec3 = " + electrodomestico.equal(electrodomestico3));
        
        System.out.println("Comparacion tv1 con tv2 = " + television.equal(television2));
        System.out.println("Comparacion tv1 con tv3 = " + television.equal(television3));  
	}

}
