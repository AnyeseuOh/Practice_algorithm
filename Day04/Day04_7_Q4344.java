package Day04;

import java.util.*;
import java.util.stream.IntStream;

public class Day04_7_Q4344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //테스트케이스 수 입력
		int cnt;
		float avg, result;
		
		for (int i=0; i<n; i++) {
			int n_sc = sc.nextInt(); //학생수 입력
			int[] score = new int[n_sc]; //학생수 만큼의 학생점수 배열 생성
			
			for (int j=0; j<n_sc; j++) {
				score[j] = sc.nextInt(); //배열에 학생점수 입력
			}
			
			cnt=0; //카운트 변수 초기화
			avg = IntStream.of(score).sum()/n_sc; //입력받은 점수배열의 평균
			for (int j=0; j<n_sc; j++) {
				if (score[j]>avg) { //평균보다 클시
					cnt+=1; //카운트 1씩 증가
				}
			}
			result = (float) cnt/n_sc * 100; //퍼센트로 나타내기 위해 100을 곱해줌
			System.out.print(String.format("%.3f",result));
			System.out.println("%");
		}
	}

}
