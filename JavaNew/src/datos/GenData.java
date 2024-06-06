package datos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GenData {
	
	
	public Optional<AnimalBean> datosOptional(){
		System.out.println("GenData.datos()");
		
		Optional<AnimalBean> datosOptional= new GenData().listaAnimals().parallelStream().findFirst();
		
		Optional<List<AnimalBean>> op = Optional.ofNullable(new GenData().listaAnimals());
		
		return datosOptional;
	}
	
	public Optional<List<AnimalBean>> datosOptionalV1(){
		System.out.println("GenData.datosOptionalV1()");
		Optional<List<AnimalBean>> op = Optional.ofNullable(new GenData().listaAnimals());
		
		return op;
	}
	
	public String [] stringArregloAnimal() {
		String [] cadena= {"perro","gato","caballo","vaca"}; 
		return cadena;
	}
	
	public List<AnimalBean> listaAnimals(){
		System.out.println("GenData.listaAnimals()");
		List<AnimalBean> listaAnimals = new ArrayList<AnimalBean>();
		listaAnimals.add(new AnimalBean(101, "perro"));
		listaAnimals.add(new AnimalBean(102, "gato"));
		listaAnimals.add(new AnimalBean(103, "caballo"));
		listaAnimals.add(new AnimalBean(104, "vaca"));
		return listaAnimals;
	}
	
	public String [] stringArregloFruit() {
		String [] cadena= {"manzana","banana","piña","melon"}; 
		return cadena;
	}
	
	
	public List<FruitBean> listaFruit() {
		System.out.println("GenData.listaFruit()");
		List<FruitBean> listaFruit = new ArrayList<FruitBean>();
		listaFruit.add(new FruitBean(101, "manzana"));
		listaFruit.add(new FruitBean(102, "banana"));
		listaFruit.add(new FruitBean(103, "piña"));
		listaFruit.add(new FruitBean(104, "melon"));
		return listaFruit;
	}
}
