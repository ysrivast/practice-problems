package soltion;

public class Solution {
	
	public static void main(String[] args) {
		PrintEvenOddRunnable printEven = new PrintEvenOddRunnable(10, 0);
		PrintEvenOddRunnable printOdd = new PrintEvenOddRunnable(10, 1);
		Thread t1 = new Thread(printOdd);
		Thread t2 = new Thread(printEven);
		t1.start();
		t2.start();
	}

}
