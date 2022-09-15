import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.LocalDateTime;

public class Aula0605 {
    public static void main(String[] args) {
        // Olá, {nome}. Hoje é {dia-da-semana}, BOM DIA.
    
        String nome = "Maria Eduarda";
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
        
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();

        if (agora.getHour() >= 0 && agora.getHour() < 12 ) {
            saudacao = "Bom dia!";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18 ) {
            saudacao = "Boa Tarde";
        } else if (agora.getHour() >=18 && agora.getHour() < 24) {
            saudacao = "Boa Noite";
        } else {
            saudacao = "Olá!";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s. %n", nome,  diaSemana, saudacao.toUpperCase());

    }
}
