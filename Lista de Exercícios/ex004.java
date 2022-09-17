import java.util.Scanner;
import java.util.Arrays;

public class ex004 {
    public static void main(String[] args) {

        String[] promoFrutas = {"banana", "melancia", "abacaxi", "uva", "laranja"};

        System.out.println("Qual é a sua lista de compras para hoje?");
        Scanner input = new Scanner(System.in);
        String compra = input.nextLine();
        boolean estaEmPromo = false;

        for (int i = 0; i < promoFrutas.length; i++) {
            if (promoFrutas[i].equals(compra)) {
                estaEmPromo = true;
            }
        }

        if (estaEmPromo) {
            System.out.println("Que bom! A fruta " + compra + " está em promoção hoje.");
        } else {
            System.out.println("Que pena. Você não ganhará um desconto hoje.");
        }

    }
}
