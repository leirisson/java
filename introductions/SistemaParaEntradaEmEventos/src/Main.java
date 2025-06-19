//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


//### **1. Sistema de Verificação de Idade para Entrada em Eventos**
//
//        - **Contexto:** Um clube noturno precisa de um programa para verificar a idade dos clientes e permitir ou negar a entrada com base na idade mínima (18 anos).
//        - **Tarefas do sistema:**
//        - [ ]  Solicitar a idade do cliente.
//        - [ ]  Usar uma estrutura **conditional** para verificar se a idade é maior ou igual a 18.
//        - [ ]  Exibir mensagem de "Entrada permitida" ou "Entrada negada".
//=======================================================================================================

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idadeCliente;

        System.out.print("Qual a idade do cleinte: ");
        idadeCliente = scanner.nextInt();

        if(idadeCliente >=18){
            System.out.println("Entrada permitida.");
        }
        else {
            System.out.println("Entrada negada.");
        }
    }
}