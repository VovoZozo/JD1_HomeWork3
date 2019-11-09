package by.htp.homework3.array2mas.main;

import java.util.Scanner;

public class Task38 {
	// 38. Найдите сумму двух матриц
	public static void main(String[] args) {

		System.out.println("task38");

		do {
			
			int[][] a = GetArray(1);
			int[][] b = GetArray(2);
			
			if (Error(a, b) == true) {
				System.out.println("Поэлементная сумма матриц А и Б равна: ");
				PrintArray(SumArray(a, b));
				System.out.println("Поэлементная разность матриц А и Б равна: ");
				PrintArray(SubstractionArray(a, b));
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
			System.out.println("Для дальнейших расчетов будет использован его модуль!!!");
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

		int[][] sum = new int[a.length][a[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}

		return sum;
	}

	public static int[][] SubstractionArray(int[][] a, int[][] b) {

		int[][] Substract = new int[a.length][a[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				Substract[i][j] = a[i][j] - b[i][j];
			}
		}

		return Substract;
	}

	public static boolean Error(int[][] a, int[][] b) {

		if (a.length != 0 && b.length != 0 && a[0].length != 0 && b[0].length != 0) {
			return !(a.length != b.length || a[0].length != b[0].length);
		} else {
			System.out.println("Размерности не совпадают!!!");
			return false;
		}

	}

	public static void PrintArray(int[][] a) {

		for (int[] a1 : a) {
			for (int j = 0; j < a1.length; j++) {
				System.out.print(a1[j] + "\t");
			}
			System.out.println();
		}

	}

	public static boolean stop() {

		System.out.println("Если хотите повторить введите любое целое число");
		System.out.println("Если хотите завершить программу введите 0");

		int stopInt = GetInt();

		return stopInt != 0;
	}
}
