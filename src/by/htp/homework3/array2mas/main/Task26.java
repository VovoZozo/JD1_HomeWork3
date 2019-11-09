package by.htp.homework3.array2mas.main;

import java.util.Scanner;

public class Task26 {
	/*
	 * 26. С клавиатуры вводится двумерный массив чисел размерностью nxm. Выполнить
	 * с массивом следующие действия: а) вычислить сумму отрицательных элементов в
	 * каждой строке; б) определить максимальный элемент в каждой строке; в)
	 * переставить местами максимальный и минимальный элементы матрицы.
	 */
	public static void main(String[] args) {

		System.out.println("task26");

		int arrayLineLehgth = scan("Введите количество строк массива ");
		int arrayColumnLehgth = scan("Введите количество столбцов массива ");

		int[][] array1 = arrayСreation(arrayLineLehgth, arrayColumnLehgth);
		array1 = arrayFilling(array1);
		arrayPrint(array1);

		int[] sum = sum(array1);
		arrayPrint(sum);

		int[] max = max(array1);
		arrayPrint(max);

		int[][] array1MaxMin = replaceMaxMin(array1);
		arrayPrint(array1MaxMin);
	}

	public static int[][] replaceMaxMin(int[][] args) {

		int maxI = 0;
		int maxJ = 0;
		int minI = 0;
		int minJ = 0;

		for (int i = 0; i < args.length; i++)
			for (int j = 0; j < args[i].length; j++) {
				if (args[maxI][maxJ] < args[i][j]) {
					maxI = i;
					maxJ = j;
				}

				if (args[minI][minJ] > args[i][j]) {
					minI = i;
					minJ = j;
				}
			}

		int tmp = args[maxI][maxJ];
		args[maxI][maxJ] = args[minI][minJ];
		args[minI][minJ] = tmp;

		return args;
	}

	public static int[] max(int[][] args) {

		int[] max = new int[args.length];

		for (int i = 0; i < args.length; i++) {
			max[i] = args[i][0];
			for (int j = 1; j < args[0].length; j++) {
				if (args[i][j] > max[i]) {
					max[i] = args[i][j];
				}
			}
		}

		return max;
	}

	public static int[] sum(int[][] args) {

		int[] sum = new int[args.length];

		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args[0].length; j++) {
				if (args[i][j] < 0) {
					sum[i] = sum[i] + args[i][j];
				}
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
