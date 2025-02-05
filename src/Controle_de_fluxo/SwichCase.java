package Controle_de_fluxo;

public class SwichCase {
	public static void main(String[] args) {
		String sigla = "A";

		switch (sigla) {
		case "P": {
			System.out.println("pequeno");
			break;
		}
		case "A": {
			System.out.println("Amante");
			break;
		}
		case "G": {
			System.out.println("Grandao fih");
			break;
		}
		default:
			System.out.println("Nenhum corno");
			break;

		}
	}
}
