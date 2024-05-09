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
	
	public void añadirVueloN(Vuelos nuevoVuelo)
	{
		listaVuelosN.add((VuelosNacionales) nuevoVuelo);
	}
	
	public void añadirVueloI(Vuelos nuevoVuelo)
	{
		listaVuelosI.add((VuelosInternacionales) nuevoVuelo);
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
		
		System.out.println("Desde donde es el vuelo: \n");
		origen=scan.nextLine();
		System.out.println("Cual es el destino del vuelo: \n");
		destino=scan.nextLine();
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
 
	public void verVuelosN(ArrayList<VuelosNacionales> lista)
	{
		VuelosNacionales vuelos;
		Iterator<VuelosNacionales> iterator = lista.iterator();
		
		System.out.println("Origen:			Destino:		Fecha:		Hora:		Duracion:		Cod:		");
		while(iterator.hasNext())
		{
			vuelos=iterator.next();
			System.out.println(vuelos.getOrigen() + "			" + vuelos.getDestino() + "			" + vuelos.getDia() + "/" + vuelos.getMes() + 
				"			" + vuelos.getHoraSalida() + ":" + vuelos.getMinSalida() + "			" + vuelos.getDuracionHoras() + ":" + 
					vuelos.getDuracionMinutos() + "			 " + vuelos.getCod());
		}
	}
	
	public void verVuelosI(ArrayList<VuelosInternacionales> lista)
	{
		VuelosInternacionales vuelos;
		Iterator<VuelosInternacionales> iterator = lista.iterator();
		
		System.out.println("Origen:			Destino:		Fecha:		Hora:		Duracion:		Cod:		");
		while(iterator.hasNext())
		{
			vuelos=iterator.next();
			System.out.println(vuelos.getOrigen() + "			" + vuelos.getDestino() + "			" + vuelos.getDia() + "/" + vuelos.getMes() + 
				"			" + vuelos.getHoraSalida() + ":" + vuelos.getMinSalida() + "			" + vuelos.getDuracionHoras() + ":" + 
					vuelos.getDuracionMinutos() + "			 " + vuelos.getCod());
		}
	}

	public void eliminarVueloN(ArrayList<VuelosNacionales> lista, int cod)
	{
		VuelosNacionales vuelos;
		Iterator<VuelosNacionales> iterator = lista.iterator();
		boolean encontrado=false;
		
		while(iterator.hasNext()&&!encontrado)
		{
			vuelos=iterator.next();
			if (vuelos.getCod()==cod)
			{
				encontrado=true;
				lista.remove(lista.indexOf(vuelos));
			}
		}
		
		if(!encontrado)
		{
			System.out.println("No se ha encontrado ningun vuelo existente con el codigo " + cod);
		}
	}

	public void eliminarVueloI(ArrayList<VuelosInternacionales> lista, int cod)
	{
		VuelosInternacionales vuelos;
		Iterator<VuelosInternacionales> iterator = lista.iterator();
		boolean encontrado=false;
		
		while(iterator.hasNext()&&!encontrado)
		{
			vuelos=iterator.next();
			if (vuelos.getCod()==cod)
			{
				encontrado=true;
				lista.remove(lista.indexOf(vuelos));
			}
		}
		
		if(!encontrado)
		{
			System.out.println("No se ha encontrado ningun vuelo existente con el codigo " + cod);
		}
	}
}
