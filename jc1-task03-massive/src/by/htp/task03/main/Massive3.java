// ���� ������������������ �������������� ����� �1 �2... ��������, ����� �� ��� ������������.

package by.htp.task03.main;

public class Massive3 {

	public static void main(String[] args) {
		double[] var = { 1, 2.5, 3, 4.9, 4.1, 6, 7, 8 };

		for (int i = 0; i < var.length - 1; i++) {
			if (var[i] >= var[i + 1]) {
				System.out.println("������������������ �� ������������");
				return;
			}

		}
		System.out.println("������������������ ������������");

	}

}
