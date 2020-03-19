package wallet;

public class Teller1 {
    private CashSlot1 cashSlot1;

    public Teller1(CashSlot1 cashSlot1) {
        this.cashSlot1 = cashSlot1;
    }

    public void withdraw(Wallet1 wallet1, int amount) {
        if (amount < wallet1.getBalance()) {
            int actualWithdraw = wallet1.withdraw(amount);
            cashSlot1.dispense(actualWithdraw);
        } else {
            System.out.println("I have insufficient funds in my account");
        }
    }
}
