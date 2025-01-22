package Je01_sitaxe_semantica;

public class BoletimEstudantil {
	public static void main(String[] args) {
		int notaBoletim = 7;
		if (notaBoletim < 6) {
			System.out.println("nota menor que o necessario: " + notaBoletim);
		} else if (notaBoletim == 6) {
			System.out.println("Prova de recuperacao " + notaBoletim);
		} else {
			System.out.println("foi aprovado bb " + notaBoletim);
		}
	}

}
