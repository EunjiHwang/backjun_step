// 평균
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double arr[] = new double[Integer.parseInt(br.readLine())]; // 시험 본 과목의 개수
		double Total = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Double.parseDouble(st.nextToken()); // 현재 성적
		}
		
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			Total += ((arr[i]/arr[arr.length-1])*100);
		}
		
		System.out.print(Total/arr.length);
	}

}
