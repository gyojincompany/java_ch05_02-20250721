package ch05_02Exer;

public class Exer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 다음 값 들의 평균을 계산하여 출력하시오.(향상된 for문 사용)
		// 90 80 70 100 85
		
		int[] numArr = {90,80,70,100,86};
		
		int sum = 0;
		for(int num:numArr) { // 향상된 for문 사용
			sum = sum + num; // 누적식
		}
		
		System.out.print(sum / (double) numArr.length); // 실수로 평균을 출력하기 위해 강제 형변환
	}

}
