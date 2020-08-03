package week7_Array_2D_ArrayList;

import java.util.Arrays;

public class Question190_Methods_MergeArrays {

	public static void main(String[] args) {
		
		int[] x = {1,2,3,4};
		int[] y = {6,8};
		System.out.println(Arrays.toString(mergR(x, y)));
		
	}
	
	 public static int[] mergR(int[] a,int[] b){
		    
		int[] newArray = new int[a.length+b.length];
		
		int z =0;
		for(int i=0; i<a.length; i++) {
			newArray[i]=a[i];
			for(int j=i+a.length; j<b.length+a.length; j++) {
				newArray[j]=b[i];
			}
		}
		 
		 return newArray;
		 
	  }

}
