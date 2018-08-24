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
        assertThat(solution.fizzBuzz(3), equalTo("fizz"));
    }

    @Test
    public void buzzTest() {
        assertThat(solution.fizzBuzz(3), equalTo("buzz"));
    }

    @Test
    public void fizzBuzzTest() {
        assertThat(solution.fizzBuzz(3), equalTo("fizz buzz"));
    }

    @Test
    public void noFizzBuzzTest() {
        assertThat(solution.fizzBuzz(29), equalTo("29"));
    }
}