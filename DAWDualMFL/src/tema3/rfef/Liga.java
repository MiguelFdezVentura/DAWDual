package tema3.rfef;

public class Liga {
	private EquipoFutbol equipo1;
	private EquipoFutbol equipo2;
	private EquipoFutbol equipo3;
	private EquipoFutbol equipo4;
	/**
	 * @param equipo1
	 * @param equipo2
	 * @param equipo3
	 * @param equipo4
	 */
	public Liga(EquipoFutbol equipo1, EquipoFutbol equipo2, EquipoFutbol equipo3, EquipoFutbol equipo4) {
		super();
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.equipo3 = equipo3;
		this.equipo4 = equipo4;
	}
	public EquipoFutbol getEquipo1() {
		return this.equipo1;
	}
	public void setEquipo1(EquipoFutbol equipo1) {
		this.equipo1 = equipo1;
	}
	public EquipoFutbol getEquipo2() {
		return this.equipo2;
	}
	public void setEquipo2(EquipoFutbol equipo2) {
		this.equipo2 = equipo2;
	}
	public EquipoFutbol getEquipo3() {
		return this.equipo3;
	}
	public void setEquipo3(EquipoFutbol equipo3) {
		this.equipo3 = equipo3;
	}
	public EquipoFutbol getEquipo4() {
		return this.equipo4;
	}
	public void setEquipo4(EquipoFutbol equipo4) {
		this.equipo4 = equipo4;
	}
	
	public void listarPuntos() {
		System.out.println(this.equipo1.getNombreEquipo() +" tiene: " + this.equipo1.getPuntos() + " puntos.");
		System.out.println(this.equipo2.getNombreEquipo() +" tiene: " + this.equipo2.getPuntos() + " puntos.");
		System.out.println(this.equipo3.getNombreEquipo() +" tiene: " + this.equipo3.getPuntos() + " puntos.");
		System.out.println(this.equipo4.getNombreEquipo() +" tiene: " + this.equipo4.getPuntos() + " puntos.");
	}
	
	@Override
	public String toString() {
		return "Liga [Equipo1=" + equipo1 + ", Equipo2=" + equipo2 + ", Equipo3=" + equipo3 + ", Equipo4=" + equipo4
				+ "]";
	}
}
