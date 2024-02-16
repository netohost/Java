package operadores;

public class OperadoresNotasEstudo {
    public static void main(String[] args) {

        //Aritméticos

        int numero1 = 1;
        int numero2 = 2;
        int soma = numero1 + numero2;
        System.err.println("A soma é de " + soma);

        int numero3 = 3;
        int numero4 = 4;
        int subtracao = numero4 - numero3;
        System.out.println("A subtração é " + subtracao);

        int numero5 = 5; 
        int numero6 = 6; 
        int multiplicacao = numero5 * numero6;
        System.out.println("A Multiplicação é de "+ multiplicacao);

        int numero7 = 7;
        int numero70 = 70;
        int divisao = numero70 / numero7; 
        System.out.println("A divisão é de " + divisao);
        
        int modulo = numero70 % numero7;
        System.out.println("O modulo é de " + modulo);

        int contador = 0;
        contador++; //Isso vai fazer incrementar
        contador++;//Isso vai fazer incrementar
        System.out.println(contador); 

        int decrementador = 0;
        contador--; //Isso vai fazer decrementar
        contador--;//Isso vai fazer decrementar
        System.out.println(decrementador); 


        //Relacionais 

        double decimal1 = 1.0;
        double decimal2 = 2.0;
        boolean Ehmaior = decimal2 > decimal1;
        System.out.println(Ehmaior); //Retorna True, pois 2 é maior que 1 
        
        boolean EhMenor = decimal2 < decimal1;
        System.out.println(EhMenor); //Retorna Falso pois 2 não é menor que 1

        System.out.println(decimal1 >= decimal1); //1 é maior ou igual à 1 = True

        System.out.println(decimal1 <= decimal1);

        System.out.println(decimal1 == decimal1); //True, pois as váriaveis são iguais

        System.out.println(decimal1 != decimal2); //True, pois decimal1 é diferente de decimal12
    
        // Atribuição 

        int variavel = 1;
        variavel += 4;
        System.out.println(variavel); //Atribuiu um valor à variavel

        variavel -= 1;
        System.out.println(variavel); //Subtrai o número 1 do valor 

        variavel *= 5;
        System.out.println(variavel);; //Multiplica 

        variavel /= 5; //Divide por 5 
        System.out.println(variavel);

        variavel %= 1; //Resto da divisão da variavel por 1 
        System.out.println(variavel);

        // Lógicos 

        int valor1 = 4;
        int valor2 = 2;
        boolean expressao = valor1 < 10 && valor2 < 1;
        System.out.println(expressao); //Falso porquê o valor 1 não é maior que 10

        boolean EhOu = valor1 < 10 || valor2 < 1; 
        System.err.println(EhOu); //Verdadeiro, pq apesar de valor1 ser menor que 10, valor 2 é maor que 1!

        boolean Negacao = valor1 == valor2;
        System.err.println(Negacao);

    }
}
