// 평균은 넘겠지
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수
		StringTokenizer st;
		
		for(int i=0; i<C; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken()); // 학생의 수 
			int arr[] = new int[N];
			double sum = 0;
			
			for(int j=0; j<N; j++) {
				int score = Integer.parseInt(st.nextToken()); // 성적
				arr[j] = score;
				sum += score; // 성적 합계
			}
			
			double ave = (sum/N); // 성적 전체 평균
			double total = 0;
			
			for(int k=0; k<N; k++) {
				if(arr[k] > ave) {
					total++; // 평균을 넘는 학생 수
				}
			}
			
			System.out.printf("%.3f%%\n", (total/N)*100);
		}
	}

}
