package Expressoes;

public class ExpressoesSimple {
	public static void main(String[] args) {
		String nome = "Brendon";
		String sobrenome = "Bernardi";
		int matricula = 123;
		double salario = 2001.212;
		String textoImpresso = "Ola ".concat(nome).concat(" ").concat(sobrenome);
		System.out.println(textoImpresso);
		// iremos formatar de forma diferente
		System.out.println("### Format Expressoes ###");
		String textoImpresso2 = String.format("Ola %s %s", nome, sobrenome);
		// expressadores s - string , d - digito , f - double e valores flutuantes ,d -datetime
		System.out.println(textoImpresso2);
		//, signifca para colocar virgula na unidade de centavos e mil na casa do milhar e 2 e para formatar apeans 2 numeros depois da virgula
		String dadosFuncionario = String.format("Olha funcionario %s %s sua matricula corresponde a %d e seu salario foi de %,.2f ", nome, sobrenome , matricula , salario);
		System.out.println(dadosFuncionario);
		
	}

}
