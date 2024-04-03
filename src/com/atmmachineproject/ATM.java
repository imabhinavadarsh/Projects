package com.atmmachineproject;

import java.util.*;
public class ATM {
    double Balance;
    int PIN = 12345;

    void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 : T0 CHECK YOUR BALANCE.");
        System.out.println("Enter 2  : TO WITHDRAW MONEY.");
        System.out.println("Enter 3  : TO DEPOSITE MONEY.");
        System.out.println("Enter 4  : TO EXIT.");
        System.out.println("Enter the option:");
        int num = sc.nextInt();
        switch(num) {
            case 1: checkBalance();
                break;
            case 2: withDrawBalance();
            break;
            case 3: depositeAmount();
            break;
            case 4: toExit();
            break;
            default:
                System.out.println("Choose the correct option");
        }


    }
    void checkBalance(){
        System.out.println("Your Current Balance is : " + Balance);
        menu();
    }
    void withDrawBalance(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the withdraw amount");
        double withDrawAmount = sc.nextDouble();
        if(withDrawAmount > Balance){
            System.out.println("Insufficient fund to withdraw!");
        }else{
           Balance -= withDrawAmount;
            System.out.println("Amount withdrawed successfully");
            System.out.println("Current Balance is " + Balance);
            menu();
      }

    }
    void depositeAmount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount you want to deposite");
        double depositedAmount = sc.nextDouble();
        Balance += depositedAmount;
        System.out.println("Money Deposited Successfully");
        menu();
    }
    void toExit(){
        System.out.println("Thankyou for choosing this ATM");
    }
    public void checkPin(){
        System.out.println("Enter your Pin");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();
        if(PIN == enteredPin){
            menu();
        }else{
            System.out.println("Kindly Enter te correct pin");
            checkPin();
        }
    }
}