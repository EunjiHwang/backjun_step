// OX����
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); // �׽�Ʈ ���̽��� ����
		String arr[] = new String[T];
		
		for(int i=0; i<T; i++) {
			arr[i] = br.readLine();
		}
		
		for(int i=0; i<T; i++) {
			
			int count = 0; // O�� ���� Ƚ��
			int total = 0; // ���� �հ�
			
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
