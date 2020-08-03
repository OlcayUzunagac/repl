package week7_Array_2D_ArrayList;

import java.util.ArrayList;

public class Question196_ArrayList_Remove {

	public static void main(String[] args) {
		// olcay // Jul 30, 2020
		
		ArrayList<Double> temp = new ArrayList<>();
		temp.add(4.56);
		temp.add(1.78);
		temp.add(10.0);
		
		test(temp);
	}
	
	public static void test(ArrayList<Double> dubs)
	{
		//write code here
		for(int i=0; i<1;i++){
		  dubs.remove(i);
		}
		for(int i=0; i<1;i++){
		  dubs.remove(i);
		}
		
		System.out.println(dubs);
	}

}
