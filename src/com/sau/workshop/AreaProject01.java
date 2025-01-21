package com.sau.workshop;

import java.util.Scanner;
import java.text.DecimalFormat;

public class AreaProject01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        Scanner sc = new Scanner(System.in);
        System.out.println("++++++++++++++++++++++++");
        System.out.println(" Shape Area Program ");
        System.out.println("++++++++++++++++++++++++");
        System.out.println("1.Square Area");
        System.out.println("++++++++++++++++++++++++");
        System.out.println("2.Triangle Area");
        System.out.println("++++++++++++++++++++++++");
        System.out.println("3.Circle Area");
        System.out.println("++++++++++++++++++++++++");
        System.out.println("Select menu : ");

        int choice = sc.nextInt();

        if (choice == 1) { // Square
            double widths, longs, areaS;
            System.out.println("+++++++++++++++");
            System.out.print("Input widths: ");
            widths = sc.nextDouble();
            System.out.print("Input longs: ");
            longs = sc.nextDouble();
            areaS = widths * longs;
            System.out.println("Area of Square is " + df.format(areaS));

        } else if (choice == 2 ) { // Triangle
            double bases , highs , areaT;
            System.out.println("+++++++++++++++");
            System.out.print("Input bases: ");
            bases = sc.nextDouble();
            System.out.print("Input highs: ");
            highs = sc.nextDouble();
            areaT = 0.5 * bases * highs;
            System.out.println("Area of Triangle is " + df.format(areaT));
            System.out.println("++++++++++++++++++++++++");

        } else if (choice == 3) {
            double radius , areaC;
            System.out.println("+++++++++++++++");
            System.out.print("Input radius: ");
            radius = sc.nextDouble();
            areaC = Math.PI * radius * radius;
            System.out.println("Area of Circle is " + df.format(areaC));
            System.out.println("++++++++++++++++++++++++");
        }else {
            System.out.println("Thank you...bye...bye^_^");
            System.out.println("++++++++++++++++++++++++");
        }

        scanner.close();
    }
}