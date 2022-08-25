package capgemini.lecture1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//TODO add unit-tests that check that RandomGenerator returns actually random numbers
class RandomGeneratorTest {

    RandomGenerator randomGenerator = new RandomGenerator();

    @BeforeEach
    void setup() {
        randomGenerator = new RandomGenerator();
    }

    /* I will use the simple statistics theory.Let's say we have an ABSOLUTE Random generator of 2 digits
    0 and 1 .The probability of appearance of 0 is 1/2 .If we try to generate ,let's say 1_000_000,we will
     get one time 500_237 of 0 the procentual difference from 500_000 is 237/500_000,another try 499_832,the
      procentual difference is 168/500_000 and so on.The procentual diference thakes a Gauss curve.
      The more we generate digits let's say 100_000_000 times the procentage of difference is near 0

      In reality no computer generates REAL Random numbers and the Gauss curve for their procentual difference
      will be flater and the distance from ABSOLUTE Random number will be a little grater

      I will try in test 1_000_000 generations because of the duration of test.The more generations we have
      the grate is duration of test

      I think a difference of 1_000 from 500_000 expected 0 digit generation is = 0.002 acceptable
      for a computer RANDOM generator.I made 20 test and in all of them the difference was under 1_000 */

    @Test
    void number_random_generations_difference_from_expected() {

        int count = 0;
        int generated;

        // number of total random generations
        for (int i = 0; i < 1_000_000; i++) {

            generated = randomGenerator.random(2);

// how many times appears 0
            if (generated == 0) {
                count++;
            }
        }

        assertTrue(Math.abs(count - 500_000) < 1_000);
    }
}