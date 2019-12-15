package com.epam.rectangle;

import java.util.Scanner;
import java.util.ArrayList;

public class RectangleCrossSquare {

    public static void main(String[] args) {
        ArrayList<Rectangle> rects = new ArrayList<Rectangle>();
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 2; i++) {
            System.out.println("Please type XY two points of " + i + " recangle");
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

            Rectangle rect = new Rectangle(ax, ay, bx, by);
            rects.add(rect);
        }
        Rectangle rect1 = rects.get(0);
        rect1.rectCheck();
        Rectangle rect2 = rects.get(1);
        rect2.rectCheck();

        double axCross = 0;
        double ayCross = 0;
        double bxCross = 0;
        double byCross = 0;

        if (!(rect1.getax() > rect2.getbx()) || (rect1.getax() < rect2.getax())) {
            if (!(rect1.getay() < rect2.getby()) || (rect1.getay() > rect2.getay())) {
                if (((rect2.getax() >= rect1.getax()) && (rect2.getax() <= rect1.getbx())) || ((rect2.getbx() >= rect1.getax()) && (rect2.getbx() <= rect1.getbx()))) {
                    if (rect1.getax() <= rect2.getax()) {
                        axCross = rect2.getax();
                    } else {
                        axCross = rect1.getax();
                    }
                    if (rect1.getay() <= rect2.getay()) {
                        ayCross = rect1.getay();
                    } else {
                        ayCross = rect2.getay();
                    }
                    if (rect1.getbx() <= rect2.getbx()) {
                        bxCross = rect1.getbx();
                    } else {
                        bxCross = rect2.getbx();
                    }
                    if (rect1.getby() <= rect2.getby()) {
                        byCross = rect2.getby();
                    } else {
                        byCross = rect1.getby();
                    }
                }
            }
        }

        Rectangle crossRect = new Rectangle(axCross, ayCross, bxCross, byCross);
        double squareRect = crossRect.squareRect();
        System.out.println("Rectangle Cross Square is  " + squareRect);

        scan.close();
    }
}
