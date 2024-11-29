package tema2;

import java.util.Scanner;

public class Examen24OctubreCorregido {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	    int iOpcion; //variable para: Almacenar la opcion del usuario
	    int j; //variable para: El bucle while
	    do //para repetir el programa hasta que el usuario salga
	    {
	        System.out.print("\nMenu del programa del alumno Miguel Fernández-Ventura López");
	        System.out.print("\nOpción 1: Usando el bucle for pinta los números pares del 2 al 20.");
	        System.out.print("\nOpción 2: Usando while pinta los impares del 21 al 1 en orden decreciente.");
	        System.out.print("\nOpción 3: Salir");
	        System.out.print("\nEliga su opción: ");
	        iOpcion = sc.nextInt(); //Preguntar al usuario la opcion
	        System.out.print("Has seleccionado la opción " + iOpcion + "\n");
	        switch(iOpcion) //Para seleccionar las opciones
	        {
	            case 1 ->
	            {
	                for(int i = 2; i<=20; i+=2) //bucle del 2 al 20 voy de dos en dos
	                {
	                	System.out.print(i + " ");
	                }
	                System.out.print("\n");
	            }
	            case 2 ->
	            {
	                j = 21;
	                while(j>=1) //bucle del 21 al 1 voy de dos en dos
	                {
	                	System.out.print(j + " ");
	                    j-=2;
	                }
	                System.out.print("\n");
	            }
	            case 3 ->
	            {
	                System.out.print("Saliendo del programa...\n");
	            }
	            default ->
	            {
	                System.out.print("No has seleccionado ninguna opcion.\n"); //Por si no selecciona ninguna opcion disponible
	            }
	        }
	    }while(iOpcion != 3); //Compruebo si vuelvo a ejecutar el programa
	    sc.close();
	}

}
