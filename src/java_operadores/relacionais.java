package java_operadores;

public class relacionais {

// == igual != diferente de igual > maior que , < menor que , >= maior que ou igual , <= menor que ou igual ,
	public static void main(String[] args) {
		int numero1 = 2;
		int numero2 = 3;

		if (numero1 > numero2) {
			System.out.println("o numero 1 maior que o numero 2");
		}
		if (numero1 < numero2) {
			System.out.println("o numero 1 e menor que o numero 2");
		}
		if (numero1 == numero2) {
			System.out.println("o numero 1  e igual ao numero dois");
		}
		if (numero1 <= numero2) {
			System.out.println("o numero 1 e menor ou igual ao numero 2 <=");
		}
		if (numero1 >= numero2) {
			System.out.println("o numero 1 e maior  ou igual que o numero 2 =>");
		}
		if (numero1 != numero2) {
			System.out.println("o numero 1 e diferente do numero 2 !=");
		}
	}
}
