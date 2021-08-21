import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		
		for(char c = 'a'; c <= 'z'; c++) {
			System.out.print(S.indexOf(c) + " "); // indexOf() : 특정 문자의 위치를 반환, 존재하지 않을 경우 -1을 반환하는 메서드
		}
	}

}
