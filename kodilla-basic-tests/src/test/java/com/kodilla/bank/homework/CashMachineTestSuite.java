package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CashMachineTestSuite {

    CashMachine cashMachine = new CashMachine();

    @Test
    public void shouldReturnCashMachineBalance() {
        CashMachine cashMachine = new CashMachine();
        int[] transactions = new int[] {50, 150, 400, -100};
        int sumResult = cashMachine.checkBalance(3000, transactions);
        assertEquals(3500, sumResult);
    }

    @Test
    public void shouldReturnBalanceWhenArrayIsEmpty() {
        CashMachine cashMachine = new CashMachine();
        int[] transactions = new int[] {};
        int transactionsResult = cashMachine.checkBalance(2000, transactions);
        assertEquals(2000, transactionsResult);
    }

    @Test
    public void testTotalBalance() {
        Bank bank = new Bank();
        int sumResult = bank.checkCompleteBalance();
        assertEquals(3500, sumResult);
    }

    @Test
    public void testNumberOfDeposits() {
        Bank bank = new Bank();
        int sumResult = bank.checkNumberOfDeposits();
        assertNotEquals(0, sumResult);
    }

    @Test
    public void testNumberOfWithdrawals() {
        Bank bank = new Bank();
        int sumResult = bank.checkNumberOfWithdrawals();
        assertNotEquals(0, sumResult);
    }

    @Test
    public void testAverageValueOfDeposits() {
        Bank bank = new Bank();
        int averageResult = bank.checkDepositAverage();
        assertEquals(190, averageResult);
    }

   @Test
   public void testAverageValueOfWithdrawals() {
       Bank bank = new Bank();
       int averageResult = bank.checkWithdrawalAverage();
       assertEquals(-150, averageResult);
   }
   }