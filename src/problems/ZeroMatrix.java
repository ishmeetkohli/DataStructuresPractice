package problems;

public class ZeroMatrix {

	public void zeroMatrix(int[][] matrix) {
		int M = matrix.length;
		int N = matrix[0].length;

		boolean[] zeroRows = new boolean[M];
		boolean[] zeroCols = new boolean[N];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (matrix[i][j] == 0) {
					zeroRows[i] = true;
					zeroCols[j] = true;
				}
			}
		}

		for (int i = 0; i < M; i++) {
			boolean isZero = zeroRows[i];
			if (isZero) {
				setZero(matrix, N, i, true);
			}
		}

		for (int i = 0; i < N; i++) {
			boolean isZero = zeroCols[i];
			if (isZero) {
				setZero(matrix, M, i, false);
			}
		}
	}

	void setZero(int[][] matrix, int size, int index, boolean setRow) {
		for (int i = 0; i < size; i++) {
			if (setRow) {
				matrix[index][i] = 0;
			} else {
				matrix[i][index] = 0;
			}
		}
	}

}
