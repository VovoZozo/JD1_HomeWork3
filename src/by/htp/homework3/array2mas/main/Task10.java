package by.htp.homework3.array2mas.main;

import java.util.Random;

public class Task10 {
	/*
	 * 10. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
	 */
	public static void main(String[] args) {

		System.out.println("task10");

		int[][] array1 = arrayСreation(4, 4);

		array1 = arrayFillingRandom(array1, 10);

		arrayPrint(array1);

		arrayPrintK(array1, 2);

		arrayPrintP(array1, 3);
	}

	public static void arrayPrintK(int[][] args, int k) {

		printInt("Строка ", k);

		if (k >= 0 && k < args.length) {
			for (int i = 0; i < args.length; i++) {
				System.out.print(args[k][i] + " ");
			}
		} else {
			System.out.print("Такой строки нет");
		}

		System.out.println();
	}

	public static void arrayPrintP(int[][] args, int p) {

		printInt("Столбец ", p);

		if (p >= 0 && p < args[0].length) {
			for (int i = 0; i < args[0].length; i++) {
				System.out.print(args[i][p] + " ");
			}
		} else {
			System.out.print("Такого столбца нет");
		}

		System.out.println();
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

	public static int[][] arrayСreation(int a, int b) {

		int[][] array = new int[a][b];

		return array;
	}

	public static void printInt(String s, int a) {

		System.out.println(s + a);

	}
}
