package Controle_de_fluxo;

public class Condicional {
	// CaixaEletronico.java
	public static void main(String[] args) {
		double saldo = 25.0;
		double valorSolicitado = 17.9;
		if (valorSolicitado < saldo)
			saldo = saldo - valorSolicitado;
		System.out.println(saldo);
		
		int nota = 3;
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "RECUPERACAO": "REPROVADO CORNO";
		System.out.println(resultado);
	}

	
	
}
