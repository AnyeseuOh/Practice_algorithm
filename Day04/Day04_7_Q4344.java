package Day04;

import java.util.*;
import java.util.stream.IntStream;

public class Day04_7_Q4344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //�׽�Ʈ���̽� �� �Է�
		int cnt;
		float avg, result;
		
		for (int i=0; i<n; i++) {
			int n_sc = sc.nextInt(); //�л��� �Է�
			int[] score = new int[n_sc]; //�л��� ��ŭ�� �л����� �迭 ����
			
			for (int j=0; j<n_sc; j++) {
				score[j] = sc.nextInt(); //�迭�� �л����� �Է�
			}
			
			cnt=0; //ī��Ʈ ���� �ʱ�ȭ
			avg = IntStream.of(score).sum()/n_sc; //�Է¹��� �����迭�� ���
			for (int j=0; j<n_sc; j++) {
				if (score[j]>avg) { //��պ��� Ŭ��
					cnt+=1; //ī��Ʈ 1�� ����
				}
			}
			result = (float) cnt/n_sc * 100; //�ۼ�Ʈ�� ��Ÿ���� ���� 100�� ������
			System.out.print(String.format("%.3f",result));
			System.out.println("%");
		}
	}

}
