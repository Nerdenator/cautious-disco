package c01_src;

/**
 * Three types of edit: insert 1 character, remove 1 character or replace 1
 * character
 * Is str2 one edit away from str1?
 * 
 * @author Adina
 *
 */
public class P5_OneAway {

	/**
	 * Note: removeEdit(str1,str2) = insertEdit(str2, str1)
	 * - if str1.len = str2.len - 1, check for insertEdit(str1, str2)
	 * - if str1.len = str2.len, check for replaceEdit(str1, str2)
	 * - if str1.len = str2.len + 1, check for removeEdit(str1, str2)
	 * ....................................<=> insertEdit(str2, str1)
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean isOneAway(char[] str1, char[] str2) {
		// remove a character
		if (str1.length == str2.length - 1)
			return insertEdit(str1, str2);

		//replace a character
		if (str1.length == str2.length) {
			return replaceEdit(str1, str2);
		}

		// insert a character
		if (str1.length == str2.length + 1) {
			return insertEdit(str2, str1);
		}

		return false;
	}

	/**
	 * Return true if replacing one character in str1 gets str2
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	private static boolean replaceEdit(char[] str1, char[] str2) {
		// no replacements O(n)
		if (str1.equals(str2))
			return false;

		// stop if this has already been true once
		boolean foundDiff = false;
		// go through the whole string O(n)
		for (int i = 0; i < str1.length; i++) {
			if (str1[i] != str2[i]) {
				// there was already a diff found
				if (foundDiff)
					return false;
				// this is the first diff found
				foundDiff = true;
			}
		}
		// only one diff was found
		return true;
	}

	/**
	 * Return true if inserting a character in str1 gets str2
	 * str1 is 1 shorter than str2
	 * Removal is identical, with reversed parameters
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	private static boolean insertEdit(char[] str1, char[] str2) {//abc adbc
		//keep track of both indices
		int i = 0, j = 0;
		while (i < str1.length && j < str2.length) {
			if (str1[i] != str2[j]) {
				// indices can only stray once, if they already strayed, there's more than one difference
				if (i != j)
					return false;
				// this is the first time straying
				j++;
			}
			// increment both indices
			else {
				j++;
				i++;
			}
		}
		return true;
	}
}