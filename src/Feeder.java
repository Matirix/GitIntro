
/**
 * AP CSA 2024 Written Question 1
 * https://apcentral.collegeboard.org/media/pdf/ap24-frq-comp-sci-a.pdf 
 * PLEASE READ THE PROMPT CAREFULLY BEFORE ATTEMPTING
 * Also make sure you are on your own branch before pushing, you can check what branch you are on by doing 'git branch -a'
 * 
 * 8/9 Marks - GOOD JOB! Nice work on using git as well
 * IN depth feedback below.
 * -1 mark(s) for not including guard statement in part B // if (numFood == 0) return numDays; 
 * 
 * 
 * 
 */
public class Feeder {
	/**
	* The amount of food, in grams, currently in the bird feeder; initialized in the constructor and
	* always greater than or equal to zero
	*/
	private int currentFood;
	
	
	/**
	 * TODO Implement the Constructor
	 * @param currentFood
	 */
	public Feeder(int currentFood) {

	}
	
	/**
	 * 
	 * 
	 *  4/4 marks
	 * 
	* Simulates one day with numBirds birds or possibly a bear at the bird feeder,
	* as described in part (a)
	* Precondition: numBirds > 0
	*/
	public void simulateOneDay(int numBirds) {
		/**
		* PART A TODO
		* Returns the number of days birds or a bear found food to eat at the feeder in this simulation,
		* as described in part (b)
		* Preconditions: numBirds > 0, numDays > 0
		*/
		
		if(currentFood <= 0) {
			System.out.println("there is no food in this simulation, add food");
			return;
		}
		if(Math.random() > 0.05) { // Teacher: Doesn't this mean that the bear will come 95% of the time? While this is technically wrong, CSA doesn't deduct you for it.
			currentFood = 0;
			System.out.println("there are no food to eat as a bear came and ate them all");
		}
		else {
			int birdsApitite = (int)(Math.random() * 41) + 10;
			
			int totalfoodEaten = birdsApitite * numBirds;
			
			if(totalfoodEaten > currentFood) {
				currentFood = 0;
				System.out.println("there are no food left");
			}
			else {
				currentFood -= totalfoodEaten;
                System.out.println("the birds all ate and there are " + currentFood + " grams of food left");
			}
		}
	}
	
	/**
	 *	4/5 marks
	 * 	
	 * 
	 * @param numBirds
	 * @param numDays
	 * @return
	 */
	public int simulateManyDays(int numBirds, int numDays) {
		/**
		 * TODO PART B:
		 * Simulates many days SimulateOne day is called.
		 */
		for(int i = 0; i < numDays; i++) {
			// There's a required 'guard' statement here in case numFoods = 0. 
			// BUT I see that you implemented it within simulateOneDay which is best practice (You typically implement the 'checks' in the beginning
			// so as to not waste space. 
			// BUT unfortunately, the guidelines will have me deduct you for not including the guard statement.
			// if (currentFood) { return numDays };
			simulateOneDay(numBirds);
		}
		
		return currentFood; // Solution returns numDays but it doesn't matter what it returns
	}
}