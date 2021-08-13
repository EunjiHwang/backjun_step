// 더하기 사이클
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int n = N; // 복사 값
		int sycle = 0;
		
		while(true) {
			int left = n/10; // 왼쪽 수만 남기기
			int right = n%10; // 오른쪽 수만 남기기
			// 오른쪽 수와 각 자리의 숫자를 더한 값을 이어 붙인 새로운 수
			n = right * 10 + (left + right) % 10;
			sycle++;
			
			if(N==n) {
				break;
			}
		}
		
		System.out.println(sycle);
	}

}
