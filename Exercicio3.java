import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, sexo, ec;
        int idade;
        float salario;

        while (true) {
            System.out.println("Digite seu nome: ");
            nome = scanner.nextLine();
            if (nome.length() > 3) {
                break;
            } else {
                System.out.println("Digite um nome válido (acima de 3 caracteres).");
            }
        }

        while (true) {
            System.out.println("Digite sua idade: ");
            idade = scanner.nextInt();
            if (idade > 0 && idade < 150) {
                break;
            } else {
                System.out.println("Digite uma idade válida.");
            }
        }

        while (true) {
            System.out.println("Digite seu salário: ");
            salario = scanner.nextFloat();
            if (salario > 0) {
                break;
            } else {
                System.out.println("Digite um salário válido.");
            }
        }

        scanner.nextLine(); // Limpa o buffer do scanner

        while (true) {
            System.out.println("Digite seu sexo ('f' ou 'm'): ");
            sexo = scanner.nextLine();
            if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
                break;
            } else {
                System.out.println("Digite um sexo válido.");
            }
        }

        while (true) {
            System.out.println("Digite seu estado cívil: \n's' para SOLTEIRO\n'c' para CASADO\n'v' para VIÚVO\n'd' para DIVORCIADO");
            ec = scanner.nextLine();
            if (ec.equalsIgnoreCase("s") || ec.equalsIgnoreCase("c") || ec.equalsIgnoreCase("v") || ec.equalsIgnoreCase("d")) {
                break;
            } else {
                System.out.println("Digite um estado civil válido.");
            }
        }

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + ec);

        scanner.close(); 
    }
}
