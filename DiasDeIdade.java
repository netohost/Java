/*Escreva um programa que leia uma idade em anos e imprima em dias. */


import java.util.Scanner;

public class DiasDeIdade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        //Leitor da nome

        System.out.println("Qual é o seu nome?");
        String Nome = scanner.nextLine();

        //Leitor da idade e conta

        System.out.println("Quantos anos você tem?");
        int Idade = scanner.nextInt();
        int conta = Idade * 365; 
        System.out.printf("Olá, %s.", Nome);
        System.out.println("Você tem " + conta + " dias!");
        scanner.close();
    }
}
