package c01_src;

/**
 * Replace spaces with "%20" in a given string
 * given original length of string and enough spaces at the end
 * 
 * @author Adina
 *
 */
public class P3_URLify {
	/**
	 * Starting at the end of the string, copy characters that are not spaces
	 * over to the end of the string and replace spaces with '%20'
	 * 
	 * @param str
	 * @param strLen
	 */
	public static void urlify(char[] str, int strLen) {
		// the last location to fill
		int urlLen = str.length - 1;
		// start at the end of the string
		for (int i = strLen - 1; i >= 0; i--) {
			// if space encountered, replace it with '%20' 
			// at the end of the URL
			if (str[i] == ' ') {
				str[urlLen] = '0';
				str[urlLen - 1] = '2';
				str[urlLen - 2] = '%';
				urlLen -= 3;
			}
			// otherwise copy the contents to the corresponding
			// location from the end of the URL
			else
				str[urlLen--] = str[i];
		}
	}
}
