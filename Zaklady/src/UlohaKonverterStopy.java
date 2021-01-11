import java.util.Scanner;

public class UlohaKonverterStopy {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("--- Konverter stopy -> metre ---");
		System.out.println("Zadaj stopy: ");
		int stopy = sc.nextInt();
		//double stopy = sc.nextDouble();
		
		if(stopy > 0) {
			double metre = stopy * 0.305;
			System.out.println(stopy + " stop je " + metre + " metrov.");
			System.out.printf("%d stop je %.2f metrov.", stopy, metre);
		}else {
			System.out.println("Zadal si nespravny vstup!");
		}
		
	}

}
