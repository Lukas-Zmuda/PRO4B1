import java.util.Scanner;

public class U_Priemer {

	public static void main(String[] args) {
		// vystup: aritmeticky priemer cisel
		// vstup: n - pocet cisel, cisla
		
		double suma = 0;
		int cislo = 0, pocetCisel = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--- Aritmeticky priemer ---");
		System.out.println("Zadaj pocet cisel: ");
		pocetCisel = sc.nextInt();
		
		for(int i = 0; i < pocetCisel; i++) {
			System.out.println("Zadaj " + (i + 1) + ". cislo: ");
			cislo = sc.nextInt();
			suma += cislo;
		}
		
		System.out.println("Priemer: \t" + (suma / pocetCisel));

	}

}
