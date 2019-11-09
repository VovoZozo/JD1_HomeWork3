package by.htp.homework3.array2mas.main;

import java.util.Random;

public class Task08 {
	/*
	 * 8. Дан двухмерный массив n×m элементов. Определить, сколько раз встречается
	 * число 7 среди элементов массива.
	 */
	public static void main(String[] args) {

		System.out.println("task08");

		int[][] array1 = arrayСreation(10, 10);

		array1 = arrayFillingRandom(array1, 10);

		arrayPrint(array1);

		int countSeven = arrayOddSum(array1);
		printInt("Число семь встречается ", countSeven, " раз");
	}

	public static int arrayOddSum(int[][] args) {
		
		int count = 0;

		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args[0].length; j++) {
				if (args[i][j] == 7) {
					count++;
				}
			}
		}

		return count;
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

	public static void printInt(String s, int a, String x) {

		System.out.println(s + a + x);

	}
}
