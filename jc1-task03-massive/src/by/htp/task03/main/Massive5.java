// Дана последовательность чисел а1 а2... Указать наименьшую длину числовой оси, содержащую все эти числа.

package by.htp.task03.main;

public class Massive5 {

	public static void main(String[] args) {
		int[] var = { 20, 5, 1, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -20 };
		int D;

		if (var[0] < var[var.length - 1]) {
			D = var[var.length - 1] - var[0];
		} else {
			D = var[0] - var[var.length - 1];
		}

		System.out.println(D);

	}

}
