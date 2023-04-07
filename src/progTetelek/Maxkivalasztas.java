package progTetelek;

public class Maxkivalasztas {

	public static void main(String[] args) {
		// Maximum kiválasztás tétele
		// Egy számsorozatban keressük a legnagyobb értékû elemet
		// Feladatokban: Ki keres a legtöbbet? Melyik nap volt a legtöbb a 
		// bevétel? Melyik diák a legmagasabb? Melyik termék a legdrágább?

		int[] tomb = {3,6,9,23,1,55,6,89,1,66};
		tombKiir(tomb);
		System.out.println();
		System.out.println("Legnagyobb érték: "+maxErtekMeghataroz(tomb));
		System.out.println("Legnagyobb érték indexe: "+maxIndexMeghataroz(tomb));
		System.out.println("Legnagyobb érték másképp: "+tomb[maxIndexMeghataroz(tomb)]);
	}
	
	public static int maxErtekMeghataroz(int[] tomb) {
		int max = tomb[0];
		for (int i = 1; i < tomb.length; i++) {
			if (tomb[i]>max) {
				max = tomb[i];
			}
		}
		return max;
	}
	
	public static int maxIndexMeghataroz(int[] tomb) {
		int max = tomb[0];
		int maxIndex = 0;
		for (int i = 0; i < tomb.length; i++) {
			if (tomb[i]>max) {
				max = tomb[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	public static void tombKiir(int[] tomb) {
		System.out.print("A tömb elemei: ");
		for (int item : tomb) {
			System.out.print(item + " ");
		}
	}
}
