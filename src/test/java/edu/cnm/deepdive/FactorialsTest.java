package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class FactorialsTest {

  static final long[][] testCases = {
      {0, 1},
      {1, 1},
      {5, 120},
      {10, 3628800},
      {13, 6227020800L}
  };

  @DisplayName("computeRecursive(non-exceptional)")
  @ParameterizedTest(name = "[{index}] Asserting computeRecursive({0}) == {1}.")
  @MethodSource
  void computeRecursive_nonException(int n, long expected) {
    assertEquals(expected, Factorials.computeRecursive(n));
  }

  @DisplayName("computeRecursive(exceptions)")
  @Test
  void computeRecursive_exception() {
    assertThrows(IllegalArgumentException.class, () -> Factorials.computeRecursive(-1));
  }

  static Object[][] computeRecursive_nonException() {
    return new Object[][] {
        {0, 1L},
        {1, 1L},
        {5, 120L},
        {10, 3_628_800L},
        {13, 6_227_020_800L}
    };
  }
}
