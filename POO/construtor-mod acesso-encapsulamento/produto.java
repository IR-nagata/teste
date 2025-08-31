public class produto {
    

    static class Produto {

        private String nome;
        private double preco;

        public Produto(String nome, double preco) {
            this.nome = nome;
            setPreco(preco); 
        }
        

        public String getNome() {
            return nome;
        }
        
        public double getPreco() {
            return preco;
        }
        

        public void setNome(String nome) {
            this.nome = nome;
        }
        
        public void setPreco(double preco) {
            if (preco >= 0) {
                this.preco = preco;
            } else {
                System.out.println("Erro: Preço não pode ser negativo! (" + preco + ")");
            }
        }
        
        public void mostrarInfo() {
            System.out.println("Produto: " + nome + " | Preço: R$ " + preco);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== TESTANDO CLASSE PRODUTO ===");
        System.out.println();
        
        System.out.println("1. Criando produtos válidos:");
        Produto p1 = new Produto("Notebook", 2500.00);
        Produto p2 = new Produto("Mouse", 50.00);
        p1.mostrarInfo();
        p2.mostrarInfo();
        System.out.println();
    
        System.out.println("2. Alterando preços com valores válidos:");
        p1.setPreco(2300.00);
        p2.setPreco(45.90);
        p1.mostrarInfo();
        p2.mostrarInfo();
        System.out.println();
        System.out.println("3. Tentando alterar preços com valores inválidos:");
        p1.setPreco(-100.00); 
        p2.setPreco(-1.00);   
        System.out.println();
        
        System.out.println("4. Preços permanecem os mesmos após tentativas inválidas:");
        p1.mostrarInfo();
        p2.mostrarInfo();
        System.out.println();
        System.out.println("5. Criando produto com preço negativo no construtor:");
        Produto p3 = new Produto("Teclado", -80.00);
        p3.mostrarInfo();
        System.out.println();
        System.out.println("6. Corrigindo o preço do teclado:");
        p3.setPreco(120.00);
        p3.mostrarInfo();
    }
}