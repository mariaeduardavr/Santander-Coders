import java.time.LocalDate;

public class Aula0603 {
    public static void main(String[] args) {

    // Olá, {nome}. Hoje é {dia-da-semana}, BOM DIA.

        String nome = "Maria Eduarda";
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        System.out.println(hoje.getDayOfWeek());
    }
}
