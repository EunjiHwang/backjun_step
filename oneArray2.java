// �ִ�
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		int max = arr[0]; // max�� arr�� ���� ��
		int index = 0;
		
		for(int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i] > max) { // ���� max�� ������ ū ���� arr[i]�� ������
				max = arr[i]; // max���� �ִ´�
				index = i+1; // �ش� ���� ��ġ�� �����Ѵ�
			}
		}
		
		System.out.printf("%d\n%d", max, index);
	}

}
