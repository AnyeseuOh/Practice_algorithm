package Day04;

import java.util.*;

public class Day04_4_Q3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		List<Integer> list = new ArrayList<>();
		
		for (int i=0; i<10; i++) {
			arr[i] = (sc.nextInt())%42;
		}
		
		Set<Integer> set = new HashSet<>();
		//set�� �ڷ��� �ߺ��� �㰡���� ���� (�ڵ����� �ߺ� ����)
		for(int loop : arr) { set.add(loop); }
		//�ڷḦ HashSet�� ����, �ߺ��� ���X(�ѹ��� ������ ��)
		System.out.println(set.size());
		//���� ����� HashSet�� ũ�⸦ ����Ѵ�.
		
	}
}
