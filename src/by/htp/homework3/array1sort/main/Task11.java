package by.htp.homework3.array1sort.main;

import java.util.Random;

public class Task11 {
	/*
	11. «Хитрая» сортировка. Из массива путем однократного просмотра выбирается
	последовательность элементов, расположенных в порядке возрастания, переносится в
	выходной массив и заменяется во входном на -1. Затем оставшиеся элементы включаются в
	полученную упорядоченную последовательность методом «погружения», когда очередной
	элемент путем ряда обменов «погружается» до требуемой позиции в уже упорядоченную
	часть массива.
	
	Пока решена не полностью
	
	*/
	public static void main(String[] args) {
		
		System.out.println("task11");

		int[] array1 = arrayСreation(10);
		array1 = arrayFillingRandom(array1, 100);
		arrayPrint(array1);
		
		array1 = sort(array1);
		arrayPrint(array1);
	}
	
	public static int[] sort(int in[]) {
		int c;
		for ( int i=1; i<in.length; i++) {                 
			for ( int k=i; k !=0 && in[k] < in[k-1]; k--){
				c=in[k];
            	in[k]=in[k-1];
            	in[k-1]=c;
            }
		}
		return in;
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
