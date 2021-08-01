package collections;

import java.util.ArrayList;

public class ApplicationLists {

	public static void main(String[] args) {
		ArrayList<Integer> grades= new ArrayList<Integer>();
		grades.add(54);
		grades.add(12);
		grades.add(15);
		grades.add(67);
		
		
		ArrayList<Integer> newGrades= new ArrayList<Integer>();
		newGrades.add(36);
		
		grades.addAll(newGrades);
		//boolean hasValue =grades.contains(67);
		//boolean hasValue =grades.isEmpty();
		boolean hasValue =grades.retainAll(newGrades);
		System.out.println(hasValue);
		//grades.clear();
		//grades.removeAll(newGrades); removes all values similar to the value in newGrades
		System.out.println(grades);
	}

}
