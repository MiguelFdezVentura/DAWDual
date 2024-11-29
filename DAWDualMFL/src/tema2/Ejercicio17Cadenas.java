package tema2;

public class Ejercicio17Cadenas {

	public static void main(String[] args) 
	{
		String str1="nombre";
		String str2="nombre";
		String str3=new String("nombre");
		String str4="Nombre";
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);
		System.out.println(str1.equals(str3));
		System.out.println(str1==str3);
		System.out.println(str1.equals(str4));
		System.out.println(str1==str4);
		System.out.println(str1.equalsIgnoreCase(str4));
	}

}
