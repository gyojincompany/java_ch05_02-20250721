package ch05_02Exer;

public class Exer04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		4. 아래 배열에서 홀수인덱스의 값만 출력하시오.
//		{10, 20, 30, 40, 50}
		int[] numArr = {10, 20, 30, 40, 50};
		for(int i=0;i<numArr.length;i++) {
			if(i % 2 == 1) { // 인덱스가 홀수인것만 참
				System.out.println(numArr[i]);
			}
		}
	}

}
