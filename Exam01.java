
public class Exam01 {

	public static void main(String[] args) {
		int num1 = 30;
		int[] arr = { 1, 2 };
		change(num1);
		change2(arr);
		System.out.println("�ٲﰪ >> " + num1);
		System.out.println("�ٲﰪ >> " + arr[0]);

	}

	public static void change(int num) {
		num = 10;
	}

	public static void change2(int[] arr) {
		arr[0] = 10;
	}

}
