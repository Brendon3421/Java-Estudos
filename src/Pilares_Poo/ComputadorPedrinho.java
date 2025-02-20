package Pilares_Poo;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		EncapsulamentoAndHeranca smi = null;
		/*
		 * NÃO SE SABE QUAL APP MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido = "fbm";
		if (appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if (appEscolhido.equals("fbm"))
			smi = new FacebookMsg();
		else if (appEscolhido.equals("tlg"))
			smi = new Telegram();

		smi.enviarMensagem();
		smi.receberMensagem();
	}
}