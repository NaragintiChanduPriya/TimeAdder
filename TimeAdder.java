import java.util.Scanner;

public class TimeAdder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the current hour: ");
		int curret_hour=scan.nextInt();
		System.out.println("Enter the Current minute: ");
		int curret_minute=scan.nextInt();
		System.out.println("Enter the Current second: ");
		int curret_second=scan.nextInt();
		System.out.println("Enter the forward hour: ");
		int forward_hour=scan.nextInt();
		System.out.println("Enter the forward minute: ");
		int forward_minute=scan.nextInt();
		System.out.println("Enter the forward second: ");
		int forward_second=scan.nextInt();
		int answerSecond=0, answerMinute=0, answerHour=0;
		int carrySecond=0,carryMinute=0;
		boolean isNextDay=false;
		answerSecond=curret_second+forward_second;
	
		if(answerSecond>=60) {
			answerSecond -=60;
			carrySecond=1;
			
		}
		answerMinute=curret_minute+forward_minute+carrySecond;
		
		if(answerMinute>=60) {
			answerMinute -=60;
			carryMinute=1;
			
		}
		answerHour=curret_hour+forward_hour+carryMinute;
		
		if(answerHour>=24) {
			answerHour -=24;
			isNextDay=true;
			
		}
		if(isNextDay) {
			System.out.println("The current time on Next Day is "+answerHour+":"+answerMinute+":"+answerSecond);
		}
		else {
			System.out.println("The current time"+answerHour+":"+answerMinute+":"+answerSecond);
		}
}
}
