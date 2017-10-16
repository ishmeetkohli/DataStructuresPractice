package runner;

import problems.ZeroMatrix;
import utils.Utils;

public class Runner {
	public static void main(String[] args) {
		// OneAway problem = new OneAway();
		// Boolean result = problem.isOneAway("bake", "pale");
		// System.out.println(result);

		// StringCompression compressor = new StringCompression();
		// String result = compressor.compress("aabccccccab");
		// System.out.println(result);

		// RotateMatrix rotateMatrix = new RotateMatrix();
		// int[][] A = new int[5][5];
		//
		// for (int i = 0; i < 5; i++) {
		// for (int j = 0; j < 5 ; j++) {
		// A[i][j] = i*5 +j;
		// }
		// }
		//
		// Utils.printMatrix(A);
		// rotateMatrix.rotateMatrix(A);
		// System.out.println("\n\n");
		// Utils.printMatrix(A);
		
		ZeroMatrix zeroMatrix = new ZeroMatrix();
		int[][] A = new int[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 ; j++) {
				A[i][j] = i*5 +j; 
			}
		}
		
		A[2][2] = 0;
		
		Utils.printMatrix(A);
		zeroMatrix.zeroMatrix(A);
		System.out.println("\n\n");
		Utils.printMatrix(A);
	}
}
