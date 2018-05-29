package edu.cnm.deepdive;

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

  public static long iterative(int generation) {
    long prev2 = 1;
    long prev1 = 1;
    if (generation == 0 || generation == 1) {
      return prev2;
    }
    for (int i = 2; i <= generation; i++) {
      long current = prev1 + prev2;
      prev2 = prev1;
      prev1 = current;
    }
    return prev1;
  }

}
