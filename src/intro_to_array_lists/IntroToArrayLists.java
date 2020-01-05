package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of animals
		//   Don't forget to import the ArrayList class
		ArrayList<String>animals=new ArrayList<String>();
		//2. Add five animals to your list
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Mice");
		animals.add("Bird");
		animals.add("Fish");
		//3. Print all the strings using a standard for-loop
		for (int i = 0; i < animals.size(); i++) {
			String s=animals.get(i);
		System.out.println(s);
		}
		//4. Print all the strings using a for-each loop
		
		//5. Print only the even numbered elements in the list.
		
		//6. Print all the strings in reverse order.
		
		//7. Print only the strings that have the letter 'e' in them.
	}
}
