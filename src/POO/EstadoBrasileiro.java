package POO;
    public enum EstadoBrasileiro {


        PI ("PI", "Piauí"),
        SAO_PAULO ("SP","São Paulo"),
        RIO_JANEIRO ("RJ", "Rio de Janeiro"),
        MARANHAO ("MA","Maranhão") ;

        private String nome;
        private String sigla;

        EstadoBrasileiro(String sigla, String nome) {
            this.sigla = sigla;
            this.nome = nome;
        }
        public String getSigla() {
            return sigla;
        }
        public String getNome() {
            return nome;
        }
        public String getNomeMaiusculo() {
            return nome.toUpperCase();
        }
    }

