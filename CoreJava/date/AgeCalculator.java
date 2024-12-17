package date;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
	
	public static void main(String[] args) {
		
		LocalDate currentdate = LocalDate.now();
		
		LocalDate birthdate = LocalDate.of(2000,9,18);
		
		Period p = Period.between(birthdate, currentdate);
		
		System.out.printf("Your age is :- %d Years ,%d months ,%d days",p.getYears(),p.getMonths(),p.getDays());
		
	}

}
