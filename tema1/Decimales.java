package tema1;
import java.util.Scanner;

public class Decimales {

	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	float nota1;
	float nota2;
	float nota3;
	int media;
	System.out.println("Introduce las tres notas: ");
	nota1 = sc.nextInt();
	nota2 = sc.nextInt();
	nota3 = sc.nextInt();
	media = (int)((nota1 + nota2 + nota3)/3);
	System.out.println("Media con decimales: " + ((nota1 + nota2 + nota3)/3));
	System.out.println("Media sin decimales: " + media);
	sc.close();
	}

}
