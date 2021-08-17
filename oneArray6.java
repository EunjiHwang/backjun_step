// OX퀴즈
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수
		String arr[] = new String[T];
		
		for(int i=0; i<T; i++) {
			arr[i] = br.readLine();
		}
		
		for(int i=0; i<T; i++) {
			
			int count = 0; // O의 연속 횟수
			int total = 0; // 점수 합계
			
			for(int j=0; j<arr[i].length(); j++) {
				if(arr[i].charAt(j) == 'O') {
					count++;
				} else {
					count = 0;
				}
				total += count;
			}
			System.out.println(total);
		}
		
	}

}
