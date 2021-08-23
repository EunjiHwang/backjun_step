import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수
		StringTokenizer st;
		
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine(), " "); // 공백으로 구분
			int R = Integer.parseInt(st.nextToken()); // 반복 횟수
			String S = st.nextToken(); // 문자열
			
			for(int j=0; j<S.length(); j++) {
				for(int k=0; k<R; k++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println(); // 줄바꿈
		}

	}

}
