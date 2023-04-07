package progTetelek;

import java.util.Random;

public class Megszamlalas {

	public static void main(String[] args) {
		// Megsz�ml�l�s t�tele: 
		// Egy sz�msorozaton bel�l megsz�moljuk h�ny adott tulajdons�g� elem van 
		// T tulajdons�g: �ltalunk meghat�rozott tulajdons�g
		// Feladatokn�l: pld. H�ny olyan nap volt, amikor bev�tel nem haladta meg a...
		// Szeretn�nk valaminek a darabsz�m�t megsz�molni, h�ny alma van a kos�rban
		
		int[] tomb = tombFeltolt(10,50,150);
		tombKiir(tomb);
		System.out.println();
		System.out.println("Ennyi p�ros volt a t�mbben: "+parosMegszamol(tomb));
	}

	public static int[] tombFeltolt(int elemSzam, int alsoHatar, int felsoHatar) {
		int[] tomb = new int[elemSzam];
		Random r = new Random();
		for (int i = 0; i < tomb.length; i++) {
			tomb[i]  = r.nextInt((felsoHatar-alsoHatar)+1)+alsoHatar;
		}
		return tomb;
	}
	
	public static void tombKiir(int[] tomb) {
		System.out.print("A t�mb elemei: ");
		for (int item : tomb) {
			System.out.print(item + " ");
		}
	}
	
	public static int parosMegszamol(int[] tomb) {
		int darab = 0;
		for (int i = 0; i < tomb.length; i++) {
			if (tomb[i]%2==0) {
				darab++; //ua. darab = darab +1
			}
		}
		return darab;
	}
}
//public double tavmunkaAtlagSzamol() {   //�tlagszamitas
//	Integer db = 0;
//	Double osszeg = 0.0;
//	for (AllasTarolo item : allasokLista) {
//		if(item.getTavmunka()) {
//			db++;
//			osszeg += item.getBruttoFizetes();
//		}
//		
//	}
//	return osszeg/db;