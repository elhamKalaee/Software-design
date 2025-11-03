package falsePosition;

import java.util.Scanner;

import falsePosition.FalsePosition;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("firt prime in the range");
        double a = scanner.nextFloat();
        System.out.println("second prime in the range");
        double b = scanner.nextFloat();
        System.out.println("stopping criterion");
        double w = scanner.nextFloat();

        FalsePosition.FalsePosition(a, b, w);

    }
}

