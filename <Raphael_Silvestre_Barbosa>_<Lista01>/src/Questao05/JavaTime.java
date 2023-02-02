package Questao05;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class JavaTime {

    public static void main(String[] args)throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma data no formato dd/MM/yyyy: ");
        String dataString1= scan.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data1 = LocalDate.parse(dataString1, formatter);
        String dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy").format(data1);
        System.out.println("Data digitada: " + dataFormatada);
        LocalDate hoje = LocalDate.now();
        System.out.println("Data de hoje: " + hoje);
        Period periodo = Period.between(data1, hoje);
        periodo.get(ChronoUnit.DAYS);
        long calculo = periodo.getYears() * 365L + periodo.getMonths() * 30L + periodo.getDays();
            int sum = periodo.getYears();
            int f = 0;
            for(int j = 0; j <= sum; j++){
                f += 1;
                if (data1.plusYears(f).isLeapYear() == true)
                {
                    calculo += 1;
                }
            }
        System.out.println("Número de dias entre a data digitada e o dia de hoje: " + calculo);
        System.out.println("Data digitada + 110 dias: " + data1.plusDays(110));
        int agosto = data1.getMonthValue();
        if(agosto == 1){
            LocalDate data2 = data1.plusMonths(7);
            String dataFormatada2 = DateTimeFormatter.ofPattern("dd/MM/yyyy").format(data2);
            System.out.println("Data digitada com o mês de agosto: " + dataFormatada2);
        }
        if(agosto == 2){
            LocalDate data2 = data1.plusMonths(6);
            String dataFormatada2 = DateTimeFormatter.ofPattern("dd/MM/yyyy").format(data2);
            System.out.println("Data digitada com o mês de agosto: " + dataFormatada2);
        }
        if(agosto == 3){
            LocalDate data2 = data1.plusMonths(5);
            String dataFormatada2 = DateTimeFormatter.ofPattern("dd/MM/yyyy").format(data2);
            System.out.println("Data digitada com o mês de agosto: " + dataFormatada2);
        }
        if(agosto == 4){
            LocalDate data2 = data1.plusMonths(4);
            String dataFormatada2 = DateTimeFormatter.ofPattern("dd/MM/yyyy").format(data2);
            System.out.println("Data digitada com o mês de agosto: " + dataFormatada2);
        }
        if(agosto == 5){
            LocalDate data2 = data1.plusMonths(3);
            String dataFormatada2 = DateTimeFormatter.ofPattern("dd/MM/yyyy").format(data2);
            System.out.println("Data digitada com o mês de agosto: " + dataFormatada2);
        }
        if(agosto == 6){
            LocalDate data2 = data1;
            String dataFormatada2 = DateTimeFormatter.ofPattern("dd/MM/yyyy").format(data2.plusMonths(2));
            System.out.println("Data digitada com o mês de agosto: " + dataFormatada2);
        }
        if(agosto == 7){
            LocalDate data2 = data1;
            String dataFormatada2 = DateTimeFormatter.ofPattern("dd/MM/yyyy").format(data2.plusMonths(1));
            System.out.println("Data digitada com o mês de agosto: " + dataFormatada2);
        }
        if(agosto == 8){
            System.out.println("Data digitada com o mês de agosto: " + dataFormatada);
        }
        if(agosto == 9){
            LocalDate data2 = data1.minusMonths(1);
            String dataFormatada2 = DateTimeFormatter.ofPattern("dd/MM/yyyy").format(data2);
            System.out.println("Data digitada com o mês de agosto: " + dataFormatada2);
        }
        if(agosto == 10){
            LocalDate data2 = data1.minusMonths(2);
            String dataFormatada2 = DateTimeFormatter.ofPattern("dd/MM/yyyy").format(data2);
            System.out.println("Data digitada com o mês de agosto: " + dataFormatada2);
        }
        if(agosto ==11){
            LocalDate data2 = data1.minusMonths(3);
            String dataFormatada2 = DateTimeFormatter.ofPattern("dd/MM/yyyy").format(data2);
            System.out.println("Data digitada com o mês de agosto: " + dataFormatada2);
        }
        if(agosto == 12){
            LocalDate data2 = data1.minusMonths(4);
            String dataFormatada2 = DateTimeFormatter.ofPattern("dd/MM/yyyy").format(data2);
            System.out.println("Data digitada com o mês de agosto: " + dataFormatada2);
        }
        System.out.println(dataFormatada);
        System.out.println("---------------Método duas datas---------------");
        duasDatas();
    }
    public static void duasDatas(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma data no formato dd/MM/yyyy: ");
        String dataString4= scan.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data4 = LocalDate.parse(dataString4, formatter);
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Digite uma outra data no formato dd/MM/yyyy: ");
        String dataString5= scan.nextLine();
        LocalDate data5 = LocalDate.parse(dataString5, formatter);
        Period diferencaDatas = Period.between(data4, data5);
        diferencaDatas.get(ChronoUnit.DAYS);
        long calculo2 = diferencaDatas.getYears() * 365L + diferencaDatas.getMonths() * 30L + diferencaDatas.getDays();
        int sum = diferencaDatas.getYears();
        int f = 0;
        int sub1 = 0;
        int sub2 = 0;
        for(long j = 0; j <= sum; j++){
            f += 1;
            if (data4.plusYears(f).isLeapYear() == true)
            {
                calculo2 += 1;
            }
        }
        int u = 0;
        for(long j = 0; j <= calculo2; j++){
            u += 1;
            if (data4.plusDays(u).getDayOfWeek() == DayOfWeek.SATURDAY)
            {
                sub1 += 1;
            }
        }
        int h = 0;
        for(long t = 0; t <= calculo2; t++) {
            h += 1;
            if (data4.plusDays(u).getDayOfWeek() == DayOfWeek.SUNDAY) {
                sub2 += 1;
            }
        }
        int somado = sub1 + sub2;
        long semDiasUteis = calculo2 - somado;
        System.out.println("Diferença de dias contando apenas os dias úteis: " + semDiasUteis);
    }


}