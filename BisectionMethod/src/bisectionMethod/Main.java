package bisectionMethod;

import java.util.Scanner;

import bisectionMethod.Caculate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("firt prime in the range");
        double a = scanner.nextFloat();
        System.out.println("second prime in the range");
        double b = scanner.nextFloat();
        System.out.println("stopping criterion");
        double w = scanner.nextFloat();

        Caculate.Caculate(a, b, w);

    }
}