import java.util.Scanner;
public class ProjetoCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== SISTEMA DE CARROS ===");
        

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        
        System.out.println("\n--- Cadastro do Primeiro Carro ---");
        System.out.print("Digite a marca: ");
        carro1.marca = scanner.nextLine();
        System.out.print("Digite o modelo: ");
        carro1.modelo = scanner.nextLine();
        System.out.print("Digite o ano: ");
        carro1.ano = scanner.nextInt();
        scanner.nextLine(); 
        

        System.out.println("\n--- Cadastro do Segundo Carro ---");
        System.out.print("Digite a marca: ");
        carro2.marca = scanner.nextLine();
        System.out.print("Digite o modelo: ");
        carro2.modelo = scanner.nextLine();
        System.out.print("Digite o ano: ");
        carro2.ano = scanner.nextInt();
        
        System.out.println("\n=== CARROS CADASTRADOS ===");
        carro1.mostrarInformacoes();
        carro2.mostrarInformacoes();
        
 
        System.out.println("\n=== ALTERANDO O PRIMEIRO CARRO ===");
        scanner.nextLine(); 
        System.out.print("Nova marca: ");
        carro1.marca = scanner.nextLine();
        System.out.print("Novo modelo: ");
        carro1.modelo = scanner.nextLine();
        System.out.print("Novo ano: ");
        carro1.ano = scanner.nextInt();
        
        System.out.println("\n=== CARRO MODIFICADO ===");
        carro1.mostrarInformacoes();
        
        System.out.println("\n=== TESTANDO OS CARROS ===");
        System.out.println("\nLigando o primeiro carro:");
        carro1.ligar();
        
        System.out.println("\nLigando o segundo carro:");
        carro2.ligar();
        
        scanner.close();
    }
}