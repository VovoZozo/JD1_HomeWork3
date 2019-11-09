package by.htp.homework3.array1sort.main;

import java.util.Random;

public class Task06 {
	/*
	 * 6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить
	 * его по возрастанию. Делается это следующим образом: сравниваются два соседних
	 * элемента ai и ai+1 . Если ai  ai+1 , то продвигаются на один элемент вперед.
	 * Если ai  ai+1 , то производится перестановка и сдвигаются на один элемент
	 * назад. Составить алгоритм этой сортировки.
	 */
	public static void main(String[] args) {

		System.out.println("task06");

		int[] array1 = arrayСreation(10);
		array1 = arrayFillingRandom(array1, 100);
		arrayPrint(array1);

		array1 = sort(array1);
		arrayPrint(array1);
	}

	public static int[] sort(int[] array) {

		int h = 1;

		while (h * 3 < array.length) {
			h = h * 3 + 1;
		}

		while (h >= 1) {
			hSort(array, h);
			h = h / 3;
		}

		return array;
	}

	private static void hSort(int[] array, int h) {

		int length = array.length;

		for (int i = h; i < length; i++) {
			for (int j = i; j >= h; j = j - h) {
				if (array[j] < array[j - h]) {
					swap(array, j, j - h);
				} else {
					break;
				}
			}
		}
	}

	public static void swap(int[] array, int i, int j) {

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

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
