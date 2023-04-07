package progTetelek;

import java.util.Random;

public class Kivalogatas {

	public static void main(String[] args) {
		// Kiv�logat�s t�tele: 
		// Egy adott halmaz elemei k�z�l az adott tulajdons�g�akat kiv�logatjuk
		// Feladat: 30 elem� t�mb felt�lt�se v�letlen sz�mokkal 1-100 k�z�tt.
		// A p�rosakat a p�ros t�mbbe, a p�ratlanokat a p�ratlan t�mbbe helyezz�k el.
		int[] tomb = tombFeltolt();
		tombKiir(tomb);
		System.out.println();
		
		// Neh�zs�g: a t�mb m�ret�t vagy elemeket meg kell adni amikor l�trehozzuk!
		// Nem tudjuk, hogy p�ros/p�rtlan lesz a gener�lt sz�mok k�z�l!
		
		// Hib�s megk�zel�t�s 
		//int[] parosTomb = new int[tomb.length];
		//int[] paratlanTomb = new int[tomb.length];

		//Megoldani  >>> ArrayList - dinamikus t�mbkezl�st tesz lehet�ve - JCF 
		//09 h�zi
		
		int[] parosTomb = new int[parosDarabSzamol(tomb)];
		int[] paratlanTomb = new int[tomb.length-parosTomb.length];
		
		int parosIndex = 0;
		int paratlanIndex = 0;
		for (int i = 0; i < tomb.length; i++) {
			if (tomb[i]%2==0) {
				//p�ros t�mbbe helyezz�k
				parosTomb[parosIndex] = tomb[i];
				parosIndex++;
			} else {
				//p�ratlan t�mbbe helyezz�k
				paratlanTomb[paratlanIndex] = tomb[i];
				paratlanIndex++;
			}
		}
		
		System.out.print("P�ros - ");
		tombKiir(parosTomb);
		System.out.println();
		System.out.print("P�ratlan - ");
		tombKiir(paratlanTomb);
	}

	public static int[] tombFeltolt() {
		Random r = new Random();
		int[] tomb = new int[30];
		for (int i = 0; i < tomb.length; i++) {
			tomb[i] = r.nextInt(100)+1;
		}
		return tomb;
	}
	
	public static void tombKiir(int[] tomb) {
		System.out.print("A t�mb elemei: ");
		for (int item : tomb) {
			System.out.print(item + " ");
		}
	}
	
	public static int parosDarabSzamol(int[] tomb) {
		int db = 0;
		for (int item : tomb) {
			if (item%2==0) {
				db++;
			}
		}
		return db;
	}
}
