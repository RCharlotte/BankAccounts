package collections;

import java.util.LinkedHashSet;

public class Application {

	public static void main(String[] args) {
		LinkedHashSet<Integer> grades = new LinkedHashSet<Integer>();
		grades.add(54);
		grades.add(37);
		grades.add(29);
		grades.add(43);
		grades.add(37);
		
		for(Integer g: grades) {
			System.out.println(g);
		}

	}
	public static void printItems(double l) {
		
	}
}
