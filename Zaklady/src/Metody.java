
public class Metody {

	public static void main(String[] args) {
		System.out.println("Rad programujem");
		vlozCiaru();
		
		System.out.println("Ahoj ako sa mas?");
		vlozCiaru();
		String mm = "Lukas";
		pozdravSa(mm);
		vlozCiaru();
		pozdravSa("Fero", "EN");
		vlozCiaru("+", 15);
		
		int cislo = 12;
		cislo = druhaMocnina(cislo);
		System.out.println("cislo = " + cislo);
		System.out.println(druhaMocnina(cislo));
		
		vlozCiaru("-", 25);
		int[] p = vytvorPole(10, 47);
		vypisPole(p);
		
	}
	
	//metoda bez navratoveho typu, bez parametra
	static void vlozCiaru() {
		System.out.println("_________________");
	}
	
	static void vlozCiaru(String znak, int dlzka) {
		for(int i = 0; i < dlzka; i++) {
			System.out.print(znak);
		}
		System.out.println();
	}
	
	//metoda bez navratoveho typu s jednym parametrom
	static void pozdravSa(String meno) {
		System.out.println("Ahoj " + meno + ". Ako sa mas?");
	}
	
	static void pozdravSa(String meno, String jazyk) {
		switch(jazyk) {
		case "SK":
			System.out.println("Ahoj " + meno + ". Ako sa mas?");
			break;
		case "EN":
			System.out.println("Hi " + meno + ". How are you?");
			break;
		case "CZ":
			System.out.println("Ahoj " + meno + ". Jak se mas?");
			break;
		case "DE":
			System.out.println("Hallo " + meno + ". Wie gehts?");
			break;
		default:
			System.out.println("Ahoj " + meno + ". Nepoznam tvoj jazyk!");
			break;
		}
	}
	
	static void vypisPole(int[] pole) {
		for(int prvok: pole) {
			System.out.print(prvok + ", ");
		}
		System.out.println();
	}

	//metoda s navratovym typom  a s jednym parametrom
	static int druhaMocnina(int cislo) {
		int c = cislo * cislo;
		return c;
	}
	
	static int[] vytvorPole(int dlzka, int hodnota) {
		int[] pole = new int[dlzka];
		for(int i = 0; i < pole.length; i++) {
			pole[i] = hodnota;
		}
		return pole;
	}
	
	
}
