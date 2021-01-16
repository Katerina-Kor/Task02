//Даны целые числа а1 а2... Вывести на печать только те числа, для которых аi > i.

package by.htp.task03.main;

public class Massive8 {

	public static void main(String[] args) {
		int[] var = { 0, 1, -9, -3, 1, 0, 5, 50, 11 };

		for (int i = 0; i < var.length; i++) {
			if (var[i] > i) {
				System.out.println(var[i]);
			}
		}

	}

}
