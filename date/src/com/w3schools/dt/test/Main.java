package com.w3schools.dt.test;
import javax.swing.text.DateFormatter;
import java.time.*; // importa todas as classes do pacote java.time;
import java.time.format.*; // importa todas as classes do pacote java.time.format;

public class Main
{
    // utilização de data e hora em Java com o pacote java.time:
    public static void main(String[] args)
    {
        LocalDate objetoData = LocalDate.now(); // cria o objeto da data atual da máquina;
        System.out.println(objetoData);

        LocalTime objetoTime = LocalTime.now(); // cria o objeto do horário atual da máquina;
        System.out.println(objetoTime);

        LocalDateTime objetoDateTime = LocalDateTime.now(); // cria uma variável da data e hora atuais da máquina;
        System.out.println(objetoDateTime);

        // formatação de data e hora:
        LocalDateTime antesDaFormatacaoDateTime = LocalDateTime.now();
        System.out.println("Antes da formatação: " + antesDaFormatacaoDateTime);

        DateTimeFormatter objetoDateTimeFormatado = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); // cria o objeto de formatação;
        String depoisDaFormatacao = antesDaFormatacaoDateTime.format(objetoDateTimeFormatado); //
        System.out.println("Depois da formatação: " + depoisDaFormatacao);

        // formatação de data:
        LocalDate antesDaFormatacaoDate = LocalDate.now();
        DateTimeFormatter objetoDateFormatado = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        String depoisDaFormatacaoDate = antesDaFormatacaoDate.format(objetoDateFormatado);
        System.out.println(depoisDaFormatacaoDate);

        // formatação de hora:
        LocalTime antesDaFormatação = LocalTime.now();
        DateTimeFormatter objetoTimeFormatado = DateTimeFormatter.ofPattern("");
    }
}
