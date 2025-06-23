
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        System.out.println("#####################");
        System.out.println("# 1 - Água           ");
        System.out.println("# 2 - Refrigerante   ");
        System.out.println("# 3 - Suco           ");
        System.out.println("# ESCOLHA UMA OPÇÃO: ");
        System.out.print("#####################: ");
        String op = scanner.nextLine().trim();

        switch (op){
            case "1":
                System.out.println("item selecionado Água.");
                break;
            case "2":
                System.out.println("Item selecionado Refrigerante.");
                break;
            case "3":
                System.out.println("Item selecionado Suco");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

    }
}