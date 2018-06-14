package org.ripley.sequence;

public class Main {

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        for (int n = 0; n < 20000; n++) {
            System.out.printf("%d = %d %n", n, fibonacci.getFibonacci(n));
        }
    }
}
