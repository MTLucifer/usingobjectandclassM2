package QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị a: ");
        a = scanner.nextDouble();
        System.out.println("Nhập giá trị b: ");
        b = scanner.nextDouble();
        System.out.println("Nhập giá trị c: ");
        c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        quadraticEquation.setA(a);
        quadraticEquation.setB(b);
        quadraticEquation.setC(c);
        System.out.println("Giá trị của a là: " + quadraticEquation.getA());
        System.out.println("Giá trị của b là: " + quadraticEquation.getB());
        System.out.println("Giá trị của c là: " + quadraticEquation.getC());
        System.out.println("Delta có giá trị là: " + quadraticEquation.getDelta());

        if (quadraticEquation.checkDelta()) {
            System.out.println("Phương trình có 2 nghiệm là: " + quadraticEquation.getRoot1() + " và " + quadraticEquation.getRoot2());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }

    }
}
