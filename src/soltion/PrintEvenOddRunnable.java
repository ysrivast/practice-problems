package soltion;

public class PrintEvenOddRunnable implements Runnable  {
	
	private final Integer max;
	private final Integer reminder;
	private static Integer number=1;
	private static final Object lock = new Object();
	
	public PrintEvenOddRunnable(Integer max, Integer reminder) {
		super();
		this.max = max;
		this.reminder = reminder;
	}



	@Override
	public void run() {
		while(number < max) {
			synchronized (lock) {
				if(number%2!=reminder) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				else {
					System.out.println(Thread.currentThread().getName() + " " + number);
					number++;
					lock.notifyAll();
				}
			}
		}
		
	}

}
