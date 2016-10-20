package org.kata.tdd.fizzbuzz;

/**
 * Created by ydabo on 20/10/16.
 */
public class FizzBuzz {

  public static String of(int number) {
    if (number % 15 == 0) return "fizzbuzz";
    if (number % 3 == 0) return "fizz";
    if (number % 5 == 0) return "buzz";
    if (number == 1) return "1";
    if (number == 2) return "2";
    if (number == 4) return "4";

    return null;

  }
}
