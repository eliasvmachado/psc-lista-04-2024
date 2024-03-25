import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int numero;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o número " + i + ": ");
            numero = scanner.nextInt();
            if (numero > maior) {
                maior = numero;
            }
        }
        System.out.println("O maior número é: " + maior);
        scanner.close();
    }
}
