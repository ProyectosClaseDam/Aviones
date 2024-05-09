package ejercicioAeropuerto;

public class VuelosInternacionales extends Vuelos 
{
	public VuelosInternacionales(String origen, String destino, int dia, int mes, int duracionHoras,
			int duracionMinutos, int horaSalida, int asientos, int minSalida, int cod, int tarifa) {
		super(origen, destino, dia, mes, duracionHoras, duracionMinutos, horaSalida, asientos, minSalida, cod);
		this.tarifa=tarifa;
		this.asientos=210;
		this.asientosBus=16;
		this.asientosCen=26;
		this.asientosPas=116;
		this.asientosTur=140;
		this.asientosVent=68;
		this.asientosPremiu=42;
		this.asientosPrim=12;
	}


	enum tipoClases
	{
		bussines,
		turista,
		premium,
		primera
	}
	enum tipoAsiento
	{
		ventana,
		pasillo, 
		centro
	}
	
	private int tarifa;
	private int asientos;
	private int asientosBus;
	private int asientosTur;
	private int asientosPremiu;
	private int asientosPrim;
	private int asientosVent;
	private int asientosPas;
	private int asientosCen;
	

	@Override
	public double calcularPrecio(int precioBase, int añadido) 
	{
		return precioBase+(añadido*0.5);
	}
}
