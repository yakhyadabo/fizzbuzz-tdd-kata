package org.kata.tdd.fizzbuzz;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by ydabo on 20/10/16.
 */
public class FizzBuzzTest {

  @Test
  public void should_return_fizz_if_the_number_is_3() {
    assertThat(FizzBuzz.of(3)).isEqualTo("fizz");
  }

  @Test
  public void should_return_fizz_if_the_number_is_6() {
    assertThat(FizzBuzz.of(6)).isEqualTo("fizz");
  }

  @Test
  public void should_return_fizz_if_the_number_is_9() {
    assertThat(FizzBuzz.of(9)).isEqualTo("fizz");
  }

  @Test
  public void should_return_fizz_if_the_number_is_12(){
    assertThat(FizzBuzz.of(12)).isEqualTo("fizz");
  }

  @Test
  public void should_return_buzz_if_the_number_is_5() {
    assertThat(FizzBuzz.of(5)).isEqualTo("buzz");
  }

  @Test
  public void should_return_buzz_if_the_number_is_10() {
    assertThat(FizzBuzz.of(10)).isEqualTo("buzz");
  }

  @Test
  public void should_return_buzz_if_the_number_is_20() {
    assertThat(FizzBuzz.of(20)).isEqualTo("buzz");
  }

  @Test
  public void should_return_buzz_if_the_number_is_25() {
    assertThat(FizzBuzz.of(25)).isEqualTo("buzz");
  }

  @Test
  public void should_return_fizzbuzz_if_the_number_is_15() {
    assertThat(FizzBuzz.of(15)).isEqualTo("fizzbuzz");
  }

  @Test
  public void should_return_fizzbuzz_if_the_number_is_30() {
    assertThat(FizzBuzz.of(30)).isEqualTo("fizzbuzz");
  }

  @Test
  public void should_return_fizzbuzz_if_the_number_is_45() {
    assertThat(FizzBuzz.of(45)).isEqualTo("fizzbuzz");
  }

  @Test
  public void should_return_fizzbuzz_if_the_number_is_60() {
    assertThat(FizzBuzz.of(60)).isEqualTo("fizzbuzz");
  }

  @Test
  public void should_return_1_if_the_number_is_1() {
    assertThat(FizzBuzz.of(1)).isEqualTo("1");
  }

  @Test
  public void should_return_2_if_the_number_is_2() {
    assertThat(FizzBuzz.of(2)).isEqualTo("2");
  }

  @Test
  public void should_return_4_if_the_number_is_4() {
    assertThat(FizzBuzz.of(4)).isEqualTo("4");
  }

}
