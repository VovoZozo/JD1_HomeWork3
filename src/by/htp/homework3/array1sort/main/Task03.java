package by.htp.homework3.array1sort.main;

import java.util.Random;

public class Task03 {
	/*
	 * 3. Сортировка выбором. Дана последовательность чисел
	 * 
	 * a1  a2  an
	 * 
	 * .Требуется переставить элементы так, чтобы они были расположены по убыванию.
	 * Для этого в массиве, начиная с первого, выбирается наибольший элемент и
	 * ставится на первое место, а первый - на место наибольшего. Затем, начиная со
	 * второго, эта процедура повторяется. Написать алгоритм сортировки выбором.
	 */
	public static void main(String[] args) {

		System.out.println("task03");

		int[] array1 = arrayСreation(10);
		array1 = arrayFillingRandom(array1, 100);
		arrayPrint(array1);

		array1 = arraySort(array1);
		arrayPrint(array1);
	}

	public static int[] arraySort(int[] args) {

		for (int i = 0; i < args.length; i++) {

			int max = args[i];
			int max_i = i;

			for (int j = i + 1; j < args.length; j++) {
				if (args[j] > max) {
					max = args[j];
					max_i = j;
				}
			}

			if (i != max_i) {
				int tmp = args[i];
				args[i] = args[max_i];
				args[max_i] = tmp;
			}
		}

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
