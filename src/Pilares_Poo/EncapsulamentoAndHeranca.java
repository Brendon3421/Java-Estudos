package Pilares_Poo;

public abstract class EncapsulamentoAndHeranca {

	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	  public void enviarMensagemEncapsulamentoAndHeranca() {
		if (validarConectadoInternet()) 
		System.out.println("Enviando mensagem");
		else
			System.out.println("Computador offline nao ira enviar");
	}

	public void receberMensagemEncapsulamentoAndHeranca() {
		if( validarConectadoInternet())
		System.out.println("Recebendo mensagem");
		else
			System.out.println("Computador offline nao recebera mensagem");
	}

	public boolean validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
		return false;
	}

	public void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem");
	}

}
