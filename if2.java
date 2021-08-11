import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] a = new int[10][10]; // 10*10 크기의 미로 상자

		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				a[i][j] = scanner.nextInt();
			}
		}

		int y = 1;
		int finish = 0;

		for(int i=1; i<a.length; i++) { // 오른쪽으로 이동
			if(finish != 1) { // 종료되지 않았다면
				for(int j=y; j<a.length; j++) {
					if(a[i][j] == 0) { // 0이면 이동
						a[i][j] = 9; // 개미가 이동한 경로를 9로 표시
						y++; // 아래로 이동
					} else if(a[i][j] == 2) { // 먹이가 있는 곳이면
						a[i][j] = 9;
						finish = 1; // 종료한다
						break;
					} else {
						y = j-1; // 1이면 다시 위로 이동
						break;
					}
				}
			} else {
				break; // finish가 1이면 종료
			}
		}

		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}
}
