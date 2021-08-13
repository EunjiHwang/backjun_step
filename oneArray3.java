// 숫자의 개수
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		
		int mul = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
		String str = String.valueOf(mul); // String 형변환
		
		for(int i=0; i<str.length(); i++) {
			arr[(str.charAt(i) - 48)]++; // 숫자 1이 아스키코드값 49이기 때문에 -48을 해준다
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
