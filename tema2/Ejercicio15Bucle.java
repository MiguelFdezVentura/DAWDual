package tema2;

import java.util.Scanner;

//Programa que pida 5 sueldos. Mostrar la suma, la media y cuántos hay mayores de 1000€
public class Ejercicio15Bucle {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int iCont = 1; //contador para moverme en el bucle
		double iSueldo = 0; //suma de todos los sueldos
		int iCantS = 0; //cantidad de los sueldos
		int iMil = 0; //cantidad de sueldos por encima de mil
		int iNum; //numero que introduce el usuario
		do
		{
			System.out.print("Introduce un sueldo: ");
			iNum = sc.nextInt();
			if(iNum>=1000) //comprobar si es mayor o igual que 1000
				iMil ++;
			if(iNum>=0)
			{
				iSueldo += iNum;
				iCantS ++;
			}
			else
			{
				System.out.println("Has introducido un valor erroneo. ");
			}
			iCont ++;
		}while(iCont<=5); //bucle que va del 1 al 5
		System.out.println("La media de los " + iCantS + " sueldos que has introducido es: " + (iSueldo/iCantS));
		System.out.println("Hay " + iMil + " sueldos por arriba de mil. ");
		sc.close();
	}

}
