package progTetelek;

import java.util.Random;

public class Kivalogatas {

	public static void main(String[] args) {
		// Kiválogatás tétele: 
		// Egy adott halmaz elemei közül az adott tulajdonságúakat kiválogatjuk
		// Feladat: 30 elemû tömb feltöltése véletlen számokkal 1-100 között.
		// A párosakat a páros tömbbe, a páratlanokat a páratlan tömbbe helyezzük el.
		int[] tomb = tombFeltolt();
		tombKiir(tomb);
		System.out.println();
		
		// Nehézség: a tömb méretét vagy elemeket meg kell adni amikor létrehozzuk!
		// Nem tudjuk, hogy páros/pártlan lesz a generált számok közül!
		
		// Hibás megközelítés 
		//int[] parosTomb = new int[tomb.length];
		//int[] paratlanTomb = new int[tomb.length];

		//Megoldani  >>> ArrayList - dinamikus tömbkezlést tesz lehetõve - JCF 
		//09 házi
		
		int[] parosTomb = new int[parosDarabSzamol(tomb)];
		int[] paratlanTomb = new int[tomb.length-parosTomb.length];
		
		int parosIndex = 0;
		int paratlanIndex = 0;
		for (int i = 0; i < tomb.length; i++) {
			if (tomb[i]%2==0) {
				//páros tömbbe helyezzük
				parosTomb[parosIndex] = tomb[i];
				parosIndex++;
			} else {
				//páratlan tömbbe helyezzük
				paratlanTomb[paratlanIndex] = tomb[i];
				paratlanIndex++;
			}
		}
		
		System.out.print("Páros - ");
		tombKiir(parosTomb);
		System.out.println();
		System.out.print("Páratlan - ");
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
		System.out.print("A tömb elemei: ");
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
