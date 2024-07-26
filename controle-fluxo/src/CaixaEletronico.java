public class CaixaEletronico {
    public static void main(String[] args) {
        double valorSolicitado = 17.0;
        double saldo = 25.0;

        // Controle de fluxo simples
        if (valorSolicitado < saldo){
            saldo -= valorSolicitado;
            System.out.println(saldo);
        }
    }
}
