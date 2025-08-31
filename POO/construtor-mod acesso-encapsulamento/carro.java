public class carro {
    
    static class Carro {
        private String marca;
        private int ano;
        
        public Carro(String marca, int ano) {
            this.marca = marca;
            this.ano = ano;
        }
        public String getMarca() {
            return marca;
        }
        public int getAno() {
            return ano;
        }
    }
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Fiat", 2020);
        
        System.out.println("Marca do carro: " + meuCarro.getMarca());
        System.out.println("Ano do carro: " + meuCarro.getAno());
    }
}