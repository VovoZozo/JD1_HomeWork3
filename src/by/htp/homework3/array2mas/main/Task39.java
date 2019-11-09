package by.htp.homework3.array2mas.main;

import java.util.Scanner;

public class Task39 {
	// 39. Найдите произведение двух матриц.
	public static void main(String[] args) {

		System.out.println("task39");

		do {

			int[][] a = GetArray(1);
			int[][] b = GetArray(2);

			if (Error(a, b) == true) {
				System.out.println("Cумма матриц А и Б равна: ");
				PrintArray(SumArray(a, b));
			}

		} while (stop());

		System.out.println("By-by");
	}

	public static int GetInt() {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		while (!scanner.hasNextInt()) {
			System.out.println("Это не целое число!!! Попробуйте снова.");
			scanner.next();
		}

		int number = scanner.nextInt();

		if (number < 0) {
			System.out.println("Вы ввели отрицательное число.");
			System.out.println("Для дальнейших расчетов будет использован его модуль!!! " + number * (-1));
			number = number * (-1);
		}

		return number;
	}

	public static int[][] GetArray(int a) {

		System.out.print("Введите количество строк матрицы " + a + " : ");
		int matA = GetInt();

		System.out.print("Введите количество столбцов матрицы " + a + " : ");
		int matB = GetInt();

		int[][] array = new int[matA][matB];

		for (int[] array1 : array) {
			for (int j = 0; j < array1.length; j++) {
				array1[j] = (int) (Math.random() * 10);
			}
		}

		System.out.println("Матрица " + a + " : ");
		PrintArray(array);

		return array;
	}

	public static int[][] SumArray(int[][] a, int[][] b) {

		Error(a, b);

		int[][] sum = new int[a.length][b[0].length];

		for (int i = 0; i < sum[0].length; i++) {
			for (int j = 0; j < sum.length; j++) {
				for (int k = 0; k < a[0].length; k++) {
					sum[i][j] = sum[i][j] + a[i][k] * b[k][j];
				}
			}
		}

		return sum;
	}

	public static void PrintArray(int[][] a) {

		for (int[] a1 : a) {
			for (int j = 0; j < a1.length; j++) {
				System.out.print(a1[j] + "\t");
			}
			System.out.println();
		}

	}

	public static boolean Error(int[][] a, int[][] b) {

		if (a.length != 0 && b.length != 0 && a[0].length != 0 && b[0].length != 0) {
			if (a.length != b[0].length || a[0].length != b.length) {
				System.out.println("Размерности не совпадают!!!");
				return false;
			}
			return true;
		} else {
			System.out.println("Размер строки или столбца равен нулю!!!");
			return false;
		}

	}

	public static boolean stop() {

		System.out.println("Если хотите повторить введите любое целое число");
		System.out.println("Если хотите завершить программу введите 0");

		int stopInt = GetInt();

		return stopInt != 0;
	}

}
