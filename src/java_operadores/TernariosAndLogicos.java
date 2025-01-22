package java_operadores;

public class TernariosAndLogicos {
	public static void main(String[] args) {
		
		TernariosAndLogicos ternariosAndLogicos = new TernariosAndLogicos();
		
		ternariosAndLogicos.ternarios(args);
		ternariosAndLogicos.logicos(args);
		
		
	}
	
	
	public static void ternarios(String[] args) {
		int idade = 1;
		String nome = " brendon";
		int maiorDeIdade = 18;
		boolean maiorIdade = idade >= maiorDeIdade;
		String menssagem = nome + " e " + (maiorIdade ? " maior de idade" : "nao e maior de idade");
		System.out.println(menssagem);
	}
	
	public static void logicos(String[] args) {
		boolean condicao1 = true;
		boolean condicao2 = true;
		
		if(condicao1 && condicao2) {
			System.out.println("Os dois valores precisam ser verdadeiros");
		}
		if(condicao1 || condicao2) {
			System.out.println("um dos valores precisa ser verdadeiro");
		}
	
	}
	
	
	
}
