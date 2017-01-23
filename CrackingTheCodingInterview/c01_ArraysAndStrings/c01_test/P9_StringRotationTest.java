package c01_test;

import org.junit.Assert;
import org.junit.Test;

import c01_src.P9_StringRotation;

public class P9_StringRotationTest {

	@Test
	public void test() {
		Assert.assertTrue(P9_StringRotation.stringRotation("waterbottle", "erbottlewat"));
		Assert.assertFalse(P9_StringRotation.stringRotation("", ""));
		Assert.assertFalse(P9_StringRotation.stringRotation("waterbottlee", "erbottlewat"));
		Assert.assertFalse(P9_StringRotation.stringRotation("waterbottlet", "erbottlewa"));
	}

}
