package soltion;

class EvenOddPrint implements Runnable {
	private int remainder;
	private int max=100;
	private Object lock = new Object();

	EvenOddPrint(int remainder) {
		this.remainder = remainder;
	}

	@Override
	public void run() {
		for (int i = 0; i < max; i++) {
			synchronized (lock) {
				if (i % 2 == remainder) {
					System.out.println(Thread.currentThread().getName() + "----" + i);
					lock.notifyAll();
				} else {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

}

class Main {
	public static void main(String[] args) {

		EvenOddPrint even = new EvenOddPrint(0);
		EvenOddPrint odd = new EvenOddPrint(1);
		Thread t1 = new Thread(even);
		Thread t2 = new Thread(odd);
		t1.start();
		t2.start();
	}
}