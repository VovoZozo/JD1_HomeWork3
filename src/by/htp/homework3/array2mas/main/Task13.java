package by.htp.homework3.array2mas.main;

public class Task13 {
	/*
	 * 13. Сформировать квадратную матрицу порядка n по заданному образцу(n -
	 * четное):
	 */
	public static void main(String[] args) {

		System.out.println("task13");

		int[][] array1 = arrayСreation(120);

		array1 = arrayFillingLeftRight(array1);

		arrayPrint(array1);

	}

	public static int[][] arrayFillingLeftRight(int[][] args) {

		for (int i = 0; i < args.length; i = i + 2) {
			for (int j = 0; j < args[0].length; j++) {
				args[i][j] = j + 1;
			}
		}

		for (int i = 1; i < args.length; i = i + 2) {
			for (int j = args[0].length - 1; j >= 0; j--) {
				args[i][args[0].length - 1 - j] = j + 1;
			}
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
