package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps1 implements En {

    private Wallet1 wallet1 = new Wallet1();
    private CashSlot1 cashSlot1 = new CashSlot1();

    public WalletSteps1() {
    Given("my wallet has been credited with ${int}", (Integer depositedValue) -> {
        wallet1.deposit(depositedValue);
            Assert.assertEquals(depositedValue.intValue(), wallet1.getBalance());
        });

    When("I withdraw ${int}", (Integer requestedValue) -> {
        Teller1 teller1 = new Teller1(cashSlot1);
        teller1.withdraw(wallet1, requestedValue);
    });

        Then("${int} should be dispensed", (Integer dispensedValue) -> {
        Assert.assertEquals(dispensedValue.intValue(), cashSlot1.getContents());
    });

        Then("I should be told that {string}", (String string) -> {
            Assert.assertEquals();
        });

}
}
