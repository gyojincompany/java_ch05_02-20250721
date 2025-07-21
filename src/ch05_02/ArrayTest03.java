package ch05_02;

public class ArrayTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 사용 시 주의 사항 error 주의!
		
		int[] intArr = {10, 20, 30, 40, 50};
		
		// System.out.println(intArr[5]); // 배열 범위 벗어난 오류 out of bounds error 발생!!	
		// intArr[5] = 300; // 배열 범위 벗어난 오류 out of bounds error 발생!!	
		
//		System.out.println(intArr[5]); //	
		
//		for(int i=0;i<=5;i++) { // 배열 범위 벗어난 오류 out of bounds error 발생!!	
//			System.out.println(intArr[i]); //
//		}
		
		String str1 = "Kor";
		System.out.println(str1 + 7777); // 출력결과->문자열로 바뀌어서 출력
		
		String[] strArr = {"kor","jap","usa"};
		System.out.println(strArr[1] + 7777); // 출력결과->문자열로 바뀌어서 출력
		
		String[] strArr2 = new String[5];
		System.out.println(strArr2[1]+7777); // 출력결과->문자열로 바뀌어서 출력
		
		int[] intArr2 = {60,70,80,90,100,465,465,46,4,4,14,4,4,4,4,58,5,54,1,54,45,4,45,1,54,7,541,5646,46,2}; // 배열 요소가 5개
		
		System.out.println(intArr2.length); // 배열요소의 갯수 반환
//		int arrLength = intArr2.length;
		for(int i=0;i<intArr2.length;i++) { // 배열 요소의 개수(배열의 길이) 만큼 만 반복되는 for문
			System.out.println(intArr2[i]);
		}
		
	}

}
