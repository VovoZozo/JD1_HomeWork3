package by.htp.homework3.array2mas.main;

import java.util.Random;

public class Task30 {
	/*
	 * 30. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран
	 * саму матрицу и номера строк, в которых число 5 встречается три и более раз.
	 */
	public static void main(String[] args) {
		System.out.println("task30");

		int[][] array1 = arrayСreation(10, 20);

		array1 = arrayFilling(array1, 16);

		arrayPrint(array1);

		arrayPrintLine5(array1);
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

	public static void arrayPrintLine5(int[][] args) {

		int count = 0;

		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args[0].length - 1; j++) {
				if (args[i][j] == 5) {
					count++;
				}
			}
			if (count >= 3) {
				System.out.print("Строка " + i + " содержит " + count + " элементa(ов) равных 5.\n");
			}
			count = 0;
		}
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
