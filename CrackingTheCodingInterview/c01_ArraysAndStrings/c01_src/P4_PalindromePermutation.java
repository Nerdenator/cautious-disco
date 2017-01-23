package c01_src;

import java.util.HashMap;

/**
 * Is this string a permutation of a palindrome?
 * 
 * @author Adina
 *
 */

public class P4_PalindromePermutation {
	/**
	 * Use a hashmap to count the number of occurrences of each unique character
	 * in the string.
	 * - If the string is even, then char count has to be even for all chars
	 * - If the string is odd, then the char count has to be even for all
	 * characters except one
	 * So, if more than one count is odd, the string is not a palindrome
	 * permutation
	 * 
	 * @param s
	 * @return
	 */
	public static boolean isPalindromePermutationHash(String s) {
		// process the string O(n)
		char[] str = s.toLowerCase().toCharArray();

		//count the characters
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length; i++) {
			if (isAceptableCharacter(str[i])) {
				if (map.containsKey(str[i])) {
					int val = map.get(str[i]);
					map.put(str[i], ++val);
				} else
					map.put(str[i], 1);
			}
		}

		// no odd character encountered yet
		boolean foundOdd = false;

		// for all the values in the map, check if you see an odd one more than once
		for (Integer count : map.values()) {
			if (count % 2 != 0) {
				if (foundOdd == false)
					foundOdd = true;
				else
					return false;
			}
		}
		return true;
	}

	/**
	 * Is this character acceptable: only allow a-z
	 * 
	 * @param c
	 * @return
	 */
	private static boolean isAceptableCharacter(char c) {
		if (c > 'z' || c < 'a') {
			return false;
		}
		return true;
	}

	/**
	 * Use an array to keep track of number of times each character appears.
	 * If more than one count is odd, the string is not a palindrome
	 * 
	 * @param s
	 * @return
	 */
	public static boolean isPalindromePermutationArray(String s) {
		//26 characters
		//a maps to numOccurrences[0]
		//z maps to numOccurrences[25]
		int[] numOccurrences = new int[26];

		// count number of odds as you go
		int numOdds = 0;

		// process string O(n)
		char[] str = s.toLowerCase().toCharArray();

		// go through the string counting the odds
		for (int i = 0; i < str.length; i++) {
			if (isAceptableCharacter(str[i])) {
				int idx = str[i] - 'a';
				numOccurrences[idx]++;
				// if it's odd, we have an extra odd
				if (numOccurrences[idx] % 2 == 1)
					numOdds++;
				// if it's even, we have one less odd
				else
					numOdds--;
			}
		}
		// need to have at most 1 odd count
		return numOdds <= 1;
	}

	// TODO Use bit vectors
}
