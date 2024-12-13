package tema3.tiendaelecv1;

public class Television extends Electrodomesticos{
	private static final int RESOLUCION_BASE = 32;
	private int iResolucion;
	
	/**
	 * @param dPotencia
	 * @param iHoras
	 * @param iDias
	 * @param dPrecioEnergia
	 */
	public Television(double dPotencia, int iHoras, int iDias, double dPrecioEnergia, int iResolucion) {
		super(dPotencia, iHoras, iDias, dPrecioEnergia);
		// TODO Auto-generated constructor stub
		this.iResolucion = iResolucion;
	}

	/**
	 * @param iResolucion
	 */
	public Television(int iResolucion) {
		super();
		this.iResolucion = iResolucion;
	}
	
	public Television() {
		super();
		this.iResolucion = RESOLUCION_BASE;
	}
	
	public int getiResolucion() {
		return iResolucion;
	}
	
	public void setiResolucion(int iResolucion) {
		this.iResolucion = iResolucion;
	}

	@Override
	public String toString() {
		return "Television [iResolucion=" + iResolucion + ", dPotencia=" + dPotencia + ", iHoras=" + iHoras + ", iDias="
				+ iDias + ", dPrecioEnergia=" + dPrecioEnergia + "]";
	}
	
	public double consumoAnual(){
		return (super.consumoAnual()*1.2);
	}
	
	public boolean equal(Object otro) {
		Television ElecOtro = (Television) otro;
		if(this.consumoAnual()==ElecOtro.consumoAnual()) {
			return true;
		}else {
			return false;
		}
	}
}
