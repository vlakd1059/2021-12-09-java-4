package 자바테스트;

public class Test03 {

	public static void main(String[] args) {
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		String[] str = score.split(",");

		String[] hakben = { "A", "B", "C", "D", "E", "F" };

		int[] cnt = new int[6]; 
		// str배열과 hakben배열 비교후 같은 문자형갯수 저장할 배열
		
		for (int i = 0; i < hakben.length; i++) {
			int num = 0;
			for (int j = 0; j < str.length; j++) {
				if (hakben[i].equals(str[j])) {
					num++;
				}
			}
			cnt[i] = num; // A~F 각각의 갯수마다 cnt변수에 저장
			System.out.println(cnt[i]);
		}

		for (int i = 0; i < hakben.length; i++) {
			if (cnt[i] > 0) {
				System.out.println(hakben[i] + " : " + cnt[i] + "명");
			}
		}
	}
}
