package thread;

class MyTread implements Runnable{
	
	public void run() {
		int i;
		
		for(i=0; i<=200; i++) {
			System.out.println(i+"\t");
			
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadTest{

	public static void main(String[] args) {
		
		System.out.println("start");
		/*MyTread th1 = new MyTread();
		MyTread th2 = new MyTread();
		
		th1.start();
		th2.start();*/
		
		/*MyTread runner1 = new MyTread();
		Thread th1 =  new Thread(runner1);
		
		MyTread runner2 = new MyTread();
		Thread th2 =  new Thread(runner2);
		*/
		
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		System.out.println("end");
	}

}
