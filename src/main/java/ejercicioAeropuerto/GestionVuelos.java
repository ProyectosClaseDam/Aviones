package ejercicioAeropuerto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GestionVuelos 
{
	Scanner scan = new Scanner(System.in);
	ArrayList<VuelosInternacionales> listaVuelosI;
	ArrayList<VuelosNacionales> listaVuelosN;
	
	GestionVuelos()
	{
		listaVuelosI=new ArrayList();
		listaVuelosN=new ArrayList();
	}
	
	public void añadirVuelo(ArrayList<Vuelos> lista, Vuelos nuevoVuelo)
	{
		lista.add(nuevoVuelo);
	}
	
	public VuelosInternacionales crearVueloI()
	{
		String origen, destino, cambiarDh;
		int dia, mes, duracionHoras, duracionMinutos, horaSalida, asientosLibres, minSalida, cod, tarifa;
		VuelosInternacionales nuevo;
		
		System.out.println("Desde donde es el vuelo: ");
		origen=scan.next();
		System.out.println("Cual es el destino del vuelo: ");
		destino=scan.next();
		System.out.println("Dia del vuelo (formato dd/mm): ");
		cambiarDh=scan.next();
		char[] numeros = cambiarDh.toCharArray();
		dia=Character.getNumericValue(numeros[0])*10+Character.getNumericValue(numeros[1]);
		mes=Character.getNumericValue(numeros[3])*10+Character.getNumericValue(numeros[4]);
		System.out.println("A que hora sale el vuelo (formato hh:mm)");
		cambiarDh=scan.next();
		char[] horas = cambiarDh.toCharArray();
		horaSalida=Character.getNumericValue(horas[0])*10+Character.getNumericValue(horas[1]);
		minSalida=Character.getNumericValue(horas[3])*10+Character.getNumericValue(horas[4]);
		System.out.println("Duracion del vuelo (formato hh:mm)");
		cambiarDh=scan.next();
		char[] duracion = cambiarDh.toCharArray();
		duracionHoras=Character.getNumericValue(duracion[0])*10+Character.getNumericValue(duracion[1]);
		duracionMinutos=Character.getNumericValue(duracion[3])*10+Character.getNumericValue(duracion[4]);
		asientosLibres=0;
		System.out.println("Introduce el codigo del vuelo: ");
		cod=scan.nextInt();
		System.out.println("Introduce la tarifa para este vuelo: ");
		tarifa=scan.nextInt();
		
		nuevo = new VuelosInternacionales(origen, destino, dia, mes, duracionHoras, duracionMinutos, horaSalida, asientosLibres, minSalida, cod, tarifa);
		nuevo.setAsientosLibres(nuevo.getAsientos());		
		
		return nuevo;
	}
	
	public VuelosNacionales crearVueloN()
	{
		String origen, destino, cambiarDh;
		int dia, mes, duracionHoras, duracionMinutos, horaSalida, asientosLibres, minSalida, cod, tarifa;
		VuelosNacionales nuevo;
		
		System.out.println("Desde donde es el vuelo: ");
		origen=scan.next();
		System.out.println("Cual es el destino del vuelo: ");
		destino=scan.next();
		System.out.println("Dia del vuelo (formato dd/mm): ");
		cambiarDh=scan.next();
		char[] numeros = cambiarDh.toCharArray();
		dia=Character.getNumericValue(numeros[0])*10+Character.getNumericValue(numeros[1]);
		mes=Character.getNumericValue(numeros[3])*10+Character.getNumericValue(numeros[4]);
		System.out.println("A que hora sale el vuelo (formato hh:mm)");
		cambiarDh=scan.next();
		char[] horas = cambiarDh.toCharArray();
		horaSalida=Character.getNumericValue(horas[0])*10+Character.getNumericValue(horas[1]);
		minSalida=Character.getNumericValue(horas[3])*10+Character.getNumericValue(horas[4]);
		System.out.println("Duracion del vuelo (formato hh:mm)");
		cambiarDh=scan.next();
		char[] duracion = cambiarDh.toCharArray();
		duracionHoras=Character.getNumericValue(duracion[0])*10+Character.getNumericValue(duracion[1]);
		duracionMinutos=Character.getNumericValue(duracion[3])*10+Character.getNumericValue(duracion[4]);
		asientosLibres=0;
		System.out.println("Introduce el codigo del vuelo: ");
		cod=scan.nextInt();
		System.out.println("Introduce la tarifa para este vuelo: ");
		tarifa=scan.nextInt();
		
		nuevo = new VuelosNacionales(origen, destino, dia, mes, duracionHoras, duracionMinutos, horaSalida, asientosLibres, minSalida, cod, tarifa);
		nuevo.setAsientosLibres(nuevo.getAsientos());		
		
		return nuevo;
	}
 
	public void verVuelos(ArrayList<Vuelos> lista)
	{
		System.out.println(lista);
	}

	public void eliminarVuelo(ArrayList<Vuelos> lista, int cod)
	{
		Vuelos vuelo;
		boolean encontrado=false;
		int pos;
		Iterator<Vuelos> iterator = lista.iterator();
		
		while(iterator.hasNext()&&!encontrado)
		{
			vuelo=iterator.next();
			if (vuelo.getCod()==cod)
			{
				encontrado=true;
				iterator.remove();
			}
		}
	
		if (!encontrado)
		{
			System.out.println("No existe ningun vuelo de este tipo con el codigo " + cod);
		}
	}

}
