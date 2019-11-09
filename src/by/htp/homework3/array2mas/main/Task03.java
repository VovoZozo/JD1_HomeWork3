package by.htp.homework3.array2mas.main;

import java.util.Random;

public class Task03 {
	/*
	 * 3. Дана матрица. Вывести на экран первый и последний столбцы.
	 */
	public static void main(String[] args) {

		System.out.println("task03");

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

		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i][0] + " ");
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
