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
		//set은 자료의 중복을 허가하지 않음 (자동으로 중복 제거)
		for(int loop : arr) { set.add(loop); }
		//자료를 HashSet에 저장, 중복값 허용X(한번만 저장이 됨)
		System.out.println(set.size());
		//따라서 저장된 HashSet의 크기를 출력한다.
		
	}
}
