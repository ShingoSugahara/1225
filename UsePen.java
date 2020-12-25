package sample;
import java.util.ArrayList;
import java.util.List;
public class UsePen {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Pen pen = new Pen("鉛筆",50);
		System.out.println(pen);

		List<Pen> penList = new ArrayList<>();
		penList.add(new Pen("万年筆",5000));
		penList.add(new Pen("多機能ペン",600));
		penList.add(new Pen("筆",1200));
		penList.add(pen);

		for(Pen p:penList) {
			System.out.println(p);
		}

	}

}
