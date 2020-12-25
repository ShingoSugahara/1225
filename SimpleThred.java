package pory.kansai.sample;

public class SimpleThred{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		MyThread2 t = new MyThread2();
		t.start();

		for(int i=0;i<100;i++) {
			System.out.println("SimpleThreadTestのmainメソッド("+i+")");
		}
	}

}
