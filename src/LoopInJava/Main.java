package LoopInJava;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
//        calculate BMI
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Nhập chiều cao: ");
//        double chieucao = scanner1.nextDouble();
//        System.out.println("Chiều cao là: " + chieucao);
//
//        Scanner scanner2 = new Scanner(System.in);
//        System.out.println("Nhập cân nặng: ");
//        double cannang = scanner2.nextDouble();
//        System.out.println("Cân nặng là: " + cannang);
//
//        BMI bmi = new BMI();
//        bmi.calculateBMI(chieucao, cannang);

        //homework day2
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter month: ");
        int month = scanner3.nextInt();

        Month m = new Month();
        m.showDatesOfMonth(month);
        m.getDatesInMonth(month);
    }

}
