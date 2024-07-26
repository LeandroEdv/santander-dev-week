
import java.util.Locale;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {

        // instanciando o objeto da classe scanner!
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println( "nome: "+ nome + " idade: "+ idade);
    }
}
