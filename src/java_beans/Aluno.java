package java_beans;

public class Aluno {
	private String nome;
	private int idade;
	
	
	public int setIdade(int newIdade) {
		if(newIdade < 0 || newIdade > 150) {
			throw new IllegalArgumentException("Valor da idade deve estar entre 0 e 150");
		};
		return idade = newIdade;
	}
	
	public String setName(String newName) {
		return nome = newName;
	}
	
	public String getName() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
}
