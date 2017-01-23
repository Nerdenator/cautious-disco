package c01_test;

import org.junit.Assert;
import org.junit.Test;

import c01_src.P5_OneAway;

public class P5_OneAwayTest {

	@Test
	public void testOneAway1() {
		Assert.assertFalse(P5_OneAway.isOneAway("pale".toCharArray(), "bali".toCharArray()));
		Assert.assertTrue(P5_OneAway.isOneAway("pale".toCharArray(), "bale".toCharArray()));

		Assert.assertTrue(P5_OneAway.isOneAway("pale".toCharArray(), "pale".toCharArray()));

		Assert.assertFalse(P5_OneAway.isOneAway("pale".toCharArray(), "palest".toCharArray()));
		Assert.assertFalse(P5_OneAway.isOneAway("palest".toCharArray(), "pale".toCharArray()));

		Assert.assertTrue(P5_OneAway.isOneAway("pale".toCharArray(), "ple".toCharArray()));
		Assert.assertFalse(P5_OneAway.isOneAway("pale".toCharArray(), "le".toCharArray()));
		Assert.assertFalse(P5_OneAway.isOneAway("pale".toCharArray(), "pla".toCharArray()));
		Assert.assertFalse(P5_OneAway.isOneAway("pate".toCharArray(), "ple".toCharArray()));

		Assert.assertTrue(P5_OneAway.isOneAway("ple".toCharArray(), "pale".toCharArray()));
		Assert.assertFalse(P5_OneAway.isOneAway("pla".toCharArray(), "pale".toCharArray()));
		Assert.assertFalse(P5_OneAway.isOneAway("le".toCharArray(), "pale".toCharArray()));
		Assert.assertFalse(P5_OneAway.isOneAway("ple".toCharArray(), "pate".toCharArray()));
	}

}
