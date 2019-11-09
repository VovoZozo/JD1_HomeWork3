package by.htp.homework3.array2mas.main;

import java.util.Random;

public class Task06 {
	/*
	 * 6. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый
	 * элемент больше последнего.
	 */
	public static void main(String[] args) {

		System.out.println("task06");

		int[][] array1 = arrayСreation(2, 10);

		array1 = arrayFillingRandom(array1, 10);
		arrayPrint(array1);
		arrayPrintOdd(array1);

	}

	public static int[][] arrayFillingRandom(int[][] args, int a) {

		Random rand = new Random();

		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args[0].length; j++) {
				args[i][j] = rand.nextInt(a);
			}
		}

		return args;
	}

	public static void arrayPrintOdd(int[][] args) {

		for (int i = 0; i < args.length; i++) {

			for (int j = 1; j < args[0].length - 1; j = j + 2) {
				if (args[0][j] > args[args.length - 1][j]) {
					System.out.print(args[i][j] + " ");
				}
			}

			if (args[0][args[0].length - 1] > args[args.length - 1][args[0].length - 1]) {
				System.out.print(args[i][args[0].length - 1]);
			}

			System.out.println();
		}

		System.out.println();
	}

	public static int[][] arrayСreation(int a, int b) {

		int[][] array = new int[a][b];

		return array;
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

}
