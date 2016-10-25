package c01_ArraysAndStrings;

/**
 * isSubstring checks if a word is substring of other.
 * Check if s2 is a rotation of s1 with only one call to isSubstring
 * 
 * @author Adina
 *
 */
public class P9_StringRotation {
	/**
	 * Observation: s2 is always a substring of s1s1
	 * 
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static boolean stringRotation(String s1, String s2) {
		// they have to be the same, positive length to be rotations
		if (s1.length() != s2.length() || s1.length() == 0)
			return false;
		return isSubstring(s2, s1 + s1);
	}

	/**
	 * Helper function, returns true if s2 is substring of s1
	 * 
	 * @param s2
	 * @param s1
	 * @return
	 */
	public static boolean isSubstring(String s2, String s1) {
		return s1.contains(s2);
	}
}
