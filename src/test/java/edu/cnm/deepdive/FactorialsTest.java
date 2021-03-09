package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FactorialsTest {

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

  static List<Arguments> computeRecursive_nonException() {
    return List.of(
        Arguments.of(0, 1L),
        Arguments.of(1, 1L),
        Arguments.of(5, 120L),
        Arguments.of(10, 3_628_800L),
        Arguments.of(13, 6_227_020_800L)
    );
  }
}
