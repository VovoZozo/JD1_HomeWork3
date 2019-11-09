package by.htp.homework3.array1sort.main;

import java.util.Random;

public class Task01 {
	/*
	 * 1. Заданы два одномерных массива с различным количеством элементов и
	 * натуральное число k. Объединить их в один массив, включив второй массив между
	 * k-м и (k+1) - м элементами первого, при этом не используя дополнительный
	 * массив.
	 */
	public static void main(String[] args) {

		System.out.println("task01");

		int k = randomInt(8);
		printInt("Дано число k = ", k);

		int[] array1 = arrayСreation(10);
		array1 = arrayFillingRandom(array1, 100);
		arrayPrint(array1);

		int[] array2 = arrayСreation(5);
		array2 = arrayFillingRandom(array2, 10);
		arrayPrint(array2);

		int[] array3 = arrayСombine(array1, array2, k);
		arrayPrint(array3);
	}

	public static int[] arrayСombine(int[] args1, int[] args2, int k) {
		int[] args3 = new int[args1.length + args2.length];

		for (int i = 0; i < k; i++) {
			args3[i] = args1[i];
		}

		for (int i = k; i < k + args2.length; i++) {
			args3[i] = args2[i - k];
		}

		for (int i = k + args2.length; i < args3.length; i++) {
			args3[i] = args1[i - args2.length];
		}

		return args3;
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

	public static void printInt(String s, int a) {

		System.out.println(s + a);

	}

	public static int randomInt(int a) {

		Random rand = new Random();
		int x = rand.nextInt(a);

		return x;
	}
}