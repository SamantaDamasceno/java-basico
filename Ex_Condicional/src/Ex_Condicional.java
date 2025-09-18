import java.util.Scanner;

public class Ex_Condicional{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            int mesada = 50;
            int mesMesada;
       
            System.out.println("digite o numero de meses recebidos: ");
            mesMesada = scan.nextInt();
            int multiplicacao = mesada*mesMesada;
             System.out.println("A Soma do valor recebido é:" + multiplicacao);
           

        }

    }

}

