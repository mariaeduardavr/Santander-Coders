import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {

        String[] promocao = {"banana", "melancia", "abacaxi", "uva", "laranja"};
        String[] listaDeCompras = new String[5];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < listaDeCompras.length; i++) {
            System.out.println("Digite a sua lista de compras:");
            listaDeCompras[i] = input.nextLine();        
        }

        int contador = 0;
        for (int j = 0; j < listaDeCompras.length; j++) {
            for (int k = 0; k < promocao.length; k++ ){
                if (listaDeCompras[j].equalsIgnoreCase(promocao[k])) {
                    contador++;
                }
            }
        }
        System.out.println("As frutas em promoção são:");
        System.out.println(promocao);
        System.out.println("Na sua lista há " + contador + " frutas em promoção.");
        System.out.println("Portanto, você terá " + contador * 5 + "% de desconto em seu pedido.");
    }
}