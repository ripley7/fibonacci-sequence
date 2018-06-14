package org.ripley.sequence;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    private static final Map<Integer, BigInteger> fibonacciSequence = new HashMap<>();

    static  {
        fibonacciSequence.put(0, BigInteger.ZERO);
        fibonacciSequence.put(1, BigInteger.ONE);

        // Iterative calculation of sequence
        for (int i = 2; i < 20000; i++) {
            BigInteger value = fibonacciSequence.get(i-2).add(fibonacciSequence.get(i-1));
            fibonacciSequence.put(i, value);
        }
    }

    public BigInteger getFibonacci(int n) {
        return fibonacciSequence.get(n);
    }
}
