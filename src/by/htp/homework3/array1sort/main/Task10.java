package by.htp.homework3.array1sort.main;

import java.util.Random;

public class Task10 {
	/*
	 * 10. Сортировка подсчетом. Выходной массив заполняется значениями -1. Затем
	 * для каждого элемента определяется его место в выходном массиве путем подсчета
	 * количества элементов строго меньших данного. Естественно, что все одинаковые
	 * элементы попадают на одну позицию, за которой следует ряд значений -1. После
	 * этого оставшиеся в выходном массиве позиции со значением -1 заполняются
	 * копией предыдущего значения.
	 */
	public static void main(String[] args) {

		System.out.println("task10");

		int[] array1 = arrayСreation(10);
		array1 = arrayFillingRandom(array1, 100);
		arrayPrint(array1);

		array1 = sort(array1, array1.length);
		arrayPrint(array1);

	}

	public static int[] sort(int[] input, int n) {

		int min = 0, max = 0;

		for (int i = 1; i < n; i++) {

			if (input[i] > max) {
				max = input[i];
			}

			if (input[i] < min) {
				min = input[i];
			}

		}

		int range = max - min + 1;
		int[] count = new int[range];

		for (int i = 0; i < n; i++) {
			count[input[i] - min]++;
		}

		for (int i = 1; i < range; i++) {
			count[i] += count[i - 1];
		}

		int j = 0;

		for (int i = 0; i < range; i++) {

			while (j < count[i]) {
				input[j++] = i + min;
			}

		}

		return input;
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

		for (int i = 0; i < args.length; i++) {
			args[i] = rand.nextInt(a);
		}

		return args;
	}
}
