public class Usuario {
    public static void main(String[] args) throws Exception {
     
        SmartTv smartTv = new SmartTv();
        
        smartTv.mudarCanal(9);
        System.out.println("Tv ligada ? " + smartTv.ligada); 
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

    }
}
