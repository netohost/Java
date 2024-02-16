package tiposprimitivos;

/*
 *  Notas de estudo sobre os tipos primitivos do Java.
 *  Tipos primitivos são providos pela linguagem nativamente.
 */
public class TiposPrimitivosNotasEstudo {
    public static void main(String[] args) {
        // Caracteres - Characters 
        char primeiraLetraDoNome = 'J';
        char primeiraLetraDoNomeASCII = 74;

        System.out.println(primeiraLetraDoNome);
        System.out.println(primeiraLetraDoNomeASCII);

        // Inteiros ou Intengers 

        byte nota = 10; //128 até -127
        short itensComprados = 2; //-32768 até 32767
        int qtdeEstoque = 23366; //Quase infinito kkkkkk
        long numeroMuitoGrande = 48290045840L; //Precisa por L no final pra mostrar que é Long. 19 dígitos em média. 
        
        // Tipos Decimais

        float peso = 1.5f; //6 - 7 casas decimais
        double preco = 24.99; // Aprox. 15 casas decimais 

        // Booleans ou Boleanos 
        boolean verdadeiro = true;
        boolean falso = false;
    }
}
