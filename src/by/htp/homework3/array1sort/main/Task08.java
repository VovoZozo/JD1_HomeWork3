package by.htp.homework3.array1sort.main;

import java.util.Arrays;
import java.util.Random;

public class Task08 {
	/*
	 * 8.Даны дроби pi qi , - натуральные). Составить программу, которая приводит
	 * эти
	 * 
	 * дроби к общему знаменателю и упорядочивает их в порядке возрастания.
	 */
	public static void main(String[] args) {

		System.out.println("task08");

		long[] arrayNumerators = arrayСreation(10);
		arrayNumerators = arrayFillingRandom(arrayNumerators, 9);

		long[] arrayDenominotors = arrayСreation(10);
		arrayDenominotors = arrayFillingRandom(arrayDenominotors, 9);

		printArrayFraction(arrayNumerators, arrayDenominotors);

		long commonDenominator = findCommonDenominator(arrayDenominotors);

		arrayNumerators = commonDenominatorNumerator(arrayDenominotors, arrayNumerators, commonDenominator);
		arrayNumerators = sortNumerator(arrayNumerators);
		arrayDenominotors = commonDenominator(arrayDenominotors, commonDenominator);
		printArrayFraction(arrayNumerators, arrayDenominotors);

	}

	public static long[] sortNumerator(long[] arrayNumerators) {

		Arrays.sort(arrayNumerators);

		return arrayNumerators;
	}

	public static long[] commonDenominatorNumerator(long[] arrayDenominotors, long[] arrayNumerators,
			long commonDenominator) {

		for (int i = 0; i < arrayDenominotors.length; i++) {
			arrayNumerators[i] = arrayNumerators[i] * commonDenominator / arrayDenominotors[i];

		}

		return arrayNumerators;
	}

	public static long[] commonDenominator(long[] arrayDenominotors, long commonDenominator) {

		for (int i = 0; i < arrayDenominotors.length; i++) {
			arrayDenominotors[i] = commonDenominator;
		}

		return arrayDenominotors;
	}

	public static long findCommonDenominator(long[] arrayDenominotors) {

		long commonDenominator = 1;

		for (int i = 0; i < arrayDenominotors.length; i++) {
			commonDenominator *= arrayDenominotors[i];
		}

		return commonDenominator;
	}

	public static void printArrayFraction(long[] arrayNumerators, long[] arrayDenominotors) {

		for (int i = 0; i < arrayNumerators.length; i++) {
			System.out.print(arrayNumerators[i] + "/" + arrayDenominotors[i] + "; ");
		}

		System.out.println();

	}

	public static void arrayPrint(long[] args) {

		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}

		System.out.println();
	}

	public static long[] arrayСreation(int i) {

		long[] array = new long[i];

		return array;

	}

	public static long[] arrayFillingRandom(long[] args, int a) {

		Random rand = new Random();

		for (int i = 0; i < args.length; i++) {
			args[i] = rand.nextInt(a) + 1;
		}

		return args;
	}

}
