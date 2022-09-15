import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Aula0604 {
    public static void main(String[] args) {

        // Olá, {nome}. Hoje é {dia-da-semana}, BOM DIA.
    
        String nome = "Maria Eduarda";
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");

        System.out.println(hoje);
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        }
}
