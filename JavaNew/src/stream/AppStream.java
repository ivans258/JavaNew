package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import datos.GenData;

public class AppStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppStream opera = new AppStream();
		GenData datos = new GenData();


		
		//opera.streamLista(datos.stringArregloFruit());
		//opera.streamFilter(datos.stringArregloFruit());
		//opera.streamUppercase(datos.stringArregloFruit());
//		opera.streamCount(datos.stringArregloFruit());
		opera.streamOperaciones(datos.stringArregloFruit());

	}
	
	/*
	 * @author Ivan Niño Jimenez
	 * @version V1
	 * @Comment java 8 manejo de Stream lista
	 */
	public void streamLista(String [] datos) {
		System.out.println("AppStream.streamLista()");
		
		Stream<String> stream = Stream.of(datos);
		List<String> listaFruit = new ArrayList<String>();
		listaFruit=stream.collect(Collectors.toList());
		System.out.println("STREAM:: "+stream);
		System.out.println("LISTA:: "+listaFruit);
	}

	/*
	 * @author Ivan Niño Jimenez
	 * @version V1
	 * @Comment java 8 manejo de Stream filter
	 */
	public void streamFilter(String [] datos) {
		System.out.println("AppStream.streamFilter()");
		
		Stream<String> streamFilter = Stream.of(datos)
				.filter(f->f.contains("ñ"));

		List<String> listaFruitFilter = new ArrayList<String>();

		listaFruitFilter=streamFilter.collect(Collectors.toList());
		System.out.println("STREAM FILTER:: "+listaFruitFilter);
	}

	/*
	 * @author Ivan Niño Jimenez
	 * @version V1
	 * @Comment java 8 manejo de Stream UpperCase
	 */
	public void streamUppercase(String [] datos) {
		System.out.println("AppStream.streamUppercase()");
		
		Stream<String> stream = Stream.of(datos)
				.map(f->f.toUpperCase());

		List<String> listaFruit = new ArrayList<String>();

		listaFruit=stream.collect(Collectors.toList());
		System.out.println("STREAM UPPERCASE:: "+listaFruit);
	}

	/*
	 * @author Ivan Niño Jimenez
	 * @version V1
	 * @Comment java 8 manejo de Stream COUNT
	 */
	public void streamCount(String [] datos) {
		System.out.println("AppStream.streamCount()");
		
		Long streamCount = Stream.of(datos)
				.count();
		
		System.out.println("STREAM COUNT:: "+streamCount);
	}
	
	/*
	 * @author Ivan Niño Jimenez
	 * @version V1
	 * @Comment java 8 manejo de Stream Varias operaciones
	 */
	public void streamOperaciones(String [] datos) {
		System.out.println("AppStream.streamOperaciones()");
		
		boolean streamFinal = Stream.of(datos)
				.filter(f->f.contains("ñ"))
				.filter(s->s.startsWith("p"))
				.anyMatch(f->f.contains("a"));
		
		System.out.println("STREAM BOOLEAN:: "+streamFinal);
		
		Stream<String> streamFinal1 = Stream.of(datos)
				.filter(f->f.contains("ñ"))
				.filter(s->s.startsWith("p"));
		List<String> listaFruit = new ArrayList<String>();
		listaFruit=streamFinal1.collect(Collectors.toList());
		System.out.println("STREAM STRING:: "+listaFruit);
		
	}
}
