/**
 * 
 */
package com.suman.practice.threads;

/**
 * @author sumandutta
 *
 */
public class UnsafeReadModifyWrite {

	private int number;
	
	
	public void incrementNumber(){
		number++;
	}
	
	public int getNumber(){
		return number;
	}
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final UnsafeReadModifyWrite unsafeReadModifyWrite = new UnsafeReadModifyWrite();
		
		for(int i=0;i<1_000;i++){
			
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					unsafeReadModifyWrite.incrementNumber();
				}
			},"T-"+i).start();
		
		}
		
		try {
			Thread.sleep(6000);
			System.out.println("Final Number - "+ unsafeReadModifyWrite.getNumber());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		}

}
