package progTetelek;

public class Maxkivalasztas {

	public static void main(String[] args) {
		// Maximum kiv�laszt�s t�tele
		// Egy sz�msorozatban keress�k a legnagyobb �rt�k� elemet
		// Feladatokban: Ki keres a legt�bbet? Melyik nap volt a legt�bb a 
		// bev�tel? Melyik di�k a legmagasabb? Melyik term�k a legdr�g�bb?

		int[] tomb = {3,6,9,23,1,55,6,89,1,66};
		tombKiir(tomb);
		System.out.println();
		System.out.println("Legnagyobb �rt�k: "+maxErtekMeghataroz(tomb));
		System.out.println("Legnagyobb �rt�k indexe: "+maxIndexMeghataroz(tomb));
		System.out.println("Legnagyobb �rt�k m�sk�pp: "+tomb[maxIndexMeghataroz(tomb)]);
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
		System.out.print("A t�mb elemei: ");
		for (int item : tomb) {
			System.out.print(item + " ");
		}
	}
}
