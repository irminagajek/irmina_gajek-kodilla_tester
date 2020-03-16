package numberchecker;

import io.cucumber.java8.En;
import org.junit.Assert;

public class NumberDivisibilitySteps implements En {

        private int number;
        private String answer;

        public NumberDivisibilitySteps() {

            Given("the number is {int}", (Integer n) -> {
                this.number = n;
            });

            When("I ask whether it's divisible by {int}", (Integer) -> {
                NumberChecker numberChecker = new NumberChecker();
                this.answer = numberChecker.checkDivisibility(this.number);
            });

            Then("I should be told {string}", (String string) -> {
                Assert.assertEquals(string, this.answer);
            });
        }
    }