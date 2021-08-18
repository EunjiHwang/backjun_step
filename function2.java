// �Ѽ�(��������)
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(sequence(Integer.parseInt(br.readLine())));
	}

	public static int sequence(int num) {
		int count = 0; // �Ѽ��� ������ ���� ����
		
		if(num<100) { // 100 ������ ���� ������ ���������̴�
			return num;
		} else { // 100 �̻��� ��
			count = 99;
			
			if(num == 1000) { // ���� ó��
				num = 999;
			}

			for(int i=100; i<=num; i++) {
				int hun = i/100; // ���� �ڸ�
				int ten = (i/10) % 10; // ���� �ڸ�
				int one = i%10; // ���� �ڸ�

				if((hun-ten) == (ten-one)) { // ���� �Ǻ�
					count++;
				}
			}
		}
		
		return count;
		
	}

}