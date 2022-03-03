package com.kodilla.bank.homework;

public class CashMachine {
    private int[] cashMachine;
    private int size;

    public CashMachine(int size) {
        this.size = 0;
        this.cashMachine = new int[0];
    }

    public void addTransaction(int value) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(cashMachine, 0, newTab, 0, cashMachine.length);
        newTab[this.size - 1] = value;
        this.cashMachine = newTab;
    }

    public int[] getCashMachine() {
        return cashMachine;
    }

    public int getBalance() {
        int sum = 0;
        for (int i = 0; i < this.cashMachine.length; i++) {
            sum += this.cashMachine[i];
        }
        return sum;
    }

    public int getNumberOfTransactions(){
        return cashMachine.length;
    }
}