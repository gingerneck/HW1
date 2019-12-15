package com.epam.rectangle;

import java.util.Scanner;

public class RectangleSquare {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("X of A rectangle point, YOU MAY USE ONLY INT or DOUBLE");
        while (!scan.hasNextDouble()) {
            System.out.println("PLEASE, USE DOUBLE or INT!!!");
            scan.next();
        }
        double ax = scan.nextDouble();
        System.out.println("Y of A rectangle point, YOU MAY USE ONLY INT or DOUBLE");
        while (!scan.hasNextDouble()) {
            System.out.println("PLEASE, USE DOUBLE or INT!!!");
            scan.next();
        }
        double ay = scan.nextDouble();
        System.out.println("X of B rectangle point, YOU MAY USE ONLY INT or DOUBLE");
        while (!scan.hasNextDouble()) {
            System.out.println("PLEASE, USE DOUBLE or INT!!!");
            scan.next();
        }
        double bx = scan.nextDouble();
        System.out.println("Y of B rectangle point, YOU MAY USE ONLY INT or DOUBLE");
        while (!scan.hasNextDouble()) {
            System.out.println("PLEASE, USE DOUBLE or INT!!!");
            scan.next();
        }
        double by = scan.nextDouble();

        Rectangle firstRect = new Rectangle(ax, ay, bx, by);
        double squareRect = firstRect.squareRect();
        System.out.println("Rectangle square is  " + squareRect);

        scan.close();
    }
}
