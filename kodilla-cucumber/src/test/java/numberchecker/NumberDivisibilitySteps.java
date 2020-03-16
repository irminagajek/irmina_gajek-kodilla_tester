package numberchecker;

import io.cucumber.java8.En;
import org.junit.Assert;

public class NumberDivisibilitySteps implements En {

        private int number;
        private String answer;

        public NumberDivisibilitySteps() {

            Given("the number is 25", () -> {
                this.number = 25;
            });

            Given("the number is 12", () -> {
                this.number = 12;
            });

            Given("the number is 15", () -> {
                this.number = 15;
            });

            Given("the number is 0", () -> {
                this.number = 0;
            });

            Given("the number is -6", () -> {
                this.number = -6;
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