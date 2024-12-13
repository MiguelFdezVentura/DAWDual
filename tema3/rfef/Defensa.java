package tema3.rfef;

public class Defensa {
	private String nombre;
	private int edad;
	private int penaltisCometidos;
	private int golesAnotados;
	private int numAsistencias;
	private int faltas;
	private int tarjetasA;
	private int tarjetasR;
	
	/**
	 * @param nombre
	 * @param edad
	 * @param penaltisCometidos
	 * @param golesAnotados
	 * @param numAsistencias
	 * @param faltas
	 * @param tarjetasA
	 * @param tarjetasR
	 */
	public Defensa(String nombre, int edad, int penaltisCometidos, int golesAnotados, int numAsistencias, int faltas,
			int tarjetasA, int tarjetasR) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.penaltisCometidos = penaltisCometidos;
		this.golesAnotados = golesAnotados;
		this.numAsistencias = numAsistencias;
		this.faltas = faltas;
		this.tarjetasA = tarjetasA;
		this.tarjetasR = tarjetasR;
	}


	public Defensa(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
	public int getTarjetasA() {
		return tarjetasA;
	}

	public void setTarjetasA(int tarjetasA) {
		this.tarjetasA = tarjetasA;
	}

	public int getTarjetasR() {
		return tarjetasR;
	}

	public void setTarjetasR(int tarjetasR) {
		this.tarjetasR = tarjetasR;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	public int getNumAsistencias() {
		return numAsistencias;
	}

	public void setNumAsistencias(int numAsistencias) {
		this.numAsistencias = numAsistencias;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public int pentaltisCometidos() {
		return this.penaltisCometidos;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setEdad(int edad) {
		this.edad=edad;
	}
	
	public void setPenaltisCometidos(int penaltisCometidos) {
		this.penaltisCometidos=penaltisCometidos;
	}
	
	public int getGolesAnotados() {
		return golesAnotados;
	}

	public void setGolesAnotados(int golesAnotados) {
		this.golesAnotados = golesAnotados;
	}

	public int getPenaltisCometidos() {
		return penaltisCometidos;
	}

	public void penaltiCometido() {
		this.penaltisCometidos++;
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
		return "Defensa [nombre=" + nombre + ", edad=" + edad + ", penaltisCometidos=" + penaltisCometidos
				+ ", golesAnotados=" + golesAnotados + ", numAsistencias=" + numAsistencias + ", faltas=" + faltas
				+ ", tarjetasA=" + tarjetasA + ", tarjetasR=" + tarjetasR + "]";
	}
}