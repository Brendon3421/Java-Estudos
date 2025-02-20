package Pilares_Poo;

public class ComputadorBrendinhoGatao {
	public static void main(String[] args) {
	
		EncapsulamentoAndHeranca msnmsg = null;
		msnmsg.enviarMensagemEncapsulamentoAndHeranca();
		msnmsg.receberMensagemEncapsulamentoAndHeranca();
		msnmsg.salvarHistoricoMensagem();
		msnmsg.validarConectadoInternet();

		Telegram telegramsg = new Telegram();
		FacebookMsg facebookmsg = new FacebookMsg();
		System.out.println("telegram");
		telegramsg.enviarMensagem();
		System.out.println("facebook");
		facebookmsg.enviarMensagem();
	}
}
