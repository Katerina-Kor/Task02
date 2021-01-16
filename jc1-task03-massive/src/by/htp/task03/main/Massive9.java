// Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.

package by.htp.task03.main;

public class Massive9 {

	public static void main(String[] args) {
		double[] Mas = { 5, 9, -5, -9, 0, 8, -50, 0, 90, 1, -6, 0 };
		int Neg = 0;
		int Poz = 0;
		int Nul = 0;

		for (int i = 0; i < Mas.length; i++) {
			if (Mas[i] > 0) {
				Poz++;
			} else if (Mas[i] < 0) {
				Neg++;
			} else {
				Nul++;
			}
		}
		System.out.println("В массиве " + Poz + " положительных чисел");
		System.out.println("В массиве " + Neg + " отрицательных чисел");
		System.out.println("В массиве " + Nul + " нулей");

	}

}
