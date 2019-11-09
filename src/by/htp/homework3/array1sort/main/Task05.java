package by.htp.homework3.array1sort.main;

import java.util.Random;

public class Task05 {
	/*
	 * 5. Сортировка вставками. Дана последовательность чисел
	 * 
	 * a a an , , , 1 2  . Требуется переставить числа в порядке возрастания.
	 * Делается это следующим образом. Пусть a a ai , , , 1 2  - упорядоченная
	 * последовательность, т. е.
	 * 
	 * a1  a2  an
	 * 
	 * . Берется следующее
	 * 
	 * число ai+1 и вставляется в последовательность так, чтобы новая
	 * последовательность была тоже возрастающей. Процесс производится до тех пор,
	 * пока все элементы от i +1 до n не будут перебраны. Примечание. Место
	 * помещения очередного элемента в отсортированную часть производить с помощью
	 * двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
	 */
	public static void main(String[] args) {

		System.out.println("task05");

		int[] array1 = arrayСreation(10);
		array1 = arrayFillingRandom(array1, 100);
		arrayPrint(array1);

		array1 = binaryInsertionSort(array1);
		arrayPrint(array1);
	}

	public static int binarySearch(int a[], int low, int high, int key) {

		int mid;

		if (low == high) {
			return low;
		}

		mid = low + ((high - low) / 2);

		if (key > a[mid]) {
			return binarySearch(a, mid + 1, high, key);
		} else if (key < a[mid]) {
			return binarySearch(a, low, mid, key);
		}

		return mid;
	}

	public static int[] binaryInsertionSort(int[] a) {

		int ins, i, j;
		int tmp;

		for (i = 1; i < a.length; i++) {

			ins = binarySearch(a, 0, i, a[i]);
			tmp = a[i];

			for (j = i - 1; j >= ins; j--) {
				a[j + 1] = a[j];
			}

			a[ins] = tmp;
		}

		return a;
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
