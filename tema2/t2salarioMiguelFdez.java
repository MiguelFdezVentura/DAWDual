package tema2;
import java.util.Scanner;

public class t2salarioMiguelFdez {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int horas = 0;
		int tarifa = 0;
		double salarioBruto = 0;
		double impuestos = 0;
		System.out.println("Introduce el numero de horas que has trabajado esta semana: ");
		horas = sc.nextInt();
		System.out.println("Introduce la tarifa por hora: ");
		tarifa = sc.nextInt();
		if (horas < 0)
			System.out.println("Error de valor horas. ");
		else if (horas <= 35)
			salarioBruto = horas * tarifa;
		else
			salarioBruto = (35 * tarifa) + ((horas - 35) * tarifa * 1.5);
		if (salarioBruto < 0)
			System.out.println("");
		else if (salarioBruto <= 500)
			impuestos = 0;
		else if (salarioBruto <= 900)
			impuestos = (salarioBruto - 500) * 0.25;
		else
			impuestos = (((salarioBruto - 900) * 0.45) + (400 * 0.25));
		System.out.println("El salario bruto es: " + salarioBruto + "\nLos impuestos son: " + impuestos + "\nEl salario netos es (salario bruto - impuestos): " + (salarioBruto - impuestos));
		sc.close();
	}

}
