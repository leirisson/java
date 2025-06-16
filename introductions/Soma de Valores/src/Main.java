import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Tarefas do sistema
        * - [x]  Receber dois ou mais valores numéricos.
          - [x]  Verificar se os valores são inteiros ou decimais.
          - [x]  Somar os valores.
          - [x]  Exibir o resultado.
        * */
        double valor1;
        double valor2;

        double soma;
        System.out.println("Digite o primeiro valor: ");
        valor1 = Double.parseDouble(scanner.nextLine().trim());

        System.out.println("Digite o segundo valor: ");
        valor2 = Double.parseDouble(scanner.nextLine().trim());

        soma = valor1 + valor2;


        System.out.println("Somda dosa valores: " + valor1 + " + " + valor2 + " = " + soma);

    }
}