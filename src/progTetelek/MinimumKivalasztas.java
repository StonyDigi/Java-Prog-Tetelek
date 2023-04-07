package progTetelek;

public class MinimumKivalasztas {

	public static void main(String[] args) {
		// Minimum kiválasztás tétele
		// Egy számsorozatban keressük a legkisebb értékû elemet
		// Feladatokban: Ki keres a legkevesebbet? Melyik nap volt a legkevesebb a 
		// bevétel? Melyik diák a legalacsonyabb? Melyik termék a legolcsóbb?
		
		int[] tomb = {3,6,9,23,1,55,6,89,1,66};
		tombKiir(tomb);
		System.out.println();
		System.out.println("Min érték: "+minErtekMeghataroz(tomb));

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
		System.out.print("A tömb elemei: ");
		for (int item : tomb) {
			System.out.print(item + " ");
		}
	}

}
