package by.htp.homework3.array2mas.main;

public class Task25 {
	// 25. Получить квадратную матрицу порядка n:
	public static void main(String[] args) {

		System.out.println("task25");

		int[][] array1 = arrayСreation(10);

		array1 = arrayFilling(array1, 10);

		arrayPrint(array1);
	}

	public static int[][] arrayFilling(int[][] args, int a) {

		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args[0].length; j++) {
				args[i][j] = j + 1 + args.length * i;
			}
		}

		return args;
	}

	public static void arrayPrint(int[][] args) {

		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args[0].length - 1; j++) {
				System.out.print(args[i][j] + "\t");
			}
			System.out.print(args[i][args[0].length - 1]);
			System.out.println();
		}

		System.out.println();
	}

	public static int[][] arrayСreation(int a) {

		int[][] array = new int[a][a];

		return array;
	}

}
