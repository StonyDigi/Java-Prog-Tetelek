package progTetelek;

public class Kivalasztas {

	public static void main(String[] args) {
		// Kiv�laszt�s t�tele: (hasonl� mint az eld�nt�s):
		// Egy sorozaton bel�l megkeres�nk egy adott elemet (index�t)
		// Fontos: Biztosan tudjuk, hogy szerepel a sorozatban az �rt�k.
		
		// Pszedud� k�d: - mondatszer� le�r�s
		// Elj�r�s: Kiv�laszt�s
		// i:=1
		// Ciklus am�g A[i] nem T tulajdons�g�
		// i:=i+1
		// Ciklus v�ge
		// Sorsz�m:i
		int[] tomb = {3,6,9,23,55,89,11,1,66};
		tombKiir(tomb);
		System.out.println();
		System.out.println("Ezen az indexen tal�lhat� a 11-es �rt�k: "+kivalasz(tomb, 11));
		//System.out.println("Ezen az indexen tal�lhat� a 999-es �rt�k: "+kivalasz(tomb, 999));
		//ArrayIndexOutOfBoundsException
	}

	public static int kivalasz(int[] tomb, int keresett) {
		int i = 0;
		while (tomb[i]!=keresett) {
			i++;
		}
		return i;
	}

	public static void tombKiir(int[] tomb) {
		System.out.print("A t�mb elemei: ");
		for (int item : tomb) {
			System.out.print(item + " ");
		}
	}
}
