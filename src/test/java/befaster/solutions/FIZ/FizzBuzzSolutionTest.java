package befaster.solutions.FIZ;

import befaster.solutions.SUM.SumSolution;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

public class FizzBuzzSolutionTest {

    private FizzBuzzSolution solution;

    @Before
    public void setUp() {

        solution = new FizzBuzzSolution();
    }

    @Test
    public void fizzTest() {
        assertThat(solution.fizzBuzz(9), equalTo("fizz"));
    }

    @Test
    public void fizzHas3Test() {
        assertThat(solution.fizzBuzz(23), equalTo("fizz"));
    }

    @Test
    public void buzzTest() {
        assertThat(solution.fizzBuzz(25), equalTo("buzz fake deluxe"));
    }

    @Test
    public void buzzHas5Test() {
        assertThat(solution.fizzBuzz(52), equalTo("buzz"));
    }

    @Test
    public void fizzBuzzTest() {
        assertThat(solution.fizzBuzz(15), equalTo("fizz buzz fake deluxe"));
    }

    @Test
    public void fizzBuzzHas5and3Test() {
        assertThat(solution.fizzBuzz(153), equalTo("fizz fake deluxe"));
    }

    @Test
    public void fizzBuzzHasDivide5and3Test() {
        assertThat(solution.fizzBuzz(546), equalTo("fizz buzz"));
    }

    @Test
    public void noFizzBuzzTest() {
        assertThat(solution.fizzBuzz(29), equalTo("29"));
    }

    @Test
    public void fizzBuzzTestDelux() {
        assertThat(solution.fizzBuzz(555), equalTo("fizz buzz fake deluxe"));
    }

    @Test
    public void fizzBuzzHas5and3TestDelux() {
        assertThat(solution.fizzBuzz(333), equalTo("fizz fake deluxe"));
    }

    @Test
    public void fizzBuzzHasDivide5and3TestDelux() {
        assertThat(solution.fizzBuzz(44), equalTo("44"));
    }

    @Test
    public void fizzBuzzTestFizzDelux() {
        assertThat(solution.fizzBuzz(33), equalTo("fizz fake deluxe"));
    }

    @Test
    public void fizzBuzzTestFizzDelux1() {
        assertThat(solution.fizzBuzz(222), equalTo("fizz"));
    }

    @Test
    public void fizzBuzzTestFizzDelux2() {
        assertThat(solution.fizzBuzz(777), equalTo("fizz"));
    }

}