package c01_test;

import org.junit.Assert;
import org.junit.Test;

import c01_src.P2_CheckPermutation;

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

	@Test
	public void testIsPermutationArray() {
		Assert.assertTrue(P2_CheckPermutation.isPermutationArray("abc", "cab"));
		Assert.assertTrue(P2_CheckPermutation.isPermutationArray("", ""));
		Assert.assertFalse(P2_CheckPermutation.isPermutationArray("ab", "a"));
		Assert.assertFalse(P2_CheckPermutation.isPermutationArray("ab", "ac"));
		Assert.assertFalse(P2_CheckPermutation.isPermutationArray("abcba", "aaacb"));
	}
}
