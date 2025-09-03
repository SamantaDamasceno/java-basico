public class Aprendizado {
    
    public static void main(String[] args) {
        Geladeira geladeira = new Geladeira();
        geladeira.abrirGeladeira();
        System.out.println("Geladeira aberta? " + geladeira.geladeiraAberta);
        
        System.out.println("Temperartura atual: " + geladeira.temperatura);
        geladeira.mudarTemperatura(1.0);
        System.out.println("Temperartura atual: " + geladeira.temperatura);
        
        geladeira.fecharGeladeira();
        System.out.println("Geladeira fechada? " + geladeira.geladeiraAberta);
        System.out.println("Estoque de sorvete: " + geladeira.estoqueSorvete);
        geladeira.pegarSorvete();
        System.out.println("Estoque de sorvete: " + geladeira.estoqueSorvete);

        geladeira.abrirGeladeira();
        System.out.println("Geladeira fechada? " + geladeira.geladeiraAberta);
    }
}
