package POO;

public class Cliente {

    String nome;
    Double limiteDeCredito = 10.0;

    public void solicitarValorDeCredito(Double valorSolicitado) {
        limiteDeCredito = valorSolicitado;
    }

    public void comprar(double valorDaCompra) {
        limiteDeCredito = limiteDeCredito - valorDaCompra;
    }

    public Cliente(String nomeInformado) {
        nome = nomeInformado;
    }


}
