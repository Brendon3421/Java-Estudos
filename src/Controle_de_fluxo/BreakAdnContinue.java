package Controle_de_fluxo;

public class BreakAdnContinue {
	public static void main(String[] args) {
		for (int numero = 1; numero <= 5; numero ++) {
			if (numero == 3) {
				System.out.println(numero);
				break;
			}
			System.out.println("depois da regra");
		}
	}
}
