import java.util.Scanner;

abstract class Calculator {
    abstract int add(int num1, int num2);
}

class Adder extends Calculator {
    @Override
    int add(int num1, int num2) {
        System.out.println("Adding integers: " + num1 + " " + num2);
        return num1 + num2;
    }
}

class Multiplier {
    int multiply(int num1, int num2, Calculator calculate) {
        int res = 0;
        for (int i = 0; i < num2; i++) {
            res = calculate.add(res, num1);
        }
        return res;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        Adder adder = new Adder();
        Multiplier multiplier = new Multiplier();

        System.out.println("Testing Addition");
        System.out.println("Sum: " + adder.add(num1, num2));

        System.out.println("\nTesting Multiplication");
        System.out.println("Product: " + multiplier.multiply(num1, num2, adder));

        scan.close();
    }
}
