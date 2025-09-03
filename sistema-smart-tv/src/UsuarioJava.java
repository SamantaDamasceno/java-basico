public class UsuarioJava {
    public static void main(String[] args) throws Exception {
        SmartTvSistema smartTv = new SmartTvSistema();
        System.out.println("TV ligada? " + smartTv.tvLigada);
        System.out.println("Canal atual: " + smartTv.canalTv);
        System.out.println("Volume atual: " + smartTv.volume); 
        smartTv.ligar();
        System.out.println("TV ligada? " + smartTv.tvLigada);

        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canalTv);

        smartTv.desligarTv();
        System.out.println("TV ligada? " + smartTv.tvLigada);
    }
}
