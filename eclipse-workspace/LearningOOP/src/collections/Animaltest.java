package collections;

import java.util.HashSet;

public class Animaltest {

	public static void main(String[] args) {
		HashSet<Animal> animals = new HashSet<Animal>();
		Animal Animal1= new Animal("Dog",12);
		Animal Animal2= new Animal("Cat",2);
		Animal Animal3= new Animal("Bird",3);
		Animal Animal4= new Animal("Dog",12);
		Animal Animal5= new Animal("Kangaroo",12);
		animals.add(Animal1);
		animals.add(Animal2);
		animals.add(Animal3);
		animals.add(Animal4);
		animals.add(Animal5);
		for(Animal a: animals) {
			System.out.println(a);
		}
		System.out.println(Animal1.equals(Animal4));
		System.out.println(Animal1.hashCode());
		System.out.println(Animal4.hashCode());
	}

}

