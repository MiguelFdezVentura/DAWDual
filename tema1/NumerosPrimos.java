package tema1;
import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {
		
		int cantidad = 0; //Variable cantidad de primos
		while(cantidad==0) 
		{
			System.out.println("Introduce la cantidad de numeros primos que desea calcular: ");
			Scanner sc = new Scanner (System.in); //Creación de un objeto Scanner
			cantidad = sc.nextInt (); //Invocamos un método sobre un objeto Scanner
			System.out.print(cantidad);
			sc.close();
		}
	}

}
