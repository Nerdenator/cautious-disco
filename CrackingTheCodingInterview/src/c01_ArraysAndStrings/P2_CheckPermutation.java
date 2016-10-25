package c01_ArraysAndStrings;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Decide if str1 is a permutation of str2
 * 
 * @author Adina
 *
 */
public class P2_CheckPermutation {

	/**
	 * Sort first and check if the two strings are the same
	 * O(nlogn)
	 * 
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static boolean isPermutationSort(String s1, String s2) {
		//they have to be the same length
		if (s1.length() != s2.length())
			return false;

		char[] c1 = s1.toCharArray(); //O(n)
		char[] c2 = s2.toCharArray(); //O(n)

		Arrays.sort(c1); //O(nlogn)
		Arrays.sort(c2); //O(nlogn)
		return Arrays.equals(c1, c2); //O(n)
	}

	/**
	 * Use a hashmap to check if all characters in s2 are the same as the
	 * characters in s1
	 * 
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static boolean isPermutationHash(String s1, String s2) {
		//they have to be the same length
		if (s1.length() != s2.length())
			return false;

		HashMap<Character, Integer> map = new HashMap<>();
		// put all the characters in s1 in a hashmap with a count for how many times they appear
		for (int i = 0; i < s1.length(); i++) {
			// if already there, increase count
			if (map.containsKey(s1.charAt(i))) {
				int val = map.get(s1.charAt(i));
				map.put(s1.charAt(i), ++val);
			}
			// otherwise, add with a count of 1
			else
				map.put(s1.charAt(i), 1);
		}

		// remove all the characters in s2 from the hashmap 
		// (and stop if discrepancies occur)
		for (int i = 0; i < s2.length(); i++) {
			//if the map doesn't contain the key or we've already matched all, a discrepancy occurred
			if (!map.containsKey(s2.charAt(i)) || map.get(s2.charAt(i)) == 0)
				return false;
			// otherwise, decrease the count for the current character
			else {
				int val = map.get(s2.charAt(i));
				map.put(s2.charAt(i), --val);
			}
		}
		return true;
	}

	/**
	 * Assuming only (extended) ASCII characters (256), count the number of
	 * occurrences of each character in s1 and make sure they match in s2
	 * 
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static boolean isPermutationArray(String s1, String s2) {
		//they have to be the same length
		if (s1.length() != s2.length())
			return false;

		int[] hash = new int[256];
		// put all the characters in s1 in hash, counting how many times they appear
		for (int i = 0; i < s1.length(); i++) {
			hash[s1.charAt(i)]++;
		}
		// remove all characters in s2 from hash, making sure we stop if we go negative
		for (int i = 0; i < s2.length(); i++) {
			if (hash[s2.charAt(i)] == 0)
				return false;
			hash[s2.charAt(i)]--;
		}
		return true;
	}

}
