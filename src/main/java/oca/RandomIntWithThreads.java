package oca;

public class RandomIntWithThreads {

	public static void main (String args[]) {
		System.out.println("Hello world!");

		Task myTask1 = new Task();
		myTask1.start();

		Task myTask2 = new Task();
		myTask2.start();
	}

}

class Task extends Thread {

	private static java.util.Random random;
	private String threadName;

	public Task(){
		random = new java.util.Random();
	}

	@Override
	public void run() {
		threadName = Thread.currentThread().getName();
		for (int i=0; i<30; i++)
			System.out.println("Do something marvelous here! Random number from " + threadName + ": " +
					this.createRandomInt());
	}

	private int createRandomInt(){
		return random.nextInt(10) + 1;
	}

}
