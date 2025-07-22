package ch05_01;

import java.util.Arrays;

public class ReffTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b;
		
		b = a;
		System.out.println(b); // b->100
		
		int[] numArr1 = null;		
		int[] numArr2 = {10,20,30,40,50};
		numArr1 = numArr2; // 대입연산자 복사->얕은 복사
		
		numArr2[2] = 700;
		
		System.out.println(numArr1[2]); // 700
		
		System.out.println("numArr1의 해시 코드: " + System.identityHashCode(numArr1));
		System.out.println("numArr2의 해시 코드: " + System.identityHashCode(numArr2));
		
		System.out.println("================================");
		
		int[] numArr3 = null;
		int[] numArr4 = {100,200,300};		
		
		numArr3 = Arrays.copyOf(numArr4, 3); // 깊은 복사
		
		for(int num:numArr3) {
			System.out.println(num);
		}
		
		System.out.println("numArr3의 해시 코드: " + System.identityHashCode(numArr3));
		System.out.println("numArr4의 해시 코드: " + System.identityHashCode(numArr4));
		
		System.out.println("================================");
		
		String str = null;
		str = "kor";
		
		String str2 = "Kor";
		str2 = null;
			
	}

}
