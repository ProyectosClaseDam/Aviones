package ejercicioAeropuerto;

public class VuelosNacionales extends Vuelos 
{
	public VuelosNacionales(String origen, String destino, int dia, int mes, int duracionHoras, int duracionMinutos,
			int horaSalida, int asientos, int minSalida, int cod, int tarifa) {
		super(origen, destino, dia, mes, duracionHoras, duracionMinutos, horaSalida, asientos, minSalida, cod);
		this.tarifa=tarifa;
		this.asientos=110;
		this.asientosBus=20;
		this.asientosCen=26;
		this.asientosExtr=8;
		this.asientosPas=40;
		this.asientosTur=90;
		this.asientosVent=36;
	}



	enum tipoClases
	{
		bussines,
		turista
	}
	enum tipoAsiento
	{
		ventana,
		pasillo, 
		centro,
		extraEspacio
	}
	
	private int tarifa;
	private int asientos;
	private int asientosBus;
	private int asientosTur;
	private int asientosVent;
	private int asientosPas;
	private int asientosCen;
	private int asientosExtr;
	


	@Override
	public double calcularPrecio(int precioBase, int añadido) 
	{
		return precioBase+(añadido*0.7);
	}
}
