package Exception;

public class LocalizadoraEstado {
	public static String nomeEstadoBr(String sigla) throws EstadoNaoLocalizadoException {
		if(sigla.equals("PI"))
			return "Piaui";
		else
			throw new EstadoNaoLocalizadoException("Nao existe um estado com essa sigla");
	}
	
	public static void main(String[] args) throws EstadoNaoLocalizadoException {
		String nomeEstado = nomeEstadoBr("PI");
		
		try {
			nomeEstado = nomeEstadoBr("PI");
		} catch (EstadoNaoLocalizadoException ex) {
			ex.printStackTrace();
		}
		
	}
}
