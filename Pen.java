package sample;

public class Pen {

 private String name;
 private int price;



public Pen(String name,int price) {
	this.name = name;
	this.price = price;
}

public String getName() {
	return name;
}

public int getPrice() {
	return price;
}

public String showInfo() {
	return name+":"+price+"円";
}

@Override
public String toString() {
	// TODO 自動生成されたメソッド・スタブ
	return name+":"+price+"円";
}

}
