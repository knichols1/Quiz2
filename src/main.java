import java.util.Scanner;
/* Quiz 3 
 * Kathryn Nichols 
 * September 20th 2015
 */
public class main {
	/* This will ask the user the information needed
	 * for the calculations to be done 
	*/
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
			// Fixed APR on the student loan
			System.out.println("What is your expected APR on your student loan ");
			double APR = input.nextDouble();
			// How many years you expect to pay the loan.
			System.out.println("How many years do you expect to pay the student loan? ");
			double paymentYears = input.nextDouble();
			// Percentage increase
			System.out.println("What is the new percentage increase? ");
			double percentageIncrease= input.nextDouble();
			// How much does it cost.
			System.out.println("How expensive is the tuition this year? ");
			double tuitionCost = input.nextDouble();
			
	for (int i= 0; i==paymentYears; i++)	{	
		double monthlyPayments = ((APR*tuitionCost)+tuitionCost)/12;
		double newCost = (tuitionCost * percentageIncrease+tuitionCost);
		System.out.printf("Your Monthly payment is $%.2f \n", monthlyPayments);	
	}}
	
}
