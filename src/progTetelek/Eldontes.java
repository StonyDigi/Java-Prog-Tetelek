package progTetelek;

public class Eldontes {

	public static void main(String[] args) {
		// Eld�nt�s: 
		// Egy sz�msorozatban keres�nk egy �rt�ket, el kell d�nten�nk
		// hogy benne van vagy nincs
		// Logikai tipussal, boolean t�r vissza - true vagy false
		
		int[] tomb = {3,6,9,23,1,55,6,89,1,66};
		tombKiir(tomb);
		System.out.println();
		System.out.println(eldontFor(tomb, 6));
		System.out.println(eldontWhile(tomb, 6));
		System.out.println(eldontWhile(tomb, 999));
	}
	
	// Hib�s megold�s (lehetnek benne felesleges fut�sok)
	// egy�bk�nt mukodik
	public static boolean eldontFor(int[] tomb, int keresett) {
		boolean valasz = false;
		for (int i = 0; i < tomb.length; i++) {
			if (tomb[i] == keresett) {
				valasz =true;
				//break; //break �s continue (light version of break)
			}
		}
		return valasz;
	}
	
	//helyesen while ciklussal
	public static boolean eldontWhile(int[] tomb, int keresett) {
		boolean valasz = false;
		int i = 0;
		
		//Addig megy a ciklus, amig a t�mb v�g�ig nem �rek, vagy meg nem 
		//tal�ltam az adott tulajdons�g� elemet
		while (i<tomb.length && tomb[i] !=keresett) {
			i++;
		}
		
		if (i<tomb.length) {
			valasz = true; //megtal�luk a keresett �rt�ket
		}
		return valasz;
	}
	
	
	public static void tombKiir(int[] tomb) {
		System.out.print("A t�mb elemei: ");
		for (int item : tomb) {
			System.out.print(item + " ");
		}
	}

}
