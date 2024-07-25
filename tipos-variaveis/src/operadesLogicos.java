

public class operadesLogicos {
    public static void main(String[] args) {

    int a = 5;
    int b = 6;
    String resultado = a == b ? "verdadeiro" : "falso"; // retorna apartir de uma expreção boleana
    boolean resposta = false;

    System.out.println(resultado);



    // operadores lógicos
    int numeroUm = 1;
    int numeroDois = 2;

    boolean simNao = numeroUm == numeroDois;
    
    System.out.println("numeroUm é igual a numeroDois? " + simNao);

    //------------------------------------------------------------------------------------

    String nomeUm = "Leandro";
    String nomeDois = new String("Leandro");

    System.out.println(nomeUm == nomeDois);
    System.out.println(nomeUm.equals(nomeDois)); // verifica o conteúdo


    }
    
    
}
