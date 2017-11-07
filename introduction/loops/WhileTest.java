package loops;

import java.io.IOException;

public class WhileTest {

	public static void main(String[] args) throws IOException {
		System.out.println("<==========WHILE EXAMPLE=========>");
		System.in.read();
		int Count = 0;
		// This will print -- 5,10,15,20,25
		while (Count < 25) {
			Count = Count + 5;
			System.out.println("Count is ==> " + Count);
		}

		int CountOnce = 25;
		// This will not print count even once
		while (CountOnce < 25) {
			CountOnce = CountOnce + 5;
			System.out.println("Count is ==> " + CountOnce);
		}
	}

}
