package tema3.profesor;
import java.util.Calendar;

public class ProfesorInterinoFernandezVenturaLopez extends ProfesorFernandezVenturaLopez{
	private Calendar cFechaInicioInterinidad;

	/**
	 * @param sDniProfesor
	 * @param sNombre
	 * @param sApellidos
	 * @param iEdad
	 * @param asignaturas
	 */
	public ProfesorInterinoFernandezVenturaLopez(String sDniProfesor, String sNombre, String sApellidos, int iEdad, modulo asignaturas, Calendar cFechaInicioInterinidad) {
		super(sDniProfesor, sNombre, sApellidos, iEdad, asignaturas);
		// TODO Auto-generated constructor stub
		this.cFechaInicioInterinidad=cFechaInicioInterinidad;
	}
	
	public void importeNomina(float fSueldoBase, float fComplementos) {
		//this.fNomina = fSueldoBase+fComplementos-100;
		super.importeNomina(fSueldoBase, fComplementos, 100f);
	}

	@Override
	public String toString() {
		return "ProfesorInterinoFernandezVenturaLopez [cFechaInicioInterinidad=" + cFechaInicioInterinidad.getTime()
				+ ", toString()=" + super.toString() + "]";
	}
}
