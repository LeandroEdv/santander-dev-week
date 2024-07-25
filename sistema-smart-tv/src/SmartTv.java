public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // metos para ligar e desligar a tv

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    // metodos de controle de volume

    public void aumentarVolume(){
        volume ++;
        System.out.println("Aumentaado o volume para: "+ volume);
    }
    public void diminuirVolume(){
        volume --;
        System.out.println("Diminuindo o volume para: "+ volume);
    }

    //metodos de controle de canal

    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentaado o canal para: "+ canal);
    }
    public void diminuirCanal(){
        canal--;
        System.out.println("Diminuindo o canal para: "+ canal);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
