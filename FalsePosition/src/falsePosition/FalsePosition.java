package falsePosition;

public class FalsePosition {

    static double round4(double x) {
        return Math.round(x * 10000.0) / 10000.0;
    }

    public static void FalsePosition(double a, double b, double w) {
        double n = 0.0000;
        double c;

        while (true) {
            double fA = round4(a * Math.sin(a) - 1);
            double fB = b * Math.sin(b) - 1;
            c = round4(((a * fB) - (b * fA)) / (fB - fA));
            double f = round4(c * Math.sin(c) - 1);
            if (Math.signum(f) == Math.signum(fA))
                a = c;
            else {
                b = c;
            }
            if (Math.abs(n - c) < w)
                break;
            n = c;
        }
        System.out.printf("%.4f\n", c);
    }


}
