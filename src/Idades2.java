public class Idades2 {
    public static void main(String[] args) {
        int[] idades = {15, 22, 17, 30, 19, 16, 25, 20, 18, 21};
        
        System.out.println("Idades maiores que 18:");
        for (int idade : idades) {
            if (idade > 18) {
                System.out.println(idade);
            }
        }
    }
}