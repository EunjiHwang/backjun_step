// 최댓값
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		int max = arr[0]; // max는 arr의 시작 값
		int index = 0;
		
		for(int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i] > max) { // 만약 max의 값보다 큰 값이 arr[i]에 들어오면
				max = arr[i]; // max값에 넣는다
				index = i+1; // 해당 값의 위치를 저장한다
			}
		}
		
		System.out.printf("%d\n%d", max, index);
	}

}
