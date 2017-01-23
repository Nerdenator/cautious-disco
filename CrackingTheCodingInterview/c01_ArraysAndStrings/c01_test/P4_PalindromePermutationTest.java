package c01_test;

import org.junit.Assert;
import org.junit.Test;

import c01_src.P4_PalindromePermutation;

public class P4_PalindromePermutationTest {

	@Test
	public void testPalindromPermutationHash() {
		Assert.assertTrue(P4_PalindromePermutation.isPalindromePermutationHash("Tact Coa"));
		Assert.assertTrue(P4_PalindromePermutation.isPalindromePermutationHash("Tact abc123321  bt"));
		Assert.assertFalse(P4_PalindromePermutation.isPalindromePermutationHash("Tact aCoa"));
	}

	@Test
	public void testPalindromPermutationArray() {
		Assert.assertTrue(P4_PalindromePermutation.isPalindromePermutationArray("Tact Coa"));
		Assert.assertTrue(P4_PalindromePermutation.isPalindromePermutationArray("Tact abc123321  bt"));
		Assert.assertFalse(P4_PalindromePermutation.isPalindromePermutationArray("Tact aCoa"));
	}

}
