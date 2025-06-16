import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     /*
     *Contexto:** Um site precisa verificar se a pessoa é maior de idade.
    - **Tarefas do sistema:**
    - [*]  Receber a idade.
    - [*]  Verificar se é maior ou menor de 18 anos.
    - [*]  Exibir uma mensagem apropriada.*/

        Scanner scanner = new Scanner(System.in);

        int idade = 0;

        System.out.print("Informe sua idade: ");
        idade = Integer.parseInt(scanner.nextLine().trim());

        if(idade < 18 ){
            System.out.println("Você não é maior de idade");
            return;
        }

        System.out.println("Bem-Vindo, você é maior de idade.");

    }
}