package ch05_02;

public class ArrayTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numArr1= {100, 200, 300, 400, 500};
		
		for(int i=0;i<=4;i++) { // 배열 numArr1의 모든 원소 출력하기
			System.out.println(numArr1[i]);
		}
		
		System.out.println("===========================");
		// 배열 numArr1의 모든 요소의 합을 구하시오.
		int sum = 0;
		for(int i=0;i<=4;i++) { // 배열 numArr1의 모든 원소 출력하기
//			sum = sum + i; // 15
			sum = sum + numArr1[i]; // 1) 0 + 100 2) 100 + 200 3) 300 + 300 ....
			
		}
		System.out.println(sum); //1500

	}

}
