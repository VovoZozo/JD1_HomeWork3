package by.htp.homework3.array2mas.main;

import java.util.Arrays;
import java.util.Random;

public class Task33 {
	// 33. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
	public static void main(String[] args) {
		System.out.println("task33");

		int[][] array1 = arrayСreation(10, 20);

		array1 = arrayFilling(array1, 16);

		arrayPrint(array1);

		int[][] arrayColumnsSortAscending = arrayColumnsSortAscending(array1);
		arrayPrint(arrayColumnsSortAscending);

		int[][] arrayColumnsSortDescending = arrayColumnsSortDescending(array1);
		arrayPrint(arrayColumnsSortDescending);
	}

	public static int[][] arrayColumnsSortDescending(int[][] args) {

		int[] temp = new int[args.length];

		for (int k = 0; k < args[0].length; k++) {

			for (int i = 0; i < args.length; i++) {

				temp[i] = args[i][k];
			}

			Arrays.sort(temp);

			for (int i = 0; i < args.length; i++) {

				args[i][k] = temp[i];

			}

		}

		return args;
	}

	public static int[][] arrayColumnsSortAscending(int[][] args) {

		int[] temp = new int[args.length];

		for (int k = 0; k < args[0].length; k++) {

			for (int i = 0; i < args.length; i++) {

				temp[i] = args[i][k];

			}

			arraySort(temp);

			for (int i = 0; i < args.length; i++) {

				args[i][k] = temp[i];

			}

		}

		return args;
	}

	public static int[] arraySort(int[] args) {

		for (int i = 0; i < args.length; i++) {

			int max = args[i];
			int max_i = i;

			for (int j = i + 1; j < args.length; j++) {
				if (args[j] > max) {
					max = args[j];
					max_i = j;
				}
			}

			if (i != max_i) {
				int tmp = args[i];
				args[i] = args[max_i];
				args[max_i] = tmp;
			}
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
