package tema1;

public class Ejercicio1Var 
{
	//esto es un comentario
	/*
	 * esto es un comentario en varias lineas
	 */
	public static void main(String[] args)
	{
		System.out.println(3);
		System.out.println(1234);
		
		String nombre = "ada"; //Variable texto
		System.out.println("El nombre es: " + nombre);
		
		int myNum = 15; //Variable numero entero
		System.out.println("El numero es: " + myNum);
		myNum = 16; //Cambiar variable
		System.out.println("El numero es: " + myNum);
		
		int x = 1;
		int y = 2;
		int z = 3;
		System.out.println(x+y+z); //Si todo son numeros los suma
		System.out.println("" +x+y+z);
		
		final double PI=3.141592;
		System.out.println(PI);
	}

}
