package progTetelek;

import java.util.Random;

public class Megszamlalas {

	public static void main(String[] args) {
		// Megszámlálás tétele: 
		// Egy számsorozaton belül megszámoljuk hány adott tulajdonságú elem van 
		// T tulajdonság: általunk meghatározott tulajdonság
		// Feladatoknál: pld. Hány olyan nap volt, amikor bevétel nem haladta meg a...
		// Szeretnénk valaminek a darabszámát megszámolni, hány alma van a kosárban
		
		int[] tomb = tombFeltolt(10,50,150);
		tombKiir(tomb);
		System.out.println();
		System.out.println("Ennyi páros volt a tömbben: "+parosMegszamol(tomb));
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
		System.out.print("A tömb elemei: ");
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
//public double tavmunkaAtlagSzamol() {   //átlagszamitas
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