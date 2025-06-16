import java.util.Scanner;
import java.text.DecimalFormat;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double altura, peso, imc;
        DecimalFormat dif = new DecimalFormat("#.##");
        String imcFormatado = "";

        // formula de calculo do imc
        // IMC = Peso (kg) ÷ Altura² (m)
        // capturar informações do usuario

        System.out.print("altura do pasciente: ");
        String alturaInput = scanner.nextLine().trim().replace(",", ".");
        altura = Double.parseDouble(alturaInput);

        System.out.print("peso do pasciente: ");
        String pesoInput = scanner.nextLine().trim().replace(",", ".");
        peso = Double.parseDouble(pesoInput);


        // calculando o imc
        imc = peso / Math.pow(altura, 2);

        // Formatar o imc para duas casas decimais
        imcFormatado = dif.format(imc).trim().replace(",", ".");;

        // convertendo o valor de string para inteiro
         imc = Float.parseFloat(imcFormatado);


        // Exibir cabeçalho e resultado
        System.out.println("\n# Calculador do IMC #");
        System.out.println(String.format("IMC: " + imc ));


        // Classificação do IMC
        if(imc < 18.5){
            System.out.println("# Calculador do IMC #");
            System.out.println("IMC: " + imc);
            System.out.println("STATUS: Abaixo do peso");

        } else if(imc >= 18.5 && imc <= 24.9){
            System.out.println("Peso normal");

        }
        else if(imc >= 25 && imc <= 29.9){
            System.out.println("Sobrepeso");

        }
        else if(imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade grau I");

        }

        else if (imc >= 35 && imc <= 39.9){
            System.out.println("Obesidade grau II");
        }
        else if (imc >= 40 ) {
            System.out.println(" Obesidade grau III (mórbida)");
        }

        scanner.close();
    }
}