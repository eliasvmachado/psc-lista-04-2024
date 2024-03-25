import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float nota = 1;
		
		while (true) {
			System.out.println("Por favor, digite uma nota entre 0 e 10:");
			nota = scanner.nextFloat();
			if (nota >=0 && nota <= 10) {
				System.out.println("A nota " + nota + " é válida! Parabéns");
				break;
			} else {
				System.out.println("Você digitou uma nota inválida.");
			}
		}
		scanner.close();
	}
}

