package week7_Array_2D_ArrayList;

public class Question217_MethodsWithArray_BadProducts {

	public static void main(String[] args) {
		
		// olcay // Jul 27, 2020
	/*	All products that go into the warehouse go through a machine that checks if they are intact .
		to declare if the products shipment was good or bad it also get a limited number of
		how many products can be broken for it to be considered a good shipment.
		badP is a method that gets an int array named products and an int named limit.
		products(int[]) - is an int array representing the products it checked, if the 
		item is intact it will be represented by 1 if its broken its 0. 
		for example: [0,1,1,1,0], this array represents 2 broken items and 3 intact.
		limit(int) - represents the max amount of broken items for this shipment to be 
		considered good (and the method returns true) 
		for example : products [1,1,1,1,0] limit:3, there is only 1 broken product and its less then 
		the limit (3) return true.

		example use:

		badP([1,1,1,1],5)
		returns true

	
		*/
		int[] products= {1,1,1,1};
		int limit =5;
		System.out.println(badP(products, limit));
		
	}
	 public static boolean badP(int[] products,int limit){
	     
		 int count=0;
		 
		 for(int i=0; i<products.length; i++) {
			 if(products[i]==0) {
				 count++;
			 }
		 }
		 
		 if(limit>count) {
			 return true;
		 }
		 return false;
		 
		 
	 }

}
