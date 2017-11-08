package decisions;

import java.io.IOException;

public class IfTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String sDay = "Sunday";
		int iDay = 7;

		System.out.println("IF");
		System.in.read();
		System.in.read();
		System.out.println("sDay = " + sDay);
		System.out.println("iDay = " + iDay);
		System.in.read();
		System.in.read();
		if (sDay.equals("Sunday")) {
			System.out.println("Today is Sunday");
		}

		if (iDay == 7) {
			System.out.println("Today is Sunday");
		}

		System.in.read();
		System.in.read();

		System.out.println("IF-ELSE");
		System.in.read();
		System.in.read();
		sDay = "Saturday";
		iDay = 6;
		System.out.println("sDay = " + sDay);
		System.out.println("iDay = " + iDay);
		System.in.read();
		System.in.read();

		if (sDay.equals("Sunday")) {
			System.out.println("Today is Sunday");
		} else {
			System.out.println("Today is not Sunday");
		}

		if (iDay == 7) {
			System.out.println("Today is Sunday");
		} else {
			System.out.println("Today is not Sunday");
		}

		System.in.read();
		System.in.read();
		System.out.println("IF-ELSEIF-ELSE");
		System.in.read();
		System.in.read();

		sDay = "Monday";
		iDay = 1;
		System.out.println("sDay = " + sDay);
		System.out.println("iDay = " + iDay);
		System.in.read();
		System.in.read();

		if (sDay.equals("Sunday")) {
			System.out.println("Today is Sunday");
		} else if (sDay.equals("Saturday")) {
			System.out.println("Today is not Saturday");
		} else {
			System.out.println("Today is a Weekday");
		}

		if (iDay == 7) {
			System.out.println("Today is Sunday");
		} else if (iDay == 6) {
			System.out.println("Today is Saturday");
		} else {
			System.out.println("Today is a Weekday");
		}
	}

}
