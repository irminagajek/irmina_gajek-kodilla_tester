package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();

    public WalletSteps() {
    Given("I have deposited ${int} in my wallet", (Integer depositedValue) -> {
        wallet.deposit(depositedValue);
            Assert.assertEquals("Incorrect wallet balance", depositedValue.intValue(), wallet.getBalance());
        });

    When("I request ${int}", (Integer requestedValue) -> {
        Teller teller = new Teller(cashSlot);
        teller.withdraw(wallet, requestedValue);
    });

        Then("${int} should be dispensed", (Integer dispensedValue) -> {
        Assert.assertEquals(dispensedValue.intValue(), cashSlot.getContents());
    });

        Then("The balance of my wallet should be {int}", (Integer walletValue) -> {
            Assert.assertEquals(walletValue.intValue(), wallet.getBalance());
        });

}
}
