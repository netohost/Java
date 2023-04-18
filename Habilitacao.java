package com.java.operadores;

import java.util.Scanner;

public class Habilitacao {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.println("Digite seu nome: "); //Digite seu nome
		String nome = scanner.nextLine();
		
		
		
		System.out.println("Você deseja tirar habilitação? (S/N)"); //Digite se deseja tirar CNH
		String tirarHabilitacao = scanner.next();
		
		if (tirarHabilitacao.equals("S")){
			System.out.println("Digite sua idade: "); //Digite sua idade
			int idade = scanner.nextInt();
			
			if (idade >= 18) {
				System.out.println("Você está apto à tirar sua habilitação!");
			} else {
				System.out.println("Infelizmente, você terá de aguardar sua maioridade.");
			}
		} else {
			System.out.println("Obrigado por utilizar nosso sistema, até a próxima!");
		}
		
		scanner.close();
	}

}
