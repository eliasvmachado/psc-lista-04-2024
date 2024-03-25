import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int populacaoA, populacaoB, anos;
        double taxaA, taxaB;

        System.out.print("Digite a população do país A: ");
        populacaoA = scanner.nextInt();
        System.out.print("Digite a taxa de crescimento anual do país A (em %): ");
        taxaA = scanner.nextDouble() / 100;

        System.out.print("Digite a população do país B: ");
        populacaoB = scanner.nextInt();
        System.out.print("Digite a taxa de crescimento anual do país B (em %): ");
        taxaB = scanner.nextDouble() / 100;

        anos = 0;
        while (populacaoA <= populacaoB) {
            populacaoA += (populacaoA * taxaA);
            populacaoB += (populacaoB * taxaB);
            anos++;
        }
        System.out.println("Serão necessários " + anos + " anos para que a população de A ultrapasse ou iguale a população de B.");
        scanner.close();
    }
}

