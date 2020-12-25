package pory.kansai.enshu;
import java.util.Scanner;
public class Countdown {

	public static int scanner() {
		Scanner scan = new Scanner(System.in);
		System.out.print("秒数を入力してください:");
		int imput = scan.nextInt();

		return imput;
	}

	public static void count(int imput) {
		
			}

	
	

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int imput = scanner();
		MyThread mythread = new MyThread(imput);
		mythread.start();
		
		}
	}	

