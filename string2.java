import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 숫자의 개수
		
		int sum = 0;
		
		for(int i=0; i<N; i++) { 
			sum += br.read() - 48; // 아스키코드 49번부터가 1이기 때문에 -48을 해준다
		}						   // 입력 받자마자 계산해서 sum에 더하기
		
		System.out.println(sum);
		
	}
}