import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite uma temperatura em Celsius para saber o seu equivalente em Fahrenheit: ");
        float num = scan.nextInt();

        float temp = (num * 9/5) + 32;

        System.out.println("O equivalente a " + num + " graus Celsius é: " + temp + " graus Fahrenheit.");
        

    }
}