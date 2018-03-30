package main.java.hu.mitro.arraycropper;

/***
 * You need to crop an array of ints, such as if it is an image and you want to crop a specific
 * segment from it in the graphics editor to remove the maximum amount of the background and leave
 * only the object you intrested in.
 *
 * The background consists of 0. The object consists of 1.
 *
 * For example the Array:
 *
 * {0,1,0,0}, {0,0,1,0}, {1,1,1,0}, {0,0,0,0}
 *
 * After the cropping will look like:
 *
 * {0,1,0}, {0,0,1}, {1,1,1}
 *
 * @author Mitró Tamás
 *
 */
public class ArrayCropper {

	public static int[][] getCroppedFieldAsArray(int[][] src) {
		int[][] resultArray = null;
		int rowOfBackground = rowChecking(src);
		int columnOfBackground = columnChecking(src);

		if (rowOfBackground != -1 && columnOfBackground != -1) {
			resultArray = new int[rowOfBackground][columnOfBackground];
			for (int i = 0; i < resultArray.length; i++) {
				for (int j = 0; j < resultArray[i].length; j++) {
					resultArray[i][j] = src[i][j];
				}
			}
		}

		return resultArray;
	}

	private static int rowChecking(int[][] givenArray) {
		int emptyRowIndex = -1;
		for (int i = 0; i < givenArray.length; i++) {
			int columnIndex = 0;
			while (columnIndex < givenArray.length && givenArray[i][columnIndex] == 0) {
				columnIndex++;
			}
			if (columnIndex == givenArray.length) {
				emptyRowIndex = columnIndex - 1;
			}
		}
		return emptyRowIndex;
	}

	private static int columnChecking(int[][] givenArray) {
		int emptyColumnIndex = -1;
		for (int i = 0; i < givenArray.length; i++) {
			int rowIndex = 0;
			while (rowIndex < givenArray.length && givenArray[rowIndex][i] == 0) {
				rowIndex++;
			}
			if (rowIndex == givenArray.length) {
				emptyColumnIndex = rowIndex - 1;
			}
		}
		return emptyColumnIndex;
	}

	public static void main(String[] args) {
		int[][] example = { { 0, 1, 0, 0 }, { 0, 0, 1, 0 }, { 1, 1, 1, 0 },
				{ 0, 0, 0, 0 } };
		int[][] result = getCroppedFieldAsArray(example);
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}
}
