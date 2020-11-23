import java.util.Scanner;

public class UlohaKonverterStopy {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("--- Konverter stopy -> metre ---");
		System.out.println("Zadaj stopy: ");
		int stopy = sc.nextInt();
		//double stopy = sc.nextDouble();
		
				
		double metre = stopy * 0.305;
		
		System.out.println(stopy + " stop je " + metre + " metrov.");
	}

}
