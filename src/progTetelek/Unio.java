package progTetelek;

import java.util.Random;

public class Unio {

	public static void main(String[] args) {
		// Unio: T�mb�k�n bel�l nincsen ism�tl�d�s - halmaz.
		// K�t halmaz k�z�l legal�bb az egyikben szerepelnie kell.
		// Kollekci�k - Java Collection Framework - adatszerkezettel 1 sorban is megoldhat�
		
		int[] tombA = tombFeltolt(10, 20);
		int[] tombB = tombFeltolt(12, 20);
		System.out.print("tombA - ");
		tombKiir(tombA);
		System.out.println();
		System.out.print("tombB - ");
		tombKiir(tombB);
		System.out.println();
		int eredmenyTombMeret = (tombA.length+tombB.length)-egyezosegekMegszamol(tombA, tombB);
		int[] eredmenyTomb = new int[eredmenyTombMeret];
		
		//1. l�p�s: tombA-b�l minden elemet belepakolunk az eredmenyTombbe
		for (int i = 0; i < tombA.length; i++) {
			eredmenyTomb[i] = tombA[i];
		}
		
		//2. l�p�s: tombB-b�l pedig azokat, amelyek m�g nincsnen benne 
		int eredmenyTombIndex = tombA.length;
		for (int i = 0; i < tombB.length; i++) {
			if (!tartalmazzaEldont(eredmenyTomb, tombB[i])) {
				eredmenyTomb[eredmenyTombIndex] = tombB[i];
				eredmenyTombIndex++;
			}
		}
		System.out.print("A k�t halmaz uni�ja - ");
		tombKiir(eredmenyTomb);
	}
	
	public static void tombKiir(int[] tomb) {
		System.out.print("A t�mb elemei: ");
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
			tomb[i] = veletlenSzam; //egy olyan sz�mot gener�lt le, ami megfelel�
		}
		return tomb;
	}
	
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
}
