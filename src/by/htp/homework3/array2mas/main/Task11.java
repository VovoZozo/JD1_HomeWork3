package by.htp.homework3.array2mas.main;

import java.util.Random;

public class Task11 {
	/*
	 * 11. Дана матрица размера m x n. Вывести ее элементы в следующем порядке:
	 * первая строка справа налево, вторая строка слева направо, третья строка
	 * справа налево и так далее.
	 */
	public static void main(String[] args) {
		System.out.println("task11");

		int[][] array1 = arrayСreation(4, 4);

		array1 = arrayFillingRandom(array1, 10);

		arrayPrint(array1);

		arrayPrintLeftRight(array1);
	}

	public static void arrayPrintLeftRight(int[][] args) {

		for (int i = 0; i < args.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < args[0].length - 1; j++) {
					System.out.print(args[i][j] + "\t");
				}
				System.out.print(args[i][args[0].length - 1]);
			} else {
				for (int j = args[0].length - 1; j > 0; j--) {
					System.out.print(args[i][j] + "\t");
				}
				System.out.print(args[i][0]);
			}

			System.out.println();
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
