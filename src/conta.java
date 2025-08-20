import java.util.Scanner;
public class conta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        


        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();
        
        System.out.println("=== CONTA 1 ===");
        System.out.print("Digite o número da conta 1: ");
        conta1.numeroConta = scanner.nextLine();
        System.out.print("Digite o titular da conta 1: ");
        conta1.titular = scanner.nextLine();
        conta1.saldo = 0;
    
        System.out.println("\n=== CONTA 2 ===");
        System.out.print("Digite o número da conta 2: ");
        conta2.numeroConta = scanner.nextLine();
        System.out.print("Digite o titular da conta 2: ");
        conta2.titular = scanner.nextLine();
        conta2.saldo = 0;
    

        
        System.out.println("\n=== OPERAÇÕES CONTA 1 ===");
        System.out.print("Valor para depósito na conta 1: ");
        double deposito1 = scanner.nextDouble();
        conta1.depositar(deposito1);
        
        System.out.print("Valor para saque na conta 1: ");
        double saque1 = scanner.nextDouble();
        conta1.sacar(saque1);
        
        conta1.consultarSaldo();
        
        System.out.println("\n=== OPERAÇÕES CONTA 2 ===");
        System.out.print("Valor para depósito na conta 2: ");
        double deposito2 = scanner.nextDouble();
        conta2.depositar(deposito2);
        
        System.out.print("Valor para saque na conta 2: ");
        double saque2 = scanner.nextDouble();
        conta2.sacar(saque2);
        



        conta2.consultarSaldo();
        System.out.println("\n=== SITUAÇÃO FINAL ===");
        conta1.mostrarDados();
        conta2.mostrarDados();
        
        scanner.close();
    }
}