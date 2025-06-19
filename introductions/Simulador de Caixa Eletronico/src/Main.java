import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int valor;
    // Calcular o número mínimo de notas de R$100, R$50, R$20, R$10.
        System.out.print("Digite um valor para a operação: ");
        valor = scanner.nextInt();


        int quantidadeDeNotas100, quantidadeDeNotas50, quantidadeDeNotas20, quantidadeDeNotas10;
        int troco=0, trocoAtual=0;

        if(valor >= 100){
            troco = valor%100;
            quantidadeDeNotas100 = (valor - troco)/100;
            System.out.println("quantidades de notas de 100R$: " + quantidadeDeNotas100);
        }
        if(troco >= 50){
            trocoAtual = troco%50;
            quantidadeDeNotas50 = troco/50;
            System.out.println("quantidades de notas de 50R$: " + quantidadeDeNotas50);
        }
        if(trocoAtual >= 20){
            troco = trocoAtual%20;
            quantidadeDeNotas20 = trocoAtual/20;
            System.out.println("quantidades de notas de 20R$: " + quantidadeDeNotas20);
        }
        if(troco >= 10){
            trocoAtual = troco%10;
            quantidadeDeNotas10 = troco/10;
            System.out.println("quantidades de notas de 10R$: " + quantidadeDeNotas10);
        }


    }
}