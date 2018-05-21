package main.java.hu.mitro.shiftmatrix;

public class JomoPipi {

	public static char[][] shift(char[][] m, int n) {
		int matrixHeight = m.length;
		int matrixLength = m[0].length;
		char[][] matrix = new char[matrixHeight][matrixLength];

		for (int i = 0; i < n; i++) {
			char temp = m[matrixHeight - 1][matrixLength - 1];
			for (int row = 0; row < matrixHeight; row++) {
				for (int column = 0; column < matrixLength; column++) {
					if (column < matrixLength - 1) {
						matrix[row][column + 1] = m[row][column];
					} else if (row < matrixHeight - 1) {
						matrix[row + 1][0] = m[row][column];
					}
				}
			}
			matrix[0][0] = temp;
			matrixCopy(m, matrix);
		}
		return matrix;
	}

	private static void matrixCopy(char[][] m, char[][] matrix) {
		for (int x = 0; x < matrix.length; x++) {
			for (int y = 0; y < matrix[0].length; y++) {
				m[x][y] = matrix[x][y];
			}
		}
	}

}
