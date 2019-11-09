package by.htp.homework3.array2mas.main;

import java.util.Random;

public class Task07 {
	/*
	 * 7. Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных
	 * элементов.
	 */
	public static void main(String[] args) {

		System.out.println("task07");

		int[][] array1 = arrayСreation(5, 5);

		array1 = arrayFillingRandom(array1, 10);

		arrayPrint(array1);

		int sum = arrayOddSum(array1);
		printInt("Сумма отричательных и нечетных элементов массива = ", sum);
	}

	public static int arrayOddSum(int[][] args) {
		int sum = 0;

		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args[0].length; j++) {
				if ((args[i][j] < 0) && (args[i][j] % 2 != 0)) {
					sum = sum + args[i][j];
				}
			}
		}

		return sum;
	}

	public static int[][] arrayFillingRandom(int[][] args, int a) {

		Random rand = new Random();

		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args[0].length; j++) {
				args[i][j] = (int) Math.pow(-rand.nextInt(a), rand.nextInt(4));
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
