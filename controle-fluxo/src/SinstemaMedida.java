public class SinstemaMedida {
    public static void main(String[] args) {

        String sigla = "M";
        
        switch (sigla){

            case "p":{
                System.out.println("pequeno");
                break;
            }
            case "M":{
                System.out.println("médio");
                break;
            }
            case "G":{
                System.out.println("grande");
                break;
            }
            default:{
                System.out.println("Não definido");
                break;
            }
        }
    }
}
