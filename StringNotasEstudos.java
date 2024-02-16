package string;

import java.util.Scanner;

/*String representa uma cadeia de caracteres */

public class StringNotasEstudos {
    public static void main(String[] args) {
        String texto = "Um texto para ser impresso!";
        System.out.println(texto);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o seu nome?");
        String nome = scanner.nextLine();
        System.out.println("Olá, " + nome);
        scanner.close();
    }
}
