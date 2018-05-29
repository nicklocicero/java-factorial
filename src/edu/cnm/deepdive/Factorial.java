package edu.cnm.deepdive;


public class Factorial {

  public static long iterative(int limit) {
    long product = 1;
    if (limit < 2) {
      return product;
    }
    for (int i = 2; i <= limit ; i++) {
      product *= i;
    }
    return product;
  }

}
