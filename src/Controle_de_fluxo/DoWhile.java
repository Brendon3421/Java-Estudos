package Controle_de_fluxo;

import java.util.Random;

public class DoWhile {
	private static int numeroDeTentativas = 0;

	public static void main(String[] args) {
		System.out.println("Discando...");
		do {
			// excutando repetidas vezes até alguém atender
			System.out.println("Telefone tocando");
		} while (tocando());
		if(numeroDeTentativas < 5)
		System.out.println("Alô !!!");
		else
			System.out.println("nao atendeu!!!");
	}

	private static boolean tocando() {
		boolean atendeu = new Random().nextInt(5) == 1;
		numeroDeTentativas++;
		if (numeroDeTentativas >= 5)
			return false;
		else
			return !atendeu;
	}
}
