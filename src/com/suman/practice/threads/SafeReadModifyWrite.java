/**
 * 
 */
package com.suman.practice.threads;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author sumandutta
 *
 */
public class SafeReadModifyWrite {

	private AtomicInteger number = new AtomicInteger();
	
	
	public void incrementNumber(){
		number.getAndIncrement();
	}
	
	public int getNumber(){
		return this.number.get();
	}
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final SafeReadModifyWrite safeReadModifyWrite = new SafeReadModifyWrite();
		
		for(int i=0;i<1_000;i++){
			
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					safeReadModifyWrite.incrementNumber();
				}
			},"T-"+i).start();
		
		}
		
		try {
			Thread.sleep(4000);
			System.out.println("Final Number - "+ safeReadModifyWrite.getNumber());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		}

}
