package ch05_03;

enum Day {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day today = Day.TUESDAY;
		System.out.println("오늘은 " + today + "요일 입니다.");
	}

}
