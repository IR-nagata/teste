public class livro {
    
    static class Livro {
        private String titulo;
        private String autor;
        private boolean disponivel;
        public Livro(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
            this.disponivel = true; 
        }
        public String getTitulo() {
            return titulo;
        }
        
        public boolean isDisponivel() {
            return disponivel;
        }
        

        public void emprestar() {
            if (disponivel) {
                disponivel = false;
                System.out.println("Livro '" + titulo + "' emprestado com sucesso!");
            } else {
                System.out.println("Livro '" + titulo + "' já está emprestado!");
            }
        }
        
        public void devolver() {
            if (!disponivel) {
                disponivel = true;
                System.out.println("Livro '" + titulo + "' devolvido com sucesso!");
            } else {
                System.out.println("Livro '" + titulo + "' já está disponível!");
            }
        }
        

        public void mostrarInfo() {
            String status = disponivel ? "Disponível" : "Emprestado";
            System.out.println("'" + titulo + "' por " + autor + " - " + status);
        }
    }
    
    static class Biblioteca {
        private Livro[] livros;
        private int contador;
        
        public Biblioteca(int capacidade) {
            livros = new Livro[capacidade];
            contador = 0;
        }
        
        public void adicionarLivro(Livro livro) {
            if (contador < livros.length) {
                livros[contador] = livro;
                contador++;
                System.out.println("Livro '" + livro.getTitulo() + "' adicionado à biblioteca!");
            } else {
                System.out.println("Biblioteca cheia! Não foi possível adicionar o livro.");
            }
        }
        
        public void emprestarLivro(String titulo) {
            for (int i = 0; i < contador; i++) {
                if (livros[i].getTitulo().equalsIgnoreCase(titulo)) {
                    livros[i].emprestar();
                    return;
                }
            }
            System.out.println("Livro '" + titulo + "' não encontrado na biblioteca!");
        }
        

        public void devolverLivro(String titulo) {
            for (int i = 0; i < contador; i++) {
                if (livros[i].getTitulo().equalsIgnoreCase(titulo)) {
                    livros[i].devolver();
                    return;
                }
            }
            System.out.println("Livro '" + titulo + "' não encontrado na bibliotca!");
        }
        
        public void mostrarLivros() {
            System.out.println("\n=== LIVROS NA BILIOTECA ===");
            if (contador == 0) {
                System.out.println("Nenhum livro cadastrado.");
            } else {
                for (int i = 0; i < contador; i++) {
                    livros[i].mostrarInfo();
                }
            }
            System.out.println("--");
        }
    }
    

    public static void main(String[] args) {
        System.out.println(" SISTEMA DE BIBLIOTECA ");
        

        Biblioteca biblioteca = new Biblioteca(5);
        

        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis");
        Livro livro2 = new Livro("O Cortiço", "Aluísio Azevedo");
        Livro livro3 = new Livro("Iracema", "José de Alencar");
        

        System.out.println("\n--- Adicionando livros ---");
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        
        System.out.println("\n--- Livros cadastrados ---");
        biblioteca.mostrarLivros();
        
        System.out.println("\n--- Realizando empréstimo ---");
        biblioteca.emprestarLivro("Dom Casmurro");
        biblioteca.emprestarLivro("Livro Inexistente");
        
        System.out.println("\n--- stado após empréstimo ---");
        biblioteca.mostrarLivros();

        System.out.println("\n--- Realizando devolução ---");
        biblioteca.devolverLivro("Dom Casmurro");
        biblioteca.devolverLivro("Dom Casmurro");
        
      
        System.out.println("\n--- estado final ---");
        biblioteca.mostrarLivros();
    }
}