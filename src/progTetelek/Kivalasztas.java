package progTetelek;

public class Kivalasztas {

	public static void main(String[] args) {
		// Kiválasztás tétele: (hasonló mint az eldöntés):
		// Egy sorozaton belül megkeresünk egy adott elemet (indexét)
		// Fontos: Biztosan tudjuk, hogy szerepel a sorozatban az érték.
		
		// Pszedudó kód: - mondatszerû leírás
		// Eljárás: Kiválasztás
		// i:=1
		// Ciklus amíg A[i] nem T tulajdonságú
		// i:=i+1
		// Ciklus vége
		// Sorszám:i
		int[] tomb = {3,6,9,23,55,89,11,1,66};
		tombKiir(tomb);
		System.out.println();
		System.out.println("Ezen az indexen található a 11-es érték: "+kivalasz(tomb, 11));
		//System.out.println("Ezen az indexen található a 999-es érték: "+kivalasz(tomb, 999));
		//ArrayIndexOutOfBoundsException
	}

	public static int kivalasz(int[] tomb, int keresett) {
		int i = 0;
		while (tomb[i]!=keresett) {
			i++;
		}
		return i;
	}

	public static void tombKiir(int[] tomb) {
		System.out.print("A tömb elemei: ");
		for (int item : tomb) {
			System.out.print(item + " ");
		}
	}
}
