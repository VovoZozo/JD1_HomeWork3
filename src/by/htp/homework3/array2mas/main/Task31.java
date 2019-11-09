package by.htp.homework3.array2mas.main;

public class Task31 {
	/*
	 * 31. Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. Посчитать
	 * количество двузначных чисел в ней.
	 */
	public static void main(String[] args) {

		System.out.println("task31");

		int[][] array1 = arrayСreation(50, 20);

		array1 = arrayFilling(array1);

		arrayPrint(array1);

		int countDoubleDigit = countDoubleDigit(array1);
		printInt("Количество двухзначных чисел = ", countDoubleDigit);
	}

	public static int[][] arrayFilling(int[][] args) {

		int count = 0;

		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args[0].length; j++) {
				args[i][j] = count;
				count++;
			}
		}

		return args;
	}

	public static int countDoubleDigit(int[][] args) {

		int count = 0;

		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args[0].length; j++) {
				if (args[i][j] >= 10 && args[i][j] < 100) {
					count++;
				}
			}
		}

		return count;
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
