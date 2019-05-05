package daysinMonth;


import java.util.*;
public class daysinMonth {

	public static void main(String[] args) {
		System.out.println("Please enter the month in double digits.");
		System.out.println("Please enter the year in four digits");
		Scanner input= new Scanner (System.in);
		int month=input.nextInt();
		int year=input.nextInt();
		boolean isLeapYear= (year % 4 ==0 && year % 100 !=0) ||(year % 400 ==0);
		boolean hasThirtyOne=(month== 01 || month==03 || month== 05 || month ==07 || month== 8 || month== 10 || month ==12);
		boolean isFebuary = (month==02);
		
		
		
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
