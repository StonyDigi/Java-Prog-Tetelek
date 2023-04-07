package progTetelek;

public class Eldontes {

	public static void main(String[] args) {
		// Eldöntés: 
		// Egy számsorozatban keresünk egy értéket, el kell döntenünk
		// hogy benne van vagy nincs
		// Logikai tipussal, boolean tér vissza - true vagy false
		
		int[] tomb = {3,6,9,23,1,55,6,89,1,66};
		tombKiir(tomb);
		System.out.println();
		System.out.println(eldontFor(tomb, 6));
		System.out.println(eldontWhile(tomb, 6));
		System.out.println(eldontWhile(tomb, 999));
	}
	
	// Hibás megoldás (lehetnek benne felesleges futások)
	// egyébként mukodik
	public static boolean eldontFor(int[] tomb, int keresett) {
		boolean valasz = false;
		for (int i = 0; i < tomb.length; i++) {
			if (tomb[i] == keresett) {
				valasz =true;
				//break; //break és continue (light version of break)
			}
		}
		return valasz;
	}
	
	//helyesen while ciklussal
	public static boolean eldontWhile(int[] tomb, int keresett) {
		boolean valasz = false;
		int i = 0;
		
		//Addig megy a ciklus, amig a tömb végéig nem érek, vagy meg nem 
		//találtam az adott tulajdonságú elemet
		while (i<tomb.length && tomb[i] !=keresett) {
			i++;
		}
		
		if (i<tomb.length) {
			valasz = true; //megtaláluk a keresett értéket
		}
		return valasz;
	}
	
	
	public static void tombKiir(int[] tomb) {
		System.out.print("A tömb elemei: ");
		for (int item : tomb) {
			System.out.print(item + " ");
		}
	}

}
