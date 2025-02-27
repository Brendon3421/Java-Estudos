package Exception;

public class Excecoes {
	public static void main(String[] args) {

//		try {
//			Double valor = (double) (100 / 0);
//			System.out.println(valor);
//		} catch (Exception ex) {
//			System.out.checkError();
//			ex.printStackTrace();
//		} finally {
//			System.out.println("Finally");
//		}
//	}
		
		try {
			checkEstados("pi");
		}catch(EstadoNaoLocalizadoException e) {
			e.printStackTrace();
		}
		
	}

	static void checkEstados(String nomeEstado) throws EstadoNaoLocalizadoException {

		if (!nomeEstado.equalsIgnoreCase("Pi"))
			throw new EstadoNaoLocalizadoException("Nao existe");
		System.out.println("Bem vindo ao estado " + nomeEstado);
	}
}
