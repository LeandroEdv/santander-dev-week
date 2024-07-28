
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        try{

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("digite seu nome ");
        String nome = scanner.next();

        System.out.println("digite seu sobrenome ");
        String sobrenome = scanner.next();

        System.out.println("digite sua idade ");
        int idade = scanner.nextInt();

        System.out.println("digite sua altura ");
        double altura = scanner.nextDouble();
    

        System.out.println("olá, eu me chamo " + nome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " cm");
        System.out.println("...");
        }
        catch(InputMismatchException e){
            System.out.println("Erro, os campos de altura e idade precisam ser numéricos");
        }
        
    }
}
