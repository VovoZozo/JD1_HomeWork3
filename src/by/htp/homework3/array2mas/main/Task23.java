package by.htp.homework3.array2mas.main;

public class Task23 {
	/*
	 * 23. Сформировать квадратную матрицу порядка N по правилу: и подсчитать
	 * количество положительных элементов в ней.
	 */
	public static void main(String[] args) {
		
		System.out.println("task07");

		double[][] array1 = arrayСreation(5);

		array1 = arrayFillingR(array1, 10);

		arrayPrint(array1);
		
		int count = arrayCount(array1);
		printInt("Количество положительных элементов  =  ", count);
	}

	public static int arrayCount(double[][] args) {
		int count = 0;

		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args[0].length; j++) {
				if (args[i][j] > 0) {
					count++;
				}
			}
		}

		return count;
	}

	public static double[][] arrayFillingR(double[][] args, int a) {
		
		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args[0].length; j++) {
				args[i][j] = Math.sin((i*i+j*j)/args.length);
			}
		}

		return args;
	}

	public static void arrayPrint(double[][] args) {

		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args[0].length - 1; j++) {
				System.out.printf("% .3f  ", args[i][j]);
			}
			System.out.printf("% .3f  ", args[i][args[0].length - 1]);
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
}
