package week7_Array_2D_ArrayList;

import java.util.Arrays;
import java.util.Scanner;



public class Question127_ZombieAttack1 {

	public static void main(String[] args) {
		// olcay // Jul 23, 2020
		
		/*An array inhabitants represents cities and their respective populations. 
		 * For example, the following arrays shows 8 cities and their respective populations:
			[3, 6, 0, 4, 3, 2, 7, 1]
			Some cities have a population of 0 due to a pandemic zombie disease that is wiping away the human lives.
			 After each day, every city will lose half of its population.
			write a program to loop though each city population and make it lose half of its population until all 
			cities have no humans left. Make updates to each element in the array And print the array like below for each day:

			Day 0 [3, 6, 0, 4, 3, 2, 7, 1]
			Day 1 [1, 3, 0, 2, 1, 1, 3, 0]
			Day 2 [0, 1, 0, 1, 0, 0, 1, 0]
			Day 3 [0, 0, 0, 0, 0, 0, 0, 0]
			---- EXTINCT ----
			*/
		
		Scanner input = new Scanner(System.in);
	    int[] inhabitants = new int[8];
	    int[] arrayNew = new int[8];
	    
	    for(int i=0; i<inhabitants.length; i++) {
	    	inhabitants[i] = input.nextInt();
	    }
	    
	    
	    int day=0;
	    do { 
	    	
	    	System.out.println("Day " + day  + " " + Arrays.toString(inhabitants));
	    	day++;
	    	for(int i=0;i<inhabitants.length;i++) {
	    		inhabitants[i]=inhabitants[i]/2;
	    	}	    	
	    	
	    }while(!Arrays.toString(inhabitants).equals(Arrays.toString(arrayNew)));
	    System.out.println("Day " + day  + " " + Arrays.toString(inhabitants));
	    System.out.println("---- EXTINCT ----");
	}

}
