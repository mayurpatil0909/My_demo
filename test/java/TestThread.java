import java.util.Collections;

class Demo implements Runnable {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		System.out.println("I am in run of runnable...");
	}
}


public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collections cl;
		
		Demo obj = new Demo();
		Thread thread = new Thread(obj);
		
		thread.start();
		thread.start();
	}

}
