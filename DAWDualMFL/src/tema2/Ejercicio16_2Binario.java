package tema2;
import java.util.Scanner;
//Convertir a Binario

public class Ejercicio16_2Binario {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String sBinario = "";
		System.out.print("Introduce un numero para convertirlo a binario: ");
		int iNum = sc.nextInt();
		while (iNum>0)
		{
			sBinario = iNum%2 + sBinario;
			iNum/=2;
		}
		System.out.print("El numero en binario es: " + sBinario);
		sc.close();
	}

}
