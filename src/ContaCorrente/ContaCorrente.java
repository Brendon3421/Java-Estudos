import java.time.LocalDate;

public class ContaCorrente {
	int numberAccount;
	int numberAgency;
	String nameClient;
	LocalDate dateOfBirth;
	double balanceOfAccount;
	boolean Ativo = true;

	public static void sacarUmValor(double ValorSolicitado) {
	}

	public static void transferirValorParaOutraConta(int NumeroDaConta, double balanceOfAccount,
			int NumeroContaDestino) {
	};

	public static void cancelarContaComJustificavativa(int numeroDaConta, String Motivo) {
	};

	public static void consultarExtratoEntreDuasConta(LocalDate dataInical, LocalDate DataFinal) {
	};

	double consultarSaldo() {
		return balanceOfAccount;
	}
}
