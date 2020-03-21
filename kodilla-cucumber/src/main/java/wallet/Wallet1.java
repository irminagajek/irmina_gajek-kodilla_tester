package wallet;

public class Wallet1 {
    private int balance = 0;

    public Wallet1() {
    }

    public void deposit(int money) {
        this.balance += money;
    }

    public int withdraw(int money) {
        if (balance >= money) {
            this.balance -= money;
            return money;
        } else {
            int b = this.balance;
            this.balance = 0;
            return b;
        }
    }

    public int getBalance() {
        return balance;
    }
}