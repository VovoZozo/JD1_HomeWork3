package by.htp.homework3.array2mas.main;

import java.util.Arrays;
import java.util.Random;

public class Task32 {
	/*
	 * 32. Отсортировать строки матрицы по возрастанию и убыванию значений
	 * элементов.
	 */
	public static void main(String[] args) {

		System.out.println("task32");

		int[][] array1 = arrayСreation(10, 20);

		array1 = arrayFilling(array1, 16);

		arrayPrint(array1);

		int[][] arrayLineSortAscending = arrayLineSortAscending(array1);
		arrayPrint(arrayLineSortAscending);

		int[][] arrayLineSortDescending = arrayLineSortDescending(array1);
		arrayPrint(arrayLineSortDescending);
	}
	// Arrays.sort([]a, Collections.reverseOrder());

	public static int[][] arrayLineSortDescending(int[][] args) {

		for (int k = 0; k < args.length; k++) {
			for (int i = 0; i < args[k].length; i++) {

				int max = args[k][i];
				int max_i = i;

				for (int j = i + 1; j < args[k].length; j++) {
					if (args[k][j] > max) {
						max = args[k][j];
						max_i = j;
					}
				}

				if (i != max_i) {
					int tmp = args[k][i];
					args[k][i] = args[k][max_i];
					args[k][max_i] = tmp;
				}
			}
		}
		return args;
	}

	public static int[][] arrayLineSortAscending(int[][] args) {

		for (int i = 0; i < args.length; i++) {
			Arrays.sort(args[i]);
		}
		return args;
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
