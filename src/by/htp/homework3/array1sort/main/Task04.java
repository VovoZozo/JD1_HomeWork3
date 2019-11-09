package by.htp.homework3.array1sort.main;

import java.util.Random;

public class Task04 {
	/*
	 * 4. Сортировка обменами. Дана последовательность чисел
	 * 
	 * a1  a2  an
	 * 
	 * .Требуется переставить числа в порядке возрастания. Для этого сравниваются
	 * два соседних числа ai и ai+1 . Если ai  ai+1 , то делается перестановка. Так
	 * продолжается до тех пор, пока все элементы не станут расположены в порядке
	 * возрастания. Составить алгоритм сортировки, подсчитывая при этом количества
	 * перестановок.
	 */
	public static void main(String[] args) {

		System.out.println("task04");

		int[] array1 = arrayСreation(1000);
		array1 = arrayFillingRandom(array1, 100);
		arrayPrint(array1);

		array1 = arraySort(array1);
		arrayPrint(array1);
	}

	public static int[] arraySort(int[] args) {

		boolean isSorted = false;
		int buf;
		int count = 0;

		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < args.length - 1; i++) {
				if (args[i] > args[i + 1]) {
					isSorted = false;
					count++;
					buf = args[i];
					args[i] = args[i + 1];
					args[i + 1] = buf;
				}
			}
		}
		System.out.println("Количество перестановок = " + count);
		return args;
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
