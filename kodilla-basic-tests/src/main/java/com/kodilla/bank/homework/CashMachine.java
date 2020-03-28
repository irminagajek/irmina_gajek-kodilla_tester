package com.kodilla.bank.homework;

import java.lang.reflect.Array;

public class CashMachine {

    public int checkBalance(int startBalance, int[] array) {
        int[] transactions = array;
        int transactionsAmount = array.length;
        int balance = startBalance;

        for (int i = 0; i <= transactionsAmount - 1; i++) {
            int value = Array.getInt(transactions, i);
            if (value >= 0) {
                balance += value;

            } else {
                balance += value;
            }
        }
        return balance;
    }

    public int numberOfOperations(int[] array, String typeOfOperation) {
        int[] transactions = array;
        int transactionsAmount = array.length;
        int deposit = 0;
        int withdrawal = 0;

        for (int i = 0; i <= transactionsAmount - 1; i++) {
            int value = Array.getInt(transactions, i);
            if (value >= 0) {
                deposit += 1;

            } else {
                withdrawal += 1;
            }
        }

        if (typeOfOperation == "deposit") {
            return deposit;
        } else {
            return withdrawal;
        }
    }

    public int getAverageDeposit(int[] ATM1, int[] ATM2, String depositOrWithdrawal) {
        int[] result = new int[ATM1.length + ATM2.length];

        System.arraycopy(ATM1, 0, result, 0, ATM1.length);
        System.arraycopy(ATM2, 0, result, ATM1.length, ATM2.length);

        int totalPayments = 0;
        int amountOfPayments = 0;
        int totalWithdrawals = 0;
        int amountOfWithdrawals = 0;

        for (int i = 0; i < result.length; i++) {
            int value = Array.getInt(result, i);
            if (value > 0) {
                totalPayments += value;
                amountOfPayments += 1;

            } if (value < 0) {
                totalWithdrawals += (value);
                amountOfWithdrawals += 1;
            }
        }

        if (depositOrWithdrawal.equals("withdrawal")) {
                return totalWithdrawals / amountOfWithdrawals;
            }
            else {
                return totalPayments / amountOfPayments;
        }
    }
}