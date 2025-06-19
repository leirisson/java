
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String emailUser = "leirisson@example.com.br";
        String passwordUser = "123456";

        System.out.print("Email do sistema: ");
        String emailInput = scanner.nextLine();

        System.out.print("Senha do sistema: ");
        String passwordInput = scanner.nextLine();

        if(emailUser.equals(emailInput) && passwordUser.equals(passwordInput)){
            System.out.println("# LOGADO COM SUCESSO #");
            System.out.println("Bem-vindo ao Sistema.");
        } else {
            System.out.println("Email ou senha, incorreto.");
        }
    }
}