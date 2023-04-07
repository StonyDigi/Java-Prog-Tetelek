package progTetelek;

public class Osszegzes {

	public static void main(String[] args) {
		// �sszegz�s t�tele: 
		// Egy sz�msorozat elemeinek �sszeg�t hat�rozza meg
		// pszedud� k�d + folyamat�bra
		// Feladatokn�l pld. heti �sszbev�tel, �ssze kell adni
		// kulcsszavak: �sszesen, �sszes
		
		int[] tomb = {3,6,9,23};
		tombKiir(tomb);
		System.out.println();
		System.out.println("A t�mb elemeinek �sszege: "+tombOsszegSzamol(tomb));
		System.out.println("A t�mb elemeinek �tlaga: "+(double)tombOsszegSzamol(tomb)/tomb.length);
	}
	
	public static int tombOsszegSzamol(int[] tomb) {
		int osszeg = 0;
		for (int i = 0; i < tomb.length; i++) {
			osszeg += tomb[i]; //ua. osszeg = osszeg + tomb[i];
		}
		return osszeg;
	} 
	
	public static void tombKiir(int[] tomb) {
		System.out.print("A t�mb elemei: ");
		for (int item : tomb) {
			System.out.print(item + " ");
		}
	}
}
