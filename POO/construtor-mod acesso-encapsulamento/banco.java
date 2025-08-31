public class banco {
    
    static class ContaBancaria {

        private int numeroConta;
        private double saldo;
    
        public ContaBancaria(int numeroConta, double saldoInicial) {
            this.numeroConta = numeroConta;
            this.saldo = saldoInicial;
        }
        
        public void depositar(double valor) {
            saldo = saldo + valor;
            System.out.println("Depósito de R$ " + valor + " realizado!");
        }
        
        public void sacar(double valor) {
            if (valor <= saldo) {
                saldo = saldo - valor;
                System.out.println("Saque de R$ " + valor + " realizado!");
            } else {
                System.out.println("Saldo insuficiente para saque de R$ " + valor);
            }
        }
        
        public double getSaldo() {
            return saldo;
        }
        
        public int getNumeroConta() {
            return numeroConta;
        }
    }

    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria(12345, 1000.00);
        System.out.println("=== CONTA BANCÁRIA ===");
        System.out.println("Número da conta: " + minhaConta.getNumeroConta());
        System.out.println("Saldo inicial: R$ " + minhaConta.getSaldo());
        System.out.println();
        minhaConta.depositar(500.00);
        System.out.println("Saldo atual: R$ " + minhaConta.getSaldo());
        System.out.println();
        minhaConta.sacar(200.00);
        System.out.println("Saldo atual: R$ " + minhaConta.getSaldo());
        System.out.println();
        minhaConta.sacar(2000.00); 
        System.out.println("Saldo atual: R$ " + minhaConta.getSaldo());
        System.out.println();
        minhaConta.depositar(300.00);
        System.out.println("Saldo final: R$ " + minhaConta.getSaldo());
    }
}