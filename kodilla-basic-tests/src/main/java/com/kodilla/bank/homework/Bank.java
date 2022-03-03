package com.kodilla.bank.homework;

public class Bank {
    CashMachine[] cashMachines;

    public Bank(int size) {
        this.cashMachines = new CashMachine[size];
    }

    public void addCashMachine(int operationSize) {
        for (int i = 0; i < cashMachines.length; i++) {
            if (cashMachines[i] == null) {
                cashMachines[i] = new CashMachine(operationSize);
                return;
            }
        }
    }

//    public void addCashMachine(int value2) {
//        this.size++;
//        int[] newTab = new int[this.size];
//        System.arraycopy(bank, 0, newTab, 0, bank.length);
//        newTab[this.size - 1] = value2;
//        this.bank = newTab;
//    }
}