package DatasHoras;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class DateExercicios {
    public static void main(String[] args) {
        // Ola, {nome}. Hoje é {dia-da-semana}, BOM DIA.

        String nome = "Jessé";

        //ISO 8601
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
        //System.out.println(hoje.getDayOfMonth().getDisplayName(TextStyle.FULL, brasil));
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("pt", "BR"));

        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if(agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() <18) {
            saudacao = "boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "boa noite";
        }else{
            saudacao = "ola";
        }

        System.out.printf("Ola, %s. Hoje é %s, %s.", nome, diaSemana, saudacao.toUpperCase());
    }
}
