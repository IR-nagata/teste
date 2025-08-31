public class pessoa {
    
    static class Pessoa {
        public String nome;
        public int idade;
        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }
    }
    
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", 25);
        Pessoa pessoa2 = new Pessoa("Maria", 30);
        System.out.println("Pessoa 1: " + pessoa1.nome + ", " + pessoa1.idade + " anos");
        System.out.println("Pessoa 2: " + pessoa2.nome + ", " + pessoa2.idade + " anos");
    }
}