package com.company;

public class Main {

    public static void main(String[] args) {
        int i = 1;
        while (i < 11) {
            System.out.print(i++ + " ");
        }
        System.out.println();
        for (int b = 10; b > 0; b = b - 1) {
            System.out.print(b + " ");
        }
        System.out.println();
        for (int friday = 3; friday < 31 ; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + " число. Необходимо подготовить отчет.");
        }
        System.out.println();
        for (int comet = 1896; comet < 2122; comet = comet + 79) {
            System.out.println(comet);
        }


    }
}
