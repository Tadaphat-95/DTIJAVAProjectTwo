package com.sau.workshop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SumProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        double sum = 0;

        do {
            System.out.print("Enter number 1 : ");
            double num1 = scanner.nextInt();

            System.out.print("Enter number 2 : ");
            double num2 = scanner.nextInt();

            sum = num1 + num2;
            System.out.println("ผลรวม: " + df.format(sum));
            System.out.println("-----------------");
        } while (sum <= 500);

        System.out.println("จบโปรแกรม เนื่องจากผลรวมเกิน 500");
        scanner.close();
    }
}
