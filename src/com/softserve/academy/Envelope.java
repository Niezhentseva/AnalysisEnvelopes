package com.softserve.academy;

public class Envelope implements Comparable<Envelope> {
    private double side1;
    private double side2;

    Envelope(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    double getSide1() {
        return side1;
    }

    double getSide2() {
        return side2;
    }

    @Override
    // the method compares first envelope with second envelope
    public int compareTo(Envelope env) {
        if ((getSide1() > env.getSide1() && getSide2() > env.getSide2())
                || ((getSide1() > env.getSide2() && getSide2() > env.getSide1()))) {
            return 1;
        } else if ((getSide1() < env.getSide1() && getSide2() < env.getSide2())
                || (getSide1() < env.getSide2() && getSide2() < env.getSide1())){
            return -1;
        } else {
            return 0;
        }
    }
}
