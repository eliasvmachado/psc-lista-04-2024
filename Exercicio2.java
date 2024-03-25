import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String user, senha;
		
		while(true) {
			System.out.println("Por favor, digite o seu usuário: ");
			user = scanner.nextLine();
			System.out.println("Agora digite a sua senha: ");
			senha = scanner.nextLine();
			
			if (!user.equalsIgnoreCase(senha)) {
				System.out.println("Uhul! O seu cadastro foi validado!");
				break;
			} else {
				System.out.println("Opss, sua senha precisa ser diferente do seu nome de usuário");
			}	
		}
		scanner.close(); 
	}
}

