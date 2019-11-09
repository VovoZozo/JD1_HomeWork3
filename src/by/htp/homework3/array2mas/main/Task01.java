package by.htp.homework3.array2mas.main;

public class Task01 {
	/*
	 * 1. Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной
	 * строке была ровно одна единица, и вывести на экран.
	 */
	public static void main(String[] args) {

		System.out.println("task01");

		int[][] array1 = arrayСreation(3, 4);

		array1 = arrayFilling(array1);

		arrayPrint(array1);
	}

	public static int[][] arrayFilling(int[][] args) {

		for (int i = 0; i < args.length; i++) {
			args[i][0] = 1;
		}

		return args;
	}

	public static void arrayPrint(int[][] args) {

		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args[0].length - 1; j++) {
				System.out.print(args[i][j] + " ");
			}
			System.out.print(args[i][args[0].length - 1]);
			System.out.println();
		}

		System.out.println();
	}

	public static int[][] arrayСreation(int a, int b) {

		int[][] array = new int[a][b];

		return array;
	}

}
