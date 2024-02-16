/*Dadas 3 notas, imprimir a média aritmética do aluno.
 * 
 * NOTA 1 + NOTA 2 + NOTA 3 / 3 
 * 
 * 1. Ler três notas
 * 2. Calcular a média 
 * 3. Imprimir o resultado
*/

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        
        //Criando objeto Scanner para fazer a leitura

        Scanner scanner = new Scanner (System.in);

        System.out.println("-- Nome do Aluno --");
        String NomeAluno = scanner.nextLine();

        //Pedindo nota 1 
        System.out.println("Nota 1: ");
        Double nota1 = scanner.nextDouble();

        //Pedindo nota 2 
        System.out.println("Nota 2: ");
        Double nota2 = scanner.nextDouble();

         //Pedindo nota 3
         System.out.println("Nota 3: ");
         Double nota3 = scanner.nextDouble();

         scanner.close();

         Double MediaAritmetica1 = (nota1 + nota2 + nota3) / 3;
         System.out.printf("Olá, %s! A sua média aritmética é %.2f%n", NomeAluno, MediaAritmetica1);

    }
}
