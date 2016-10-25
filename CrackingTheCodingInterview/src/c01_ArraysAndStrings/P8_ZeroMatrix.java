package c01_ArraysAndStrings;

/**
 * If an element of MxN matrix is 0, then its entire row and column are set to
 * 0.
 * 
 * @author Adina
 *
 */
public class P8_ZeroMatrix {
	/**
	 * Use two additional arrays to indicate locations to zero out on rows and
	 * columns
	 * 
	 * @param A
	 */
	public static void zeroMatrixExtraSpace(int[][] A) {
		// M rows, N columns
		int M = A.length;
		int N = 0;
		if (M != 0)
			N = A[0].length;

		int[] rows = new int[M];
		int[] cols = new int[N];

		for (int r = 0; r < M; r++) {
			for (int c = 0; c < N; c++) {
				if (A[r][c] == 0) {
					rows[r] = 1;
					cols[c] = 1;
				}
			}
		}

		//make the whole column 0
		for (int c = 0; c < N; c++) {
			if (cols[c] == 1) {
				for (int r = 0; r < M; r++)
					A[r][c] = 0;
			}
		}

		//make the whole row 0
		for (int r = 0; r < M; r++) {
			if (rows[r] == 1) {
				for (int c = 0; c < N; c++)
					A[r][c] = 0;
			}
		}
	}

	/**
	 * To save space, instead of two additional arrays to keep track of
	 * zero-able locations, use first row and first column
	 * 
	 * @param A
	 */
	public static void zeroMatrix(int[][] A) {
		// M rows, N columns
		int M = A.length;
		int N = 0;
		if (M != 0)
			N = A[0].length;

		//does the first row contain a zero?
		boolean row0Zero = false;
		for (int c = 0; c < N; c++) {
			if (A[0][c] == 0) {
				row0Zero = true;
				break;
			}
		}

		//does the first column contain a zero?
		boolean col0Zero = false;
		for (int r = 0; r < M; r++) {
			if (A[r][0] == 0) {
				col0Zero = true;
				break;
			}
		}

		// save the locations of the zeros in the matrix by using
		// the first row and the first column
		for (int r = 1; r < M; r++) {
			for (int c = 1; c < N; c++) {
				if (A[r][c] == 0) {
					// the row is 0
					A[r][0] = 0;
					// the column is 0
					A[0][c] = 0;
				}
			}
		}

		//make the whole column 0
		for (int c = 0; c < N; c++) {
			if (A[0][c] == 0) {
				for (int r = 0; r < M; r++)
					A[r][c] = 0;
			}
		}

		//make the whole row 0
		for (int r = 0; r < M; r++) {
			if (A[r][0] == 0) {
				for (int c = 0; c < N; c++)
					A[r][c] = 0;
			}
		}

		//if the first row had a zero, nullify the column
		if (row0Zero) {
			for (int c = 0; c < N; c++)
				A[0][c] = 0;
		}
		//if the first column had a zero, nullify the row
		if (col0Zero) {
			for (int r = 0; r < M; r++)
				A[r][0] = 0;
		}
	}
}
