package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        System.out.println("Ваш баланс: " + amount );
        return amount;

    }
    void  deposit(double sum){
        amount =+ sum;

    }
    void withDraw(int sum)throws LimitException{
        if (sum > amount){
            throw new LimitException("Запрашиваемая сумма больше чем вы хотите",amount);

        }else {
            amount -= sum;
            System.out.println(" Было снято " + sum);
        }

    }

}
