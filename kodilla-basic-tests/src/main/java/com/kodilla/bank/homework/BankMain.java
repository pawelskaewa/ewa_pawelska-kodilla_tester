package com.kodilla.bank.homework;

public class BankMain {
    public static void main(String[] args) {
        CashMachine cashMachine2 = new CashMachine(0);
        Bank bank = new Bank(0);
        cashMachine2.addTransaction(100);
        cashMachine2.addTransaction(200);

        System.out.println(cashMachine2.countDepositTransactions());

        cashMachine2.addTransaction(-400);

        System.out.println(cashMachine2.countDepositTransactions());
        System.out.println(cashMachine2.countWithdrawTransactions());
        System.out.println(cashMachine2.depositSum());
        System.out.println(cashMachine2.withdrawSum());
        System.out.println(cashMachine2.getNumberOfTransactions());

        cashMachine2.addTransaction(500);

        System.out.println(cashMachine2.getNumberOfTransactions());
        System.out.println(cashMachine2.getBalance());

        cashMachine2.addTransaction(-800);

        System.out.println(cashMachine2.getBalance());
        bank.addCashMachine(cashMachine2);
        CashMachine cashMachine3 = new CashMachine(0);

        cashMachine3.addTransaction(1000);
        cashMachine3.addTransaction(2000);

        System.out.println(cashMachine3.getBalance());
        System.out.println(cashMachine2.getBalance());

        bank.addCashMachine(cashMachine3);

        System.out.println(bank.bankBalance());
        System.out.println(bank.depositSum());
        System.out.println(bank.withdrawSum());
        System.out.println(bank.depositCount());
        System.out.println(bank.withdrawCount());
        System.out.println(bank.averageDepositCashMachine());
        System.out.println(bank.averageWithdrawCashMachine());
    }
}