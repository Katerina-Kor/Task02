//���� ������������������ ����������� ����� �1 �2... ������� ������ �� ������ ����� ���� ������������������. ���� ����� ����� ���, �� ������� ��������� �� ���� �����.

package by.htp.task03.main;

public class Massive4 {

	public static void main(String[] args) {
		int[] var = { 1, 3, 5, 7, 7, 9, 11, 11, 11, 13, 15, 21 };
		int k = 0; // ����� ������� ���������� ��������� � ������� var

		for (int i = 0; i < var.length; i++) {
			if ((var[i] % 2) == 0) {
				k++;
			}
		}
		if (k == 0) {
			System.out.println("� ������� ��� ������ �����");
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
