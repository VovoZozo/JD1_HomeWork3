package by.htp.homework3.array2mas.main;

import java.util.Random;

public class Task24 {
	/*
	 * 24. Дан линейный массив
	 * 
	 * n n x , x , , x , x 1 2  −1
	 * 
	 * . Получить действительную квадратную матрицу
	 * 
	 * порядка n:
	 */
	public static void main(String[] args) {
		System.out.println("task24");

		double[] arrayLine = arrayСreationLine(5);
		arrayLine = arrayFillingRandom(arrayLine);

		double[][] array1 = arrayСreation(arrayLine.length);

		array1 = arrayFillingR(array1, arrayLine);

		arrayPrint(array1);
	}

	public static double[][] arrayFillingR(double[][] args, double[] array) {

		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args[0].length; j++) {
				args[i][j] = Math.pow(array[j], i + 1);

			}
		}

		return args;
	}

	public static void arrayPrint(double[][] args) {

		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args[0].length - 1; j++) {
				System.out.printf("%20.3f  ", args[i][j]);
			}
			System.out.printf("%20.3f  ", args[i][args[0].length - 1]);
			System.out.println();
		}

		System.out.println();
	}

	public static double[][] arrayСreation(int a) {

		double[][] array = new double[a][a];

		return array;
	}

	public static void printInt(String s, int a) {

		System.out.println(s + a);

	}

	public static void arrayPrint(double[] args) {

		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}

		System.out.println();
	}

	public static double[] arrayСreationLine(int i) {

		double[] array = new double[i];

		return array;

	}

	public static double[] arrayFillingRandom(double[] args) {

		Random rand = new Random();

		for (int i = 0; i < args.length; i++) {
			args[i] = Math.pow(-rand.nextDouble() * 10, rand.nextInt(4));
		}

		return args;
	}
}

