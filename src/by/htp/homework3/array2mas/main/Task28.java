package by.htp.homework3.array2mas.main;

import java.util.Random;

public class Task28 {
	/*
	 * 28. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом
	 * столбце. Определить, какой столбец содержит максимальную сумму.
	 */
	public static void main(String[] args) {

		System.out.println("task28");

		int[][] array1 = arrayСreation(4, 6);
		array1 = arrayFilling(array1, 10);
		arrayPrint(array1);

		int[] sum = sum(array1);
		arrayPrint(sum);

		int maxColumn = maxColumn(sum);
		printInt("Максимальная сумма в столбце № ", maxColumn);
	}

	public static int maxColumn(int[] args) {

		int max = 0;
		int maxColumn = 0;
		for (int i = 0; i < args.length; i++) {
			if (args[i] > max) {
				max = args[i];
				maxColumn = i + 1;
			}
		}

		return maxColumn;
	}

	public static int[] sum(int[][] args) {

		int[] sum = new int[args[0].length];

		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args[0].length; j++) {
				sum[j] = sum[j] + args[i][j];
			}
		}

		return sum;
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

	public static int[][] arrayFilling(int[][] args, int a) {

		Random rand = new Random();

		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args[0].length; j++) {
				args[i][j] = rand.nextInt(a);
			}
		}

		return args;
	}

	public static int[][] arrayСreation(int a, int b) {

		int[][] array = new int[a][b];

		return array;
	}

	public static void arrayPrint(int[] args) {

		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}

		System.out.println();
	}

	public static void printInt(String s, int a) {

		System.out.println(s + a);

	}
}
