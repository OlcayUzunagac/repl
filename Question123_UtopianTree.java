package week7_Array_2D_ArrayList;

public class Question123_UtopianTree {

	public static void main(String[] args) {
		// olcay // Jul 23, 2020
		/*The Utopian Tree grows exactly 1 cm for the first three years, and after that it grows by 2 cm every year, 
		 * this is a simple implementation of the algorithm. You will need to use loops to create it.
		Show 10 years of growth of the Utopian Tree.

		Output:
		year 1 - growth 1 cm
		tree size: 1cm
		year 2 - growth 1 cm
		tree size: 2cm
		year 3  - growth 1 cm
		tree size:3cm
		year 4 - growth 2 cm
		tree size: 5cm
		year 5 - growth 2 cm
		tree size: 7cm
		year 6 - growth 2 cm
		tree size: 9cm
		... until you reach year 10
		*/
		int[] treeSize = new int[11];
		int growth;
		
		growth=0;
		
		for(int year=1; year<11; year++) {
			if(year>=1 && year<4) {
				growth=1;
			}else if(year>=4 && year<11) {
				growth=2;
			}
			treeSize[year]=treeSize[year-1]+growth;
			System.out.println("year " + year + " - " + " growth " + growth + " cm");
			System.out.println("tree size: " + treeSize[year] + "cm");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
