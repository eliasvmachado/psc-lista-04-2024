import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        float media;
        int numero;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o número " + i + ": ");
            numero = scanner.nextInt();
            soma += numero;
        }
        media = (float) soma / 5;
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);
        scanner.close();
    }
}

