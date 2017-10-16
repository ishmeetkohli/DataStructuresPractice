package utils;

public class Utils {
	public static void printMatrix(int[][] matrix) {
		int M = matrix.length;
		int N = matrix[0].length;
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}
}
