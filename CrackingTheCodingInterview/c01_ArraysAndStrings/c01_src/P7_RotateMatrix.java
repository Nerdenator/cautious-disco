package c01_src;

/**
 * Rotate a matrix 90 degrees clockwise
 * 
 * @author Adina
 *
 */
public class P7_RotateMatrix {
	/**
	 * Use an extra matrix to keep track of rotations
	 * 
	 * @param A
	 * @return Ar, the rotated matrix
	 */
	public static int[][] rotateMatrixBruteForce(int[][] A) {
		int n = A.length;
		int[][] Ar = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				Ar[i][j] = A[n - j - 1][i];
			}
		}
		return Ar;
	}

	/**
	 * Rotate matrix in place, with no additional data structure
	 * 
	 * @param A
	 */
	public static void rotateMatrixInPlace(int[][] A) {
		int n = A.length;
		// O(n^2)
		for (int l = 0; l < n / 2; l++) {
			for (int k = n - l - 2; k >= l; k--) {
				rotateIndices(A, n, k, l);
			}
		}
	}

	/**
	 * Perform a rotation
	 * 
	 * @param A matrix to rotate
	 * @param n matrix length
	 * @param k xIndex to rotate
	 * @param l yIndex to rotate
	 */
	public static void rotateIndices(int[][] A, int n, int k, int l) {
		//aux = top
		int aux = A[l][n - k - 2];
		//top = left
		A[l][n - k - 2] = A[k + 1][l];
		//left = bottom
		A[k + 1][l] = A[n - l - 1][k + 1];
		//bottom = right
		A[n - l - 1][k + 1] = A[n - k - 2][n - l - 1];
		//right = aux
		A[n - k - 2][n - l - 1] = aux;
	}
}
