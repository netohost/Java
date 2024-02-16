package io;

/*Importa direto da biblioteca a funcionalidade de Scanner */
import java.util.Scanner;

/*
 * Entrada e Saída (I/O) de dados no Java.
 * 
 * Entrada de dados: Ler dados digitados pelo usuário.
 * Saída de dados: Escrever dados para o usuário.
 */

public class IoNotasEstudo {
    public static void main(String[] args) {
    //Leitura de dados de entrada
     Scanner scanner = new Scanner(System.in);
     System.out.println("Digite um número abaixo:");
     int valorDigitado = scanner.nextInt();
     System.out.println("O valor digitado foi " + valorDigitado);
     scanner.close();

     //Saída de Dados 
     System.out.printf("O número digitado foi %d", valorDigitado);
    }
}
