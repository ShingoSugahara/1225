package pory.kansai.sample;

public class SimpleThreadTest2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		MyThread t = new MyThread();
		Thread thread = new Thread(t);
		thread.start();

		for(int i=0; i<100;i++) {
			System.out.println("SimpleThreadTest2のmainメソッド("+i+"))");
		}

	}

}
