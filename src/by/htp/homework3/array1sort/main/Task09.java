package by.htp.homework3.array1sort.main;

import java.util.Random;

public class Task09 {

	/*
	 * 9. Алгоритм фон Неймана. Упорядочить массив по неубыванию с помощью 1) каждая
	 * пара соседних элементов сливается в одну группу из двух элементов (последняя
	 * группа может состоять из одного элемента); 2) каждая пара соседних
	 * двухэлементных групп сливается в одну четырехэлементную группу и т. д. При
	 * каждом слиянии новая укрупненная группа упорядочивается. алгоритма сортировки
	 * слияниями:
	 */

	public static void main(String[] args) {

		System.out.println("task09");

		int[] array1 = arrayСreation(10);
		array1 = arrayFillingRandom(array1, 100);
		arrayPrint(array1);

		array1 = mergeSort(array1);
		arrayPrint(array1);
	}

	public static int[] mergeSort(int[] a) {

		int[] tmpArray = new int[a.length];

		mergeSort(a, tmpArray, 0, a.length - 1);

		return tmpArray;
	}

	private static void mergeSort(int[] a, int[] tmpArray, int left, int right) {

		if (left < right) {

			int center = (left + right) / 2;

			mergeSort(a, tmpArray, left, center);

			mergeSort(a, tmpArray, center + 1, right);

			merge(a, tmpArray, left, center + 1, right);

		}

	}

	private static void merge(int[] a, int[] tmpArray, int leftPos, int rightPos, int rightEnd) {

		int leftEnd = rightPos - 1;

		int tmpPos = leftPos;

		int numElements = rightEnd - leftPos + 1;

		while (leftPos <= leftEnd && rightPos <= rightEnd) {

			if (a[leftPos] <= (a[rightPos])) {
				tmpArray[tmpPos++] = a[leftPos++];
			} else {
				tmpArray[tmpPos++] = a[rightPos++];
			}

		}

		while (leftPos <= leftEnd) {

			tmpArray[tmpPos++] = a[leftPos++];
		}

		while (rightPos <= rightEnd) {

			tmpArray[tmpPos++] = a[rightPos++];
		}

		for (int i = 0; i < numElements; i++, rightEnd--) {

			a[rightEnd] = tmpArray[rightEnd];
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

		for (int i = 0; i < args.length; i++) {
			args[i] = rand.nextInt(a);
		}

		return args;
	}

}
