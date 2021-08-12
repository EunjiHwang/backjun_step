// 빠른 A+B
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st; // 한 줄에 여러 개를 입력받는 경우 사용
		int T = Integer.parseInt(br.readLine()); // 테스트케이스의 개수
		int sum=0;
		
		for(int i=1; i<=T; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			sum = A+B;
			
			bw.write(sum + "\n"); // 출력
		}
		bw.flush(); // 남아있는 데이터 모두 출력
	}

}
