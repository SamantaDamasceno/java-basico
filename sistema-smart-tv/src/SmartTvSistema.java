public class SmartTvSistema {
    boolean tvLigada = false;
    int canalTv = 1;
    int volume = 25;

    public void ligar() {
        tvLigada = true;
    }

    public void desligarTv() {
        tvLigada = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void mudarCanal(int novoCanal) {
        canalTv = novoCanal;
    }
}
