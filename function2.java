// 한수(등차수열)
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(sequence(Integer.parseInt(br.readLine())));
	}

	public static int sequence(int num) {
		int count = 0; // 한수의 개수를 세는 변수
		
		if(num<100) { // 100 이하의 수는 무조건 등차수열이다
			return num;
		} else { // 100 이상일 시
			count = 99;
			
			if(num == 1000) { // 예외 처리
				num = 999;
			}

			for(int i=100; i<=num; i++) {
				int hun = i/100; // 백의 자리
				int ten = (i/10) % 10; // 십의 자리
				int one = i%10; // 일의 자리

				if((hun-ten) == (ten-one)) { // 수열 판별
					count++;
				}
			}
		}
		
		return count;
		
	}

}