package c01_test;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import c01_src.P7_RotateMatrix;

public class P7_RotateMatrixTest {
	int[][] A0o = new int[][] {};
	int[][] A0r = new int[][] {};

	int[][] A1o = new int[][] { { 1 } };
	int[][] A1r = new int[][] { { 1 } };

	int[][] A2o = new int[][] { { 1, 2 }, { 3, 4 } };
	int[][] A2r = new int[][] { { 3, 1 }, { 4, 2 } };

	int[][] A3o = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	int[][] A3r = new int[][] { { 7, 4, 1 }, { 8, 5, 2 }, { 9, 6, 3 } };

	int[][] A4o = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
	int[][] A4r = new int[][] { { 13, 9, 5, 1 }, { 14, 10, 6, 2 }, { 15, 11, 7, 3 }, { 16, 12, 8, 4 } };

	int[][] A5o = new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
			{ 21, 22, 23, 24, 25 } };
	int[][] A5r = new int[][] { { 21, 16, 11, 6, 1 }, { 22, 17, 12, 7, 2 }, { 23, 18, 13, 8, 3 }, { 24, 19, 14, 9, 4 },
			{ 25, 20, 15, 10, 5 } };

	@Ignore
	@Test
	public void testRotateMatrixBF() {
		Assert.assertArrayEquals(A0r, P7_RotateMatrix.rotateMatrixBruteForce(A0o));
		Assert.assertArrayEquals(A1r, P7_RotateMatrix.rotateMatrixBruteForce(A1o));
		Assert.assertArrayEquals(A2r, P7_RotateMatrix.rotateMatrixBruteForce(A2o));
		Assert.assertArrayEquals(A3r, P7_RotateMatrix.rotateMatrixBruteForce(A3o));
		Assert.assertArrayEquals(A4r, P7_RotateMatrix.rotateMatrixBruteForce(A4o));
		Assert.assertArrayEquals(A5r, P7_RotateMatrix.rotateMatrixBruteForce(A5o));
	}

	@Test
	public void testRotateMatrixInPlace() {
		P7_RotateMatrix.rotateMatrixInPlace(A0o);
		Assert.assertArrayEquals(A0r, A0o);

		P7_RotateMatrix.rotateMatrixInPlace(A1o);
		Assert.assertArrayEquals(A1r, A1o);

		P7_RotateMatrix.rotateMatrixInPlace(A2o);
		Assert.assertArrayEquals(A2r, A2o);

		P7_RotateMatrix.rotateMatrixInPlace(A3o);
		Assert.assertArrayEquals(A3r, A3o);

		P7_RotateMatrix.rotateMatrixInPlace(A4o);
		Assert.assertArrayEquals(A4r, A4o);

		P7_RotateMatrix.rotateMatrixInPlace(A5o);
		Assert.assertArrayEquals(A5r, A5o);
	}
}
