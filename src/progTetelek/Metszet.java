package progTetelek;

import java.util.Random;

public class Metszet {

	public static void main(String[] args) {
		// Metszet: azoknak az elemeknek a kiválasztása, amelyek mind a két 
		// halmazban megtalálhatóak.
		int[] tombA = tombFeltolt(10, 20);
		int[] tombB = tombFeltolt(12, 20);
		System.out.print("tombA - ");
		tombKiir(tombA);
		System.out.println();
		System.out.print("tombB - ");
		tombKiir(tombB);
		System.out.println();
		System.out.println("Egyezõségek száma: "+egyezosegekMegszamol(tombA, tombB));
	
		int[] metszetTomb = eredmenyTombFeltolt(tombA, tombB);
		System.out.print("A két halmaz metszete - ");
		tombKiir(metszetTomb);
	}
	
	public static void tombKiir(int[] tomb) {
		System.out.print("A tömb elemei: ");
		for (int item : tomb) {
			System.out.print(item + " ");
		}
	}
	
	public static int[] tombFeltolt(int meret, int velFelsoHatar) {
		int[] tomb = new int[meret];
		//ctrl+shift+o
		Random r = new Random();
		int veletlenSzam;
		for (int i = 0; i < tomb.length; i++) {
			do {
				veletlenSzam = r.nextInt(velFelsoHatar)+1;
			} while (tartalmazzaEldont(tomb, veletlenSzam));
			tomb[i] = veletlenSzam; //egy olyan számot generált le, ami megfelelõ
		}
		return tomb;
	}
	
	
	//Hf-nál Lottós feladatoknál 
	public static boolean tartalmazzaEldont(int[] tomb, int keresett) {
		boolean benneVan = false;
		int i = 0;
		do {
			if (tomb[i]==keresett) {
				benneVan = true;
			}
			i++;
		} while (!benneVan && i<tomb.length);
		return benneVan;
	}

	public static int egyezosegekMegszamol(int[] tombA, int[] tombB) {
		int db = 0;
		for (int i = 0; i < tombA.length; i++) {
			if (tartalmazzaEldont(tombB, tombA[i])) {
				db++;
			}
		}
		return db;
	}
	
	public static int[] eredmenyTombFeltolt(int[] tombA, int[] tombB) {
		int[] eredmenyTomb = new int[egyezosegekMegszamol(tombA, tombB)];
		int eredmenyTombIndex = 0;
		for (int i = 0; i < tombA.length; i++) {
			if (tartalmazzaEldont(tombB, tombA[i])) {
				eredmenyTomb[eredmenyTombIndex] = tombA[i];
				eredmenyTombIndex++;
			}
		}
		return eredmenyTomb;
	}
	
}
