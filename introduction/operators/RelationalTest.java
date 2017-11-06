package operators;

import java.io.IOException;

public class RelationalTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int Ten = 10;
		int Twenty = 20;
		int Thirty = 30;

		System.out.println("<<<<<< GREATER THAN OPERATOR >>>>>>");
		System.in.read();
		System.in.read();
		System.out.println(" Ten > Twenty ==> " + (Ten > Twenty)); // false
		System.in.read();
		System.in.read();
		System.out.println(" Twenty > Ten ==> " + (Twenty > Ten)); // true
		System.in.read();
		System.in.read();
		System.out.println(" Thirty > Twenty ==> " + (Thirty > Twenty)); // true
		System.in.read();
		System.in.read();

		System.out.println("<<<<<< GREATER THAN OR EQUAL TO OPERATOR >>>>>>");
		System.in.read();
		System.in.read();
		System.out.println(" Ten >= Twenty ==> " + (Ten >= Twenty)); // false
		System.in.read();
		System.in.read();
		System.out.println(" Twenty >= Ten ==> " + (Twenty >= Ten)); // true
		System.in.read();
		System.in.read();
		System.out.println(" Thirty >= Twenty ==> " + (Thirty >= Twenty)); // true
		System.in.read();
		System.in.read();

		System.out.println("<<<<<< LESS THAN OPERATOR >>>>>>");
		System.in.read();
		System.in.read();
		System.out.println(" Ten < Twenty ==> " + (Ten < Twenty)); // true
		System.in.read();
		System.in.read();
		System.out.println(" Twenty < Ten ==> " + (Twenty < Ten)); // false
		System.in.read();
		System.in.read();
		System.out.println(" Thirty < Twenty ==> " + (Thirty < Twenty)); // false
		System.in.read();
		System.in.read();
		// less than or equal to
		System.out.println("<<<<<< LESS THAN OR EQUAL TO OPERATOR >>>>>>");
		System.in.read();
		System.in.read();
		System.out.println(" Ten <= Twenty ==> " + (Ten <= Twenty)); // true
		System.in.read();
		System.in.read();
		System.out.println(" Twenty <= Ten ==> " + (Twenty <= Ten)); // false
		System.in.read();
		System.in.read();
		System.out.println(" Thirty <= Twenty ==> " + (Thirty <= Twenty)); // false
		System.in.read();
		System.in.read();
		// equal to
		System.out.println("<<<<<< EQUAL TO OPERATOR >>>>>>");
		System.in.read();
		System.in.read();
		System.out.println(" Ten == Twenty ==> " + (Ten == Twenty)); // false
		System.in.read();
		System.in.read();
		System.out.println(" Thirty == Twenty + Ten ==> " + (Thirty == Twenty + Ten)); // true
		System.in.read();
		System.in.read();
		// not equal to
		System.out.println("<<<<<< NOT EQUAL TO OPERATOR >>>>>>");
		System.in.read();
		System.in.read();
		System.out.println(" Ten != Twenty ==> " + (Ten != Twenty)); // true
		System.in.read();
		System.in.read();
		System.out.println(" Thirty != Twenty + Ten ==> " + (Thirty != Twenty + Ten)); // false
	}

}
