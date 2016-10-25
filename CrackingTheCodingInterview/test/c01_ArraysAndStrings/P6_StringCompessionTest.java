package c01_ArraysAndStrings;

import org.junit.Assert;
import org.junit.Test;

public class P6_StringCompessionTest {

	@Test
	public void testCompressStr() {
		Assert.assertEquals("a2b1c5a3", P6_StringCompression.compressStr("aabcccccaaa"));
		Assert.assertEquals("ab", P6_StringCompression.compressStr("ab"));
		Assert.assertEquals("a", P6_StringCompression.compressStr("a"));
		Assert.assertEquals("a4b1", P6_StringCompression.compressStr("aaaab"));
	}

	@Test
	public void testCompressStrCountFirst() {
		Assert.assertEquals("a2b1c5a3", P6_StringCompression.compressStrCountFirst("aabcccccaaa"));
		Assert.assertEquals("ab", P6_StringCompression.compressStrCountFirst("ab"));
		Assert.assertEquals("a", P6_StringCompression.compressStrCountFirst("a"));
		Assert.assertEquals("a4b1", P6_StringCompression.compressStrCountFirst("aaaab"));
	}

	@Test
	public void testCountLength() {
		Assert.assertEquals(2, P6_StringCompression.findCompressedLength("a"));
		Assert.assertEquals(2, P6_StringCompression.findCompressedLength("ab"));
		Assert.assertEquals(8, P6_StringCompression.findCompressedLength("aabcccccaaa"));
		Assert.assertEquals(4, P6_StringCompression.findCompressedLength("aaaab"));
	}
}
