package �ڹ��׽�Ʈ;

public class Test03 {

	public static void main(String[] args) {
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		String[] str = score.split(",");

		String[] hakben = { "A", "B", "C", "D", "E", "F" };

		int[] cnt = new int[6]; 
		// str�迭�� hakben�迭 ���� ���� ���������� ������ �迭
		
		for (int i = 0; i < hakben.length; i++) {
			int num = 0;
			for (int j = 0; j < str.length; j++) {
				if (hakben[i].equals(str[j])) {
					num++;
				}
			}
			cnt[i] = num; // A~F ������ �������� cnt������ ����
			System.out.println(cnt[i]);
		}

		for (int i = 0; i < hakben.length; i++) {
			if (cnt[i] > 0) {
				System.out.println(hakben[i] + " : " + cnt[i] + "��");
			}
		}
	}
}
