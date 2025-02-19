package java_operadores;

public class Unarios {
	public static void main(String[] args) {
		
		Unarios unarios =new Unarios();
			 
//		chamar o metodo falso
		
		unarios.falsa(args);
		
			int numero = +5;
			numero++;
			System.out.println(++numero);
	}

	public void falsa(String[] args) {
		boolean verdadeira = true;
		boolean falsa = !verdadeira;
		System.out.println(falsa); 
	}
}
