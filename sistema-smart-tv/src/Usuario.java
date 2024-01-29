public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada ? " + smartTv.ligada);
        System.out.println(" Canal atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> Tv ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Tv ligada ? " + smartTv.ligada);

        smartTv.diminuindoVolume();
        smartTv.diminuindoVolume(); 
        smartTv.diminuindoVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual : " + smartTv.volume);


        smartTv.mudarCanal(13);
        System.out.println(" Canal atual : " + smartTv.canal);

        smartTv.dimunuirCanal();
        System.out.println(" Canal atual : " + smartTv.canal);
        

    }

        
}
