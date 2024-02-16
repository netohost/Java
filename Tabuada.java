/*
 * Imprimir a tabuada de um determinado número
 * 
 * 1. Ler o número 
 * 2. Imprimir sua tabuada
 * 
 * 1 à 10. 
 */

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        //Abre Scanner pra ler o dado
        Scanner scanner = new Scanner (System.in);

        //Leitor do dado

        System.out.println("-- Tabuada --");
        System.out.println("Qual número você deseja saber?");
        int numero = scanner.nextInt();
        scanner.close();

        System.out.println("-- Tabuada do " + numero + "--");
        System.out.println(numero + " x 1 = " + (1*numero));
        System.out.println(numero + " x 2 = " + (2*numero));
        System.out.println(numero + " x 3 = " + (3*numero));
        System.out.println(numero + " x 4 = " + (4*numero));
        System.out.println(numero + " x 5 = " + (5*numero));
        System.out.println(numero + " x 6 = " + (6*numero));
        System.out.println(numero + " x 7 = " + (7*numero));
        System.out.println(numero + " x 8 = " + (8*numero));
        System.out.println(numero + " x 9 = " + (9*numero));
        System.out.println(numero + " x 10 = " + (10*numero));

    }
}
