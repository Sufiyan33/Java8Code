package string;

import java.util.HashMap;
import java.util.Map;

public class FindLastNonRepeatedCharacterInString {

	public static void main(String[] args) {
		String input = "happy"; // OR abbcdecfgg
		String count = "0";
		char[] charr = input.toCharArray();
		int i = 0;
		for (i = 0; i < input.length(); i++) {

			Map<Character, String> map = new HashMap<>();

			if (map.containsKey(charr[i]) == false) {

				count = map.get(charr[i]);
				map.put(charr[i], count + 1);
			} else {
				map.put(charr[i], "1");
			}
		}
		for (int j = input.length() - 1; j >= 0; j--) {
			if (count == "1") {
				System.out.println(charr[i]);
			}
		}

	}

}
