import java.util.Scanner;

public class ContaBancaria {
    // Atributos
    public String numeroConta;
    public String titular;
    public double saldo;
    
    // Método para depositar
    public void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }
    
    // Método para sacar
    public void sacar(double valor) {
        if (valor > 0) {
            if (saldo >= valor) {
                saldo = saldo - valor;
                System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
            } else {
                System.out.println("Saldo insuficiente para saque!");
            }
        } else {
            System.out.println("Valor de saque inválido!");
        }
    }
    
    // Método para consultar saldo
    public void consultarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }
    
    // Método para mostrar dados da conta
    public void mostrarDados() {
        System.out.println("\n=== DADOS DA CONTA ===");
        System.out.println("Número: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
    }
}

