package c01_test;

import org.junit.Assert;
import org.junit.Test;

import c01_src.P8_ZeroMatrix;

public class P8_ZeroMatrixTest {

	int[][] A0 = new int[][] {};
	int[][] A0r = new int[][] {};

	int[][] A1_0 = new int[][] { { 0 } };
	int[][] A1_0r = new int[][] { { 0 } };

	int[][] A1_1 = new int[][] { { 1 } };
	int[][] A1_1r = new int[][] { { 1 } };

	int[][] A2 = new int[][] { { 1, 0, 2 }, { 2, 3, 3 } };
	int[][] A2r = new int[][] { { 0, 0, 0 }, { 2, 0, 3 } };

	int[][] A3o = new int[][] { { 1, 1, 4 }, { 2, 3, 7 } };
	int[][] A3or = new int[][] { { 1, 1, 4 }, { 2, 3, 7 } };

	int[][] A3 = new int[][] { { 1, 0, 4, 9 }, { 2, 3, 7, 9 }, { 8, 5, 0, 9 } };
	int[][] A3r = new int[][] { { 0, 0, 0, 0 }, { 2, 0, 0, 9 }, { 0, 0, 0, 0 } };

	@Test
	public void testZeroMatrixExtraSpace() {
		P8_ZeroMatrix.zeroMatrixExtraSpace(A0);
		Assert.assertArrayEquals(A0r, A0);

		P8_ZeroMatrix.zeroMatrixExtraSpace(A1_0);
		Assert.assertArrayEquals(A1_0r, A1_0);

		P8_ZeroMatrix.zeroMatrixExtraSpace(A1_1);
		Assert.assertArrayEquals(A1_1r, A1_1);

		P8_ZeroMatrix.zeroMatrixExtraSpace(A2);
		Assert.assertArrayEquals(A2r, A2);

		P8_ZeroMatrix.zeroMatrixExtraSpace(A3o);
		Assert.assertArrayEquals(A3or, A3o);

		P8_ZeroMatrix.zeroMatrixExtraSpace(A3);
		Assert.assertArrayEquals(A3r, A3);
	}

	@Test
	public void testZeroMatrix() {
		P8_ZeroMatrix.zeroMatrix(A0);
		Assert.assertArrayEquals(A0r, A0);

		P8_ZeroMatrix.zeroMatrix(A1_0);
		Assert.assertArrayEquals(A1_0r, A1_0);

		P8_ZeroMatrix.zeroMatrix(A1_1);
		Assert.assertArrayEquals(A1_1r, A1_1);

		P8_ZeroMatrix.zeroMatrix(A2);
		Assert.assertArrayEquals(A2r, A2);

		P8_ZeroMatrix.zeroMatrix(A3o);
		Assert.assertArrayEquals(A3or, A3o);

		P8_ZeroMatrix.zeroMatrix(A3);
		Assert.assertArrayEquals(A3r, A3);
	}
}
