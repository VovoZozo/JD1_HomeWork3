package by.htp.homework3.array1sort.main;

import java.util.Random;

public class Task07 {
	/*
	 * 7. Пусть даны две неубывающие последовательности действительных чисел .
	 * Требуется указать те места, на которые нужно вставлять
	 * 
	 * элементы второй последовательности
	 * 
	 * в первую последовательность так, чтобы новая
	 * 
	 * последовательность оставалась возрастающей.
	 */
	public static void main(String[] args) {

		System.out.println("task07");

		int[] array1 = arrayСreation(10);
		array1 = arrayFillingRandom(array1, 100);
		arrayPrint(array1);

		int[] array2 = arrayСreation(10);
		array2 = arrayFillingRandom(array2, 100);
		arrayPrint(array2);

		printLocationInsert(array2, array1);

	}

	private static void printLocationInsert(int[] array1, int[] array2) {

		boolean flagIns;

		for (int i = 0; i < array1.length; i++) {

			flagIns = true;

			for (int j = 0; j < array2.length; j++) {
				if (array1[i] < array2[j]) {
					System.out.printf("%d елемент второго масс. вставим до %d элем. первого\n", i, j);
					flagIns = false;
					break;
				}
			}

			if (flagIns)
				System.out.printf("%d елемент второго масс. вставим после последенго элем. первого\n", i);
		}

	}

	public static void arrayPrint(int[] args) {

		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}

		System.out.println();
	}

	public static int[] arrayСreation(int i) {

		int[] array = new int[i];

		return array;

	}

	public static int[] arrayFillingRandom(int[] args, int a) {

		Random rand = new Random();

		for (int i = 1; i < args.length; i++) {
			do {
				args[i] = rand.nextInt(a);
			} while (args[i] < args[i - 1]);

		}

		return args;
	}
}
