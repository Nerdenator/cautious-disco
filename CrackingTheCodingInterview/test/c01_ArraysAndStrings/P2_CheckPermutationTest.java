package c01_ArraysAndStrings;

import org.junit.Assert;
import org.junit.Test;

public class P2_CheckPermutationTest {

	@Test
	public void testIsPermutationSort() {
		Assert.assertTrue(P2_CheckPermutation.isPermutationSort("abc", "cab"));
		Assert.assertTrue(P2_CheckPermutation.isPermutationSort("", ""));
		Assert.assertFalse(P2_CheckPermutation.isPermutationSort("ab", "a"));
		Assert.assertFalse(P2_CheckPermutation.isPermutationSort("ab", "ac"));
		Assert.assertFalse(P2_CheckPermutation.isPermutationSort("abcba", "aaacb"));
	}

	@Test
	public void testIsPermutationHash() {
		Assert.assertTrue(P2_CheckPermutation.isPermutationHash("abc", "cab"));
		Assert.assertTrue(P2_CheckPermutation.isPermutationHash("", ""));
		Assert.assertFalse(P2_CheckPermutation.isPermutationHash("ab", "a"));
		Assert.assertFalse(P2_CheckPermutation.isPermutationHash("ab", "ac"));
		Assert.assertFalse(P2_CheckPermutation.isPermutationHash("abcba", "aaacb"));
	}

}
