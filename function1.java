// 셀프 넘버
public class Main {
	public static void main(String[] args) {
		boolean[] check = new boolean[10001];

		for(int i=1; i<10001; i++) {
			int n = d(i);

			if(n<10001) { // 10000 이상의 수 X
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
			sum = sum+(num%10); // 첫 번째 자릿수
			num = num/10; // 첫 번째 자리 삭제
		}
		return sum;
	}
}
