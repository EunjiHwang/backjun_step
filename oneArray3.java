// ������ ����
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		
		int mul = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
		String str = String.valueOf(mul); // String ����ȯ
		
		for(int i=0; i<str.length(); i++) {
			arr[(str.charAt(i) - 48)]++; // ���� 1�� �ƽ�Ű�ڵ尪 49�̱� ������ -48�� ���ش�
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
