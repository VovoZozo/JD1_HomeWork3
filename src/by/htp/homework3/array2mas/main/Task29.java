package by.htp.homework3.array2mas.main;

import java.util.Random;

public class Task29 {
	// 29. Найти положительные элементы главной диагонали квадратной матрицы.
	public static void main(String[] args) {
		
		System.out.println("task29");

		int[][] array1 = arrayСreation(3);

		array1 = arrayFilling(array1, 10);

		arrayPrint(array1);
		
		int sumDioganal = arraySumDiagonal(array1);
		printInt("Сумма эелементов на главной диагонали = ", sumDioganal);
	}

	public static int arraySumDiagonal(int[][] args) {
		
		int sum = 0;
		
		for (int i = 0, j = 0; i < args.length; i++, j++) {
			sum = sum + args[i][j];
		}

		return sum;
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

	public static int[][] arrayСreation(int a) {

		int[][] array = new int[a][a];

		return array;
	}

	public static void printInt(String s, int a) {

		System.out.println(s + a);

	}
}