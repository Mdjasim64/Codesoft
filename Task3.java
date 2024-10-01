//package CodSoft;

import java.util.Scanner;

class ATM{
    int PIN=4321;
    double balance;
    public void checkPin(){
        System.out.print("Enter PIN: ");
        Scanner sc=new Scanner(System.in);
        int pin=sc.nextInt();
        if(pin==PIN){
            menu();
        }
        else{
            System.out.println("Please, Enter Valid PIN!!");
            checkPin();
        }
    }
    public void menu(){
        System.out.print("Enter Choice: ");
        System.out.println("1.Check Balance");
        System.out.println("2.Withdrawl Money");
        System.out.println("3.Deposit Money");
        System.out.println("4.Exit");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
                checkBalance();
                break;
            case 2:
                withdraw();
                break;
            case 3:
                deposit();
                break;
            case 4:
                return;

            default:
                System.out.println("Please,Enter Valid Choice!!");
                break;
        }
    }
    public void checkBalance(){
        System.out.println("Balance: "+balance);
        menu();
    }
    public void withdraw(){
        System.out.print("Enter amount: ");
        Scanner sc=new Scanner(System.in);
        double amount=sc.nextDouble();
        if(amount<=balance){
            balance=balance-amount;
            System.out.println("Money Withdrawl Successful");
        }else{
            System.out.println("Insufficient Balance!!");
        }
        menu();
    }
    public void deposit(){
        System.out.print("Enter amount: ");
        Scanner sc=new Scanner(System.in);
        double amount=sc.nextDouble();
        balance=balance+amount;
        System.out.println("Deposit Successfull.");
        menu();
    }
}
public class Task3 {
    public static void main(String[] args) {
        ATM a=new ATM();
        a.checkPin();

    }
}
