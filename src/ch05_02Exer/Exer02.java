package ch05_02Exer;

public class Exer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2. 다음 숫자들을 거꾸로 출력하시오. ex) 50 40 30 20 10
//		10 20 30 40 50
		
		int[] numArr = {10,20,30,40,50,60,70};
		
		for(int i=numArr.length-1;i>=0;i--) {
			System.out.println(numArr[i]);
		}
		

	}

}
