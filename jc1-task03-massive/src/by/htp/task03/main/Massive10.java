//Даны действительные числа а1 а2...а2n. Найти max (a1+a2n, a2+a2n-1...)

package by.htp.task03.main;

public class Massive10 {

	public static void main(String[] args) {
		double[] Mas = {1,5,9,6,8,10,9,4};
		double MaxSumm;
		MaxSumm = Mas[0]+Mas[Mas.length-1];
		
		for (int i = 1; i<=Mas.length/2; i++) {
			if ((Mas[i]+Mas[Mas.length-1-i])>MaxSumm) {
				MaxSumm = (Mas[i]+Mas[Mas.length-1-i]);
			}
		}
		System.out.println(MaxSumm);

	}

}
