package tema1;

public class Conversion {

	public static void main(String[] args) {
		//Tipos basicos
		byte edad = 30;
		double altura = 1.75;
		char inicial = 'A';
		boolean esEstudiante = true;
		System.out.println("Edad=" + edad);
		System.out.println("Altura=" + altura);
		System.out.println("Inicial=" + inicial);
		System.out.println("esEstudiante=" + esEstudiante);
		//Conversion de 32 a 64
		int iNum = 3;
		double dNum=iNum;
		System.out.println("dNum=" + dNum);
		//Conversion de 64 a 32
		double dNum2 = 5.8;
		int iNum2 = (int)dNum2;
		System.out.println("iNum=" + iNum2);
	}

}
