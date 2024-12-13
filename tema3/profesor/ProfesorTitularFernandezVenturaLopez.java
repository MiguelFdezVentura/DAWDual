package tema3.profesor;

public class ProfesorTitularFernandezVenturaLopez extends ProfesorFernandezVenturaLopez{
	private int iAñosAntiguedad;

	/**
	 * @param sDniProfesor
	 * @param sNombre
	 * @param sApellidos
	 * @param iEdad
	 * @param asignaturas
	 */
	public ProfesorTitularFernandezVenturaLopez(String sDniProfesor, String sNombre, String sApellidos, int iEdad,modulo asignaturas,int iAñosAntiguedad) {
		super(sDniProfesor, sNombre, sApellidos, iEdad, asignaturas);
		// TODO Auto-generated constructor stub
		this.iAñosAntiguedad = iAñosAntiguedad;
	}
	
	public void importeNomina(float fSueldoBase,float fComplementos) {
		//this.fNomina = fSueldoBase+fComplementos-10*this.iAñosAntiguedad;
		super.importeNomina(fSueldoBase, fComplementos, this.iAñosAntiguedad*10);
	}

	@Override
	public String toString() {
		return "ProfesorTitularFernandezVenturaLopez [iAñosAntiguedad=" + iAñosAntiguedad + ", toString()="
				+ super.toString() + "]";
	}
}
