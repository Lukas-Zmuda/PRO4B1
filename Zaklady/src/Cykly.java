
public class Cykly {

	public static void main(String[] args) {
		
//		System.out.println("Ahoj");
//		System.out.println("Ahoj");
//		System.out.println("Ahoj");
//		System.out.println("Ahoj");
//		System.out.println("Ahoj");
		
		for(int i = 0; i < 5; i++) {
			System.out.println((i + 1) + ". Ahoj");
		}
		
		for(int i = 0; i < 11; i = i + 2) {
			System.out.print(i + ", ");
		}
		
		System.out.println("\n------------");
		int j = 10;
		while(j > 0) {
			System.out.print(j + ", ");
			j--;
		}
		
		System.out.println("\n---do-while---");
		j = 5;
		do {
			System.out.print(j + ", ");
			j--;
		}while(j > 0);
			
		System.out.println("\nProgram pokracuje dalej ...");

	}

}
