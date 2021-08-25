import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase(); // 대문자로 변경
		int[] count = new int[26]; // 알파벳 개수만큼 배열 생성
		
		for(int i=0; i<str.length(); i++) {
			int n = str.charAt(i) - 'A';
			count[n]++;
		}
		
		int max = 0;
		char a = '?';
		
		for(int i=0; i<count.length; i++) {
			if(max<count[i]) { // 최댓값보다 크면
				max = count[i]; // 가장 많이 사용된 알파벳이므로 최댓값에 넣는다
				a = (char)(i+'A'); // 해당 알파벳을 a에 저장
			} else if(max == count[i]) { // 가장 많이 사용된 알파벳이 여러 개이면
				a = '?'; // ?를 저장
			}
		}
		System.out.println(a);
	}

}
