//Program to calculate the projected population growth in 5 years added to the current population

public class populationCounter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
	double secCounter= 60;
	double minCounter= secCounter*60;
	double hourCounter= minCounter*60;
	double dayCounter= hourCounter*24;
	double yearCounter= dayCounter*365;
	double currentPopulation= 312032486;
	double birthCounter= yearCounter/7;
	double deathCounter= yearCounter /13;
	double immigrantCounter=yearCounter/45;
	double currentPopCounter= (birthCounter+immigrantCounter+currentPopulation)-deathCounter;
	

	
	System.out.println("There will be"+ " " + birthCounter*5+ " "+"births in the next five years,");
	System.out.println(deathCounter*5+" "+"deaths in the next five years,");
	System.out.println(immigrantCounter*5+" "+"immigrants migrated in the next five years, and");
	System.out.println("The population projection the next five years is"+" "+currentPopCounter);


	
	
	
}
}