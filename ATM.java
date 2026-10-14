// ATM Simulation Using Java

import java.util.Scanner;

public class ATM {
    private int pin;
    private double balance = 0;
    public void setpin(int pin){
        this.pin=pin;
    }
    
    
    public void checkBalance() {
        System.out.println("Balance: Rs. " + balance);
    }


    

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Invalid amount!");
        }


    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Invalid amount or insufficient balance!");
        }
    }
}


class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();
        
        System.out.println("create a pin:");
        int enteredpin=sc.nextInt();
        atm.setpin(enteredpin);


         System.out.print("Enter deposit amount: ");
            double deposit = sc.nextDouble();
            atm.deposit(deposit);

            System.out.print("Enter withdrawal amount: ");
            double withdraw = sc.nextDouble();
            atm.withdraw(withdraw);

            atm.checkBalance();

        }
    }

        
    




