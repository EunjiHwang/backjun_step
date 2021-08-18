// ���� �ѹ�
public class Main {
	public static void main(String[] args) {
		boolean[] check = new boolean[10001];

		for(int i=1; i<10001; i++) {
			int n = d(i);

			if(n<10001) { // 10000 �̻��� �� X
				check[n] = true;			
			}
		}

		for(int i=1; i<10001; i++) {
			if(!check[i]) { // false
				System.out.println(i);
			}
		}
	}

	public static int d(int num) {
		int sum = num;
		while(num!=0) {
			sum = sum+(num%10); // ù ��° �ڸ���
			num = num/10; // ù ��° �ڸ� ����
		}
		return sum;
	}
}
