package Exception;

public class Excecoes {
	public static void main(String[] args) {

		try {
			Double valor = (double) (100 / 0);
			System.out.println(valor);
		} catch (Exception ex) {
			System.out.checkError();
			ex.printStackTrace();
		} finally {
			System.out.println("Finally");
		}

	}

}
