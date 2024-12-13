package tema1;
import java.util.Scanner;

public class Ejercicio2Entrada {

	public static void main(String[] args) 
	{
		boolean comp = false;
		int num = 0; //declaramos una variable int
		Scanner sc = new Scanner (System.in); // declarar clase que es un escaner
		while(comp==false)
		{
			System.out.print("Escribe un numero del 1 al 10: ");
			num = sc.nextInt ();
			if(num>0 && num<=10)
			{
				comp = true;
			}
		}
		System.out.println("Has elegido el numero: " + num);
		sc.close(); // hay que cerrar la clase
	}

}
