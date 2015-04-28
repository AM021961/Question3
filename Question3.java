<<<<<<< HEAD
﻿public class Question
  public static void main(String[] args){
    HellowThread t1 = new HelloThread();
    HellowThread t2 = new HelloThread();
    ThreadA t1 = new ThreadA(t1, "T1");
    ThreadA t2 = new ThreadA(t2, "T2");
    t1.start();
    t2.start();
    System.out.println(Thread.activeCount()); 
  }
}
class HelloThread implements ThreadA{
  public void run(){
    for(int i=1; i<1000; i++){ 
      String tName = ThreadA.currentThread().getName();       
	System.out.println("ThreadA"); 
	ThreadA.sleep(1000);
    } 
  } 
=======
﻿public class Question3{
	public static void main(String[] args){

	ThreadB ta = new ThreadB();
	Thread t = new Thread(ta);
	t.start();

	}
}

class ThreadB implements Runnable{
	public void run(){

	int i;
	for(i=1 ; i<=1000 ; i++){
		Thread.sleep(1000);
		System.out.println("ThreadB");
		
		}


	}

>>>>>>> younglink0612-B_Branch
}
class ThreadC {
}