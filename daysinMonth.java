package daysinMonth;


import java.util.*;//added to add the Scanner class for the users input
public class daysinMonth {

	public static void main(String[] args) {//main method used to print information to the user.
		System.out.println("Please enter the month in double digits.");
		System.out.println("Please enter the year in four digits");
		Scanner input= new Scanner (System.in);
		int month=input.nextInt();// takes the user's input and stores it in the month variable
		int year=input.nextInt();//takes the user's input and stores it in the month variable
		boolean isLeapYear= (year % 4 ==0 && year % 100 !=0) ||(year % 400 ==0);// Accounts for a leap year by seeing if it is divisable by 4, not by 100, or if it is divisable by 400.
		boolean hasThirtyOne=(month== 01 || month==03 || month== 05 || month ==07 || month== 8 || month== 10 || month ==12);// varibale that checks if the month has 31 days.
		boolean isFebuary = (month==02);// check to see if the month is Febuarary.
		
		
		
		if (isLeapYear) {
			System.out.println("Year"+ " "+year+" "+"has 366 days.");
		}
         else 
			System.out.println("Year"+ " "+year+" "+"has 365 days.");
		
	
		
       
	    if (hasThirtyOne) {
	    	System.out.println("Month"+" "+ month+" "+ "has 31 days in the year"+" " +year+".");
	    }
	    else if (isFebuary && isLeapYear== true) {
			System.out.println("Month"+" "+ month+" "+ "has 29 days in the year"+ " "+year+".");
		}
		else if (isFebuary && isLeapYear== false) {
			System.out.println("Month"+" "+ month+" "+ "has 28 days in the year"+ " "+year+".");
		}
	    else {
	       System.out.println("Month"+" "+ month+" "+" has 30 days in the year"+ " "+ year+".");
	    
	
	    }

	}
}
