package progTetelek;

public class Osszegzes {

	public static void main(String[] args) {
		// Összegzés tétele: 
		// Egy számsorozat elemeinek összegét határozza meg
		// pszedudó kód + folyamatábra
		// Feladatoknál pld. heti összbevétel, össze kell adni
		// kulcsszavak: összesen, összes
		
		int[] tomb = {3,6,9,23};
		tombKiir(tomb);
		System.out.println();
		System.out.println("A tömb elemeinek összege: "+tombOsszegSzamol(tomb));
		System.out.println("A tömb elemeinek átlaga: "+(double)tombOsszegSzamol(tomb)/tomb.length);
	}
	
	public static int tombOsszegSzamol(int[] tomb) {
		int osszeg = 0;
		for (int i = 0; i < tomb.length; i++) {
			osszeg += tomb[i]; //ua. osszeg = osszeg + tomb[i];
		}
		return osszeg;
	} 
	
	public static void tombKiir(int[] tomb) {
		System.out.print("A tömb elemei: ");
		for (int item : tomb) {
			System.out.print(item + " ");
		}
	}
}
