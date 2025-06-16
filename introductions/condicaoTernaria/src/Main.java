import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Qual sua idade: ");
        String idadeInput = scanner.nextLine().trim();

        int idade = Integer.parseInt(idadeInput);

        final int MAIOR_IDADE = 18;

        boolean mario_de_idade = idade > MAIOR_IDADE;

        String mensagem = nome + (mario_de_idade ? " é maior de iadade." : " não é maior de idade.");


        System.out.println(mensagem);

        scanner.close();
    }
}