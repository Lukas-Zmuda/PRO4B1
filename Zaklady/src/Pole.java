
public class Pole {

	public static void main(String[] args) {
		
		//deklaracia pola
		int[] cisla;
		
		//inicializacia pola
		cisla = new int[7];
		
		cisla[0] = 14;
		
		System.out.println("Prvy prvok: " + cisla[0]);
		
		cisla[1] = cisla[0] + 10;
		cisla[2] = 3 * cisla[1];
		cisla[3] = cisla[2] + cisla[1];
		
		for(int i = 0; i < 7; i++) {
			System.out.print(cisla[i] + ", ");
		}
		System.out.println();
		
		String[] mena = {"Lukas", "Fero", "Jan", "Petra", "Maria", "Tibor"};
		int[] vyska = {186, 170, 190, 181, 168, 175};
		
		
		System.out.println("Pocet ludi v zozname: " + mena.length);
		System.out.println("Zoznam mien:");
		for(int i = 0; i < mena.length; i++) {
			System.out.println((i + 1) + ". " + mena[i] + ": " + vyska[i] + " cm");
		}
		
		double suma = 0;
		for(int i = 0; i < vyska.length; i++) {
			suma += vyska[i];
		}
		System.out.println("Priemerna vyska: " + (suma / vyska.length) );
		
		
		for(String m: mena) {
			System.out.print(m + ", ");
		}
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		

	}

}
