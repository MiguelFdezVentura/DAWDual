package tema3.rfef;

public class Centrocampista {
	private String nombre;
	private int edad;
	private int numAsistencias;
	private int golesAnotados;
	private int faltas;
	private int tarjetasA;
	private int tarjetasR;

	/**
	 * @param nombre
	 * @param edad
	 * @param numAsistencias
	 * @param golesAnotados
	 * @param faltas
	 * @param tarjetasA
	 * @param tarjetasR
	 */
	public Centrocampista(String nombre, int edad, int numAsistencias, int golesAnotados, int faltas, int tarjetasA,
			int tarjetasR) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.numAsistencias = numAsistencias;
		this.golesAnotados = golesAnotados;
		this.faltas = faltas;
		this.tarjetasA = tarjetasA;
		this.tarjetasR = tarjetasR;
	}
	
	public Centrocampista(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public int gettarjetasR() {
		return tarjetasR;
	}

	public void settarjetasR(int tarjetasR) {
		this.tarjetasR = tarjetasR;
	}

	public int getTarjetasA() {
		return tarjetasA;
	}

	public void setTarjetasA(int tarjetasA) {
		this.tarjetasA = tarjetasA;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public int getNumAsistencias() {
		return this.numAsistencias;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setEdad(int edad) {
		this.edad=edad;
	}
	
	public void setNumAsistencias(int NumAsistencias) {
		this.numAsistencias=NumAsistencias;
	}
	
	public int getGolesAnotados() {
		return golesAnotados;
	}

	public void setGolesAnotados(int golesAnotados) {
		this.golesAnotados = golesAnotados;
	}

	public void asistencia(){
		this.numAsistencias++;
	}
	
	public void golAnotado() {
		this.golesAnotados++;
	}
	
	public void falta() {
		this.faltas++;
	}
	
	public void tarjetaA() {
		this.tarjetasA++;
	}
	
	public void tarjetaR() {
		this.tarjetasR++;
	}

	@Override
	public String toString() {
		return "Centrocampista [nombre=" + nombre + ", edad=" + edad + ", numAsistencias=" + numAsistencias
				+ ", golesAnotados=" + golesAnotados + ", faltas=" + faltas + ", tarjetasA=" + tarjetasA
				+ ", tarjetasR=" + tarjetasR + "]";
	}
}
