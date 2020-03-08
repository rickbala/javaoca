package oca;

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
