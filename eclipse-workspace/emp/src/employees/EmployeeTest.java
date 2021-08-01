package employees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class EmployeeTest {

	public static void main(String[] args) {
		HashSet<Employee> hashSet = new HashSet<Employee> ();
		hashSet.add(new Employee("Joshua",150000,"Psychotherapy"));
		hashSet.add(new Employee("Caleb",750000,"Engineer"));
		hashSet.add(new Employee("Angel",15000,"IT"));
		hashSet.add(new Employee("Paul",15000,"Accounting"));
		
		
		ArrayList<Employee> myList = new ArrayList<Employee> (hashSet);
		
		Collections.sort(myList);
		System.out.println(myList);
	}

}
