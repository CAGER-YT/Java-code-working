package placement;

public class ATMThread extends Thread {
	 private ATM atm;
	 private boolean isDeposit;
	 private int amount;

	 public ATMThread(ATM atm, boolean isDeposit, int amount) {
	     this.atm = atm;
	     this.isDeposit = isDeposit;
	     this.amount = amount;
	 }

	 @Override
	 public void run() {
	     if (isDeposit) {
	         atm.deposit(amount);
	     } else {
	         atm.withdraw(amount);
	     }
	 }
}