/*
* CONTEXTO DO EXERCICIO
* Uma loja online deseja oferecer descontos com base no valor total da compra usando atribuição ternária.
* - **Tarefas do sistema:**
    - [x] Solicitar o valor total da compra.
    - [x] Aplicar 10% de desconto se o valor for maior que R$ 100,00, caso contrário, não aplicar desconto (usar operador ternário).
    - [x] Exibir o valor final com ou sem desconto.
* */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Float valorTotalDaCompra ;

        System.out.print("Qual o valor total da compra: ");
        String valorInput = scanner.nextLine().trim();
        valorTotalDaCompra = Float.parseFloat(valorInput);

       double totoal = valorTotalDaCompra > 100 ? valorTotalDaCompra - (valorTotalDaCompra * 0.10) : valorTotalDaCompra;

        System.out.println("valor: " +  totoal);

    }
}