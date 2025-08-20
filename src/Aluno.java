import java.util.Scanner;

public class Aluno {

    String nome;
    int matricula;
    double notaAv1;
    double notaAv2;
    
    public void cadastrarAluno() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");
        this.nome = scanner.nextLine();
        
        System.out.print("Digite a matrícula: ");
        this.matricula = scanner.nextInt();
        
        System.out.print("Digite a nota AV1: ");
        this.notaAv1 = scanner.nextDouble();
        
        System.out.print("Digite a nota AV2: ");
        this.notaAv2 = scanner.nextDouble();
    }
    public void mostrarDados() {
        System.out.println("\n=== DADOS DO ALUNO ===");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota AV1: " + notaAv1);
        System.out.println("Nota AV2: " + notaAv2);
        System.out.println("Média: " + calcularMedia());
        verificarAprovacaoCompleto();
    }
    public double calcularMedia() {
        return (notaAv1 + notaAv2) / 2;
    }
    public void verificarAprovacaoCompleto() {
        double media = calcularMedia();
        System.out.print("Situação: ");
        
        if (media >= 7.0) {
            System.out.println("APROVADO! Parabéns!");
        } else if (media >= 4.0) {
            System.out.println("PROVA FINAL. Você precisa de " + (10 - media) + " na final.");
        } else {
            System.out.println("REPROVADO. Estude mais no próximo semestre.");
        }
    }
    public void atualizarNota() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nAtualizando notas de " + nome);
        System.out.print("Nova nota AV1: ");
        this.notaAv1 = scanner.nextDouble();
        System.out.print("Nova nota AV2: ");
        this.notaAv2 = scanner.nextDouble();
        System.out.println("Notas atualizadas com sucesso!");
    }
}
