package tema2;
import java.util.Scanner;

public class Ejercicio20CincoNumeros {

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int iSumaP = 0;
	int iCantP = 0;
	int iSumaN = 0;
	int iCantN = 0;
	int iCantCeros = 0;
	int iNum = 0;
	for(int i = 1; i<=5; i++) //pido 5 veces un numero
	{
		System.out.println("Introduce un numero: ");
		iNum = sc.nextInt();
		if(iNum<0) //compruebo si es negativo
		{
			iCantN++;
			iSumaN += iNum;
		}
		else if(iNum>0) //compruebo si es positivo
		{
			iCantP++;
			iSumaP += iNum;
		}
		else //tiene que ser cero si no ha entrado en los if anteriores
		{
			iCantCeros++;
		}
	}
	double dMediaP = iCantP==0? (double)0:(iSumaP/iCantP); //uso ternario para evitar dividir entre cero
	double dMediaN = iCantN==0? (double)0:(iSumaN/iCantN);
	System.out.println("La cantidad de ceros introducidos:" + iCantCeros); //muestro los resultados
	System.out.println("La media positvos:" + dMediaP);
	System.out.println("La media negativos:" + dMediaN);
	sc.close();
	}

}
