package POO;

public class Sistemas {
    public static void main(String[] args) {
        Cliente brendon = new Cliente("brendon");


        System.out.println(brendon.limiteDeCredito);
        brendon.solicitarValorDeCredito(350.21);
        System.out.println("o valor do credito do " + brendon.nome + " "+ brendon.limiteDeCredito);
        brendon.comprar(321.21);
        System.out.println("o valor do credito do " + brendon.nome + " "+ brendon.limiteDeCredito);

    }

}


