package problems;

public class RotateMatrix {

	public void rotateMatrix(int[][] matrix) {
		int N = matrix.length;

		for (int i = 0; i < N / 2; i++) {
			for (int j = i; j < N - i - 1; j++) {
				int temp = matrix[N - j - 1][i];
				matrix[N - j - 1][i] = matrix[N - i - 1][N - j - 1];
				matrix[N - i - 1][N - j - 1] = matrix[j][N - i - 1];
				matrix[j][N - i - 1] = matrix[i][j];
				matrix[i][j] = temp;
			}
		}
	}
}
