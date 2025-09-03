public class Geladeira {
    boolean geladeiraAberta = false;
    double temperatura = -6;
    int estoqueSorvete = 100;


    public void abrirGeladeira() {
        geladeiraAberta = true;
    }
    public void fecharGeladeira() {
        geladeiraAberta = false;
    }

    public void temperaturaMinima() {
        temperatura = -15;
    }
    public void temperaturaMaxima() {
        temperatura = 10;
    }
    public void mudarTemperatura(double novaTemperatura) {
        temperatura = novaTemperatura;
    }
    public void pegarSorvete(){
        estoqueSorvete--;
    }
    
}