package tema2;
import java.util.Scanner;
/*
 * Pedir tres numeros:
 * -la distancia (en metros) que separa las dos camaras
 * -la velocidad maxima (km/h) del tramo
 * -segundos que ha tardado el vehiculo en recorrer el tramo
 * Tres opciones de salida:
 * -NO si no hay multa
 * -Multa sin puntos si no excede del 20% de vel max
 * -Multa con puntos si excede el 20%
 */

public class Ejercicio19Radar {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int iDistancia;
		int iVelocidadMax;
		int iTiempo;
		System.out.println("Introduce la distancia en metros entre las dos camaras.");
		iDistancia = sc.nextInt();
		System.out.println("Introduce la velocidad maxima en km/h en el tramo.");
		iVelocidadMax = sc.nextInt();
		System.out.println("Introduce el tiempo en segundos que ha tardado en coche.");
		iTiempo = sc.nextInt();
		double dDistancia=(double)iDistancia;
		double dTiempo=(double)iTiempo;
		double dVelocidad=dDistancia/dTiempo/1000*3600;
		if(dVelocidad<iVelocidadMax)
		{
			System.out.println("No hay multa.");
		}
		else if(dVelocidad<iVelocidadMax*1.2)
		{
			System.out.println("Multa sin quitar puntos.");
		}
		else
		{
			System.out.println("Multa quitando puntos.");
		}
	sc.close();
	}

}
