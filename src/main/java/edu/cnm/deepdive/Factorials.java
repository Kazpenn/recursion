package edu.cnm.deepdive;

public class Factorials {
  public static long computeRecursive(int n) throws IllegalArgumentException {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    if (n == 0) {
      return 1;
    }
    return n * computeRecursive(n - 1);
  }
}
