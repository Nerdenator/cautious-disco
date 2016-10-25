package c01_ArraysAndStrings;

/**
 * Compress string based on counts of successive repeated characters
 * aabcccccaaa => a2b1c5a3
 * If compressed string not smaller than original, return original
 * String has only letters A-Za-z
 * 
 * @author Adina
 *
 */
public class P6_StringCompression {

	/**
	 * Go through the string,
	 * counting successive occurrences of same character,
	 * appending unique character on last occurrence
	 * and then appending the count
	 * 
	 * @param str
	 * @return the compressed string if smaller than original str,
	 *         otherwise the original str
	 */
	public static String compressStr(String str) {
		StringBuilder sb = new StringBuilder();
		int identicalCount = 1;
		int i;
		for (i = 0; i < str.length() - 1; i++) {
			// count the number of identical characters
			if (str.charAt(i) == str.charAt(i + 1)) {
				identicalCount++;
			}
			// append last identical character and the identical count
			else {
				sb.append(str.charAt(i));
				sb.append(identicalCount);
				identicalCount = 1;
			}
		}
		// append last identical character and the identical count
		sb.append(str.charAt(i));
		sb.append(identicalCount);
		// return newly created string if it's smaller than original
		if (sb.length() < str.length())
			return sb.toString();
		// otherwise return original
		return str;
	}

	/**
	 * Find the length of the compressed string first, and only create the new
	 * string if it's shorter than the original
	 * 
	 * @param str
	 * @return
	 */
	public static String compressStrCountFirst(String str) {
		int compressedLength = findCompressedLength(str);
		if (compressedLength >= str.length())
			return str;

		StringBuilder sb = new StringBuilder(compressedLength);
		int countIdentical = 1;
		int i;
		for (i = 0; i < str.length() - 1; i++) {
			// count the number of identical characters
			if (str.charAt(i) == str.charAt(i + 1)) {
				countIdentical++;
			} else {
				// append last identical character and the identical count
				sb.append(str.charAt(i));
				sb.append(countIdentical);
				countIdentical = 1;
			}
		}
		// append last identical character and the identical count
		sb.append(str.charAt(i));
		sb.append(countIdentical);
		return sb.toString();
	}

	/**
	 * Find the length of a compressed string first so we don't compress it if
	 * we don't have to
	 * Add the number of digits of the identical count plus 1 (for the
	 * character) on every pass
	 * 
	 * @param str
	 * @return
	 */
	protected static int findCompressedLength(String str) {
		if (str.length() == 1 || str.length() == 2)
			return 2;

		int len = 0;
		int identicalCount = 1;
		int i;

		for (i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				identicalCount++;
			} else {
				// add the length (number of digits) of count
				len += 1 + Integer.toString(identicalCount).length();
				identicalCount = 1;
			}
		}
		len += 1 + Integer.toString(identicalCount).length();
		return len;
	}
}
