package tema3.tiendaelecv1;

public class Electrodomesticos {
	
	//Enum
	public enum MARCAS{Bosch, Samsung, LG, Whirpol, Siemens};
	
	//Valores defecto
	protected static final MARCAS MARCA_BASE = MARCAS.Bosch;
	protected static final String MODELO_BASE = "modelo 7200";
	protected static final double PRECIO_ELECTRO = 400;
	protected static final String COLOR_BASE = "gris";
	protected static final double POTENCIA_BASE = 2300;
	protected static final int HORAS_BASE = 1;
	protected static final int DIAS_BASE = 3;
	protected static final double PRECIO_ENERGIA_BASE = 0.40397;
	
	//Atributos private
	private MARCAS eMarca;
	private String sModelo;
	private double dPrecioElectrodom;
	private String sColor;
	
	//Atributos protected
	protected double dPotencia;
	protected int iHoras;
	protected int iDias;
	protected double dPrecioEnergia;
	
	/**
	 * @param eMarca
	 * @param sModelo
	 * @param dPrecioElectrodom
	 */
	public Electrodomesticos(MARCAS eMarca, String sModelo, double dPrecioElectrodom, String sColor) {
		this(eMarca,sModelo,dPrecioElectrodom,sColor,POTENCIA_BASE,HORAS_BASE,DIAS_BASE,PRECIO_ENERGIA_BASE);
	}
	
	public Electrodomesticos(double dPotencia, int iHoras, int iDias, double dPrecioEnergia) {
		this(MARCA_BASE,MODELO_BASE,PRECIO_ELECTRO,COLOR_BASE,dPotencia,iHoras,iDias,dPrecioEnergia);
	}

	/**
	 * @param eMarca
	 * @param sModelo
	 * @param dPrecioElectrodom
	 * @param sColor
	 * @param dPotencia
	 * @param iHoras
	 * @param iDias
	 * @param dPrecioEnergia
	 */
	public Electrodomesticos(MARCAS eMarca, String sModelo, double dPrecioElectrodom, String sColor, double dPotencia,
			int iHoras, int iDias, double dPrecioEnergia) {
		super();
		this.eMarca = eMarca;
		this.sModelo = sModelo;
		this.dPrecioElectrodom = dPrecioElectrodom;
		this.sColor = sColor;
		this.dPotencia = dPotencia;
		this.iHoras = iHoras;
		this.iDias = iDias;
		this.dPrecioEnergia = dPrecioEnergia;
	}

	public Electrodomesticos() {
		this(MARCA_BASE,MODELO_BASE,PRECIO_ELECTRO,COLOR_BASE,POTENCIA_BASE,HORAS_BASE,DIAS_BASE,PRECIO_ENERGIA_BASE);
	}

	public MARCAS geteMarca() {
		return eMarca;
	}

	public void seteMarca(MARCAS eMarca) {
		this.eMarca = eMarca;
	}

	public String getsModelo() {
		return sModelo;
	}

	public void setsModelo(String sModelo) {
		this.sModelo = sModelo;
	}

	public double getdPrecioElectrodom() {
		return dPrecioElectrodom;
	}

	public void setdPrecioElectrodom(double dPrecioElectrodom) {
		this.dPrecioElectrodom = dPrecioElectrodom;
	}

	public String getsColor() {
		return sColor;
	}

	public void setsColor(String sColor) {
		this.sColor = sColor;
	}

	public double getdPotencia() {
		return dPotencia;
	}

	public void setdPotencia(double dPotencia) {
		this.dPotencia = dPotencia;
	}

	public int getiHoras() {
		return iHoras;
	}

	public void setiHoras(int iHoras) {
		this.iHoras = iHoras;
	}

	public int getiDias() {
		return iDias;
	}

	public void setiDias(int iDias) {
		this.iDias = iDias;
	}

	public double getdPrecioEnergia() {
		return dPrecioEnergia;
	}

	public void setdPrecioEnergia(double dPrecioEnergia) {
		this.dPrecioEnergia = dPrecioEnergia;
	}

	@Override
	public String toString() {
		return "Electrodomesticos [eMarca=" + eMarca + ", sModelo=" + sModelo + ", dPrecioElectrodom="
				+ dPrecioElectrodom + ", sColor=" + sColor + ", dPotencia=" + dPotencia + ", iHoras=" + iHoras
				+ ", iDias=" + iDias + ", dPrecioEnergia=" + dPrecioEnergia + "]";
	}
	
	public double consumoAnual() {
		return ((dPotencia/1000)*iHoras*iDias*dPrecioEnergia*52);
	}
	
	public boolean equal(Object otro) {
		Electrodomesticos ElecOtro = (Electrodomesticos) otro;
		if(this.consumoAnual()==ElecOtro.consumoAnual()) {
			return true;
		}else {
			return false;
		}
	}
}
