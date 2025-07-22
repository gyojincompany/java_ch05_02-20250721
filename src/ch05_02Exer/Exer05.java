package ch05_02Exer;

public class Exer05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5. 아래 숫자들을 모두 곱한 값을 배열을 사용하여 출력하시오.
//		1 2 3 4 5
		
		int[] numArr = {1,2,3,4,5};
		int result = 1;
		for(int num : numArr) {
			result *= num; // 곱셈 누적식
		}
		
		System.out.println(result);
	}

}
