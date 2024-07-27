public class ResultadoEscolar {
   public static void main(String[] args) {

     int nota = 5;
     
    //Controle de fluxo composto
    if(nota >= 7){
        System.out.println("Aprovado!");
    }
    else if (nota >= 5 && nota < 7){ // ----- fluxo encadeado -----
        System.out.println("Recuperação");
    }

    else{
        System.out.println("Reprovado!");
    }
   
    // condição com operador ternario
    String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
    System.out.println(resultado);
    }
}


