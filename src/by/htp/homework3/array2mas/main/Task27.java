package by.htp.homework3.array2mas.main;

import java.util.Scanner;

public class Task27 {
	/*
	 * 27. В числовой матрице поменять местами два столбца любых столбца, т. е. все
	 * элементы одного столбца поставить на соответствующие им позиции другого, а
	 * его элементы второго переместить в первый. Номера столбцов вводит
	 * пользователь с клавиатуры.
	 */
	public static void main(String[] args) {

		System.out.println("task26");

		int arrayLineLehgth = scan("Введите количество строк массива ");
		int arrayColumnLehgth = scan("Введите количество столбцов массива ");

		int[][] array1 = arrayСreation(arrayLineLehgth, arrayColumnLehgth);
		array1 = arrayFilling(array1);
		arrayPrint(array1);

		int[][] array1replace = replaceMaxMin(array1);
		arrayPrint(array1replace);

	}

	public static int[][] replaceMaxMin(int[][] args) {

		int column1 = scan("Введите номер первого столбца для перемещения ");
		int column2 = scan("Введите номер второго столбца для перемещения ");

		int temp = 0;

		for (int i = 0; i < args.length; i++) {

			temp = args[i][column1];
			args[i][column1] = args[i][column2];
			args[i][column2] = temp;

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

	public static int[][] arrayFilling(int[][] args) {

		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args[0].length; j++) {
				args[i][j] = scan(" Введите целое число ");
			}
		}

		return args;
	}

	public static int[][] arrayСreation(int a, int b) {

		int[][] array = new int[a][b];

		return array;
	}

	public static int scan(String s) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(s);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(s);
		}

		int number;
		number = sc.nextInt();

		return number;
	}

	public static void arrayPrint(int[] args) {

		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}

		System.out.println();
	}

}

