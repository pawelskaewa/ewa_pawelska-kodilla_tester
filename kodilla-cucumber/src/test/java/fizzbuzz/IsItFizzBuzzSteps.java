package fizzbuzz;

import io.cucumber.java8.En;
import org.junit.Assert;

public class IsItFizzBuzzSteps implements En {

    private int number;
    private String answer;

    public IsItFizzBuzzSteps() {
        Given("the number is 1", () -> {
            this.number = 1;
        });

        Given("the number is -2", () -> {
            this.number = -2;
        });

        Given("the number is 3", () -> {
            this.number = 3;
        });

        Given("the number is 5", () -> {
            this.number = 5;
        });

        Given("the number is 15", () -> {
            this.number = 15;
        });

        Given("the number is 100", () -> {
            this.number = 100;
        });

        Given("the number is 30", () -> {
            this.number = 30;
        });

        Given("the number is -10", () -> {
            this.number = -10;
        });

        Given("the number is -999", () -> {
            this.number = -999;
        });

        When("I ask whether it's FizzBuzz", () -> {
            FizzBuzzChecker fizzbuzzchecker = new FizzBuzzChecker();
            this.answer = fizzbuzzchecker.isItFizzBuzz(this.number);
        });

        Then("I should be told {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
    }
}