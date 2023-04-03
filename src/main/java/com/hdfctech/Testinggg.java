package com.hdfctech;

import java.util.Properties;

public class Testinggg  implements Runnable  {
	private Thread t;
	private String threadName;
	Testinggg(String threadName){
		
		this.threadName=threadName;
	}
	public void run()  
	{    
		while(true)
	System.out.println(threadName);    
	}    
	public void start()  
	{    
		if(t==null) {
		t=new Thread(this,threadName);
		t.start();
		}
	    
	}    
	public static void main(String[] args) {
		Testinggg t1= new Testinggg("A");
		
		Testinggg t2= new Testinggg("B");
		t2.start();
		t1.start();
	}
}
