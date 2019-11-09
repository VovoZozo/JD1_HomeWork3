package by.htp.homework3.array2mas.main;

import java.util.Random;

public class Task02 {
	/*
	 * 2. Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами
	 * из [0, 9].
	 */
	public static void main(String[] args) {

		System.out.println("task02");

		int[][] array1 = arrayСreation(2, 3);

		array1 = arrayFillingRandom(array1, 10);

		arrayPrint(array1);
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
