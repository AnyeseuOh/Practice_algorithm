package Day04;

import java.util.Scanner;

public class Day04_6_Q8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		
		String input;
		int cnt, sum, n= sc.nextInt(); //테이스케이스 개수 입력
		
		for (int i=0; i<n; i++) { //테스트케이스 개수만큼
			input = sc.next(); //스트링을 입력받는다
			cnt=0; sum=0; //값 초기화	
			for (int j=0; j<input.length(); j++) { //스트링의 길이만큼 O와 X를 비교체크
				if (input.substring(j, j+1).equals("O")) { //만약 O라면
					cnt+=1; //카운트값에 1을 더하고
					sum+=cnt; //결과에, 더한 카운트값을 합한다
				}
				else { cnt=0; } //X라면 카운트를 0으로 초기화한다
			}
			System.out.println(sum); //결과값 출력
		}
	
	}

}
