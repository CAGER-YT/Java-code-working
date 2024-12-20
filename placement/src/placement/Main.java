package placement;

public class Main {
	 public static void main(String[] args) {
	     ATM atm = new ATM();

	     // Creating threads for deposit and withdrawal
	     Thread t1 = new ATMThread(atm, false, 200);
	     Thread t2 = new ATMThread(atm, true, 300);
	     Thread t3 = new ATMThread(atm, false, 500);
	     Thread t4 = new ATMThread(atm, true, 700);

	     // Starting the threads
	     t1.start();
	     t2.start();
	     t3.start();
	     t4.start();

	     // Wait for all threads to complete
	     try {
	         t1.join();
	         t2.join();
	         t3.join();
	         t4.join();
	     } catch (InterruptedException e) {
	         e.printStackTrace();
	     }
	 }
	}