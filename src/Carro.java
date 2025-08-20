import java.util.Scanner;

public class Carro {
    public String marca;
    public String modelo;
    public int ano;
    
    public void mostrarInformacoes() {
        System.out.println("\n=== INFORMAÇÕES DO CARRO ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
    

    

    public void ligar() {
        System.out.println("VRUM VRUM! O carro " + marca + " " + modelo + " está ligado!");
    }
}
