package Day04;

import java.util.Scanner;

public class Day04_6_Q8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		
		String input;
		int cnt, sum, n= sc.nextInt(); //���̽����̽� ���� �Է�
		
		for (int i=0; i<n; i++) { //�׽�Ʈ���̽� ������ŭ
			input = sc.next(); //��Ʈ���� �Է¹޴´�
			cnt=0; sum=0; //�� �ʱ�ȭ	
			for (int j=0; j<input.length(); j++) { //��Ʈ���� ���̸�ŭ O�� X�� ��üũ
				if (input.substring(j, j+1).equals("O")) { //���� O���
					cnt+=1; //ī��Ʈ���� 1�� ���ϰ�
					sum+=cnt; //�����, ���� ī��Ʈ���� ���Ѵ�
				}
				else { cnt=0; } //X��� ī��Ʈ�� 0���� �ʱ�ȭ�Ѵ�
			}
			System.out.println(sum); //����� ���
		}
	
	}

}
