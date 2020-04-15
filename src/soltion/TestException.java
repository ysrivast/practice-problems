package soltion;

import java.io.IOException;

public class TestException {
	public static void main(String[] args) {
		int a =1;
		start();
		try {
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			a=4;
		}
		
		System.out.println(a);
	}
	
	public static void start() throws  RuntimeException{
	    throw new RuntimeException("Not able to Start");
	 }


}
