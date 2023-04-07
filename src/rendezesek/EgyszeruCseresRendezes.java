package rendezesek;

public class EgyszeruCseresRendezes {

	public static void main(String[] args) {
		//Egyszerû cserés rendezés
		// Rendezettlen halmazból rendezett áll elõ
		
		// 44 7 8 -> 7 8 44 ; 44 8 7 
		// 'F' , 'R', 'K' -> FKR; RKF
		
		// Rendezõ alg.-ok összehasonlítási szempontjai:
		// gyorsaság (idõ), memóriahasználat, cserék száma, összehasonlítások száma
		
		int[] tomb = {44,78,3,91,11};
		System.out.print("A tömb elemei rendezetlenül: ");
		tombKiir(tomb);
		System.out.println();
		tombRendez(tomb);
		System.out.print("A tömb elemei rendezve: ");
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
