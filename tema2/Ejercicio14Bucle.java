package tema2;
import java.util.Scanner;
//Programa que pida 5 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros.

public class Ejercicio14Bucle {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int iCont = 1; //Variable que use en bucle while
		double iMediaP = 0; //Variable que suma todos los numeros positivos
		int iNumP = 0; //Variable que cuenta la cantidad de numeros positivos
		double iMediaN = 0; //Lo mismo que la positiva
		int iNumN = 0; //Lo mismo que la positiva
		int iCeros = 0; //Cuenta la cantidad de ceros
		int iNum; //Numero que mete el usuario
		while(iCont<=5) //Bucle que cuenta hasta 5
		{
			System.out.print("Introduce un numero: ");
			iNum = sc.nextInt();
			if(iNum==0) //comprobar si el numero que ha introducido es 0
				iCeros += 1;
			else if(iNum<0) //comprobar si el numero que ha introducido es negativo
			{
				iMediaN += iNum;
				iNumN ++;
			}
			else //El numero tiene que ser positivo por descarte
			{
				iMediaP += iNum;
				iNumP ++;
			}
			iCont ++;//Sumo uno al contador para moverme en el bucle
		}
		
		double dMediaN = (iNumN>0)? (double) iMediaN/iNumN:0;
		double dMediaP = (iNumP>0)? (double) iMediaP/iNumP:0;
		
		System.out.println("La media de los numeros negativos es: " + dMediaN); //Resultados
		System.out.println("La media de los numeros positivos es: " + dMediaP);
		System.out.println("Has metido esta cantidad de ceros: " + iCeros);
		sc.close();
	}

}