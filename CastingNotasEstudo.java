package casting;

/*
 * Casting = Operação de transformar um tipo de dados em outro.
 * 
 * Widening Casting Vs Narrowing Casting 
 */
public class CastingNotasEstudo {
    public static void main(String[] args) {
       
        //Widening Casting (Implícito) 
        
        byte variavelPequena = 1; 
        int variavelGrande = variavelPequena; //Como o int é maior que o Byte, implicitamente é feito esse Casting.)

        short variavelShort = 10;
        int variavelInt = variavelShort; //Mesmo esquema do de cima

        // Narrowing Casting (Explícito) 

        long variavelLong = 48290045840L; 
        int variavelIntL = (int)variavelLong; //Só é possível fazer a conversão se usar em parenteses, o (INT) 
        //Porém, vale ressaltar também que no final da declaração da variável Long é necessário colocar o L

         System.out.println(variavelIntL);

    }
}
