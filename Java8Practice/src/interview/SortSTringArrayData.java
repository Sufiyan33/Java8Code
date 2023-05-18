package interview;

import java.util.Arrays;

public class SortSTringArrayData {

	public static void main(String[] args) {
		String[] fruits = { "apple", "orange", "banana", "pear", "kiwi" };

		for (int i = 0; i < fruits.length - 1; i++) {
			for (int j = i + 1; j < fruits.length; j++) {
				if (fruits[i].compareTo(fruits[j]) > 0) {
					String temp = fruits[i];
					fruits[i] = fruits[j];
					fruits[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(fruits));

		System.out.println("--------------------------");

		Arrays.sort(fruits);
		System.out.println(Arrays.toString(fruits));
	}
}
