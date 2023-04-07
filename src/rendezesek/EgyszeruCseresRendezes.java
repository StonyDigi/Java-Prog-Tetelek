package rendezesek;

public class EgyszeruCseresRendezes {

	public static void main(String[] args) {
		//Egyszer� cser�s rendez�s
		// Rendezettlen halmazb�l rendezett �ll el�
		
		// 44 7 8 -> 7 8 44 ; 44 8 7 
		// 'F' , 'R', 'K' -> FKR; RKF
		
		// Rendez� alg.-ok �sszehasonl�t�si szempontjai:
		// gyorsas�g (id�), mem�riahaszn�lat, cser�k sz�ma, �sszehasonl�t�sok sz�ma
		
		int[] tomb = {44,78,3,91,11};
		System.out.print("A t�mb elemei rendezetlen�l: ");
		tombKiir(tomb);
		System.out.println();
		tombRendez(tomb);
		System.out.print("A t�mb elemei rendezve: ");
		tombKiir(tomb);
	}

	public static void tombRendez(int[] tomb) {
		for (int i = 0; i < tomb.length-1; i++) {
			for (int j = i+1; j < tomb.length; j++) {
				if (tomb[i]>tomb[j]) {
					//csere alg.
					int temp = tomb[j];
					tomb[j] = tomb[i];
					tomb[i] = temp;
				}
			}
		}
	}
	
	public static void tombKiir(int[] tomb) {
		for (int item : tomb) {
			System.out.print(item + " ");
		}
	}
}
