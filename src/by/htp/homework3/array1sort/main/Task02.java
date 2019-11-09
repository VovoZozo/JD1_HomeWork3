package by.htp.homework3.array1sort.main;

import java.util.Arrays;
import java.util.Random;

public class Task02 {
	/*
	 * 2. Даны две последовательности
	 * 
	 * a1  a2  an и b1  b2  bm
	 * 
	 * . Образовать из них новую последовательность чисел так, чтобы она тоже была
	 * неубывающей. Примечание. Дополнительный массив не использовать.
	 */
	public static void main(String[] args) {

		System.out.println("task02");

		int[] array1 = arrayСreation(2);
		array1 = arrayFillingRandom(array1, 1000);
		arrayPrint(array1);

		int[] array2 = arrayСreation(2);
		array2 = arrayFillingRandom(array2, 1000);
		arrayPrint(array2);

		int[] array3 = arrayСombine(array1, array2);
		arrayPrint(array3);

	}

	public static int[] arrayСombine(int[] args1, int[] args2) {

		int[] args3 = new int[(args1.length + args2.length)];
		int count = 0;

		for (int i = 0; i < args1.length; i++) {
			args3[i] = args1[i];
		}

		for (int i = args1.length; i < args3.length; i++) {
			args3[i] = args2[count];
			count++;
		}

		Arrays.sort(args3);

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

		for (int i = 1; i < args.length; i++) {
			do {
				args[i] = rand.nextInt(a);
			} while (args[i] < args[i - 1]);

		}

		return args;
	}
}

