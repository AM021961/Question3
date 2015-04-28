public class Question3{
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

}