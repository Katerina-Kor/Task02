//ƒана последовательность натуральных чисел а1 а2... —оздать массив из четных чисел этой последовательности. ≈сли таких чисел нет, то вывести сообщение об этом факте.

package by.htp.task03.main;

public class Massive4 {

	public static void main(String[] args) {
		int[] var = { 1, 3, 5, 7, 7, 9, 11, 11, 11, 13, 15, 21 };
		int k = 0; // будет считать количество элементов в массиве var

		for (int i = 0; i < var.length; i++) {
			if ((var[i] % 2) == 0) {
				k++;
			}
		}
		if (k == 0) {
			System.out.println("¬ массиве нет четных чисел");
			return;
		}
		int[] end = new int[k];
		int j = 0;
		for (int i = 0; i < var.length; i++) {
			if ((var[i] % 2) == 0) {
				end[j] = var[i];
				j++;
			}
		}
		for (int i = 0; i < end.length; i++) {
			System.out.print(end[i] + " ");
		}

	}

}
