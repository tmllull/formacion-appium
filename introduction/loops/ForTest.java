package loops;

import java.io.IOException;

public class ForTest {

	public static void main(String[] args) throws IOException {
		
		System.out.println("<=======LOOP INCREMENT EXAMPLE=========>");
		System.in.read();

		// This will print -- 0,1,2,3,4,5
		for(int Increment = 0;Increment<=5;Increment++){
			System.out.println("Count is  ==> " + Increment );
		}
		System.in.read();
 
		System.out.println("<=======LOOP DECREMENT EXAMPLE=========>");
		System.in.read();
		// This will print -- 5,4,3,2,1,0
		for(int Decrement = 5;Decrement>=0;Decrement--){
			System.out.println("Count is ==> " + Decrement );
		}
 
		System.in.read();
		
		System.out.println("<=======LOOP SKIP ITERATION EXAMPLE=========>");
		System.in.read();
		// This will print -- 0,2,4
		for(int Increment = 0;Increment<=5;Increment+=2){
			System.out.println("Skip every one another  ==> " + Increment );
		}
		
		System.in.read();
		System.out.println("<=========BREAK EXAMPLE========>");
		System.in.read();
		// This will print -- 0,1,2,3,4,5
				for(int Count = 0;Count<=10;Count++){
					if(Count==6){
						break;
						}
					System.out.println("Count is ==> " + Count );
					}
				System.out.println("You have exited the loop");
				
		
	}
}
