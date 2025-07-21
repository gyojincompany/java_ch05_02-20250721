package ch05_02;

public class ArrayTest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 향상된 for문
		
		int[] arr = {10,20,30,40,50};
		
		// 모든 배열 요소를 출력하는 for문을 작성하시오.
		for(int i=0;i<arr.length;i++) { // 배열 요소의 개수(배열의 길이) 만큼 만 반복되는 for문
			System.out.println(arr[i]);
		}
		
		// 향상된 for문으로 전환
		for(int num : arr) {
			System.out.println(num);
		}
		
		// 다음 배열의 모든 요소 중 짝수만 출력하시오.
		
		int[] numArr = {10,20,30,11,22,33,44,55};
		
		for(int num : numArr) {
			if(num % 2 == 0) {
				System.out.println(num);				
			}
		}
		
	}

}
