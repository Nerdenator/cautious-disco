package c01_test;

import org.junit.Assert;
import org.junit.Test;

import c01_src.P1_IsUnique;

public class P1_IsUniqueTest {
	String str_empty = "";
	String str_unique = "abcd";
	String str_repeatf = "aabc";
	String str_repeatm = "abbc";
	String str_repeatl = "abcc";

	@Test
	public void testEmpyUniqueArray() {
		Assert.assertTrue(P1_IsUnique.isUniqueArray(str_empty));
	}

	@Test
	public void testUniqueUniqueArray() {
		Assert.assertTrue(P1_IsUnique.isUniqueArray(str_unique));
	}

	@Test
	public void testRepeatfNotUniqueArray() {
		Assert.assertFalse(P1_IsUnique.isUniqueArray(str_repeatf));
	}

	@Test
	public void testRepeatmNotUniqueArray() {
		Assert.assertFalse(P1_IsUnique.isUniqueArray(str_repeatm));
	}

	@Test
	public void testRepeatlNotUniqueArray() {
		Assert.assertFalse(P1_IsUnique.isUniqueArray(str_repeatl));
	}
	/////////////////////////

	@Test
	public void testEmpyUniqueHashSet() {
		Assert.assertTrue(P1_IsUnique.isUniqueHashSet(str_empty));
	}

	@Test
	public void testUniqueUniqueHashSet() {
		Assert.assertTrue(P1_IsUnique.isUniqueHashSet(str_unique));
	}

	@Test
	public void testRepeatfNotUniqueHashSet() {
		Assert.assertFalse(P1_IsUnique.isUniqueHashSet(str_repeatf));
	}

	@Test
	public void testRepeatmNotUniqueHashSet() {
		Assert.assertFalse(P1_IsUnique.isUniqueHashSet(str_repeatm));
	}

	@Test
	public void testRepeatlNotUniqueHashSet() {
		Assert.assertFalse(P1_IsUnique.isUniqueHashSet(str_repeatl));
	}

	///
	@Test
	public void testEmpyUniqueBruteForce() {
		Assert.assertTrue(P1_IsUnique.isUniqueBruteForce(str_empty));
	}

	@Test
	public void testUniqueUniqueBruteForce() {
		Assert.assertTrue(P1_IsUnique.isUniqueBruteForce(str_unique));
	}

	@Test
	public void testRepeatfNotUniqueBruteForce() {
		Assert.assertFalse(P1_IsUnique.isUniqueBruteForce(str_repeatf));
	}

	@Test
	public void testRepeatmNotUniqueBruteForce() {
		Assert.assertFalse(P1_IsUnique.isUniqueBruteForce(str_repeatm));
	}

	@Test
	public void testRepeatlNotUniqueBruteForce() {
		Assert.assertFalse(P1_IsUnique.isUniqueBruteForce(str_repeatl));
	}

	///
	@Test
	public void testEmpyUniqueSortFirst() {
		Assert.assertTrue(P1_IsUnique.isUniqueSortFirst(str_empty));
	}

	@Test
	public void testUniqueUniqueSortFirst() {
		Assert.assertTrue(P1_IsUnique.isUniqueSortFirst(str_unique));
	}

	@Test
	public void testRepeatfNotUniqueSortFirst() {
		Assert.assertFalse(P1_IsUnique.isUniqueSortFirst(str_repeatf));
	}

	@Test
	public void testRepeatmNotUniqueSortFirst() {
		Assert.assertFalse(P1_IsUnique.isUniqueSortFirst(str_repeatm));
	}

	@Test
	public void testRepeatlNotUniqueSortFirst() {
		Assert.assertFalse(P1_IsUnique.isUniqueSortFirst(str_repeatl));
	}
}
