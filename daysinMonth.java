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
		
		if (isLeapYear= true) {
			System.out.println("Year"+ " "+year+" "+"has 366 days.");
		}
		
		else 
			System.out.println("Year"+ " "+year+" "+"has 365 days.");
		
		
		}


	}


