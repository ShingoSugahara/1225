package pory.kansai.sample;

public class MyThread implements Runnable {
	public void run() {
		for(int i=0; i<100;i++) {
			System.out.println("MyThreadのrunメソッド("+i+")");
		}
	}
}
