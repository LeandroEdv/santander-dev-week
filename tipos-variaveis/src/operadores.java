public class operadores {
    public static void main(String[] args) {
        int numero = 5;
        System.out.println(- numero);  // esta forma não altera o sinal da variável, apenas modifica a impressão.
        System.out.println(numero);

        int numero2 = 5;
        numero2 *= -1;  // dessa forma existe a modificação no sinal do numero !
        System.out.println(numero2);

        //------------------------------------------------------------------------------------

        // ordem de precedência de incremento

        int numero3 = 5;
        int numero4 = 5;

        //numero3 ++; // numero = numero +1; 

        System.out.println(++numero3); // soma antes da impressão 
        System.out.println(numero4++); // soma após a impressão

         //------------------------------------------------------------------------------------

         boolean variavel = false;

         System.out.println(!variavel); // muda o estado apenas no momento da execução !
         System.out.println(variavel);


        //------------------------------------------------------------------------------------

        // operadores lógicos
        int numeroUm = 1;
        int numeroDois = 2;

        boolean simNao = numero == numero2;
        
        System.out.println("numeroUm é igual a numeroDois ?" + simNao);






    }
}
