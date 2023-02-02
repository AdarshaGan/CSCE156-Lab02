package unl.cse;

import java.util.ArrayList;
import java.util.List;

/**
 * This program produces a report on how much a a tax payer can expect for their
 * child tax credits.
 * 
 * @author cbourke
 *
 */
public class ChildCredit {

	/**
	 * Produces a report (printed to the standard output) of how much
	 * of a credit each child receives as well as a grand total.
	 * 
	 * Returns the total child tax credit.
	 * 
	 * @param kids
	 * @return
	 */
	public static int produceReport(List<Child> kids) {
		boolean hasSeveralChildren = false;
		// TODO: write a loop to iterate over the elements in the child array
		// and output a table as specified
		int total = 0;
		System.out.println("Child		Amount");
		for(int i = 0 ; i < kids.size(); i++) {
			System.out.print(kids.get(i).getName()+ " (" + kids.get(i).getAge() + ")  ");

			if(kids.get(i).getAge() < 18) {
				if(hasSeveralChildren == true) {
					total += 500;
					System.out.println("$500.00");
				}
				else {
					total += 1000;
					System.out.println("$1000.00");
					hasSeveralChildren = true;
				}
				
			}
			else {
				System.out.println("$0.00");
			}
			
		}
		System.out.print("Total Credit: $" + total);
		return total;

	}

	public static void main(String args[]) {

		Child tom = new Child("Tommy", 14);
		Child dick = new Child("Richard", 12);
		Child harry = new Child("Harold", 21);

		// A list of children above:
		List<Child> kids = new ArrayList<>();
		kids.add(tom);
		kids.add(dick);
		kids.add(harry);

		produceReport(kids);

	}
}
