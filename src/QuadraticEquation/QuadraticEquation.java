package QuadraticEquation;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDelta() {
        double delta = Math.pow(b, 2) - 4 * a * c;
        return delta;
    }

    public boolean checkDelta() {
        if (this.getDelta() >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public double getRoot1() {
        double root1 = (-b + (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / (2 * a);
        return root1;
    }

    public double getRoot2() {
        double root2 = (-b - (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / (2 * a);
        return root2;
    }


}
