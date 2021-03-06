package edu.cnm.deepdive;

import java.math.BigInteger;

public class Fibonacci {

  public static void main() {
    System.out.println(recursive(5));
  }

  public static long recursive(int generation) {
    if (generation <= 1) {
      return 1;
    }
    return recursive(generation-1) + recursive(generation-2);
  }

  public static BigInteger iterative(int generation) {
    BigInteger prev2 = BigInteger.ONE;
    BigInteger prev1 = BigInteger.ONE;
    if (generation == 0 || generation == 1) {
      return prev2;
    }
    for (int i = 2; i <= generation; i++) {
      BigInteger current = prev1.add(prev2);
      prev2 = prev1;
      prev1 = current;
    }
    return prev1;
  }

}
