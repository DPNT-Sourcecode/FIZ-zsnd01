package befaster.solutions.HLO;

import befaster.solutions.SUM.SumSolution;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

public class HelloSolutionTest {

    private HelloSolution helloSolution;

    @Before
    public void setUp() {

        helloSolution = new HelloSolution();
    }

    @Test
    public void helloTest() {
        assertThat(helloSolution.hello("John"), equalTo("Hello, John!"));
    }
}