package collections;

import java.util.ArrayList;
import java.util.List; 


public class Trial {

	public static void main(String[] args) {
		ArrayList<Integer> grades = new ArrayList<Integer>();
		grades.add(54);
		grades.add(37);
		grades.add(29);
		grades.add(43);
		grades.add(37);
		
		for(Integer g: grades) {
			System.out.println(g);
		}

	}
	public static void printItems(List l) {
		
	}
}
