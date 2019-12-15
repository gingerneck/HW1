package com.epam.rectangle;

import java.text.DecimalFormat;

public class Rectangle {
    private double ax;
    private double ay;
    private double bx;
    private double by;

    Rectangle() {
    }

    Rectangle(double ax, double ay, double bx, double by) {
        this.ax = ax;
        this.ay = ay;
        this.bx = bx;
        this.by = by;
    }

    public DecimalFormat format2 = new DecimalFormat("##.00");

    public void setax(double inax) {
        ax = inax;
    }

    public void setay(double inay) {
        ay = inay;
    }

    public void setbx(double inbx) {
        bx = inbx;
    }

    public void setby(double inby) {
        by = inby;
    }

    public double getax() {
        return ax;
    }

    public double getay() {
        return ay;
    }

    public double getbx() {
        return bx;
    }

    public double getby() {
        return by;
    }

    public double squareRect() {
        return Double.parseDouble((format2.format((double) (Math.abs(ax - bx) * Math.abs(ay - by)))).replace(',', '.'));
    }

    public void rectCheck() {
        if (ay < by) {
            double ayBet = ay;
            ay = by;
            by = ayBet;
        }
        if (ax > bx) {
            double axBet = ax;
            ax = bx;
            bx = axBet;
        }
    }
}
