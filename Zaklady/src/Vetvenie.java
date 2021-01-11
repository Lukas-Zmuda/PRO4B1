
public class Vetvenie {

	public static void main(String[] args) {

		int a = -1;
		//neuplna podmienka
		if(a > 0) {
			System.out.println("a je kladne");
		}
		
		//uplna podmienka
		if(a % 2 == 0) {
			System.out.println("a je parne cislo");
		}else {
			System.out.println("a je neparne cislo");
		}
		
		int skore = 72;
//		if(skore <= 100 && skore > 90) {
//			System.out.println("1");
//		}
//		if(skore <= 90 && skore > 80) {
//			System.out.println("2");
//		}
		
		if(skore > 90) {
			System.out.println("1");
		}else if(skore > 80) {
			System.out.println("2");
		}else if(skore > 70) {
			System.out.println("3");
		}else if(skore > 60) {
			System.out.println("4");
		}else {
			System.out.println("5");
		}
		
		int den = 3;
//		if(den == 1) {
//			System.out.println("Pondelok");
//		}else if(den == 2) {
//			System.out.println("Utorok");
//		}
		
		switch(den) {
		case 1:
			System.out.println("Pondelok");
			break;
		case 2:
			System.out.println("Utorok");
			break;
		case 3:
			System.out.println("Streda");
			break;
		case 4:
			System.out.println("Stvrtok");
			break;
		case 5:
			System.out.println("Piatok");
			break;
		case 6:
			System.out.println("Sobota");
			break;
		case 7:
			System.out.println("Nedela");
			break;
		default:
			System.out.println("Nespravny den v tyzdni");
		}
		
		System.out.println("Program pokracuje dalej ...");
		
		System.out.println(Math.sqrt(100));

	}

}
