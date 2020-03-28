package com.kodilla.bank.homework;

public class Bank {

    CashMachine cashMachine = new CashMachine();
    CashMachine cashMachine1 = new CashMachine();
    CashMachine cashMachine2 = new CashMachine();
    CashMachine cashMachine3 = new CashMachine();

    int[] ATM1 = new int[] {100, 250, 150, -50, -250};
    int[] ATM2 = new int[] {350, -150, 100};

    public int checkCompleteBalance() {

        int balance1 = cashMachine1.checkBalance(1000, ATM1);
        int balance2 = cashMachine2.checkBalance(2000, ATM2);

        return balance1 + balance2;
    }

    public int checkNumberOfDeposits() {
        int deposit1 = cashMachine1.numberOfOperations(ATM1, "deposit");
        int deposit2 = cashMachine2.numberOfOperations(ATM2, "deposit");

        return deposit1 + deposit2;
        }

        public int checkNumberOfWithdrawals() {
        int withdrawal1 = cashMachine1.numberOfOperations(ATM1, "withdrawal");
        int withdrawal2 = cashMachine2.numberOfOperations(ATM2, "withdrawal");

        return withdrawal1 + withdrawal2;
        }

        public int checkDepositAverage() {
        int averageDeposit = cashMachine.getAverageDeposit(ATM1, ATM2, "deposit");
        return averageDeposit;
            }

        public int checkWithdrawalAverage() {
        int averageWithdrawal = cashMachine.getAverageDeposit(ATM1, ATM2, "withdrawal");
        return averageWithdrawal;
        }
           }

