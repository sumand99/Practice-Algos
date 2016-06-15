/**
 * 
 */
package com.suman.practice.threads;

/**
 * @author sumandutta
 *
 */
public class SafeCheckThenAct {

	private int number;
	
	
	public synchronized void changeNumber(){
		
		if(number==0){
			System.out.println(Thread.currentThread().getName() + "| Changed");
			number =-1;
		}else{
			System.out.println(Thread.currentThread().getName() + "| Un-Changed");
	
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final UnsafeCheckThenAct unsafeCheckThenAct = new UnsafeCheckThenAct();
		
		for(int i=0;i<20;i++){
			
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					unsafeCheckThenAct.changeNumber();
				}
			},"T-"+i).start();
		
		}

		}

}
