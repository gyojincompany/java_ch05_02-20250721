package ch05_02Exer;

public class Exer03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3. 다음 숫자열에서 3의 갯수가 몇개 인지 출력하시오.
//		1 3 7 3 3 5 3 6 9 3 3 3
		
		int[] numArr = {1,3,7,3,3,5,3,6,9,3,3,3};
		int count = 0;
		for(int num : numArr) {
			if(num == 3) {
				count++; // 3의 개수 count = count + 1 -> count += num 
			}
		}
		System.out.println(count);
	}

}
