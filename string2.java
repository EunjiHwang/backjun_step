import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // ������ ����
		
		int sum = 0;
		
		for(int i=0; i<N; i++) { 
			sum += br.read() - 48; // �ƽ�Ű�ڵ� 49�����Ͱ� 1�̱� ������ -48�� ���ش�
		}						   // �Է� ���ڸ��� ����ؼ� sum�� ���ϱ�
		
		System.out.println(sum);
		
	}
}