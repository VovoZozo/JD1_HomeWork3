package by.htp.homework3.array2mas.main;

import java.util.Random;

public class Task05 {
	/*
	 * 5. Дана матрица. Вывести на экран все четные строки, то есть с четными
	 * номерами.
	 */
	public static void main(String[] args) {

		System.out.println("task05");

		int[][] array1 = arrayСreation(5, 5);

		array1 = arrayFillingRandom(array1, 10);

		arrayPrintFirstAndLess(array1);

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

	public static void arrayPrintFirstAndLess(int[][] args) {

		for (int i = 0; i < args.length; i = i + 2) {
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
