import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String meno = "";
		System.out.println("Zadaj meno: ");
		meno = sc.nextLine(); //nacitanie retazca z klavesnice do premennej
		System.out.println("Ahoj " + meno + ". :)");
		
		int rok = 0;
		System.out.println("Zadaj rok narodenia: ");
		rok = sc.nextInt(); //nacitanie cisla z klavesnice
		System.out.println("Mas " + (2020 - rok) + " rokov. ");
		
		double des = 0;
		System.out.println("Zadaj des. cislo: ");
		des = sc.nextDouble();
		System.out.println(des);
		
		

	}

}
