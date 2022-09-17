import java.util.Scanner;
import java.util.Arrays;

public class ex005 {
    public static void main(String[] args) {

        String[] promocao = {"banana", "melancia", "abacaxi", "uva", "laranja"};
        String[] listaDeCompras = new String[5];
        int contador = 0;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < listaDeCompras.length; i++) {
            System.out.println("Digite a sua lista de compras:");
            listaDeCompras[i] = input.nextLine();        
        }

        System.out.println(Arrays.toString(listaDeCompras));

    }
}