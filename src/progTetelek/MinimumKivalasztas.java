package progTetelek;

public class MinimumKivalasztas {

	public static void main(String[] args) {
		// Minimum kiv�laszt�s t�tele
		// Egy sz�msorozatban keress�k a legkisebb �rt�k� elemet
		// Feladatokban: Ki keres a legkevesebbet? Melyik nap volt a legkevesebb a 
		// bev�tel? Melyik di�k a legalacsonyabb? Melyik term�k a legolcs�bb?
		
		int[] tomb = {3,6,9,23,1,55,6,89,1,66};
		tombKiir(tomb);
		System.out.println();
		System.out.println("Min �rt�k: "+minErtekMeghataroz(tomb));

	}
	public static int minErtekMeghataroz(int[] tomb) {
		//int min = Integer.MAX_VALUE;
		int min = tomb[0];
		for (int i = 1; i < tomb.length; i++) {
			if (tomb[i]<min) {
				min = tomb[i];
			}
		}
		return min;
	}
	
	public static void tombKiir(int[] tomb) {
		System.out.print("A t�mb elemei: ");
		for (int item : tomb) {
			System.out.print(item + " ");
		}
	}

}
