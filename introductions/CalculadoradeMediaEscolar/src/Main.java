import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);

        // nota do Aluno
        double nota1;
        double nota2;
        double nota3;
        double nota4;

        double mediaAluno;

        String status = "";

        System.out.println("#INFORME AS NOTAS DO ALUNO#");

        System.out.print("Digite a primeira nota: ");
        nota1 = Double.parseDouble(scanner.nextLine().trim());

        System.out.print("Digite a seunda nota: ");
        nota2 = Double.parseDouble(scanner.nextLine().trim());

        System.out.print("Digite a terceira nota: ");
        nota3 = Double.parseDouble(scanner.nextLine().trim());

        System.out.print("Digite a ultima nota do aluno: ");
        nota4 = Double.parseDouble(scanner.nextLine().trim());


        // calculando a media do aluno
        mediaAluno = (nota1 + nota2 + nota3 + nota4)/4;

        if(mediaAluno < 6){
            status = "reprovado";
            System.out.println("#NOTAS DO ALUNO E SUA MÉDIA#");
            System.out.println("# 1ª Nota: "  + nota1);
            System.out.println("# 2ª Nota: "  + nota2);
            System.out.println("# 3ª Nota: "  + nota3);
            System.out.println("# 4ª Nota: "  + nota4);
            System.out.println("# média do aluno: "  + mediaAluno);
            System.out.print("# STATUS DO ALUNO: " + status);
        } else if (mediaAluno >= 6 ){
            status = "aprovado";
            System.out.println("#NOTAS DO ALUNO E SUA MÉDIA#");
            System.out.println("# 1ª Nota: "  + nota1);
            System.out.println("# 2ª Nota: "  + nota2);
            System.out.println("# 3ª Nota: "  + nota3);
            System.out.println("# 4ª Nota: "  + nota4);
            System.out.println("# média do aluno: "  + mediaAluno);
            System.out.print("# STATUS DO ALUNO: " + status);
        }

    }
}