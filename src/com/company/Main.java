package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        int a,b,c,d,e,f,g,h,i,j;
        int dia,mes;
        double ano;
        boolean bissexto = false;




        System.out.println("Digite um dia válido:");
        dia = scan.nextInt();
        System.out.println("Digite um mês válido:");
        mes = scan.nextInt();
        System.out.println("Digite um ano:");
        ano = scan.nextDouble();

        //Variaveis para fazer concatenação na data
        String cont0 = "0", cont1 = "0";

        if(mes > 10) {
            cont1 = "";
        }

        if(dia > 10) {
            cont0 = "";
        }

        if(ano % 400 == 0 || ano % 4 == 0 && ano % 100  != 0){
            //Definir se o ano é bissexto
            bissexto = true;
        }

       // else{
            //Caso o ano não seja bissexto, poderá ser exibido por este campo
        //}



        System.out.println(cont0+dia+"/"+cont1+mes+"/"+(int)ano);
        // Calculo para descobrir em qual posição fica o dia 1 do mês no ano definido
        a = (12 - mes) / 10;
        b = (int)ano - a;
        c = mes + (12 * a);
        d = b / 100;
        e = d / 4;
        f = 2 - d + e;
        g = (int)(365.25 * b);
        h = (int)(30.6001 *(c + 1));
        i = (f + g) + (h + 1) + 5;
        j = i % 7;

        //Pequeno vetor para fazer alterações nos ultimos dias de cada mês
        String[] para = {"28","29","30","31"};

        //Janeiro
        if(mes == 1) {
            if(dia > 31 || dia <= 0) {
                System.out.println("Este dia não existe no mês!");
                return;
            }
            System.out.println("JANEIRO");
        }

        //Fevereiro
        if(mes == 2 && bissexto) {
            if(dia > 29 || dia <= 0) {
                System.out.println("Este dia não existe no mês!");
                return;
            }
            System.out.println("FEVEREIRO");
            para[3] = "";
            para[2] = "";
        }if(mes == 2 && !bissexto){
            if(dia > 28 || dia <= 0) {
                System.out.println("Este dia não existe no mês!");
                return;
            }
            System.out.println("FEVEREIRO");
            para[3] = "";
            para[2] = "";
            para[1] = "";
        }

        //Março
        if(mes == 3) {
            if(dia <= 0 || dia > 31) {
                System.out.println("Este dia não existe no mês!");
                return;
            }
            System.out.println("MARÇO");
        }

        //abril
        if(mes == 4) {
            if(dia > 30 || dia <= 0 ) {
                System.out.println("Este dia não existe no mês!");
                return;
            }

            para[3] = "";
            System.out.println("ABRIL");
        }

        //Maio
        if(mes == 5) {
            if(dia > 31 || dia <= 0 ) {
                System.out.println("Este dia não existe no mês!");
                return;
            }
            System.out.println("MAIO");
        }

        //junho
        if(mes == 6) {
            if(dia > 30 || dia <= 0 ) {
                System.out.println("Este dia não existe no mês!");
                return;
            }
            para[3] = "";
            System.out.println("JUNHO");
        }

        //julho
        if(mes == 7) {
            if(dia > 31 || dia <= 0 ) {
                System.out.println("Este dia não existe no mês!");
                return;
            }
            System.out.println("JULHO");
        }
        //Agosto
        if(mes == 8) {
            if(dia > 31 || dia <= 0 ) {
                System.out.println("Este dia não existe no mês!");
                return;
            }
            System.out.println("AGOSTO");
        }

        //Setembro
        if(mes == 9) {
            if(dia > 30 || dia <= 0 ) {
                System.out.println("Este dia não existe no mês!");
                return;
            }
            para[3] = "";
            System.out.println("SETEMBRO");
        }

        //Outubro
        if(mes == 10) {
            if(dia > 31 || dia <= 0 ) {
                System.out.println("Este dia não existe no mês!");
                return;
            }
            System.out.println("OUTUBRO");
        }

        //Novembro
        if(mes == 11) {
            if(dia > 30 || dia <= 0 ) {
                System.out.println("Este dia não existe no mês");
                return;
            }
            para[3] = "";
            System.out.println("NOVEMBRO");
        }

        //Dezembro
        if(mes == 12) {
            if(dia > 31 || dia <= 0 ) {
                System.out.println("Este dia não existe no mês!");
                return;
            }
            System.out.println("DEZEMBRO");
        }

        if(mes >= 13 || mes <= 0) {
            System.out.println("Este mês não existe!");
            return;
        }


        switch (j) {
            case 0 -> {
                System.out.println("D   S   T   Q   Q   S   S ");
                System.out.println("                        1 ");
                System.out.println("2   3   4   5   6   7   8 ");
                System.out.println("9   10  11  12  13  14  15");
                System.out.println("16  17  18  19  20  21  22");
                System.out.println("23  24  25  26  27  " + para[0] + "  " + para[1]);
                System.out.println(para[2] + "  " + para[3]);
            }
            case 1 -> {
                System.out.println("D   S   T   Q   Q   S   S ");
                System.out.println("1   2   3   4   5   6   7 ");
                System.out.println("8   9   10  11  12  13  14");
                System.out.println("15  16  17  18  19  20  21");
                System.out.println("22  23  24  25  26  27  " + para[0]);
                System.out.println(para[1] + "  " + para[2] + "  " + para[3]);
            }
            case 2 -> {
                System.out.println("D   S   T   Q   Q   S   S ");
                System.out.println("    1   2   3   4   5   6 ");
                System.out.println("7   8   9   10  11  12  13");
                System.out.println("14  15  16  17  18  19  20");
                System.out.println("21  22  23  24  25  26  27");
                System.out.println(para[0] + "  " + para[1] + "  " + para[2] + "  " + para[3]);
            }
            case 3 -> {
                System.out.println("D   S   T   Q   Q   S   S ");
                System.out.println("        1   2   3   4   5 ");
                System.out.println("6   7   8   9   10  11  12");
                System.out.println("13  14  15  16  17  18  19");
                System.out.println("20  21  22  23  24  25  26");
                System.out.println("27  " + para[0] + "  " + para[1] + "  " + para[2] + "  " + para[3]);
            }
            case 4 -> {
                System.out.println("D   S   T   Q   Q   S   S ");
                System.out.println("            1   2   3   4 ");
                System.out.println("5   6   7   8   9   10  11");
                System.out.println("12  13  14  15  16  17  18");
                System.out.println("19  20  21  22  23  24  25");
                System.out.println("26  27  " + para[0] + "  " + para[1] + "  " + para[2] + "  " + para[3]);
            }
            case 5 -> {
                System.out.println("D   S   T   Q   Q   S   S ");
                System.out.println("                1   2   3 ");
                System.out.println("4   5   6   7   8   9   10");
                System.out.println("11  12  13  14  15  16  17");
                System.out.println("18  19  20  21  22  23  24");
                System.out.println("25  26  27  " + para[0] + "  " + para[1] + "  " + para[2] + "  " + para[3]);
            }
            case 6 -> {
                System.out.println("D   S   T   Q   Q   S   S ");
                System.out.println("                    1   2 ");
                System.out.println("3   4   5   6   7   8   9 ");
                System.out.println("10  11  12  13  14  15  16 ");
                System.out.println("16  18  19  20  21  22  23 ");
                System.out.println("24  25  26  27  " + para[0] + "  " + para[1] + "  " + para[2] + "  ");
                System.out.println(para[3]);
            }
        }

        //Calculo para descobrir em qual dia da semana está localizado o dia numeral.
        a = (12 - mes) / 10;
        b = (int)ano - a;
        c = mes + (12 * a);
        d = b / 100;
        e = d / 4;
        f = 2 - d + e;
        g = (int)(365.25 * b);
        h = (int)(30.6001 *(c + 1));
        i = (f + g) + (h + dia) + 5;
        j = i % 7;

        switch (j) {
            case 0 -> System.out.println("O Dia está em um Sábado!");
            case 1 -> System.out.println("O Dia está em um Domingo!");
            case 2 -> System.out.println("O Dia está em uma Segunda-Feira!");
            case 3 -> System.out.println("O Dia está em uma Terça-Feira!");
            case 4 -> System.out.println("O Dia está em uma Quarta-Feira!");
            case 5 -> System.out.println("O Dia está em uma Quinta-Feira!");
            case 6 -> System.out.println("O Dia está em uma Sexta-Feira!");
        }
    }
    }

