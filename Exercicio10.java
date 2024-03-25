import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inicio, fim;

        System.out.print("Digite o primeiro número inteiro: ");
        inicio = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        fim = scanner.nextInt();

        for (int i = inicio; i <= fim; i++) {
            System.out.println(i);
        }
        scanner.close();
    }
}

