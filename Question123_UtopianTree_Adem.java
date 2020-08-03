package week7_Array_2D_ArrayList;

public class Question123_UtopianTree_Adem {

	public static void main(String[] args) {
		// olcay // Jul 23, 2020
		
		
		int[] utopian = new int[10];
		for (int i = 0; i < utopian.length; i++) {
			if (i > 2) {
				utopian[i] = 2;
			} else {
				
				utopian[i] = 1;

			}
			
		}
		//System.out.println(Arrays.toString(utopian));
		int totalsize = 0;
		for(int i =0;i<utopian.length;i++) {
			totalsize += utopian[i];
			System.out.println("year " + (i+1) +" - " + " growth "+ utopian[i]+  " cm");
			System.out.println("tree size: " + totalsize + "cm");
			
		}
	}

}
