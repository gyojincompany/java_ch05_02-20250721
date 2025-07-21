package ch05_02;

public class ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score;
		score = 50;
		double avg = 95.2;
		String str = "Korea";
		boolean flag = true;
		
		// 배열 선언 방법
		
		// 선언과 동시에 값 초기화
		int[] intArr = {10, 20, 30, 40, 50}; 
		double[] doubleArr = {3.14, 5.2, 3.99, 0.2};
		String[] strArr = {"Kor","Jap","USA"};
		boolean[] flagArr = {true, false, true, true};
		
		//배열의 크기만 지정하고 기본값으로 초기화
		int[] intArr2 = new int[5]; // 4바이트(정수형) 방이 5개 만들어짐->0으로 초기화
		// int[] intArr2 = {0, 0, 0, 0, 0};
		
		intArr2[0] = 100;
		intArr2[3] = 40;
		intArr2[4] = 60;
		
		double[] doubleArr2 = new double[3]; 
		// double[] doubleArr2 = {0.0, 0.0, 0.0};
		boolean[] boolArr = new boolean[4];
		// boolean[] boolArr = {false, false, false, false};
		String[] strArr2 = new String[3];
		// String[] strArr2 = {null, null, null};
		
		//new 연산자를 사용하여 배열 선언과 동시에 초기화
		int[] intArr3 = new int[] {1, 2, 3, 4, 5, 6};
		String[] strArr3 = new String[] {"aaa", "bbb", "ccc"};
		
		
		
		
		
		
	}

}
