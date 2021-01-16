// В целочисленной последовательности есть нулевые элементы. Создать масссив из номеров этих элементов.

package by.htp.task03.main;

public class Massive2 {

	public static void main(String[] args) {
		int[] var = { 1, 2, -3, 0, 4, 5, 6, 0, 7, -8, 9, 0, 10, 11, 0, 5 };
		int k = 0; // áóäåò ñ÷èòàòü êîëè÷åñòâî ýëåìåíòîâ â ìàññèâå var

		for (int i = 0; i < var.length; i++) {
			if (var[i] == 0) {
				k++;
			}
		}
		int[] end = new int[k];
		int j = 0;
		for (int i = 0; i < var.length; i++) {
			if (var[i] == 0) {
				end[j] = i;
				j++;
			}
		}
		for (int i = 0; i < end.length; i++) {
			System.out.print(end[i] + " ");
		}

	}

}
