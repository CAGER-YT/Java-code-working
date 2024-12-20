package placement;

//ATM.java
public class ATM {
 private int balance = 1000;

 // Synchronized method to ensure thread safety
 public synchronized void withdraw(int amount) {
     if (amount > 0 && amount <= balance) {
         System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
         balance -= amount;
         System.out.println("New balance: " + balance);
     } else {
         System.out.println("Insufficient funds or invalid amount.");
     }
 }

 public synchronized void deposit(int amount) {
     if (amount > 0) {
         System.out.println(Thread.currentThread().getName() + " is depositing " + amount);
         balance += amount;
         System.out.println("New balance: " + balance);
     } else {
         System.out.println("Invalid deposit amount.");
     }
 }
}

//ATMThread.java

//Main.java
