import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        
        System.out.println("=== SISTEMA DE ALUNOS UNAMA ===");
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        System.out.println("\nCadastro do primeiro aluno:");
        aluno1.cadastrarAluno();
        System.out.println("\nCadastro do segundo aluno:");
        aluno2.cadastrarAluno();
        aluno1.mostrarDados();
        aluno2.mostrarDados();
        



        System.out.print("\nDeseja atualizar as notas de algum aluno? (s/n): ");
        char resposta = Scanner.next().charAt(0);
        
        if (resposta == 's' || resposta == 'S') {
            System.out.print("Qual aluno? (1 ou 2): ");
            int escolha = Scanner.nextInt();
            
            if (escolha == 1) {
                aluno1.atualizarNota();
            } else {
                aluno2.atualizarNota();
            }
        }
        System.out.println("\n=== DADOS FINAIS ===");
        aluno1.mostrarDados();
        aluno2.mostrarDados();
    }
}