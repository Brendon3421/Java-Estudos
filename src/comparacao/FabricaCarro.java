package comparacao;

    public class FabricaCarro {
        public static void main(String[] args) {
            Carro carro1 = new Carro("branca", "fiat", "palio");
            Carro carro2 = new Carro("branca", "fiat", "palio");
            Carro carro3 = new Carro("branca", "fiat", "palio");
            Carro carro4 = new Carro("branca", "fiat", "palio");
            Carro carro5 = new Carro("branca", "fiat", "palio");

            Integer number1 =127;
            Integer number2 =127;

            System.out.println(number1 == number2);
            //case01
            System.out.println(carro1.equals(carro3)); //false
            //case02
            System.out.println(carro1.equals(carro2)); //false
        }
    }

