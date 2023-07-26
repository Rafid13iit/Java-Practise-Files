package LabFinalExam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many persons : ");
		int personNum = input.nextInt();
		
		List <User> personList = new ArrayList<>();
		//Set<User> personSet = new HashSet<>();

		
		System.out.println("Input the persons information : ");
		
		for (int i = 0; i < personNum; i++) {
			System.out.print("ID : ");
			int id = input.nextInt();
			
			System.out.print("Full name : ");
			String fullName = input.next();
			
			System.out.print("Present Address : ");
			String presentAddress = input.next();
			
			System.out.print("Username : ");
			String userName = input.next();
			
			
			User Person = new User(id, fullName, presentAddress, userName);
			
			int count = 0;
			for (int j = 0; j < personList.size(); j++) {
				if (id == personList.get(j).id || userName == personList.get(j).userName) {
					count = -1;
					break;
				}
			}
			
			if (count == 0)
				personList.add(Person);
				//personSet.add(Person);
			
			
		}

		//System.out.println(personSet);
		System.out.println(personList);
	}
}

