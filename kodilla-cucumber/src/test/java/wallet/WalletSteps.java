package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();

    public WalletSteps() {
    Given("I have deposited $200 in my wallet", () -> {
        wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });

    When("I request $30", () -> {
        Teller teller = new Teller(cashSlot);
        teller.withdraw(wallet, 30);
    });

        When("I request $1", () -> {
            Teller teller = new Teller(cashSlot);
            teller.withdraw(wallet, 1);
        });

        When("I request $0", () -> {
            Teller teller = new Teller(cashSlot);
            teller.withdraw(wallet, 0);
        });

        When("I request $300", () -> {
            Teller teller = new Teller(cashSlot);
            teller.withdraw(wallet, 300);
        });

        When("I request $-10", () -> {
            Teller teller = new Teller(cashSlot);
            teller.withdraw(wallet, -10);
        });


        Then("$30 should be dispensed", () -> {
        Assert.assertEquals(30, cashSlot.getContents());
    });

        Then("$1 should be dispensed", () -> {
            Assert.assertEquals(1, cashSlot.getContents());
        });

        Then("$0 should be dispensed", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });

        Then("$300 should be dispensed", () -> {
            Assert.assertEquals(300, cashSlot.getContents());
        });

        Then("$-10 should be dispensed", () -> {
            Assert.assertEquals(-10, cashSlot.getContents());
        });

}
}
