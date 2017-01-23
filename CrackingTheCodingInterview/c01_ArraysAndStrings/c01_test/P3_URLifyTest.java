package c01_test;

import org.junit.Assert;
import org.junit.Test;

import c01_src.P3_URLify;

public class P3_URLifyTest {
	@Test
	public void test() {
		char[] str = "Mr John Smith    ".toCharArray();
		P3_URLify.urlify(str, 13);
		Assert.assertArrayEquals("Mr%20John%20Smith".toCharArray(), str);
	}

	@Test
	public void test2() {
		char[] str = " Mr John Smith      ".toCharArray();
		P3_URLify.urlify(str, 14);
		Assert.assertArrayEquals("%20Mr%20John%20Smith".toCharArray(), str);
	}

	@Test
	public void test3() {
		char[] str = " Mr John Smith         ".toCharArray();
		P3_URLify.urlify(str, 15);
		Assert.assertArrayEquals("%20Mr%20John%20Smith%20".toCharArray(), str);
	}

}
