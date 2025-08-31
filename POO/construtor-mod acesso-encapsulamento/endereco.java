public class endereco {
    
    static class Endereco {
        private String rua;
        private int numero;
        
        public Endereco(String rua, int numero) {
            this.rua = rua;
            this.numero = numero;
        }
        
        public String getRua() {
            return rua;
        }
        
        public int getNumero() {
            return numero;
        }
    }
    
    static class Pessoa {
        private String nome;
        private int idade;
        private Endereco endereco; 
        

        public Pessoa(String nome, int idade, Endereco endereco) {
            this.nome = nome;
            this.idade = idade;
            this.endereco = endereco;
        }
        
        public String getNome() {
            return nome;
        }
        
        public int getIdade() {
            return idade;
        }
        
        public Endereco getEndereco() {
            return endereco;
        }
    
        public void mostrarDados() {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Endereço: " + endereco.getRua() + ", " + endereco.getNumero());
            System.out.println();
        }
    }
    

    public static void main(String[] args) {
        System.out.println("= PESSOAS E ENDEREÇOS =");
        System.out.println();
        
        Endereco endereco1 = new Endereco("Rua das Flores", 123);
        Endereco endereco2 = new Endereco("Avenida Brasil", 456);
        
        Pessoa pessoa1 = new Pessoa("João Silva", 25, endereco1);
        Pessoa pessoa2 = new Pessoa("Maria Santos", 30, endereco2);
        
        System.out.println("Dados da Pessoa 1:");
        pessoa1.mostrarDados();
        
        System.out.println("Dados da Pessoa 2:");
        pessoa2.mostrarDados();
    
        System.out.println("= USANDO GETTERS INDIVIDUAIS =");
        System.out.println("Pessoa 1 - Nome: " + pessoa1.getNome());
        System.out.println("Pessoa 1 - Idade: " + pessoa1.getIdade());
        System.out.println("Pessoa 1 - Rua: " + pessoa1.getEndereco().getRua());
        System.out.println("Pessoa 1 - Número: " + pessoa1.getEndereco().getNumero());
        System.out.println();
        
        System.out.println("Pessoa 2 - Nome: " + pessoa2.getNome());
        System.out.println("Pessoa 2 - Idade: " + pessoa2.getIdade());
        System.out.println("Pessoa 2 - Rua: " + pessoa2.getEndereco().getRua());
        System.out.println("Pessoa 2 - Número: " + pessoa2.getEndereco().getNumero());
    }
}