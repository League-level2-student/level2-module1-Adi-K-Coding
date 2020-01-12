package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of animals
		// Don't forget to import the ArrayList class
		ArrayList<String> animals = new ArrayList<String>();
		// 2. Add five animals to your list
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Mice");
		animals.add("Bird");
		animals.add("Fish");
		// 3. Print all the strings using a standard for-loop
		for (int i = 0; i < animals.size(); i++) {
			String s = animals.get(i);
			System.out.println(s);
		}
		// 4. Print all the strings using a for-each loop
		System.out.println("\n For Each: \n");

		for (String s : animals) {
			System.out.println(s);
		}
		System.out.println("\n");
		// 5. Print only the even numbered elements in the list.
		System.out.println("\n Only even numbered elements:\n");
		for (int i = 0; i < animals.size(); i++) {
			String s = animals.get(i);
			if (i % 2 == 0) {
				System.out.println(s);
			}
		}
		// 6. Print all the strings in reverse order.
		System.out.println("\n Reverse Order:\n");
		for (int i = (animals.size() - 1); i >= 0; i--) {
			String s = animals.get(i);
			System.out.println(s);
		}
		// 7. Print only the strings that have the letter 'e' in them.
		System.out.println("\n Only The Elements That Contain E: \n");
		for (int i = 0; i < animals.size(); i++) {
			String s = animals.get(i);
			if (s.contains("e")) {
System.out.println(s);
			}
		}
	}
}
