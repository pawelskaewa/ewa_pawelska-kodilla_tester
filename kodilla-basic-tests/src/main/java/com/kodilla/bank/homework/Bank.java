package com.kodilla.bank.homework;

public class Bank {
    public int[][] bank;
    int size = 0;

    public Bank() {
        this.bank = new int [0][];
        this.size = 0;
    }

    public void addCashMachine(CashMachine cashMachine) {
        this.size++;
        int[][] newTab = new int[this.size][];
        System.arraycopy(bank, 0, newTab, 0, bank.length);
        newTab[this.size - 1][] = new CashMachine;
        this.bank = newTab;
    }
}