import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        String nome;
        int idade;
            while(true){
            System.out.println("Digite seu nome: ");
            nome = scanner.next();
                if (nome.equals("0"))break ;
            System.out.println("Digite sua idade: ");
            idade = scanner.nextInt();
                 if (idade < 18) {
                 break;
            }
        }
    }
}
