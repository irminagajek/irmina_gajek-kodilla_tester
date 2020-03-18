package wallet;

public class Teller {
private CashSlot cashSlot;

public Teller(CashSlot cashSlot) {
    this.cashSlot = cashSlot;
}
    public void withdraw(Wallet wallet, int amount) {
    if (amount > 0) {
        int actualWithdraw = wallet.withdraw(amount);
        cashSlot.dispense(actualWithdraw);
    }
    }
}
