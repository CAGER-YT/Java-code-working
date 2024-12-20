package task;

public class RunThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is Running");
		synchronized(RunThread.class) {
			try {
				RunThread.class.wait(3000);
				System.out.println("Thread is awaked");
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

	public static void main(String[] args)throws Exception {
		RunThread r1=new RunThread();
		Thread t1=new Thread(r1);
		t1.start();
		Thread.sleep(2000);
		System.out.println("Main Thread");
	}
}
