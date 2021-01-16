//Даны действительные числа а1 а2... Поменять местами наибольший и наименьший элементы.

package by.htp.task03.main;

public class Massive7 {

	public static void main(String[] args) {
		double[] Var = {0,5,9,3,8,50,-5,-100,90,6,8,2,100};
		double MaxInt = Var[0];
		int MaxIndex = 0;
		
		double MinInt = Var[0];
		int MinIndex = 0;
		
		for (int i = 1; i < Var.length; i++) {
			if (MaxInt < Var[i]) {
				MaxInt = Var[i];
				MaxIndex = i;
			}
			if (MinInt > Var[i]) {
				MinInt = Var[i];
				MinIndex = i;
			}
		}
		Var[MinIndex] = MaxInt;
		Var[MaxIndex] = MinInt;
		
		for (int i = 0; i < Var.length; i++) {
			System.out.print(Var[i]+" ");
		}

	}

}
