package by.htp.homework3.array2mas.main;

public class Task12 {
	/*
	 * 12. Получить квадратную матрицу порядка n:
	 */
	public static void main(String[] args) {

		System.out.println("task12");

		int[][] array1 = arrayСreation(5);

		array1 = arrayFillingDiagonal(array1);

		arrayPrint(array1);

	}

	public static int[][] arrayFillingDiagonal(int[][] args) {

		for (int i = 0, j = 0; i < args.length; i++, j++) {
			args[i][j] = i;
		}

		return args;
	}

	public static void arrayPrint(int[][] args) {

		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args[0].length - 1; j++) {
				System.out.print(args[i][j] + "\t");
			}
			System.out.print(args[i][args[0].length - 1]);
			System.out.println();
		}

		System.out.println();
	}

	public static int[][] arrayСreation(int a) {

		int[][] array = new int[a][a];

		return array;
	}

	public static void printInt(String s, int a) {

		System.out.println(s + a);

	}
}
