package c01_ArraysAndStrings;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Determine if string has all unique characters
 * 
 * @author Adina
 *
 */
public class P1_IsUnique {
	/**
	 * Use an array of extended ASCII characters to keep track of
	 * seen characters in the string
	 * 
	 * @param str
	 * @return true if all characters are unique and false otherwise
	 */
	public static boolean isUniqueArray(String str) {
		//there are 256 chars in extended ASCII, so anything above that shall not be unique
		if (str.length() > 256)
			return false;

		boolean[] seen = new boolean[256];
		// check if the array is true at position corresponding to the character
		for (int i = 0; i < str.length(); i++) {
			int loc = str.charAt(i);
			if (seen[loc] == true) {
				return false;
			}
			seen[loc] = true;
		}
		return true;
	}

	/**
	 * Use a hash set to keep track of
	 * seen characters in the string
	 * 
	 * @param str
	 * @return true if all characters are unique and false otherwise
	 */
	public static boolean isUniqueHashSet(String str) {
		//there are 256 chars in extended ASCII, so anything above that shall not be unique
		if (str.length() > 256)
			return false;

		HashSet<Character> seen = new HashSet<Character>();
		// check if the character was seen
		for (int i = 0; i < str.length(); i++) {
			if (seen.contains(str.charAt(i)) == true) {
				return false;
			}
			seen.add(str.charAt(i));
		}
		return true;
	}

	//using a bit vector
	//assumption: string contains only characters 'a' through 'z'
	//	public static Boolean isUniqueBitVector(String str){
	//		int seen = 0;
	//		for(int i=0; i<str.length(); i++){
	//			int offset = str.charAt(i) - 'a';
	//			
	//		}
	//		return true;
	//	}

	/**
	 * No extra data structure: brute force, compare current character with all
	 * subsequent characters
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isUniqueBruteForce(String str) {
		//there are 256 chars in extended ASCII, so anything above that shall not be unique
		if (str.length() > 256)
			return false;

		for (int i = 0; i < str.length() - 1; i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j))
					return false;
			}
		}
		return true;
	}

	/**
	 * No extra data structure: sort first and check if characters repeat
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isUniqueSortFirst(String str) {
		//there are 256 chars in extended ASCII, so anything above that shall not be unique
		if (str.length() > 256)
			return false;

		char[] str2 = str.toCharArray();
		Arrays.sort(str2);

		for (int i = 0; i < str2.length - 1; i++) {
			if (str2[i] == str2[i + 1])
				return false;
		}
		return true;
	}
}
