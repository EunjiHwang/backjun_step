// ���ϱ� ����Ŭ
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int n = N; // ���� ��
		int sycle = 0;
		
		while(true) {
			int left = n/10; // ���� ���� �����
			int right = n%10; // ������ ���� �����
			// ������ ���� �� �ڸ��� ���ڸ� ���� ���� �̾� ���� ���ο� ��
			n = right * 10 + (left + right) % 10;
			sycle++;
			
			if(N==n) {
				break;
			}
		}
		
		System.out.println(sycle);
	}

}
