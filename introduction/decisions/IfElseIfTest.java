package decisions;

public class IfElseIfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sDay = "Monday";
		int iDay = 1;
 
		if(sDay.equals("Sunday")){
			System.out.println("Today is Sunday");
		}else if(sDay.equals("Saturday")){
			System.out.println("Today is not Saturday");
		}else{
			System.out.println("Today is a Weekday");
		}
 
		if(iDay==7){
			System.out.println("Today is Sunday");
		}else if(iDay==6){
			System.out.println("Today is Saturday");
		}else{
			System.out.println("Today is a Weekday");
		}
	}

}
