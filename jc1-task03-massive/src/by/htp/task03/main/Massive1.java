// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

package by.htp.task03.main;

public class Massive1 {

	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		int K = 2;
		int sum = 0;

		for (int i = 0; i < A.length; i++) {
			if ((A[i] % K) == 0) {
				sum += A[i];

			}
		}

		System.out.println(sum);

	}

}
