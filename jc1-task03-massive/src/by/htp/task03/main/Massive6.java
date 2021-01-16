// Дана последовательность действительных чисел а1 а2... Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.

package by.htp.task03.main;

public class Massive6 {

	public static void main(String[] args) {
		double[] Var = { -5, -4.5, 0, 1, 2, 3.5, 6, 10 };
		double Z = 3.4;
		int x = 0;

		for (int i = 0; i < Var.length; i++) {
			if (Var[i] > Z) {
				Var[i] = Z;
				x++;
			}
		}
		for (int i = 0; i < Var.length; i++) {
			System.out.print(Var[i] + " ");
		}
		System.out.println("\n" + x);

	}

}
